import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    @Test
    public void test19501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19501");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 0);
        java.io.Writer writer4 = null;
        int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0036\\u0034", (int) (byte) 0, writer4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper1.with(charSequenceTranslatorArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test19502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19502");
        java.io.IOException iOException1 = new java.io.IOException("\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0034");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test19503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19503");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray19 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper18 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper15.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper12.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper7.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator23 = unicodeEscaper4.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer31 = null;
        boolean boolean32 = unicodeEscaper29.translate((int) '4', writer31);
        java.io.Writer writer34 = null;
        boolean boolean35 = unicodeEscaper29.translate((int) (byte) -1, writer34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str44 = unicodeEscaper42.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray45 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper38, unicodeEscaper40, unicodeEscaper42 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper29.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper26.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper4.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper2.with(charSequenceTranslatorArray45);
        java.io.Writer writer52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = charSequenceTranslator49.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020\\u0030", (int) ' ', writer52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str9, "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(charSequenceTranslator23);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str44, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
    }

    @Test
    public void test19504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19504");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
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
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper5.with(charSequenceTranslatorArray25);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper2.with(charSequenceTranslatorArray25);
        java.lang.String str33 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0031");
        java.io.Writer writer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException:\\u0020java.io.IOException:\\u0020\\\\u0075005C\\\\u0075007500\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u007500750030\\\\u0075005C\\\\u007500750030\\\\u0075005C\\\\u007500750033\\\\u0075005C\\\\u007500750030", 100, writer36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\\\u00750031" + "'", str33, "\\\\u00750031");
    }

    @Test
    public void test19505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19505");
        java.io.IOException iOException2 = new java.io.IOException("23");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException();
        iOException5.addSuppressed((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException6.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException("");
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException6.addSuppressed((java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray14 = iOException6.getSuppressed();
        iOException3.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException17 = new java.io.IOException();
        java.io.IOException iOException18 = new java.io.IOException();
        iOException17.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException17);
        java.lang.Throwable[] throwableArray21 = iOException20.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException();
        java.io.IOException iOException25 = new java.io.IOException();
        iOException24.addSuppressed((java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException();
        java.io.IOException iOException28 = new java.io.IOException();
        iOException27.addSuppressed((java.lang.Throwable) iOException28);
        java.lang.Throwable[] throwableArray30 = iOException28.getSuppressed();
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException28);
        java.io.IOException iOException33 = new java.io.IOException("");
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) iOException33);
        iOException28.addSuppressed((java.lang.Throwable) iOException34);
        iOException25.addSuppressed((java.lang.Throwable) iOException34);
        java.io.IOException iOException37 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException34);
        java.io.IOException iOException38 = new java.io.IOException("64", (java.lang.Throwable) iOException37);
        iOException20.addSuppressed((java.lang.Throwable) iOException37);
        java.io.IOException iOException40 = new java.io.IOException("1", (java.lang.Throwable) iOException37);
        java.lang.Throwable[] throwableArray41 = iOException40.getSuppressed();
        java.io.IOException iOException43 = new java.io.IOException();
        java.io.IOException iOException44 = new java.io.IOException();
        iOException43.addSuppressed((java.lang.Throwable) iOException44);
        java.io.IOException iOException46 = new java.io.IOException("0", (java.lang.Throwable) iOException43);
        java.io.IOException iOException47 = new java.io.IOException((java.lang.Throwable) iOException46);
        java.io.IOException iOException48 = new java.io.IOException((java.lang.Throwable) iOException47);
        java.io.IOException iOException50 = new java.io.IOException();
        java.io.IOException iOException51 = new java.io.IOException();
        iOException50.addSuppressed((java.lang.Throwable) iOException51);
        java.lang.Throwable[] throwableArray53 = iOException51.getSuppressed();
        java.lang.Throwable[] throwableArray54 = iOException51.getSuppressed();
        java.io.IOException iOException55 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException51);
        java.io.IOException iOException56 = new java.io.IOException();
        java.io.IOException iOException57 = new java.io.IOException();
        iOException56.addSuppressed((java.lang.Throwable) iOException57);
        java.io.IOException iOException59 = new java.io.IOException((java.lang.Throwable) iOException56);
        java.lang.Throwable[] throwableArray60 = iOException59.getSuppressed();
        iOException55.addSuppressed((java.lang.Throwable) iOException59);
        iOException47.addSuppressed((java.lang.Throwable) iOException59);
        java.io.IOException iOException63 = new java.io.IOException((java.lang.Throwable) iOException59);
        java.lang.Throwable[] throwableArray64 = iOException63.getSuppressed();
        iOException40.addSuppressed((java.lang.Throwable) iOException63);
        iOException6.addSuppressed((java.lang.Throwable) iOException63);
        java.lang.Throwable throwable71 = null;
        java.io.IOException iOException72 = new java.io.IOException("java.io.IOException: \\u0068\\u0069\\u0021", throwable71);
        java.io.IOException iOException73 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException72);
        java.io.IOException iOException76 = new java.io.IOException("");
        java.io.IOException iOException77 = new java.io.IOException((java.lang.Throwable) iOException76);
        java.io.IOException iOException79 = new java.io.IOException("");
        iOException77.addSuppressed((java.lang.Throwable) iOException79);
        java.io.IOException iOException81 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException79);
        java.io.IOException iOException83 = new java.io.IOException("");
        java.io.IOException iOException84 = new java.io.IOException((java.lang.Throwable) iOException83);
        java.io.IOException iOException85 = new java.io.IOException((java.lang.Throwable) iOException83);
        iOException81.addSuppressed((java.lang.Throwable) iOException83);
        iOException72.addSuppressed((java.lang.Throwable) iOException83);
        java.io.IOException iOException88 = new java.io.IOException((java.lang.Throwable) iOException83);
        java.io.IOException iOException89 = new java.io.IOException("j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A \\u0036\\u0034", (java.lang.Throwable) iOException83);
        java.io.IOException iOException90 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException89);
        iOException63.addSuppressed((java.lang.Throwable) iOException90);
        java.io.IOException iOException92 = new java.io.IOException((java.lang.Throwable) iOException63);
        java.lang.String str93 = iOException63.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException" + "'", str93, "java.io.IOException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test19506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19506");
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
        java.lang.Throwable[] throwableArray21 = iOException17.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException();
        java.io.IOException iOException26 = new java.io.IOException();
        iOException25.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException("0", (java.lang.Throwable) iOException25);
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) iOException28);
        java.io.IOException iOException30 = new java.io.IOException((java.lang.Throwable) iOException29);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.lang.Throwable[] throwableArray32 = iOException31.getSuppressed();
        java.io.IOException iOException33 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException31);
        java.io.IOException iOException34 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException31);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException34);
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
        java.io.IOException iOException53 = new java.io.IOException("");
        java.io.IOException iOException54 = new java.io.IOException((java.lang.Throwable) iOException53);
        java.io.IOException iOException56 = new java.io.IOException("");
        iOException54.addSuppressed((java.lang.Throwable) iOException56);
        java.io.IOException iOException58 = new java.io.IOException("java.io.IOException: 0", (java.lang.Throwable) iOException56);
        iOException47.addSuppressed((java.lang.Throwable) iOException56);
        java.io.IOException iOException60 = new java.io.IOException((java.lang.Throwable) iOException47);
        iOException35.addSuppressed((java.lang.Throwable) iOException47);
        java.io.IOException iOException62 = new java.io.IOException((java.lang.Throwable) iOException47);
        java.lang.Throwable[] throwableArray63 = iOException47.getSuppressed();
        java.io.IOException iOException67 = new java.io.IOException("34");
        java.io.IOException iOException68 = new java.io.IOException("FFFFFFFF", (java.lang.Throwable) iOException67);
        java.io.IOException iOException69 = new java.io.IOException("\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: 64", (java.lang.Throwable) iOException68);
        iOException47.addSuppressed((java.lang.Throwable) iOException68);
        iOException17.addSuppressed((java.lang.Throwable) iOException68);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray63);
    }

    @Test
    public void test19507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19507");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((int) (byte) -1, writer6);
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper2.translate((-1), writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer27 = null;
        boolean boolean28 = unicodeEscaper25.translate((int) ' ', writer27);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str33 = unicodeEscaper31.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper31.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper25.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper23.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer42 = null;
        boolean boolean43 = unicodeEscaper40.translate((int) '4', writer42);
        java.io.Writer writer45 = null;
        boolean boolean46 = unicodeEscaper40.translate((int) (byte) -1, writer45);
        java.io.Writer writer48 = null;
        boolean boolean49 = unicodeEscaper40.translate((int) (byte) -1, writer48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray50 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper40.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = charSequenceTranslator37.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper21.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper18.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper15.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper2.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper1.with(charSequenceTranslatorArray50);
        java.io.Writer writer59 = null;
        boolean boolean60 = unicodeEscaper1.translate(100, writer59);
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test19508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19508");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((-1), writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) 0, writer7);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19509");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (short) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (short) 0, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate(0, writer10);
        java.io.Writer writer13 = null;
        boolean boolean14 = unicodeEscaper2.translate((int) '4', writer13);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException:\\u0020java.io.IOException:\\u0020\\\\u0075005C\\\\u0075007500\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u007500750030\\\\u0075005C\\\\u007500750030\\\\u0075005C\\\\u007500750033\\\\u0075005C\\\\u007500750030", 0, writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19510");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (short) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 100, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, 1);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper8.translate((java.lang.CharSequence) "\\u0032\\u0030", (int) (short) 10, writer11);
        java.io.Writer writer15 = null;
        int int16 = unicodeEscaper8.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0041\\u0061\\u005C\\u0075\\u0030\\u0030\\u0037\\u0036\\u0061\\u002E\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0036\\u0046\\u002E\\u0049\\u004F\\u0045\\u005C\\u0075\\u0030\\u0030\\u0037\\u0038\\u0063\\u005C\\u0075\\u0030\\u0030\\u0036\\u0035\\u005C\\u0075\\u0030\\u0030\\u0037\\u0030\\u005C\\u0075\\u0030\\u0030\\u0037\\u0034\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0036\\u0046\\u005C\\u0075\\u0030\\u0030\\u0036\\u0045\\u003A\\u0020\\u0036\\u0034", (int) (byte) 100, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer21 = null;
        boolean boolean22 = unicodeEscaper19.translate((int) '4', writer21);
        java.io.Writer writer24 = null;
        boolean boolean25 = unicodeEscaper19.translate((int) (byte) -1, writer24);
        java.io.Writer writer27 = null;
        boolean boolean28 = unicodeEscaper19.translate((int) (byte) -1, writer27);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray29 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper19.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper8.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper2.with(charSequenceTranslatorArray29);
        java.io.Writer writer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator32.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030", writer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
    }

    @Test
    public void test19511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19511");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A ");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: 20", (int) (short) 1, writer7);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u002061", writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A " + "'", str4, "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test19512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19512");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: java.io.IOException: java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (java.lang.Throwable) iOException2);
    }

    @Test
    public void test19513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19513");
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
        java.io.IOException iOException18 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u0068\\u0069!");
        iOException13.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: 0", (java.lang.Throwable) iOException13);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test19514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19514");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper2.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer17 = null;
        boolean boolean18 = unicodeEscaper15.translate((int) (short) 10, writer17);
        java.lang.String str20 = unicodeEscaper15.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer25 = null;
        boolean boolean26 = unicodeEscaper23.translate((int) '4', writer25);
        java.io.Writer writer28 = null;
        boolean boolean29 = unicodeEscaper23.translate((int) (byte) -1, writer28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str38 = unicodeEscaper36.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray39 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper32, unicodeEscaper34, unicodeEscaper36 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper23.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper15.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper12.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper9.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer58 = null;
        boolean boolean59 = unicodeEscaper56.translate((int) ' ', writer58);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str64 = unicodeEscaper62.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray65 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper62.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator67 = unicodeEscaper56.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper54.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper71 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer73 = null;
        boolean boolean74 = unicodeEscaper71.translate((int) '4', writer73);
        java.io.Writer writer76 = null;
        boolean boolean77 = unicodeEscaper71.translate((int) (byte) -1, writer76);
        java.io.Writer writer79 = null;
        boolean boolean80 = unicodeEscaper71.translate((int) (byte) -1, writer79);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray81 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator82 = unicodeEscaper71.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = charSequenceTranslator68.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = unicodeEscaper52.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = unicodeEscaper49.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator86 = unicodeEscaper46.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator87 = charSequenceTranslator43.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator88 = unicodeEscaper2.with(charSequenceTranslatorArray81);
        java.io.Writer writer90 = null;
        boolean boolean91 = unicodeEscaper2.translate((int) (byte) 1, writer90);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str38, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0" + "'", str64, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(charSequenceTranslator67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
        org.junit.Assert.assertNotNull(unicodeEscaper71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray81);
        org.junit.Assert.assertNotNull(charSequenceTranslator82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
        org.junit.Assert.assertNotNull(charSequenceTranslator86);
        org.junit.Assert.assertNotNull(charSequenceTranslator87);
        org.junit.Assert.assertNotNull(charSequenceTranslator88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test19515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19515");
        java.io.IOException iOException3 = new java.io.IOException("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0041\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0037\\u0036\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0036\\u0046\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u005C\\u0075\\u0030\\u0030\\u0037\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0033\\u005C\\u0075\\u0030\\u0030\\u0036\\u0035\\u005C\\u0075\\u0030\\u0030\\u0037\\u0030\\u005C\\u0075\\u0030\\u0030\\u0037\\u0034\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0036\\u0046\\u005C\\u0075\\u0030\\u0030\\u0036\\u0045");
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: \\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.io.IOException iOException11 = new java.io.IOException("");
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException14 = new java.io.IOException("");
        iOException12.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("");
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        java.io.IOException iOException20 = new java.io.IOException("");
        iOException18.addSuppressed((java.lang.Throwable) iOException20);
        iOException12.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException23 = new java.io.IOException("0", (java.lang.Throwable) iOException12);
        java.io.IOException iOException24 = new java.io.IOException("\\u0033\\u0034", (java.lang.Throwable) iOException12);
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030", (java.lang.Throwable) iOException12);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0");
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException27);
        iOException12.addSuppressed((java.lang.Throwable) iOException28);
        iOException6.addSuppressed((java.lang.Throwable) iOException28);
        java.io.IOException iOException34 = new java.io.IOException("61");
        java.io.IOException iOException35 = new java.io.IOException("34", (java.lang.Throwable) iOException34);
        java.io.IOException iOException36 = new java.io.IOException((java.lang.Throwable) iOException34);
        java.io.IOException iOException37 = new java.io.IOException("java\\u005Cu\\u0030\\u0030\\u0032\\u0045io\\u005Cu\\u0030\\u0030\\u0032\\u0045\\u005Cu\\u0030\\u0030\\u0034\\u0039\\u005Cu\\u0030\\u0030\\u0034\\u0046\\u005Cu\\u0030\\u0030\\u0034\\u0035xception\\u005Cu\\u0030\\u0030\\u0033\\u0041\\u005Cu\\u0030\\u0030\\u0032\\u0030java\\u005Cu\\u0030\\u0030\\u0032\\u0045io\\u005Cu\\u0030\\u0030\\u0032\\u0045\\u005Cu\\u0030\\u0030\\u0034\\u0039\\u005Cu\\u0030\\u0030\\u0034\\u0046\\u005Cu\\u0030\\u0030\\u0034\\u0035xception", (java.lang.Throwable) iOException34);
        java.io.IOException iOException40 = new java.io.IOException("");
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) iOException40);
        java.io.IOException iOException43 = new java.io.IOException("");
        iOException41.addSuppressed((java.lang.Throwable) iOException43);
        java.io.IOException iOException46 = new java.io.IOException("");
        java.io.IOException iOException47 = new java.io.IOException((java.lang.Throwable) iOException46);
        java.io.IOException iOException49 = new java.io.IOException("");
        iOException47.addSuppressed((java.lang.Throwable) iOException49);
        iOException41.addSuppressed((java.lang.Throwable) iOException47);
        java.io.IOException iOException52 = new java.io.IOException("\\u005C\\u00750033\\u005C\\u00750034", (java.lang.Throwable) iOException47);
        iOException37.addSuppressed((java.lang.Throwable) iOException47);
        iOException6.addSuppressed((java.lang.Throwable) iOException47);
    }

    @Test
    public void test19516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19516");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("0", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("hi!", (java.lang.Throwable) iOException14);
        java.io.IOException iOException18 = new java.io.IOException("");
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException21 = new java.io.IOException("");
        iOException19.addSuppressed((java.lang.Throwable) iOException21);
        java.io.IOException iOException24 = new java.io.IOException("");
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) iOException24);
        java.io.IOException iOException27 = new java.io.IOException("");
        iOException25.addSuppressed((java.lang.Throwable) iOException27);
        iOException19.addSuppressed((java.lang.Throwable) iOException25);
        iOException16.addSuppressed((java.lang.Throwable) iOException19);
        java.io.IOException iOException31 = new java.io.IOException("java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (java.lang.Throwable) iOException19);
        iOException9.addSuppressed((java.lang.Throwable) iOException31);
        java.lang.Throwable[] throwableArray33 = iOException31.getSuppressed();
        java.io.IOException iOException35 = new java.io.IOException();
        java.io.IOException iOException36 = new java.io.IOException();
        iOException35.addSuppressed((java.lang.Throwable) iOException36);
        java.io.IOException iOException38 = new java.io.IOException("0", (java.lang.Throwable) iOException35);
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException38);
        java.io.IOException iOException40 = new java.io.IOException((java.lang.Throwable) iOException39);
        java.io.IOException iOException42 = new java.io.IOException();
        java.io.IOException iOException43 = new java.io.IOException();
        iOException42.addSuppressed((java.lang.Throwable) iOException43);
        java.lang.Throwable[] throwableArray45 = iOException43.getSuppressed();
        java.lang.Throwable[] throwableArray46 = iOException43.getSuppressed();
        java.io.IOException iOException47 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException43);
        java.io.IOException iOException48 = new java.io.IOException();
        java.io.IOException iOException49 = new java.io.IOException();
        iOException48.addSuppressed((java.lang.Throwable) iOException49);
        java.io.IOException iOException51 = new java.io.IOException((java.lang.Throwable) iOException48);
        java.lang.Throwable[] throwableArray52 = iOException51.getSuppressed();
        iOException47.addSuppressed((java.lang.Throwable) iOException51);
        iOException39.addSuppressed((java.lang.Throwable) iOException51);
        iOException31.addSuppressed((java.lang.Throwable) iOException51);
        java.io.IOException iOException56 = new java.io.IOException((java.lang.Throwable) iOException51);
        java.io.IOException iOException57 = new java.io.IOException("java.io.IOException: \\u0030", (java.lang.Throwable) iOException56);
        java.io.IOException iOException58 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u00750068\\\\u00750069!", (java.lang.Throwable) iOException56);
        java.io.IOException iOException59 = new java.io.IOException((java.lang.Throwable) iOException58);
        java.io.IOException iOException60 = new java.io.IOException((java.lang.Throwable) iOException59);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test19517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19517");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((int) (byte) 100, writer10);
        java.io.Writer writer13 = null;
        boolean boolean14 = unicodeEscaper2.translate((int) (short) -1, writer13);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19518");
        java.io.IOException iOException7 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException("hi!", (java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException7);
        java.io.IOException iOException12 = new java.io.IOException();
        java.io.IOException iOException13 = new java.io.IOException();
        iOException12.addSuppressed((java.lang.Throwable) iOException13);
        java.lang.Throwable[] throwableArray15 = iOException13.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException13);
        iOException10.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.lang.Throwable[] throwableArray19 = iOException18.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException18);
        java.io.IOException iOException21 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: \\\\u00750068\\\\u00750069\\\\u00750021", (java.lang.Throwable) iOException18);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException23 = new java.io.IOException("java.io.IOException: \\u005Cu\\u0030\\u0030\\u0036\\u0041\\u005Cu\\u0030\\u0030\\u0036\\u0031\\u005Cu\\u0030\\u0030\\u0037\\u0036\\u005Cu\\u0030\\u0030\\u0036\\u0031\\u005Cu\\u0030\\u0030\\u0032\\u0045\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0036\\u0046\\u005Cu\\u0030\\u0030\\u0032\\u0045\\u005Cu\\u0030\\u0030\\u0034\\u0039\\u005Cu\\u0030\\u0030\\u0034\\u0046\\u005Cu\\u0030\\u0030\\u0034\\u0035\\u005Cu\\u0030\\u0030\\u0037\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0033\\u005Cu\\u0030\\u0030\\u0036\\u0035\\u005Cu\\u0030\\u0030\\u0037\\u0030\\u005Cu\\u0030\\u0030\\u0037\\u0034\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0036\\u0046\\u005Cu\\u0030\\u0030\\u0036\\u0045", (java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException23);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test19519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19519");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
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
        java.io.IOException iOException21 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException18);
        java.io.IOException iOException22 = new java.io.IOException("64", (java.lang.Throwable) iOException21);
        iOException4.addSuppressed((java.lang.Throwable) iOException21);
        java.io.IOException iOException24 = new java.io.IOException("1", (java.lang.Throwable) iOException21);
        java.lang.Throwable[] throwableArray25 = iOException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = iOException24.getSuppressed();
        java.io.IOException iOException29 = new java.io.IOException("");
        java.io.IOException iOException30 = new java.io.IOException((java.lang.Throwable) iOException29);
        java.io.IOException iOException32 = new java.io.IOException("");
        iOException30.addSuppressed((java.lang.Throwable) iOException32);
        java.io.IOException iOException34 = new java.io.IOException("java.io.IOException: 0", (java.lang.Throwable) iOException32);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException32);
        iOException24.addSuppressed((java.lang.Throwable) iOException35);
        java.lang.String str37 = iOException24.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.io.IOException: 1" + "'", str37, "java.io.IOException: 1");
    }

    @Test
    public void test19520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19520");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException(throwable1);
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: \\u0068\\u0069\\u0021", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.String str8 = iOException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException" + "'", str8, "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test19521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19521");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (short) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) -1, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, 0);
        java.lang.String str10 = unicodeEscaper8.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A ");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', 0);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper13.translate((int) (short) 1, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (byte) 10);
        java.io.Writer writer21 = null;
        boolean boolean22 = unicodeEscaper19.translate((int) (byte) 0, writer21);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
        java.lang.String str29 = unicodeEscaper27.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray39 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper38 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper35.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper32.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper27.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper24.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer51 = null;
        boolean boolean52 = unicodeEscaper49.translate((int) '4', writer51);
        java.io.Writer writer54 = null;
        boolean boolean55 = unicodeEscaper49.translate((int) (byte) -1, writer54);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str64 = unicodeEscaper62.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray65 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper58, unicodeEscaper60, unicodeEscaper62 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper49.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator67 = unicodeEscaper46.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper24.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator69 = unicodeEscaper19.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator70 = unicodeEscaper13.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator71 = unicodeEscaper8.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator72 = unicodeEscaper2.with(charSequenceTranslatorArray65);
        java.io.Writer writer75 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int76 = charSequenceTranslator72.translate((java.lang.CharSequence) "java.io.IOException: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006A\\\\u00750061\\u0076\\\\u00750061\\\\u0075002E\\u0069\\u006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\u0078\\\\u00750063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\\\u0075003A\\\\u00750020", 1, writer75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A " + "'", str10, "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A ");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str29, "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str64, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(charSequenceTranslator67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
        org.junit.Assert.assertNotNull(charSequenceTranslator69);
        org.junit.Assert.assertNotNull(charSequenceTranslator70);
        org.junit.Assert.assertNotNull(charSequenceTranslator71);
        org.junit.Assert.assertNotNull(charSequenceTranslator72);
    }

    @Test
    public void test19522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19522");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (int) (byte) 0, writer5);
        java.io.Writer writer9 = null;
        int int10 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) (short) 100, writer9);
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper2.translate((int) (byte) 0, writer12);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19523");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(10, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) '4');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer22 = null;
        boolean boolean23 = unicodeEscaper20.translate((int) '4', writer22);
        java.io.Writer writer25 = null;
        boolean boolean26 = unicodeEscaper20.translate((int) (byte) -1, writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str35 = unicodeEscaper33.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray36 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper29, unicodeEscaper31, unicodeEscaper33 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper20.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper17.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper14.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper11.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper8.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str46 = unicodeEscaper44.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray47 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper44.with(charSequenceTranslatorArray47);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = charSequenceTranslator41.with(charSequenceTranslatorArray47);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper2.with(charSequenceTranslatorArray47);
        java.io.Writer writer53 = null;
        int int54 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: \\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (int) (short) 0, writer53);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str35, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0" + "'", str46, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test19524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19524");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        java.lang.String str10 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer20 = null;
        boolean boolean21 = unicodeEscaper18.translate((int) ' ', writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str26 = unicodeEscaper24.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray27 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper24.with(charSequenceTranslatorArray27);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper18.with(charSequenceTranslatorArray27);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper16.with(charSequenceTranslatorArray27);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper13.with(charSequenceTranslatorArray27);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper2.with(charSequenceTranslatorArray27);
        java.io.Writer writer35 = null;
        int int36 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750034", 0, writer35);
        java.io.Writer writer39 = null;
        int int40 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A \\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (int) (short) 10, writer39);
        java.io.Writer writer43 = null;
        int int44 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u0076\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u005C\\u0075\\u0030\\u0030\\u0036\\u0033\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u0076\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u005C\\u0075\\u0030\\u0030\\u0036\\u0033\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030", (int) (byte) 100, writer43);
        java.io.Writer writer47 = null;
        int int48 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\\\u00750068\\\\u00750069\\\\u00750021", 100, writer47);
        java.io.Writer writer50 = null;
        boolean boolean51 = unicodeEscaper2.translate((int) (short) 0, writer50);
        java.lang.String str53 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020\\\\u00750068\\\\u00750069\\\\u00750021");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.io.Writer writer57 = null;
        boolean boolean58 = unicodeEscaper55.translate((int) (byte) 1, writer57);
        java.io.Writer writer60 = null;
        boolean boolean61 = unicodeEscaper55.translate((int) (short) 0, writer60);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper67 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer71 = null;
        boolean boolean72 = unicodeEscaper69.translate((int) ' ', writer71);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper75 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str77 = unicodeEscaper75.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray78 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper75.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper69.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator81 = unicodeEscaper67.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator82 = unicodeEscaper64.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = unicodeEscaper55.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = unicodeEscaper2.with(charSequenceTranslatorArray78);
        java.io.Writer writer87 = null;
        int int88 = charSequenceTranslator84.translate((java.lang.CharSequence) "\\u006A\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u0076\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u005C\\u0075\\u0030\\u0030\\u0036\\u0033\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u0076\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u005C\\u0075\\u0030\\u0030\\u0036\\u0033\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (int) (byte) 10, writer87);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException" + "'", str10, "java.io.IOException");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020\\\\u00750068\\\\u00750069\\\\u00750021" + "'", str53, "java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020\\\\u00750068\\\\u00750069\\\\u00750021");
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertNotNull(unicodeEscaper67);
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "0" + "'", str77, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
        org.junit.Assert.assertNotNull(charSequenceTranslator81);
        org.junit.Assert.assertNotNull(charSequenceTranslator82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test19525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19525");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: java.io.IOException");
        java.io.IOException iOException5 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) iOException5);
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray9 = iOException2.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException2);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.Class<?> wildcardClass13 = iOException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test19526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19526");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0035\\u0043u\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0034\\u0033u\\u005Cu\\u0030\\u0030\\u0035\\u0043u\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043u\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043u\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0035\\u0043u\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030", throwable2);
        java.io.IOException iOException4 = new java.io.IOException("\\\\u0075\\\\u00750030\\\\u007500305C\\u0075\\\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075\\\\u00750030\\\\u007500305C\\u0075\\\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750034", (java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass5 = iOException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test19527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19527");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 100, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) ' ', writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate(1, writer10);
        java.io.Writer writer13 = null;
        boolean boolean14 = unicodeEscaper2.translate((int) ' ', writer13);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19528");
        java.io.IOException iOException3 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u0068\\u0069!");
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException(throwable7);
        java.lang.Throwable[] throwableArray9 = iOException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = iOException8.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException15 = new java.io.IOException("");
        java.io.IOException iOException16 = new java.io.IOException("A", (java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.io.IOException iOException19 = new java.io.IOException();
        java.io.IOException iOException20 = new java.io.IOException();
        iOException19.addSuppressed((java.lang.Throwable) iOException20);
        java.lang.Throwable[] throwableArray22 = iOException20.getSuppressed();
        java.lang.Throwable[] throwableArray23 = iOException20.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException20);
        java.io.IOException iOException25 = new java.io.IOException();
        java.io.IOException iOException26 = new java.io.IOException();
        iOException25.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray29 = iOException28.getSuppressed();
        iOException24.addSuppressed((java.lang.Throwable) iOException28);
        iOException15.addSuppressed((java.lang.Throwable) iOException28);
        java.lang.Throwable[] throwableArray32 = iOException15.getSuppressed();
        java.io.IOException iOException33 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException15);
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) iOException33);
        iOException8.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.Throwable[] throwableArray36 = iOException8.getSuppressed();
        iOException3.addSuppressed((java.lang.Throwable) iOException8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test19529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19529");
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException();
        iOException5.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException("");
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        iOException9.addSuppressed((java.lang.Throwable) iOException15);
        iOException6.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException15);
        java.io.IOException iOException19 = new java.io.IOException("64", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException22 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray23 = iOException22.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException22);
        iOException18.addSuppressed((java.lang.Throwable) iOException22);
        java.io.IOException iOException26 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException18);
        java.io.IOException iOException28 = new java.io.IOException();
        java.io.IOException iOException29 = new java.io.IOException();
        iOException28.addSuppressed((java.lang.Throwable) iOException29);
        java.lang.Throwable[] throwableArray31 = iOException29.getSuppressed();
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException29);
        java.io.IOException iOException34 = new java.io.IOException("");
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException34);
        iOException29.addSuppressed((java.lang.Throwable) iOException35);
        java.lang.Throwable[] throwableArray37 = iOException29.getSuppressed();
        java.io.IOException iOException38 = new java.io.IOException("\\u0068\\u0069\\u0021", (java.lang.Throwable) iOException29);
        java.io.IOException iOException40 = new java.io.IOException("");
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) iOException40);
        java.io.IOException iOException42 = new java.io.IOException((java.lang.Throwable) iOException41);
        iOException38.addSuppressed((java.lang.Throwable) iOException41);
        iOException18.addSuppressed((java.lang.Throwable) iOException38);
        java.io.IOException iOException45 = new java.io.IOException("\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E:\\\\\\u007500750020\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E:\\\\\\u007500750020\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E:\\\\\\u007500750020\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E:\\\\\\u007500750020\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E:\\\\\\u0075007500200", (java.lang.Throwable) iOException18);
        java.io.IOException iOException46 = new java.io.IOException("\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E:\\\\u00750020\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E", (java.lang.Throwable) iOException45);
        java.lang.Class<?> wildcardClass47 = iOException46.getClass();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test19530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19530");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 1);
        java.lang.String str10 = unicodeEscaper8.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: 0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer17 = null;
        boolean boolean18 = unicodeEscaper15.translate((int) '4', writer17);
        java.io.Writer writer20 = null;
        boolean boolean21 = unicodeEscaper15.translate((int) (byte) -1, writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str30 = unicodeEscaper28.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray31 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper24, unicodeEscaper26, unicodeEscaper28 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper15.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer37 = null;
        boolean boolean38 = unicodeEscaper35.translate((int) (short) 10, writer37);
        java.lang.String str40 = unicodeEscaper35.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer45 = null;
        boolean boolean46 = unicodeEscaper43.translate((int) '4', writer45);
        java.io.Writer writer48 = null;
        boolean boolean49 = unicodeEscaper43.translate((int) (byte) -1, writer48);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str58 = unicodeEscaper56.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray59 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper52, unicodeEscaper54, unicodeEscaper56 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = unicodeEscaper43.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = unicodeEscaper35.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper15.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper12.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper8.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper5.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper2.with(charSequenceTranslatorArray59);
        java.io.Writer writer68 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = unicodeEscaper2.translate((int) (byte) 0, writer68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030" + "'", str10, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str30, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str58, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
    }

    @Test
    public void test19531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19531");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u0068\\u0069\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) (short) 10, writer5);
        java.io.Writer writer9 = null;
        int int10 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030", 100, writer9);
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper2.translate((int) 'a', writer12);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19532");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030", throwable1);
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        iOException2.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException();
        iOException10.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException15 = new java.io.IOException("");
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException("");
        iOException16.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: 0", (java.lang.Throwable) iOException18);
        iOException11.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException23 = new java.io.IOException();
        java.io.IOException iOException24 = new java.io.IOException();
        iOException23.addSuppressed((java.lang.Throwable) iOException24);
        iOException11.addSuppressed((java.lang.Throwable) iOException23);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException: \\u005C\\u007500\\u0035\\u0043\\u0075\\u005C\\u00750030\\u005C\\u00750030\\u005C\\u00750033\\u005C\\u00750030", (java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray28 = iOException27.getSuppressed();
        iOException2.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException30 = new java.io.IOException((java.lang.Throwable) iOException27);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException27);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test19533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19533");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", 100, writer8);
        java.io.Writer writer12 = null;
        int int13 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021", 0, writer12);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test19534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19534");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("A", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException2);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test19535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19535");
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
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: java.io.IOException: \\\\u00750068\\\\u00750069\\\\u00750021", (java.lang.Throwable) iOException19);
        java.io.IOException iOException27 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray28 = iOException27.getSuppressed();
        java.io.IOException iOException29 = new java.io.IOException("hi!", (java.lang.Throwable) iOException27);
        java.io.IOException iOException31 = new java.io.IOException("");
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        java.io.IOException iOException34 = new java.io.IOException("");
        iOException32.addSuppressed((java.lang.Throwable) iOException34);
        java.io.IOException iOException37 = new java.io.IOException("");
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) iOException37);
        java.io.IOException iOException40 = new java.io.IOException("");
        iOException38.addSuppressed((java.lang.Throwable) iOException40);
        iOException32.addSuppressed((java.lang.Throwable) iOException38);
        iOException29.addSuppressed((java.lang.Throwable) iOException32);
        java.io.IOException iOException44 = new java.io.IOException("java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (java.lang.Throwable) iOException32);
        java.io.IOException iOException45 = new java.io.IOException("\\u0068\\u0069\\u0021", (java.lang.Throwable) iOException32);
        java.lang.Throwable[] throwableArray46 = iOException45.getSuppressed();
        java.io.IOException iOException47 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException45);
        java.io.IOException iOException48 = new java.io.IOException((java.lang.Throwable) iOException47);
        java.io.IOException iOException49 = new java.io.IOException("java.io.IOException: java.io.IOException: \\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException47);
        iOException19.addSuppressed((java.lang.Throwable) iOException47);
        java.io.IOException iOException54 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray55 = iOException54.getSuppressed();
        java.io.IOException iOException56 = new java.io.IOException("hi!", (java.lang.Throwable) iOException54);
        java.io.IOException iOException57 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException54);
        java.io.IOException iOException58 = new java.io.IOException((java.lang.Throwable) iOException54);
        iOException47.addSuppressed((java.lang.Throwable) iOException54);
        java.lang.Throwable[] throwableArray60 = iOException54.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
    }

    @Test
    public void test19536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19536");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) '#', writer7);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (int) (byte) 0, writer11);
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper2.translate((int) (byte) 10, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.io.Writer writer19 = null;
        boolean boolean20 = unicodeEscaper17.translate((int) 'a', writer19);
        java.io.Writer writer22 = null;
        boolean boolean23 = unicodeEscaper17.translate((int) '#', writer22);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (short) 100);
        java.io.Writer writer28 = null;
        boolean boolean29 = unicodeEscaper26.translate((int) (short) 1, writer28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer41 = null;
        boolean boolean42 = unicodeEscaper39.translate((int) ' ', writer41);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str47 = unicodeEscaper45.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray48 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper45.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper39.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper37.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer56 = null;
        boolean boolean57 = unicodeEscaper54.translate((int) '4', writer56);
        java.io.Writer writer59 = null;
        boolean boolean60 = unicodeEscaper54.translate((int) (byte) -1, writer59);
        java.io.Writer writer62 = null;
        boolean boolean63 = unicodeEscaper54.translate((int) (byte) -1, writer62);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray64 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper54.with(charSequenceTranslatorArray64);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = charSequenceTranslator51.with(charSequenceTranslatorArray64);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator67 = unicodeEscaper35.with(charSequenceTranslatorArray64);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper32.with(charSequenceTranslatorArray64);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator69 = unicodeEscaper26.with(charSequenceTranslatorArray64);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator70 = unicodeEscaper17.with(charSequenceTranslatorArray64);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator71 = unicodeEscaper2.with(charSequenceTranslatorArray64);
        java.io.Writer writer73 = null;
        boolean boolean74 = unicodeEscaper2.translate(0, writer73);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(charSequenceTranslator67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
        org.junit.Assert.assertNotNull(charSequenceTranslator69);
        org.junit.Assert.assertNotNull(charSequenceTranslator70);
        org.junit.Assert.assertNotNull(charSequenceTranslator71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test19537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19537");
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
        java.io.Writer writer40 = null;
        int int41 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u0068\\u0069!", (int) (short) 10, writer40);
        java.io.Writer writer44 = null;
        int int45 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException:\\u0020\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E:\\\\u00750020\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E", (int) (short) 1, writer44);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test19538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19538");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 100, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 100);
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) '#', writer12);
        java.io.Writer writer16 = null;
        int int17 = unicodeEscaper10.translate((java.lang.CharSequence) "\\\\u0075006A\\\\u00750061\\\\u00750076\\\\u00750061\\\\u0075002E\\\\u00750069\\\\u0075006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E\\\\u0075003A\\\\u00750020", (int) (byte) 10, writer16);
        java.lang.String str19 = unicodeEscaper10.translate((java.lang.CharSequence) "java.io.IOException: ");
        java.io.Writer writer22 = null;
        int int23 = unicodeEscaper10.translate((java.lang.CharSequence) "java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u00200", (int) (byte) 10, writer22);
        java.io.Writer writer25 = null;
        boolean boolean26 = unicodeEscaper10.translate((int) (short) -1, writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, 100);
        java.lang.String str31 = unicodeEscaper29.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str36 = unicodeEscaper34.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray37 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper34.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper29.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper10.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper2.with(charSequenceTranslatorArray37);
        java.io.Writer writer43 = null;
        boolean boolean44 = unicodeEscaper2.translate(100, writer43);
        java.io.Writer writer47 = null;
        int int48 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\\\u0075006A\\\\u00750061\\\\u00750076\\\\u00750061\\\\u0075002E\\\\u00750069\\\\u0075006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E\\\\u0075003A\\\\u00750020\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750034", 0, writer47);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.io.IOException: " + "'", str19, "java.io.IOException: ");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str31, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test19539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19539");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(1, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (short) 0, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((int) (byte) 0, writer10);
        java.io.Writer writer14 = null;
        int int15 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061.\\u0069\\u006F.\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A \\u005C\\u0075003\\u0036\\u005C\\u00750034", (int) '4', writer14);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test19540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19540");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(100, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) 10, writer7);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19541");
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
        java.lang.String str36 = unicodeEscaper1.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A \\u0036\\u0034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 0);
        java.io.Writer writer42 = null;
        int int43 = unicodeEscaper39.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: ", (int) (short) 1, writer42);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) 100);
        java.io.Writer writer51 = null;
        int int52 = unicodeEscaper48.translate((java.lang.CharSequence) "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (int) (byte) 0, writer51);
        java.io.Writer writer54 = null;
        boolean boolean55 = unicodeEscaper48.translate((int) '#', writer54);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) 'a');
        java.io.Writer writer60 = null;
        boolean boolean61 = unicodeEscaper58.translate(100, writer60);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper67 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray68 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper67 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator69 = unicodeEscaper64.with(charSequenceTranslatorArray68);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator70 = unicodeEscaper58.with(charSequenceTranslatorArray68);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator71 = unicodeEscaper48.with(charSequenceTranslatorArray68);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator72 = unicodeEscaper45.with(charSequenceTranslatorArray68);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator73 = unicodeEscaper39.with(charSequenceTranslatorArray68);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator74 = unicodeEscaper1.with(charSequenceTranslatorArray68);
        java.io.Writer writer77 = null;
        int int78 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750034", (int) '4', writer77);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A \\u0036\\u0034" + "'", str36, "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A \\u0036\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertNotNull(unicodeEscaper67);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray68);
        org.junit.Assert.assertNotNull(charSequenceTranslator69);
        org.junit.Assert.assertNotNull(charSequenceTranslator70);
        org.junit.Assert.assertNotNull(charSequenceTranslator71);
        org.junit.Assert.assertNotNull(charSequenceTranslator72);
        org.junit.Assert.assertNotNull(charSequenceTranslator73);
        org.junit.Assert.assertNotNull(charSequenceTranslator74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test19542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19542");
        java.io.IOException iOException5 = new java.io.IOException("");
        java.io.IOException iOException6 = new java.io.IOException("A", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException5.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException9 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\\\u0075006A\\\\u00750061\\\\u00750076\\\\u00750061\\\\u0075002E\\\\u00750069\\\\u0075006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E\\\\u0075003A\\\\u00750020", (java.lang.Throwable) iOException8);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u00200", (java.lang.Throwable) iOException11);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test19543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19543");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) '4');
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
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper21.translate((int) (short) 10, writer23);
        java.lang.String str26 = unicodeEscaper21.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer31 = null;
        boolean boolean32 = unicodeEscaper29.translate((int) '4', writer31);
        java.io.Writer writer34 = null;
        boolean boolean35 = unicodeEscaper29.translate((int) (byte) -1, writer34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str44 = unicodeEscaper42.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray45 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper38, unicodeEscaper40, unicodeEscaper42 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper29.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper21.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str52 = unicodeEscaper50.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray53 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper50 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper21.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = charSequenceTranslator18.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper67 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer71 = null;
        boolean boolean72 = unicodeEscaper69.translate((int) ' ', writer71);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper75 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str77 = unicodeEscaper75.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray78 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper75.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper69.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator81 = unicodeEscaper67.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator82 = unicodeEscaper64.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = unicodeEscaper61.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = unicodeEscaper58.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = charSequenceTranslator18.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator86 = unicodeEscaper2.with(charSequenceTranslatorArray78);
        java.io.Writer writer89 = null;
        int int90 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: \\\\u00750068\\\\u00750069\\\\u00750021", 1, writer89);
        java.lang.String str92 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006A\\\\u00750061\\u0076\\\\u00750061\\\\u0075002E\\u0069\\u006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\u0078\\\\u00750063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\\\u0075003A\\\\u00750020");
        java.lang.String str94 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: \\\\u00750036\\\\u00750034");
        java.io.Writer writer96 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = unicodeEscaper2.translate((int) '#', writer96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str44, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str52, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertNotNull(unicodeEscaper61);
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertNotNull(unicodeEscaper67);
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "0" + "'", str77, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
        org.junit.Assert.assertNotNull(charSequenceTranslator81);
        org.junit.Assert.assertNotNull(charSequenceTranslator82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
        org.junit.Assert.assertNotNull(charSequenceTranslator86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "\\u\\u0030\\u00306Aa\\u\\u0030\\u003076a\\u002E\\u\\u0030\\u003069\\u\\u0030\\u00306F\\u002EIOE\\u\\u0030\\u003078\\u\\u0030\\u00306\\u0033\\u\\u0030\\u003065\\u\\u0030\\u00307\\u0030\\u\\u0030\\u00307\\u0034\\u\\u0030\\u003069\\u\\u0030\\u00306F\\u\\u0030\\u00306E:\\u0020\\u\\u0030\\u00306A\\\\u\\u0030\\u003075\\u0030\\u00306\\u0031\\u\\u0030\\u003076\\\\u\\u0030\\u003075\\u0030\\u00306\\u0031\\\\u\\u0030\\u003075\\u0030\\u0030\\u0032E\\u\\u0030\\u003069\\u\\u0030\\u00306F\\\\u\\u0030\\u003075\\u0030\\u0030\\u0032E\\\\u\\u0030\\u003075\\u0030\\u0030\\u00349\\\\u\\u0030\\u003075\\u0030\\u0030\\u0034F\\\\u\\u0030\\u003075\\u0030\\u0030\\u00345\\u\\u0030\\u003078\\\\u\\u0030\\u003075\\u0030\\u00306\\u0033\\u\\u0030\\u003065\\u\\u0030\\u00307\\u0030\\u\\u0030\\u00307\\u0034\\u\\u0030\\u003069\\u\\u0030\\u00306F\\u\\u0030\\u00306E\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033A\\\\u\\u0030\\u003075\\u0030\\u0030\\u0032\\u0030" + "'", str92, "\\u\\u0030\\u00306Aa\\u\\u0030\\u003076a\\u002E\\u\\u0030\\u003069\\u\\u0030\\u00306F\\u002EIOE\\u\\u0030\\u003078\\u\\u0030\\u00306\\u0033\\u\\u0030\\u003065\\u\\u0030\\u00307\\u0030\\u\\u0030\\u00307\\u0034\\u\\u0030\\u003069\\u\\u0030\\u00306F\\u\\u0030\\u00306E:\\u0020\\u\\u0030\\u00306A\\\\u\\u0030\\u003075\\u0030\\u00306\\u0031\\u\\u0030\\u003076\\\\u\\u0030\\u003075\\u0030\\u00306\\u0031\\\\u\\u0030\\u003075\\u0030\\u0030\\u0032E\\u\\u0030\\u003069\\u\\u0030\\u00306F\\\\u\\u0030\\u003075\\u0030\\u0030\\u0032E\\\\u\\u0030\\u003075\\u0030\\u0030\\u00349\\\\u\\u0030\\u003075\\u0030\\u0030\\u0034F\\\\u\\u0030\\u003075\\u0030\\u0030\\u00345\\u\\u0030\\u003078\\\\u\\u0030\\u003075\\u0030\\u00306\\u0033\\u\\u0030\\u003065\\u\\u0030\\u00307\\u0030\\u\\u0030\\u00307\\u0034\\u\\u0030\\u003069\\u\\u0030\\u00306F\\u\\u0030\\u00306E\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033A\\\\u\\u0030\\u003075\\u0030\\u0030\\u0032\\u0030");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "java\\u002Eio\\u002EIOException:\\u0020java\\u002Eio\\u002EIOException:\\u0020\\\\u\\u0030\\u003075\\u0030\\u0030\\u00336\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0034" + "'", str94, "java\\u002Eio\\u002EIOException:\\u0020java\\u002Eio\\u002EIOException:\\u0020\\\\u\\u0030\\u003075\\u0030\\u0030\\u00336\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0034");
    }

    @Test
    public void test19544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19544");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (short) 10, writer3);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper13.translate((int) (short) 10, writer15);
        java.lang.String str18 = unicodeEscaper13.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper21.translate((int) '4', writer23);
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper21.translate((int) (byte) -1, writer26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.lang.String str36 = unicodeEscaper34.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray37 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper30, unicodeEscaper32, unicodeEscaper34 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper21.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper13.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper10.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper7.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper1.with(charSequenceTranslatorArray37);
        java.io.Writer writer44 = null;
        boolean boolean45 = unicodeEscaper1.translate(1, writer44);
        java.io.Writer writer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\\\u00750020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\\\u00750020\\\\\\u007500750036\\\\\\u007500750034", writer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception" + "'", str36, "java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test19545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19545");
        java.io.IOException iOException1 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\\\u00750068\\\\u00750069\\\\u00750021");
        java.io.IOException iOException3 = new java.io.IOException("23");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass6 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test19546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19546");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper1.translate((int) '#', writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper1.translate((int) (short) 10, writer8);
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper1.translate((int) '#', writer11);
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str3, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19547");
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
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.io.IOException iOException21 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray22 = iOException21.getSuppressed();
        java.io.IOException iOException23 = new java.io.IOException("hi!", (java.lang.Throwable) iOException21);
        java.io.IOException iOException24 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException21);
        iOException16.addSuppressed((java.lang.Throwable) iOException24);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException24);
        iOException5.addSuppressed((java.lang.Throwable) iOException26);
        java.lang.Throwable[] throwableArray28 = iOException5.getSuppressed();
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray30 = iOException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test19548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19548");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("");
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException4.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray13 = iOException4.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray15 = iOException4.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: java.io.IOException");
        java.io.IOException iOException23 = new java.io.IOException("0");
        java.lang.Throwable[] throwableArray24 = iOException23.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException("hi!", (java.lang.Throwable) iOException23);
        iOException20.addSuppressed((java.lang.Throwable) iOException23);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException20);
        java.lang.Throwable[] throwableArray28 = iOException27.getSuppressed();
        java.io.IOException iOException29 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException27);
        java.io.IOException iOException31 = new java.io.IOException("0");
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        java.lang.Throwable[] throwableArray33 = iOException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = iOException32.getSuppressed();
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException32);
        iOException29.addSuppressed((java.lang.Throwable) iOException35);
        iOException16.addSuppressed((java.lang.Throwable) iOException29);
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.io.IOException iOException39 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0036\\u0041\\u0061\\u005Cu\\u0030\\u0030\\u0037\\u0036\\u0061\\u002E\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0036\\u0046\\u002E\\u0049\\u004F\\u0045\\u005Cu\\u0030\\u0030\\u0037\\u0038c\\u005Cu\\u0030\\u0030\\u0036\\u0035\\u005Cu\\u0030\\u0030\\u0037\\u0030\\u005Cu\\u0030\\u0030\\u0037\\u0034\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0036\\u0046\\u005Cu\\u0030\\u0030\\u0036\\u0045\\u003A\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0030\\u0030", (java.lang.Throwable) iOException16);
        java.io.IOException iOException40 = new java.io.IOException("j\\u005Cu\\u0030\\u0030\\u0036\\u0031v\\u005Cu\\u0030\\u0030\\u0036\\u0031\\u005Cu\\u0030\\u0030\\u0032\\u0045io\\u005Cu\\u0030\\u0030\\u0032\\u0045\\u005Cu\\u0030\\u0030\\u0034\\u0039\\u005Cu\\u0030\\u0030\\u0034\\u0046\\u005Cu\\u0030\\u0030\\u0034\\u0035xception", (java.lang.Throwable) iOException39);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test19549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19549");
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
        java.io.IOException iOException15 = new java.io.IOException("java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (java.lang.Throwable) iOException3);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray17 = iOException3.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        java.io.IOException iOException21 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException20);
        iOException3.addSuppressed((java.lang.Throwable) iOException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) iOException21);
        java.io.IOException iOException24 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException23);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) iOException23);
        java.lang.Throwable[] throwableArray26 = iOException23.getSuppressed();
        java.lang.Class<?> wildcardClass27 = throwableArray26.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test19550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19550");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030");
        java.lang.String str7 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030" + "'", str5, "java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0034" + "'", str7, "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0034");
    }

    @Test
    public void test19551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19551");
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
        java.lang.Throwable[] throwableArray14 = iOException3.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray16 = iOException15.getSuppressed();
        java.io.IOException iOException18 = new java.io.IOException();
        java.io.IOException iOException19 = new java.io.IOException();
        iOException18.addSuppressed((java.lang.Throwable) iOException19);
        java.lang.Throwable[] throwableArray21 = iOException19.getSuppressed();
        java.lang.Throwable[] throwableArray22 = iOException19.getSuppressed();
        java.io.IOException iOException23 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException19);
        iOException15.addSuppressed((java.lang.Throwable) iOException23);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.io.IOException iOException27 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: 64");
        java.io.IOException iOException28 = new java.io.IOException();
        java.io.IOException iOException29 = new java.io.IOException();
        iOException28.addSuppressed((java.lang.Throwable) iOException29);
        java.lang.Throwable[] throwableArray31 = iOException29.getSuppressed();
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException29);
        java.io.IOException iOException34 = new java.io.IOException("");
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException34);
        iOException29.addSuppressed((java.lang.Throwable) iOException35);
        java.io.IOException iOException38 = new java.io.IOException("0");
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException38);
        iOException29.addSuppressed((java.lang.Throwable) iOException38);
        iOException27.addSuppressed((java.lang.Throwable) iOException38);
        iOException15.addSuppressed((java.lang.Throwable) iOException38);
        java.io.IOException iOException43 = new java.io.IOException("java.io.IOException: \\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (java.lang.Throwable) iOException15);
        java.io.IOException iOException44 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061.\\u0069\\u006F.\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A \\u005C\\u0075003\\u0036\\u005C\\u00750034", (java.lang.Throwable) iOException15);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test19552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19552");
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
        java.io.IOException iOException32 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException29);
        java.io.IOException iOException33 = new java.io.IOException("64", (java.lang.Throwable) iOException32);
        java.io.IOException iOException34 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException33);
        iOException1.addSuppressed((java.lang.Throwable) iOException33);
        java.io.IOException iOException36 = new java.io.IOException((java.lang.Throwable) iOException33);
        java.lang.String str37 = iOException36.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.io.IOException: java.io.IOException: 64" + "'", str37, "java.io.IOException: java.io.IOException: 64");
    }

    @Test
    public void test19553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19553");
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
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer27 = null;
        boolean boolean28 = unicodeEscaper25.translate((int) (short) 10, writer27);
        java.io.Writer writer30 = null;
        boolean boolean31 = unicodeEscaper25.translate((int) '#', writer30);
        java.io.Writer writer34 = null;
        int int35 = unicodeEscaper25.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException", (int) (byte) 1, writer34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer50 = null;
        boolean boolean51 = unicodeEscaper48.translate((int) ' ', writer50);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str56 = unicodeEscaper54.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray57 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper54.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator59 = unicodeEscaper48.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = unicodeEscaper46.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper63 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer65 = null;
        boolean boolean66 = unicodeEscaper63.translate((int) '4', writer65);
        java.io.Writer writer68 = null;
        boolean boolean69 = unicodeEscaper63.translate((int) (byte) -1, writer68);
        java.io.Writer writer71 = null;
        boolean boolean72 = unicodeEscaper63.translate((int) (byte) -1, writer71);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray73 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator74 = unicodeEscaper63.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = charSequenceTranslator60.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator76 = unicodeEscaper44.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator77 = unicodeEscaper41.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = unicodeEscaper38.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper25.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper2.with(charSequenceTranslatorArray73);
        java.io.Writer writer82 = null;
        boolean boolean83 = unicodeEscaper2.translate((int) '4', writer82);
        java.lang.String str85 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: \\u005C\\u0075\\u0030\\u0030\\u0036\\u0041\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0037\\u0036\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0036\\u0046\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u005C\\u0075\\u0030\\u0030\\u0037\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0033\\u005C\\u0075\\u0030\\u0030\\u0036\\u0035\\u005C\\u0075\\u0030\\u0030\\u0037\\u0030\\u005C\\u0075\\u0030\\u0030\\u0037\\u0034\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0036\\u0046\\u005C\\u0075\\u0030\\u0030\\u0036\\u0045\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
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
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
        org.junit.Assert.assertNotNull(charSequenceTranslator59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertNotNull(unicodeEscaper63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray73);
        org.junit.Assert.assertNotNull(charSequenceTranslator74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
        org.junit.Assert.assertNotNull(charSequenceTranslator76);
        org.junit.Assert.assertNotNull(charSequenceTranslator77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "java.io.IOException:\\u0020\\u005C\\u0075\\u0030\\u0030\\u0036\\u0041\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0037\\u0036\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0036\\u0046\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u005C\\u0075\\u0030\\u0030\\u0037\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0033\\u005C\\u0075\\u0030\\u0030\\u0036\\u0035\\u005C\\u0075\\u0030\\u0030\\u0037\\u0030\\u005C\\u0075\\u0030\\u0030\\u0037\\u0034\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0036\\u0046\\u005C\\u0075\\u0030\\u0030\\u0036\\u0045\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str85, "java.io.IOException:\\u0020\\u005C\\u0075\\u0030\\u0030\\u0036\\u0041\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0037\\u0036\\u005C\\u0075\\u0030\\u0030\\u0036\\u0031\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0036\\u0046\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u005C\\u0075\\u0030\\u0030\\u0037\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0033\\u005C\\u0075\\u0030\\u0030\\u0036\\u0035\\u005C\\u0075\\u0030\\u0030\\u0037\\u0030\\u005C\\u0075\\u0030\\u0030\\u0037\\u0034\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0036\\u0046\\u005C\\u0075\\u0030\\u0030\\u0036\\u0045\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
    }

    @Test
    public void test19554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19554");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u0020java.io.IOException:\\u002064", (java.lang.Throwable) iOException2);
    }

    @Test
    public void test19555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19555");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException("");
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        iOException3.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray12 = iOException3.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException14 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException3);
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException: \\u005C\\u007500\\u0035\\u0043\\u0075\\u005C\\u00750030\\u005C\\u00750030\\u005C\\u00750033\\u005C\\u00750030", (java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException();
        java.io.IOException iOException17 = new java.io.IOException();
        iOException16.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.Throwable[] throwableArray19 = iOException17.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException17);
        java.io.IOException iOException22 = new java.io.IOException("");
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) iOException22);
        iOException17.addSuppressed((java.lang.Throwable) iOException23);
        java.io.IOException iOException26 = new java.io.IOException();
        java.io.IOException iOException27 = new java.io.IOException();
        iOException26.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException29 = new java.io.IOException();
        java.io.IOException iOException30 = new java.io.IOException();
        iOException29.addSuppressed((java.lang.Throwable) iOException30);
        java.lang.Throwable[] throwableArray32 = iOException30.getSuppressed();
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.io.IOException iOException35 = new java.io.IOException("");
        java.io.IOException iOException36 = new java.io.IOException((java.lang.Throwable) iOException35);
        iOException30.addSuppressed((java.lang.Throwable) iOException36);
        iOException27.addSuppressed((java.lang.Throwable) iOException36);
        java.io.IOException iOException39 = new java.io.IOException("java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020java\\u002Eio\\u002E\\u0049\\u004F\\u0045xception", (java.lang.Throwable) iOException27);
        java.io.IOException iOException40 = new java.io.IOException((java.lang.Throwable) iOException27);
        iOException23.addSuppressed((java.lang.Throwable) iOException27);
        iOException14.addSuppressed((java.lang.Throwable) iOException27);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test19556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19556");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) '#', writer7);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (int) (byte) 0, writer11);
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper2.translate((int) (byte) 10, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer25 = null;
        boolean boolean26 = unicodeEscaper23.translate((int) ' ', writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str31 = unicodeEscaper29.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray32 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper29.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper23.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper21.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper18.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper2.with(charSequenceTranslatorArray32);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper2.translate((int) ' ', writer39);
        java.io.Writer writer42 = null;
        boolean boolean43 = unicodeEscaper2.translate(0, writer42);
        java.io.Writer writer46 = null;
        int int47 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045x\\u0063eption\\u003A\\u0020", 1, writer46);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test19557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19557");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((-1), writer6);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unicodeEscaper2.translate((int) (short) 10, writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0041\\u005Cu\\u0030\\u0030\\u0036\\u0031\\u005Cu\\u0030\\u0030\\u0037\\u0036\\u005Cu\\u0030\\u0030\\u0036\\u0031\\u005Cu\\u0030\\u0030\\u0032\\u0045\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0036\\u0046\\u005Cu\\u0030\\u0030\\u0032\\u0045\\u005Cu\\u0030\\u0030\\u0034\\u0039\\u005Cu\\u0030\\u0030\\u0034\\u0046\\u005Cu\\u0030\\u0030\\u0034\\u0035\\u005Cu\\u0030\\u0030\\u0037\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0033\\u005Cu\\u0030\\u0030\\u0036\\u0035\\u005Cu\\u0030\\u0030\\u0037\\u0030\\u005Cu\\u0030\\u0030\\u0037\\u0034\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0036\\u0046\\u005Cu\\u0030\\u0030\\u0036\\u0045\\u005Cu\\u0030\\u0030\\u0033\\u0041\\u005Cu\\u0030\\u0030\\u0032\\u0030" + "'", str4, "\\u005Cu\\u0030\\u0030\\u0036\\u0041\\u005Cu\\u0030\\u0030\\u0036\\u0031\\u005Cu\\u0030\\u0030\\u0037\\u0036\\u005Cu\\u0030\\u0030\\u0036\\u0031\\u005Cu\\u0030\\u0030\\u0032\\u0045\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0036\\u0046\\u005Cu\\u0030\\u0030\\u0032\\u0045\\u005Cu\\u0030\\u0030\\u0034\\u0039\\u005Cu\\u0030\\u0030\\u0034\\u0046\\u005Cu\\u0030\\u0030\\u0034\\u0035\\u005Cu\\u0030\\u0030\\u0037\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0033\\u005Cu\\u0030\\u0030\\u0036\\u0035\\u005Cu\\u0030\\u0030\\u0037\\u0030\\u005Cu\\u0030\\u0030\\u0037\\u0034\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0036\\u0046\\u005Cu\\u0030\\u0030\\u0036\\u0045\\u005Cu\\u0030\\u0030\\u0033\\u0041\\u005Cu\\u0030\\u0030\\u0032\\u0030");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19558");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException(throwable3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: \\u0068\\u0069\\u0021", (java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException();
        java.io.IOException iOException10 = new java.io.IOException();
        iOException9.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("0", (java.lang.Throwable) iOException9);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.lang.Throwable[] throwableArray16 = iOException15.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException: java.io.IOException", (java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException15);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException21 = new java.io.IOException();
        java.io.IOException iOException22 = new java.io.IOException();
        iOException21.addSuppressed((java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException();
        java.io.IOException iOException25 = new java.io.IOException();
        iOException24.addSuppressed((java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray27 = iOException25.getSuppressed();
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException25);
        java.io.IOException iOException30 = new java.io.IOException("");
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        iOException25.addSuppressed((java.lang.Throwable) iOException31);
        iOException22.addSuppressed((java.lang.Throwable) iOException31);
        java.io.IOException iOException34 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException31);
        java.io.IOException iOException37 = new java.io.IOException("");
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) iOException37);
        java.io.IOException iOException40 = new java.io.IOException("");
        iOException38.addSuppressed((java.lang.Throwable) iOException40);
        java.io.IOException iOException42 = new java.io.IOException("java.io.IOException: 0", (java.lang.Throwable) iOException40);
        iOException31.addSuppressed((java.lang.Throwable) iOException40);
        java.io.IOException iOException44 = new java.io.IOException((java.lang.Throwable) iOException31);
        iOException19.addSuppressed((java.lang.Throwable) iOException31);
        iOException5.addSuppressed((java.lang.Throwable) iOException31);
        java.io.IOException iOException48 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray49 = iOException48.getSuppressed();
        iOException5.addSuppressed((java.lang.Throwable) iOException48);
        java.io.IOException iOException51 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray52 = iOException5.getSuppressed();
        java.io.IOException iOException53 = new java.io.IOException("", (java.lang.Throwable) iOException5);
        java.io.IOException iOException54 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray55 = iOException54.getSuppressed();
        java.io.IOException iOException56 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750034", (java.lang.Throwable) iOException54);
        java.io.IOException iOException57 = new java.io.IOException((java.lang.Throwable) iOException54);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
    }

    @Test
    public void test19559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19559");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper4.translate((int) ' ', writer6);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray13 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator14 = unicodeEscaper10.with(charSequenceTranslatorArray13);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper4.with(charSequenceTranslatorArray13);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator16 = unicodeEscaper2.with(charSequenceTranslatorArray13);
        java.lang.String str18 = unicodeEscaper2.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031");
        java.io.Writer writer20 = null;
        boolean boolean21 = unicodeEscaper2.translate((int) 'a', writer20);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray13);
        org.junit.Assert.assertNotNull(charSequenceTranslator14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(charSequenceTranslator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031" + "'", str18, "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test19560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19560");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(100, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper8.translate((int) (short) 10, writer10);
        java.io.Writer writer13 = null;
        boolean boolean14 = unicodeEscaper8.translate((int) '#', writer13);
        java.io.Writer writer16 = null;
        boolean boolean17 = unicodeEscaper8.translate(10, writer16);
        java.io.Writer writer19 = null;
        boolean boolean20 = unicodeEscaper8.translate((int) 'a', writer19);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str27 = unicodeEscaper25.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper25.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper22.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (byte) -1);
        java.lang.String str35 = unicodeEscaper33.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper37.translate((int) ' ', writer39);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str45 = unicodeEscaper43.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray46 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper43.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper37.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper33.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper22.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper8.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper2.with(charSequenceTranslatorArray46);
        java.io.Writer writer54 = null;
        boolean boolean55 = unicodeEscaper2.translate(1, writer54);
        java.io.Writer writer58 = null;
        int int59 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) (byte) 10, writer58);
        java.lang.String str61 = unicodeEscaper2.translate((java.lang.CharSequence) "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031");
        java.io.Writer writer64 = null;
        int int65 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\\\u0075006A\\\\u00750061\\\\u00750076\\\\u00750061\\\\u0075002E\\\\u00750069\\\\u0075006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E\\\\u0075003A\\\\u00750020", (int) '4', writer64);
        java.io.Writer writer67 = null;
        boolean boolean68 = unicodeEscaper2.translate((int) (short) 100, writer67);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str35, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031" + "'", str61, "j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020j\\u0061v\\u0061\\u002Eio\\u002E\\u0049\\u004F\\u0045xception\\u003A\\u0020\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test19561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19561");
        java.io.IOException iOException3 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030");
        java.io.IOException iOException4 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", (java.lang.Throwable) iOException3);
        java.io.IOException iOException9 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a\\\\u0075002E\\u0069\\u006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\\\u0075003A\\\\u00750020\\u006Aa\\u0076a\\\\u0075002E\\u0069\\u006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        iOException3.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray13 = iOException9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test19562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19562");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("A", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException2);
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
        java.io.IOException iOException21 = new java.io.IOException();
        java.io.IOException iOException22 = new java.io.IOException();
        iOException21.addSuppressed((java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException();
        java.io.IOException iOException25 = new java.io.IOException();
        iOException24.addSuppressed((java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray27 = iOException25.getSuppressed();
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException25);
        java.io.IOException iOException30 = new java.io.IOException("");
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        iOException25.addSuppressed((java.lang.Throwable) iOException31);
        iOException22.addSuppressed((java.lang.Throwable) iOException31);
        java.io.IOException iOException34 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException31);
        iOException17.addSuppressed((java.lang.Throwable) iOException34);
        java.io.IOException iOException37 = new java.io.IOException("");
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) iOException37);
        java.io.IOException iOException40 = new java.io.IOException("");
        iOException38.addSuppressed((java.lang.Throwable) iOException40);
        java.io.IOException iOException43 = new java.io.IOException("");
        java.io.IOException iOException44 = new java.io.IOException((java.lang.Throwable) iOException43);
        java.io.IOException iOException46 = new java.io.IOException("");
        iOException44.addSuppressed((java.lang.Throwable) iOException46);
        iOException38.addSuppressed((java.lang.Throwable) iOException44);
        iOException17.addSuppressed((java.lang.Throwable) iOException44);
        java.io.IOException iOException50 = new java.io.IOException((java.lang.Throwable) iOException44);
        java.io.IOException iOException51 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006Aa\\u0076a\\\\u0075002E\\u0069\\u006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\\\u0075003A\\\\u00750020\\u006Aa\\u0076a\\\\u0075002E\\u0069\\u006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException44);
        iOException2.addSuppressed((java.lang.Throwable) iOException44);
        java.lang.Throwable[] throwableArray53 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray54 = iOException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test19563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19563");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException:\\u0020java.io.IOException:\\u002023", (int) (short) 10, writer7);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E: \\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E", (int) (short) -1, writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test19564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19564");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((int) (byte) -1, writer6);
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper2.translate((int) '4', writer9);
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper2.translate(0, writer12);
        java.io.Writer writer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = unicodeEscaper2.translate((java.lang.CharSequence) "java\\u002Eio\\u002EIOException:\\u00206\\u0034", 100, writer16);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str4, "\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u005C\\u0075\\u0030\\u0030\\u0033\\u0041\\u005C\\u0075\\u0030\\u0030\\u0032\\u0030\\u006A\\u0061\\u0076\\u0061\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u0069\\u006F\\u005C\\u0075\\u0030\\u0030\\u0032\\u0045\\u005C\\u0075\\u0030\\u0030\\u0034\\u0039\\u005C\\u0075\\u0030\\u0030\\u0034\\u0046\\u005C\\u0075\\u0030\\u0030\\u0034\\u0035\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19565");
        java.io.IOException iOException3 = new java.io.IOException("34");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E: \\u006A\\\\u00750061\\u0076\\\\u00750061\\\\u0075002E\\u0069\\u006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\u0078\\\\u00750063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\\\u0075003A\\\\u00750020", (java.lang.Throwable) iOException5);
    }

    @Test
    public void test19566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19566");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) (short) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 100, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) ' ', writer12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str18 = unicodeEscaper16.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray19 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper16.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper10.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper8.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
        java.lang.String str29 = unicodeEscaper27.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray39 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper38 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper35.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper32.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper27.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper24.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = charSequenceTranslator22.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper2.with(charSequenceTranslatorArray39);
        java.io.Writer writer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = charSequenceTranslator45.translate((java.lang.CharSequence) "\\u006A\\\\u00750061\\u0076\\\\u00750061\\\\u0075002E\\u0069\\u006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\u0078\\\\u00750063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\\\u0075003A\\\\u00750020\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031", (int) (short) -1, writer48);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E" + "'", str29, "\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E");
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
    }

    @Test
    public void test19567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19567");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0", (int) (short) 10, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper2.translate((int) (short) 0, writer8);
        java.lang.String str11 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer13 = null;
        boolean boolean14 = unicodeEscaper2.translate((int) (byte) 0, writer13);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 1);
        java.io.Writer writer23 = null;
        int int24 = unicodeEscaper20.translate((java.lang.CharSequence) "61", (int) (byte) 0, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str31 = unicodeEscaper29.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray32 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper29.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper26.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper20.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper17.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper2.with(charSequenceTranslatorArray32);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper2.translate((int) (short) 100, writer39);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test19568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19568");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: \\u006A\\u0061\\u0076\\u0061.\\u0069\\u006F.\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A \\u005C\\u0075003\\u0036\\u005C\\u00750034", (int) (byte) 10, writer5);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test19569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19569");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (byte) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) -1, writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075006A\\\\u00750061\\\\u00750076\\\\u00750061\\\\u0075002E\\\\u00750069\\\\u0075006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E\\\\u0075003A\\\\u00750020\\\\u0075006A\\\\u00750061\\\\u00750076\\\\u00750061\\\\u0075002E\\\\u00750069\\\\u0075006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E", 100, writer8);
        java.io.Writer writer12 = null;
        int int13 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E:\\\\u00750020\\\\u0075006Aa\\\\u00750076a.\\\\u00750069\\\\u0075006F.IOE\\\\u00750078\\u0063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E", (int) (byte) 1, writer12);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper2.translate((int) (short) 100, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) '4');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper24.translate((int) ' ', writer26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 0);
        java.lang.String str32 = unicodeEscaper30.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray33 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper30.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper24.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper22.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper19.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper2.with(charSequenceTranslatorArray33);
        java.io.Writer writer40 = null;
        boolean boolean41 = unicodeEscaper2.translate((int) (byte) 1, writer40);
        java.io.Writer writer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061.\\u0069\\u006F.\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A \\u005C\\u005C\\u007500\\u0037\\u003500\\u0035\\u0043\\u005C\\u005C\\u007500\\u0037\\u003500\\u0037\\u003500\\u005C\\u005C\\u007500\\u0037\\u0035003\\u0035\\u005C\\u005C\\u007500\\u0037\\u00350043\\u005C\\u005C\\u007500\\u0037\\u003500\\u0037\\u0035\\u005C\\u005C\\u007500\\u0037\\u003500\\u0035\\u0043\\u005C\\u005C\\u007500\\u0037\\u003500\\u0037\\u00350030\\u005C\\u005C\\u007500\\u0037\\u003500\\u0035\\u0043\\u005C\\u005C\\u007500\\u0037\\u003500\\u0037\\u00350030\\u005C\\u005C\\u007500\\u0037\\u003500\\u0035\\u0043\\u005C\\u005C\\u007500\\u0037\\u003500\\u0037\\u00350033\\u005C\\u005C\\u007500\\u0037\\u003500\\u0035\\u0043\\u005C\\u005C\\u007500\\u0037\\u003500\\u0037\\u00350030", writer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test19570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19570");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) '4');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "java.io.IOException: \\u006A\\u0061\\u0076\\u0061.\\u0069\\u006F.\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A \\u005C\\u0075003\\u0036\\u005C\\u00750034");
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper2.translate((int) 'a', writer9);
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper2.translate((int) (byte) 100, writer12);
        java.lang.Class<?> wildcardClass14 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java\\u002Eio\\u002EIOException: \\u\\u0030\\u00306A\\u\\u0030\\u00306\\u0031\\u\\u0030\\u003076\\u\\u0030\\u00306\\u0031\\u002E\\u\\u0030\\u003069\\u\\u0030\\u00306F\\u002E\\u\\u0030\\u0030\\u00349\\u\\u0030\\u0030\\u0034F\\u\\u0030\\u0030\\u00345\\u\\u0030\\u003078\\u\\u0030\\u00306\\u0033\\u\\u0030\\u003065\\u\\u0030\\u00307\\u0030\\u\\u0030\\u00307\\u0034\\u\\u0030\\u003069\\u\\u0030\\u00306F\\u\\u0030\\u00306E\\u\\u0030\\u0030\\u0033A \\u\\u0030\\u00305C\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u\\u0030\\u0030\\u00336\\u\\u0030\\u00305C\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0034" + "'", str7, "java\\u002Eio\\u002EIOException: \\u\\u0030\\u00306A\\u\\u0030\\u00306\\u0031\\u\\u0030\\u003076\\u\\u0030\\u00306\\u0031\\u002E\\u\\u0030\\u003069\\u\\u0030\\u00306F\\u002E\\u\\u0030\\u0030\\u00349\\u\\u0030\\u0030\\u0034F\\u\\u0030\\u0030\\u00345\\u\\u0030\\u003078\\u\\u0030\\u00306\\u0033\\u\\u0030\\u003065\\u\\u0030\\u00307\\u0030\\u\\u0030\\u00307\\u0034\\u\\u0030\\u003069\\u\\u0030\\u00306F\\u\\u0030\\u00306E\\u\\u0030\\u0030\\u0033A \\u\\u0030\\u00305C\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u\\u0030\\u0030\\u00336\\u\\u0030\\u00305C\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test19571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19571");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 100, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate(10, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((int) (short) 10, writer10);
        java.io.Writer writer13 = null;
        boolean boolean14 = unicodeEscaper2.translate((int) (short) 10, writer13);
        java.io.Writer writer17 = null;
        int int18 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0032\\u0030", (int) 'a', writer17);
        java.io.Writer writer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0032\\u0033", writer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test19572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19572");
        java.io.IOException iOException2 = new java.io.IOException("\\\\u0075006A\\\\u00750061\\\\u00750076\\\\u00750061\\\\u0075002E\\\\u00750069\\\\u0075006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E\\\\u0075003A\\\\u00750020\\\\u0075006A\\\\u00750061\\\\u00750076\\\\u00750061\\\\u0075002E\\\\u00750069\\\\u0075006F\\\\u0075002E\\\\u00750049\\\\u0075004F\\\\u00750045\\\\u00750078\\\\u00750063\\\\u00750065\\\\u00750070\\\\u00750074\\\\u00750069\\\\u0075006F\\\\u0075006E");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException("");
        java.io.IOException iOException8 = new java.io.IOException("A", (java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("\\u0033\\u0034", (java.lang.Throwable) iOException7);
        iOException3.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.String str12 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030" + "'", str12, "java.io.IOException: java.io.IOException: \\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u006A\\u0061\\u0076\\u0061\\u002E\\u0069\\u006F\\u002E\\u0049\\u004F\\u0045\\u0078\\u0063\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E\\u003A\\u0020\\u0030");
    }

    @Test
    public void test19573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19573");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray7 = iOException4.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException();
        java.io.IOException iOException10 = new java.io.IOException();
        iOException9.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray13 = iOException12.getSuppressed();
        iOException8.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException16 = new java.io.IOException();
        java.io.IOException iOException17 = new java.io.IOException();
        iOException16.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException();
        java.io.IOException iOException20 = new java.io.IOException();
        iOException19.addSuppressed((java.lang.Throwable) iOException20);
        java.lang.Throwable[] throwableArray22 = iOException20.getSuppressed();
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.io.IOException iOException25 = new java.io.IOException("");
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        iOException20.addSuppressed((java.lang.Throwable) iOException26);
        iOException17.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException29 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException26);
        iOException12.addSuppressed((java.lang.Throwable) iOException29);
        java.io.IOException iOException32 = new java.io.IOException("");
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException32);
        java.io.IOException iOException35 = new java.io.IOException("");
        iOException33.addSuppressed((java.lang.Throwable) iOException35);
        java.lang.Throwable[] throwableArray37 = iOException35.getSuppressed();
        iOException29.addSuppressed((java.lang.Throwable) iOException35);
        java.io.IOException iOException39 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 0", (java.lang.Throwable) iOException29);
        java.io.IOException iOException42 = new java.io.IOException("0");
        java.io.IOException iOException43 = new java.io.IOException();
        java.io.IOException iOException44 = new java.io.IOException();
        iOException43.addSuppressed((java.lang.Throwable) iOException44);
        java.io.IOException iOException46 = new java.io.IOException();
        java.io.IOException iOException47 = new java.io.IOException();
        iOException46.addSuppressed((java.lang.Throwable) iOException47);
        java.lang.Throwable[] throwableArray49 = iOException47.getSuppressed();
        java.io.IOException iOException50 = new java.io.IOException((java.lang.Throwable) iOException47);
        java.io.IOException iOException52 = new java.io.IOException("");
        java.io.IOException iOException53 = new java.io.IOException((java.lang.Throwable) iOException52);
        iOException47.addSuppressed((java.lang.Throwable) iOException53);
        iOException44.addSuppressed((java.lang.Throwable) iOException53);
        iOException42.addSuppressed((java.lang.Throwable) iOException44);
        java.io.IOException iOException57 = new java.io.IOException((java.lang.Throwable) iOException44);
        java.io.IOException iOException58 = new java.io.IOException((java.lang.Throwable) iOException57);
        java.io.IOException iOException59 = new java.io.IOException("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", (java.lang.Throwable) iOException58);
        iOException29.addSuppressed((java.lang.Throwable) iOException58);
        java.io.IOException iOException61 = new java.io.IOException("\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030", (java.lang.Throwable) iOException58);
        java.lang.Throwable[] throwableArray62 = iOException58.getSuppressed();
        java.io.IOException iOException63 = new java.io.IOException((java.lang.Throwable) iOException58);
        java.lang.Throwable[] throwableArray64 = iOException63.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test19574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19574");
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException();
        iOException5.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException();
        java.io.IOException iOException9 = new java.io.IOException();
        iOException8.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException("");
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        iOException9.addSuppressed((java.lang.Throwable) iOException15);
        iOException6.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException15);
        java.io.IOException iOException19 = new java.io.IOException("64", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException("\\u0036\\u0034", (java.lang.Throwable) iOException19);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException24 = new java.io.IOException("\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0034");
        iOException22.addSuppressed((java.lang.Throwable) iOException24);
        java.lang.Throwable[] throwableArray26 = iOException22.getSuppressed();
        java.io.IOException iOException28 = new java.io.IOException();
        java.io.IOException iOException29 = new java.io.IOException();
        iOException28.addSuppressed((java.lang.Throwable) iOException29);
        java.io.IOException iOException31 = new java.io.IOException("0", (java.lang.Throwable) iOException28);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException32);
        java.io.IOException iOException34 = new java.io.IOException();
        java.io.IOException iOException35 = new java.io.IOException();
        iOException34.addSuppressed((java.lang.Throwable) iOException35);
        java.io.IOException iOException37 = new java.io.IOException();
        java.io.IOException iOException38 = new java.io.IOException();
        iOException37.addSuppressed((java.lang.Throwable) iOException38);
        java.lang.Throwable[] throwableArray40 = iOException38.getSuppressed();
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) iOException38);
        java.io.IOException iOException43 = new java.io.IOException("");
        java.io.IOException iOException44 = new java.io.IOException((java.lang.Throwable) iOException43);
        iOException38.addSuppressed((java.lang.Throwable) iOException44);
        iOException35.addSuppressed((java.lang.Throwable) iOException44);
        iOException33.addSuppressed((java.lang.Throwable) iOException44);
        java.io.IOException iOException49 = new java.io.IOException("0");
        java.io.IOException iOException50 = new java.io.IOException();
        java.io.IOException iOException51 = new java.io.IOException();
        iOException50.addSuppressed((java.lang.Throwable) iOException51);
        java.io.IOException iOException53 = new java.io.IOException();
        java.io.IOException iOException54 = new java.io.IOException();
        iOException53.addSuppressed((java.lang.Throwable) iOException54);
        java.lang.Throwable[] throwableArray56 = iOException54.getSuppressed();
        java.io.IOException iOException57 = new java.io.IOException((java.lang.Throwable) iOException54);
        java.io.IOException iOException59 = new java.io.IOException("");
        java.io.IOException iOException60 = new java.io.IOException((java.lang.Throwable) iOException59);
        iOException54.addSuppressed((java.lang.Throwable) iOException60);
        iOException51.addSuppressed((java.lang.Throwable) iOException60);
        iOException49.addSuppressed((java.lang.Throwable) iOException51);
        java.io.IOException iOException64 = new java.io.IOException((java.lang.Throwable) iOException51);
        java.io.IOException iOException68 = new java.io.IOException("");
        java.io.IOException iOException69 = new java.io.IOException((java.lang.Throwable) iOException68);
        java.io.IOException iOException71 = new java.io.IOException("");
        iOException69.addSuppressed((java.lang.Throwable) iOException71);
        java.io.IOException iOException73 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException71);
        java.io.IOException iOException75 = new java.io.IOException("");
        java.io.IOException iOException76 = new java.io.IOException((java.lang.Throwable) iOException75);
        java.io.IOException iOException77 = new java.io.IOException((java.lang.Throwable) iOException75);
        iOException73.addSuppressed((java.lang.Throwable) iOException75);
        java.io.IOException iOException79 = new java.io.IOException("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (java.lang.Throwable) iOException73);
        java.lang.Throwable[] throwableArray80 = iOException79.getSuppressed();
        iOException64.addSuppressed((java.lang.Throwable) iOException79);
        java.io.IOException iOException82 = new java.io.IOException((java.lang.Throwable) iOException79);
        iOException44.addSuppressed((java.lang.Throwable) iOException79);
        iOException22.addSuppressed((java.lang.Throwable) iOException79);
        java.io.IOException iOException85 = new java.io.IOException("\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u006Aa\\u0076a.\\u0069\\u006F.IOE\\u0078c\\u0065\\u0070\\u0074\\u0069\\u006F\\u006E:\\u0020\\u0068\\u0069\\u0021", (java.lang.Throwable) iOException79);
        java.io.IOException iOException87 = new java.io.IOException("\\u005C\\u00750033\\u005C\\u00750034");
        java.io.IOException iOException89 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException");
        java.lang.Throwable[] throwableArray90 = iOException89.getSuppressed();
        iOException87.addSuppressed((java.lang.Throwable) iOException89);
        iOException85.addSuppressed((java.lang.Throwable) iOException87);
        java.lang.Class<?> wildcardClass93 = iOException87.getClass();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }
}

