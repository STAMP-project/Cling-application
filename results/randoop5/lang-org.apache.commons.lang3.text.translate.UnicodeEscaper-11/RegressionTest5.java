import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper4.translate((java.lang.CharSequence) "6\\u0031", 0, writer7);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper4.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", 100, writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) (byte) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str30 = unicodeEscaper28.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer36 = null;
        int int37 = unicodeEscaper33.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer36);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray44 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper33, unicodeEscaper39, unicodeEscaper40, unicodeEscaper43 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper28.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper23.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer52 = null;
        int int53 = unicodeEscaper49.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer52);
        java.io.Writer writer55 = null;
        boolean boolean56 = unicodeEscaper49.translate((int) (byte) -1, writer55);
        java.lang.String str58 = unicodeEscaper49.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str63 = unicodeEscaper61.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray64 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper49, unicodeEscaper61 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper23.with(charSequenceTranslatorArray64);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper18.with(charSequenceTranslatorArray64);
        java.lang.String str68 = unicodeEscaper18.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper71 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper74 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str76 = unicodeEscaper74.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper79 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer82 = null;
        int int83 = unicodeEscaper79.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer82);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper85 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper86 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper89 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray90 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper79, unicodeEscaper85, unicodeEscaper86, unicodeEscaper89 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator91 = unicodeEscaper74.with(charSequenceTranslatorArray90);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator92 = unicodeEscaper71.with(charSequenceTranslatorArray90);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator93 = unicodeEscaper18.with(charSequenceTranslatorArray90);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator94 = unicodeEscaper15.with(charSequenceTranslatorArray90);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator95 = unicodeEscaper4.with(charSequenceTranslatorArray90);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator96 = unicodeEscaper1.with(charSequenceTranslatorArray90);
        java.lang.Class<?> wildcardClass97 = charSequenceTranslator96.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\u0031" + "'", str20, "\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str68, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper71);
        org.junit.Assert.assertNotNull(unicodeEscaper74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper79);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper85);
        org.junit.Assert.assertNotNull(unicodeEscaper89);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray90);
        org.junit.Assert.assertNotNull(charSequenceTranslator91);
        org.junit.Assert.assertNotNull(charSequenceTranslator92);
        org.junit.Assert.assertNotNull(charSequenceTranslator93);
        org.junit.Assert.assertNotNull(charSequenceTranslator94);
        org.junit.Assert.assertNotNull(charSequenceTranslator95);
        org.junit.Assert.assertNotNull(charSequenceTranslator96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (short) -1);
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
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", (int) (short) 100, writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (byte) 0);
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate(0, writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str24 = unicodeEscaper22.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer30 = null;
        int int31 = unicodeEscaper27.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer30);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray38 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper27, unicodeEscaper33, unicodeEscaper34, unicodeEscaper37 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper22.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper17.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper14.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper9.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper2.with(charSequenceTranslatorArray38);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', 1);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((-1), writer6);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unicodeEscaper2.translate((int) (byte) 1, writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper7.translate((int) (short) 0, writer9);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray14 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper7, unicodeEscaper11, unicodeEscaper13 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper4.with(charSequenceTranslatorArray14);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator16 = unicodeEscaper2.with(charSequenceTranslatorArray14);
        java.io.Writer writer19 = null;
        int int20 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) 1, writer19);
        java.io.Writer writer23 = null;
        int int24 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0034\\u0036\\u005C\\u0075\\u0030\\u0030\\u0034\\u0036\\u005C\\u0075\\u0030\\u0030\\u0034\\u0036\\u005C\\u0075\\u0030\\u0030\\u0034\\u0036\\u005C\\u0075\\u0030\\u0030\\u0034\\u0036\\u005C\\u0075\\u0030\\u0030\\u0034\\u0036\\u005C\\u0075\\u0030\\u0030\\u0034\\u0036\\u005C\\u0075\\u0030\\u0030\\u0034\\u0036", (int) (byte) 0, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str32 = unicodeEscaper30.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer38 = null;
        int int39 = unicodeEscaper35.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer38);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray46 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper35, unicodeEscaper41, unicodeEscaper42, unicodeEscaper45 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper30.with(charSequenceTranslatorArray46);
        java.lang.String str49 = unicodeEscaper30.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str54 = unicodeEscaper52.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str59 = unicodeEscaper57.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer65 = null;
        int int66 = unicodeEscaper62.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer65);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper68 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper72 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray73 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper62, unicodeEscaper68, unicodeEscaper69, unicodeEscaper72 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator74 = unicodeEscaper57.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = unicodeEscaper52.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper77 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper80 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer82 = null;
        boolean boolean83 = unicodeEscaper80.translate((int) (short) 0, writer82);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper84 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper86 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray87 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper80, unicodeEscaper84, unicodeEscaper86 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator88 = unicodeEscaper77.with(charSequenceTranslatorArray87);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator89 = charSequenceTranslator75.with(charSequenceTranslatorArray87);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator90 = unicodeEscaper30.with(charSequenceTranslatorArray87);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator91 = unicodeEscaper27.with(charSequenceTranslatorArray87);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator92 = unicodeEscaper2.with(charSequenceTranslatorArray87);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(charSequenceTranslator16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str54, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper68);
        org.junit.Assert.assertNotNull(unicodeEscaper72);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray73);
        org.junit.Assert.assertNotNull(charSequenceTranslator74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
        org.junit.Assert.assertNotNull(unicodeEscaper77);
        org.junit.Assert.assertNotNull(unicodeEscaper80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper86);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray87);
        org.junit.Assert.assertNotNull(charSequenceTranslator88);
        org.junit.Assert.assertNotNull(charSequenceTranslator89);
        org.junit.Assert.assertNotNull(charSequenceTranslator90);
        org.junit.Assert.assertNotNull(charSequenceTranslator91);
        org.junit.Assert.assertNotNull(charSequenceTranslator92);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str10 = unicodeEscaper8.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str15 = unicodeEscaper13.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer21 = null;
        int int22 = unicodeEscaper18.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer21);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray29 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper18, unicodeEscaper24, unicodeEscaper25, unicodeEscaper28 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper13.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper8.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper5.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper2.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        java.io.Writer writer45 = null;
        int int46 = unicodeEscaper42.translate((java.lang.CharSequence) "61", (int) (short) 0, writer45);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str54 = unicodeEscaper52.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str59 = unicodeEscaper57.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer65 = null;
        int int66 = unicodeEscaper62.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer65);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper68 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper72 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray73 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper62, unicodeEscaper68, unicodeEscaper69, unicodeEscaper72 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator74 = unicodeEscaper57.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = unicodeEscaper52.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator76 = unicodeEscaper49.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator77 = unicodeEscaper42.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = unicodeEscaper39.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper36.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper2.with(charSequenceTranslatorArray73);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str10, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str54, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper68);
        org.junit.Assert.assertNotNull(unicodeEscaper72);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray73);
        org.junit.Assert.assertNotNull(charSequenceTranslator74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
        org.junit.Assert.assertNotNull(charSequenceTranslator76);
        org.junit.Assert.assertNotNull(charSequenceTranslator77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer18 = null;
        int int19 = unicodeEscaper15.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper15, unicodeEscaper21, unicodeEscaper22, unicodeEscaper25 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper5.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer34 = null;
        int int35 = unicodeEscaper31.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer34);
        java.io.Writer writer37 = null;
        boolean boolean38 = unicodeEscaper31.translate((int) (byte) -1, writer37);
        java.lang.String str40 = unicodeEscaper31.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str45 = unicodeEscaper43.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray46 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper31, unicodeEscaper43 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper5.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper2.with(charSequenceTranslatorArray46);
        java.lang.String str50 = charSequenceTranslator48.translate((java.lang.CharSequence) "0");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\u0030" + "'", str50, "\\u0030");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        java.lang.String str10 = unicodeEscaper8.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.lang.String str15 = unicodeEscaper13.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer31 = null;
        int int32 = unicodeEscaper28.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray39 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper28, unicodeEscaper34, unicodeEscaper35, unicodeEscaper38 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper23.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper18.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper13.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper8.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper5.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer54 = null;
        boolean boolean55 = unicodeEscaper52.translate((int) (short) 0, writer54);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray59 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper52, unicodeEscaper56, unicodeEscaper58 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = unicodeEscaper49.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = unicodeEscaper47.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = charSequenceTranslator44.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper2.with(charSequenceTranslatorArray59);
        java.lang.String str65 = charSequenceTranslator63.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FFFFFFFF" + "'", str15, "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str20, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(unicodeEscaper47);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033" + "'", str65, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer15 = null;
        int int16 = unicodeEscaper12.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray23 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper12, unicodeEscaper18, unicodeEscaper19, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper7.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator25 = unicodeEscaper2.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer31 = null;
        int int32 = unicodeEscaper28.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer31);
        java.io.Writer writer34 = null;
        boolean boolean35 = unicodeEscaper28.translate((int) (byte) -1, writer34);
        java.lang.String str37 = unicodeEscaper28.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str42 = unicodeEscaper40.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray43 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper28, unicodeEscaper40 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper2.with(charSequenceTranslatorArray43);
        java.lang.Class<?> wildcardClass45 = charSequenceTranslatorArray43.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(charSequenceTranslator25);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) (short) 1);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.lang.String str15 = unicodeEscaper13.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer31 = null;
        int int32 = unicodeEscaper28.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray39 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper28, unicodeEscaper34, unicodeEscaper35, unicodeEscaper38 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper23.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper18.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper13.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper10.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper5.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper2.with(charSequenceTranslatorArray39);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str7, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FFFFFFFF" + "'", str15, "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str20, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
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
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (short) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "6\\\\u00750031");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031" + "'", str4, "\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) ' ', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (short) 1, writer7);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) '#', writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0037\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (byte) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(0, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer23 = null;
        int int24 = unicodeEscaper20.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray31 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper20, unicodeEscaper26, unicodeEscaper27, unicodeEscaper30 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper15.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper10.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper7.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper2.with(charSequenceTranslatorArray31);
        java.lang.Class<?> wildcardClass36 = charSequenceTranslator35.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer15 = null;
        int int16 = unicodeEscaper12.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray23 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper12, unicodeEscaper18, unicodeEscaper19, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper7.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator25 = unicodeEscaper2.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer31 = null;
        int int32 = unicodeEscaper28.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer31);
        java.io.Writer writer34 = null;
        boolean boolean35 = unicodeEscaper28.translate((int) (byte) -1, writer34);
        java.lang.String str37 = unicodeEscaper28.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str42 = unicodeEscaper40.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray43 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper28, unicodeEscaper40 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper2.with(charSequenceTranslatorArray43);
        java.lang.String str46 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer49 = null;
        int int50 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0034\\u0031", 0, writer49);
        java.io.Writer writer52 = null;
        boolean boolean53 = unicodeEscaper2.translate(1, writer52);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(charSequenceTranslator25);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\\\u007500750068\\\\\\u007500750069\\\\\\u007500750021", (int) (byte) 0, writer5);
        java.lang.String str8 = unicodeEscaper2.translate((java.lang.CharSequence) "20");
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", 0, writer11);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033", writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20" + "'", str8, "20");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) 10);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper5.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", 1, writer8);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper12.translate((int) (short) 0, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer31 = null;
        int int32 = unicodeEscaper28.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray39 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper28, unicodeEscaper34, unicodeEscaper35, unicodeEscaper38 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper23.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper18.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper12.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper5.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper2.with(charSequenceTranslatorArray39);
        java.lang.String str46 = unicodeEscaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str48 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "A" + "'", str46, "A");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer10 = null;
        int int11 = unicodeEscaper7.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper7, unicodeEscaper13, unicodeEscaper14, unicodeEscaper17 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper2.with(charSequenceTranslatorArray18);
        java.lang.String str21 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str26 = unicodeEscaper24.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str31 = unicodeEscaper29.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer37 = null;
        int int38 = unicodeEscaper34.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer37);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray45 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper34, unicodeEscaper40, unicodeEscaper41, unicodeEscaper44 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper29.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper24.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer54 = null;
        boolean boolean55 = unicodeEscaper52.translate((int) (short) 0, writer54);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray59 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper52, unicodeEscaper56, unicodeEscaper58 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = unicodeEscaper49.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = charSequenceTranslator47.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper2.with(charSequenceTranslatorArray59);
        java.io.Writer writer64 = null;
        boolean boolean65 = unicodeEscaper2.translate((-1), writer64);
        java.io.Writer writer67 = null;
        boolean boolean68 = unicodeEscaper2.translate(1, writer67);
        java.io.Writer writer70 = null;
        boolean boolean71 = unicodeEscaper2.translate((int) ' ', writer70);
        java.io.Writer writer74 = null;
        int int75 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031", (int) ' ', writer74);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str26, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer15 = null;
        int int16 = unicodeEscaper12.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray23 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper12, unicodeEscaper18, unicodeEscaper19, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper7.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator25 = unicodeEscaper2.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer31 = null;
        int int32 = unicodeEscaper28.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer31);
        java.io.Writer writer34 = null;
        boolean boolean35 = unicodeEscaper28.translate((int) (byte) -1, writer34);
        java.lang.String str37 = unicodeEscaper28.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str42 = unicodeEscaper40.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray43 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper28, unicodeEscaper40 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper2.with(charSequenceTranslatorArray43);
        java.lang.String str46 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.lang.String str48 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper63 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str65 = unicodeEscaper63.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper68 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer71 = null;
        int int72 = unicodeEscaper68.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer71);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper74 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper75 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper78 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray79 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper68, unicodeEscaper74, unicodeEscaper75, unicodeEscaper78 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper63.with(charSequenceTranslatorArray79);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator81 = unicodeEscaper60.with(charSequenceTranslatorArray79);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator82 = unicodeEscaper57.with(charSequenceTranslatorArray79);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = unicodeEscaper54.with(charSequenceTranslatorArray79);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = unicodeEscaper51.with(charSequenceTranslatorArray79);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = unicodeEscaper2.with(charSequenceTranslatorArray79);
        java.io.Writer writer87 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0034\\u0031", writer87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(charSequenceTranslator25);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str48, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertNotNull(unicodeEscaper63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper74);
        org.junit.Assert.assertNotNull(unicodeEscaper78);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
        org.junit.Assert.assertNotNull(charSequenceTranslator81);
        org.junit.Assert.assertNotNull(charSequenceTranslator82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 100, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750030", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 100);
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
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer15 = null;
        int int16 = unicodeEscaper12.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray23 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper12, unicodeEscaper18, unicodeEscaper19, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper7.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator25 = unicodeEscaper2.with(charSequenceTranslatorArray23);
        java.lang.String str27 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        java.io.Writer writer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = unicodeEscaper2.translate((int) (byte) 100, writer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(charSequenceTranslator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str27, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeEscaper2.translate(charSequence5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper2.translate(0, writer8);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0031" + "'", str4, "\\u0031");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str13 = unicodeEscaper11.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str18 = unicodeEscaper16.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer24 = null;
        int int25 = unicodeEscaper21.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer24);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray32 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper21, unicodeEscaper27, unicodeEscaper28, unicodeEscaper31 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper16.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper11.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer41 = null;
        boolean boolean42 = unicodeEscaper39.translate((int) (short) 0, writer41);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray46 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper39, unicodeEscaper43, unicodeEscaper45 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper36.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = charSequenceTranslator34.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper8.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper2.with(charSequenceTranslatorArray46);
        java.io.Writer writer52 = null;
        boolean boolean53 = unicodeEscaper2.translate((int) (byte) 10, writer52);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str13, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (-1));
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer20 = null;
        int int21 = unicodeEscaper17.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper17, unicodeEscaper23, unicodeEscaper24, unicodeEscaper27 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper12.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper7.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper2.with(charSequenceTranslatorArray28);
        java.io.Writer writer33 = null;
        boolean boolean34 = unicodeEscaper2.translate((int) '#', writer33);
        java.lang.String str36 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4, "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str9, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\\u0036\\u0034" + "'", str36, "\\u0036\\u0034");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer15 = null;
        int int16 = unicodeEscaper12.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray23 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper12, unicodeEscaper18, unicodeEscaper19, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper7.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator25 = unicodeEscaper2.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 10);
        java.io.Writer writer29 = null;
        boolean boolean30 = unicodeEscaper27.translate((int) (byte) 100, writer29);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer40 = null;
        boolean boolean41 = unicodeEscaper38.translate((int) (short) 0, writer40);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str46 = unicodeEscaper44.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str51 = unicodeEscaper49.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer57 = null;
        int int58 = unicodeEscaper54.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer57);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray65 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper54, unicodeEscaper60, unicodeEscaper61, unicodeEscaper64 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper49.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator67 = unicodeEscaper44.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper38.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper71 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper74 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper76 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray77 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper32, unicodeEscaper35, charSequenceTranslator68, unicodeEscaper71, unicodeEscaper74, unicodeEscaper76 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = unicodeEscaper27.with(charSequenceTranslatorArray77);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = charSequenceTranslator25.with(charSequenceTranslatorArray77);
        java.lang.String str81 = charSequenceTranslator79.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(charSequenceTranslator25);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(charSequenceTranslator67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
        org.junit.Assert.assertNotNull(unicodeEscaper71);
        org.junit.Assert.assertNotNull(unicodeEscaper74);
        org.junit.Assert.assertNotNull(unicodeEscaper76);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033" + "'", str81, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (int) ' ', writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((int) (byte) 10, writer10);
        java.lang.String str13 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0041");
        java.lang.Class<?> wildcardClass14 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "64" + "'", str4, "64");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0041" + "'", str13, "\\u0041");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046", (int) (byte) 10, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeEscaper2.translate(charSequence7);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750032\\\\u00750033");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeEscaper2.translate(charSequence5);
        java.lang.Class<?> wildcardClass7 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u00750032\\\\u00750033" + "'", str4, "\\\\u00750032\\\\u00750033");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper4.translate(1, writer6);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str24 = unicodeEscaper22.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer30 = null;
        int int31 = unicodeEscaper27.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer30);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray38 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper27, unicodeEscaper33, unicodeEscaper34, unicodeEscaper37 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper22.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper17.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper14.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray50 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper14, unicodeEscaper44, unicodeEscaper47, unicodeEscaper49 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper12.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper9.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper4.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper2.with(charSequenceTranslatorArray50);
        java.lang.String str56 = charSequenceTranslator54.translate((java.lang.CharSequence) "20");
        java.io.Writer writer58 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator54.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertNotNull(unicodeEscaper47);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\\u0032\\u0030" + "'", str56, "\\u0032\\u0030");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u\\u0030\\u003075\\u0030\\u00305C\\\\u\\u0030\\u003075\\u0030\\u003075\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0030\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0030\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0033\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0032\\\\u\\u0030\\u003075\\u0030\\u00305C\\\\u\\u0030\\u003075\\u0030\\u003075\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0030\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0030\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0033\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0033", 10, writer7);
        java.lang.String str10 = unicodeEscaper2.translate((java.lang.CharSequence) "20");
        java.lang.String str12 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unicodeEscaper2.translate(0, writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "20" + "'", str10, "20");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str12, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 10, writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750068\\\\u00750069\\\\u00750021", (int) ' ', writer8);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer17 = null;
        boolean boolean18 = unicodeEscaper15.translate((int) (short) 0, writer17);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str23 = unicodeEscaper21.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str28 = unicodeEscaper26.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer34 = null;
        int int35 = unicodeEscaper31.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray42 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper31, unicodeEscaper37, unicodeEscaper38, unicodeEscaper41 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper26.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper21.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper15.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper12.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper2.with(charSequenceTranslatorArray42);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str10 = unicodeEscaper8.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str15 = unicodeEscaper13.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer21 = null;
        int int22 = unicodeEscaper18.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer21);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray29 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper18, unicodeEscaper24, unicodeEscaper25, unicodeEscaper28 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper13.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper8.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper2.with(charSequenceTranslatorArray29);
        java.lang.String str34 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0034\\u0031");
        java.lang.String str36 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0034\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0034\\u0031" + "'", str34, "\\u005C\\u0075\\u0030\\u0030\\u0034\\u0031");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0034\\u0031" + "'", str36, "\\u005Cu\\u0030\\u0030\\u0034\\u0031");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper8.translate((java.lang.CharSequence) "61", (int) (short) 0, writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer31 = null;
        int int32 = unicodeEscaper28.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray39 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper28, unicodeEscaper34, unicodeEscaper35, unicodeEscaper38 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper23.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper18.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper15.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper8.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper5.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper2.with(charSequenceTranslatorArray39);
        java.lang.String str47 = charSequenceTranslator45.translate((java.lang.CharSequence) "\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str20, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str47, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 10);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper6.translate((int) (byte) 100, writer8);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer19 = null;
        boolean boolean20 = unicodeEscaper17.translate((int) (short) 0, writer19);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str30 = unicodeEscaper28.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer36 = null;
        int int37 = unicodeEscaper33.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer36);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray44 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper33, unicodeEscaper39, unicodeEscaper40, unicodeEscaper43 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper28.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper23.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper17.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper53 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray56 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper11, unicodeEscaper14, charSequenceTranslator47, unicodeEscaper50, unicodeEscaper53, unicodeEscaper55 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper6.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper2.with(charSequenceTranslatorArray56);
        java.io.Writer writer61 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int62 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) (byte) -1, writer61);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0031" + "'", str4, "\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertNotNull(unicodeEscaper53);
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) ' ', writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str10 = unicodeEscaper8.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str22 = unicodeEscaper20.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer28 = null;
        int int29 = unicodeEscaper25.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray36 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper25, unicodeEscaper31, unicodeEscaper32, unicodeEscaper35 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper20.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper15.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper12.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer44 = null;
        boolean boolean45 = unicodeEscaper42.translate((int) (byte) 100, writer44);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str53 = unicodeEscaper51.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer59 = null;
        int int60 = unicodeEscaper56.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer59);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper63 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper66 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray67 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper56, unicodeEscaper62, unicodeEscaper63, unicodeEscaper66 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper51.with(charSequenceTranslatorArray67);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator69 = unicodeEscaper48.with(charSequenceTranslatorArray67);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator70 = unicodeEscaper42.with(charSequenceTranslatorArray67);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator71 = charSequenceTranslator39.with(charSequenceTranslatorArray67);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator72 = unicodeEscaper8.with(charSequenceTranslatorArray67);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator73 = unicodeEscaper2.with(charSequenceTranslatorArray67);
        java.lang.String str75 = charSequenceTranslator73.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertNotNull(unicodeEscaper66);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
        org.junit.Assert.assertNotNull(charSequenceTranslator69);
        org.junit.Assert.assertNotNull(charSequenceTranslator70);
        org.junit.Assert.assertNotNull(charSequenceTranslator71);
        org.junit.Assert.assertNotNull(charSequenceTranslator72);
        org.junit.Assert.assertNotNull(charSequenceTranslator73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str75, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper13.translate((int) (short) 0, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray20 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper13, unicodeEscaper17, unicodeEscaper19 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper10.with(charSequenceTranslatorArray20);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper8.with(charSequenceTranslatorArray20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str30 = unicodeEscaper28.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer36 = null;
        int int37 = unicodeEscaper33.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer36);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray44 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper33, unicodeEscaper39, unicodeEscaper40, unicodeEscaper43 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper28.with(charSequenceTranslatorArray44);
        java.lang.String str47 = unicodeEscaper28.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str52 = unicodeEscaper50.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str57 = unicodeEscaper55.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer63 = null;
        int int64 = unicodeEscaper60.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer63);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper66 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper67 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper70 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray71 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper60, unicodeEscaper66, unicodeEscaper67, unicodeEscaper70 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator72 = unicodeEscaper55.with(charSequenceTranslatorArray71);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator73 = unicodeEscaper50.with(charSequenceTranslatorArray71);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper75 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper78 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer80 = null;
        boolean boolean81 = unicodeEscaper78.translate((int) (short) 0, writer80);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper82 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper84 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray85 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper78, unicodeEscaper82, unicodeEscaper84 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator86 = unicodeEscaper75.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator87 = charSequenceTranslator73.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator88 = unicodeEscaper28.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator89 = unicodeEscaper25.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator90 = charSequenceTranslator22.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator91 = unicodeEscaper5.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator92 = unicodeEscaper2.with(charSequenceTranslatorArray85);
        java.io.Writer writer94 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator92.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str52, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper66);
        org.junit.Assert.assertNotNull(unicodeEscaper70);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray71);
        org.junit.Assert.assertNotNull(charSequenceTranslator72);
        org.junit.Assert.assertNotNull(charSequenceTranslator73);
        org.junit.Assert.assertNotNull(unicodeEscaper75);
        org.junit.Assert.assertNotNull(unicodeEscaper78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper84);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray85);
        org.junit.Assert.assertNotNull(charSequenceTranslator86);
        org.junit.Assert.assertNotNull(charSequenceTranslator87);
        org.junit.Assert.assertNotNull(charSequenceTranslator88);
        org.junit.Assert.assertNotNull(charSequenceTranslator89);
        org.junit.Assert.assertNotNull(charSequenceTranslator90);
        org.junit.Assert.assertNotNull(charSequenceTranslator91);
        org.junit.Assert.assertNotNull(charSequenceTranslator92);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (short) 1, writer7);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        java.lang.String str13 = unicodeEscaper11.translate((java.lang.CharSequence) "64");
        java.io.Writer writer16 = null;
        int int17 = unicodeEscaper11.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (int) ' ', writer16);
        java.io.Writer writer19 = null;
        boolean boolean20 = unicodeEscaper11.translate((int) (byte) 10, writer19);
        java.lang.String str22 = unicodeEscaper11.translate((java.lang.CharSequence) "\\u0041");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        java.io.Writer writer27 = null;
        boolean boolean28 = unicodeEscaper25.translate((int) (short) 10, writer27);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str36 = unicodeEscaper34.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str41 = unicodeEscaper39.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer47 = null;
        int int48 = unicodeEscaper44.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer47);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray55 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper44, unicodeEscaper50, unicodeEscaper51, unicodeEscaper54 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper39.with(charSequenceTranslatorArray55);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper34.with(charSequenceTranslatorArray55);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer64 = null;
        boolean boolean65 = unicodeEscaper62.translate((int) (short) 0, writer64);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper66 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper68 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray69 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper62, unicodeEscaper66, unicodeEscaper68 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator70 = unicodeEscaper59.with(charSequenceTranslatorArray69);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator71 = charSequenceTranslator57.with(charSequenceTranslatorArray69);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator72 = unicodeEscaper31.with(charSequenceTranslatorArray69);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator73 = unicodeEscaper25.with(charSequenceTranslatorArray69);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator74 = unicodeEscaper11.with(charSequenceTranslatorArray69);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = unicodeEscaper2.with(charSequenceTranslatorArray69);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\u0041" + "'", str22, "\\u0041");
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str36, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(unicodeEscaper59);
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper68);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray69);
        org.junit.Assert.assertNotNull(charSequenceTranslator70);
        org.junit.Assert.assertNotNull(charSequenceTranslator71);
        org.junit.Assert.assertNotNull(charSequenceTranslator72);
        org.junit.Assert.assertNotNull(charSequenceTranslator73);
        org.junit.Assert.assertNotNull(charSequenceTranslator74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 0, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 10);
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) (byte) 100, writer12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper21.translate((int) (short) 0, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str29 = unicodeEscaper27.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str34 = unicodeEscaper32.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer40 = null;
        int int41 = unicodeEscaper37.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer40);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray48 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper37, unicodeEscaper43, unicodeEscaper44, unicodeEscaper47 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper32.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper27.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper21.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray60 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper15, unicodeEscaper18, charSequenceTranslator51, unicodeEscaper54, unicodeEscaper57, unicodeEscaper59 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = unicodeEscaper10.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper8.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper2.with(charSequenceTranslatorArray60);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(unicodeEscaper47);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertNotNull(unicodeEscaper59);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper7.translate((int) (short) 0, writer9);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray14 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper7, unicodeEscaper11, unicodeEscaper13 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper4.with(charSequenceTranslatorArray14);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator16 = unicodeEscaper2.with(charSequenceTranslatorArray14);
        java.lang.String str18 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(charSequenceTranslator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033" + "'", str18, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "64", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 1);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer20 = null;
        int int21 = unicodeEscaper17.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper17, unicodeEscaper23, unicodeEscaper24, unicodeEscaper27 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper12.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper7.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper2.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str39 = unicodeEscaper37.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str44 = unicodeEscaper42.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer50 = null;
        int int51 = unicodeEscaper47.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer50);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper53 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray58 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper47, unicodeEscaper53, unicodeEscaper54, unicodeEscaper57 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator59 = unicodeEscaper42.with(charSequenceTranslatorArray58);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = unicodeEscaper37.with(charSequenceTranslatorArray58);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = unicodeEscaper34.with(charSequenceTranslatorArray58);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper2.with(charSequenceTranslatorArray58);
        java.lang.String str64 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4, "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str9, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str39, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper53);
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray58);
        org.junit.Assert.assertNotNull(charSequenceTranslator59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str64, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) 'a', writer3);
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeEscaper1.translate(charSequence5);
        java.io.Writer writer9 = null;
        int int10 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", 0, writer9);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str30 = unicodeEscaper28.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer36 = null;
        int int37 = unicodeEscaper33.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer36);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray44 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper33, unicodeEscaper39, unicodeEscaper40, unicodeEscaper43 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper28.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper25.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper22.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper19.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper16.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper13.with(charSequenceTranslatorArray44);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper1.with(charSequenceTranslatorArray44);
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer20 = null;
        int int21 = unicodeEscaper17.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper17, unicodeEscaper23, unicodeEscaper24, unicodeEscaper27 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper12.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper7.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer36 = null;
        int int37 = unicodeEscaper33.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer36);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper33.translate((int) (byte) -1, writer39);
        java.lang.String str42 = unicodeEscaper33.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str47 = unicodeEscaper45.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray48 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper33, unicodeEscaper45 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper7.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper2.with(charSequenceTranslatorArray48);
        java.lang.String str52 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str60 = unicodeEscaper58.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper63 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer66 = null;
        int int67 = unicodeEscaper63.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer66);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper70 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper73 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray74 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper63, unicodeEscaper69, unicodeEscaper70, unicodeEscaper73 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = unicodeEscaper58.with(charSequenceTranslatorArray74);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator76 = unicodeEscaper55.with(charSequenceTranslatorArray74);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator77 = unicodeEscaper2.with(charSequenceTranslatorArray74);
        java.io.Writer writer79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = unicodeEscaper2.translate((int) 'a', writer79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0031" + "'", str4, "\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str52, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertNotNull(unicodeEscaper73);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
        org.junit.Assert.assertNotNull(charSequenceTranslator76);
        org.junit.Assert.assertNotNull(charSequenceTranslator77);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (-1));
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031", writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0031" + "'", str4, "\\u0031");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0031" + "'", str4, "\\u0031");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) ' ');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((-1), writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unicodeEscaper2.translate(10, writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str7, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750032\\\\u00750033", (int) (short) 1, writer7);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str4, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, 0);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper8.translate((int) ' ', writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str16 = unicodeEscaper14.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str23 = unicodeEscaper21.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str28 = unicodeEscaper26.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer34 = null;
        int int35 = unicodeEscaper31.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray42 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper31, unicodeEscaper37, unicodeEscaper38, unicodeEscaper41 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper26.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper21.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper18.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer50 = null;
        boolean boolean51 = unicodeEscaper48.translate((int) (byte) 100, writer50);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str59 = unicodeEscaper57.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer65 = null;
        int int66 = unicodeEscaper62.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer65);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper68 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper72 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray73 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper62, unicodeEscaper68, unicodeEscaper69, unicodeEscaper72 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator74 = unicodeEscaper57.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = unicodeEscaper54.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator76 = unicodeEscaper48.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator77 = charSequenceTranslator45.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = unicodeEscaper14.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper8.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper5.with(charSequenceTranslatorArray73);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator81 = unicodeEscaper2.with(charSequenceTranslatorArray73);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper68);
        org.junit.Assert.assertNotNull(unicodeEscaper72);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray73);
        org.junit.Assert.assertNotNull(charSequenceTranslator74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
        org.junit.Assert.assertNotNull(charSequenceTranslator76);
        org.junit.Assert.assertNotNull(charSequenceTranslator77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
        org.junit.Assert.assertNotNull(charSequenceTranslator81);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), 0);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu0033\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu003\\u0034", 1, writer5);
        java.io.Writer writer9 = null;
        int int10 = unicodeEscaper2.translate((java.lang.CharSequence) "6\\\\u00750031", 1, writer9);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str13 = unicodeEscaper11.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer19 = null;
        int int20 = unicodeEscaper16.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer19);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray27 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper16, unicodeEscaper22, unicodeEscaper23, unicodeEscaper26 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper11.with(charSequenceTranslatorArray27);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper8.with(charSequenceTranslatorArray27);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper5.with(charSequenceTranslatorArray27);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper2.with(charSequenceTranslatorArray27);
        java.io.Writer writer34 = null;
        int int35 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0034", 1, writer34);
        java.io.Writer writer37 = null;
        boolean boolean38 = unicodeEscaper2.translate((int) 'a', writer37);
        java.lang.String str40 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu0033\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu003\\u0034");
        java.io.Writer writer43 = null;
        int int44 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (int) (short) 1, writer43);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu0033\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu003\\u0034" + "'", str40, "\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu0033\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu003\\u0034");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper7.translate((int) (short) 0, writer9);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray14 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper7, unicodeEscaper11, unicodeEscaper13 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper4.with(charSequenceTranslatorArray14);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator16 = unicodeEscaper2.with(charSequenceTranslatorArray14);
        java.io.Writer writer18 = null;
        boolean boolean19 = unicodeEscaper2.translate(100, writer18);
        java.lang.String str21 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u007500\\\\u00750035\\\\u00750043\\\\u0075005C\\u007500\\\\u00750037\\\\u00750035\\\\u0075005C\\u00750030\\\\u0075005C\\u00750030\\\\u0075005C\\u00750033\\\\u0075005C\\u00750033\\\\u0075005C\\u007500\\\\u00750035\\\\u00750043\\\\u0075005C\\u007500\\\\u00750037\\\\u00750035\\\\u0075005C\\u00750030\\\\u0075005C\\u00750030\\\\u0075005C\\u00750033\\\\u0075005C\\u0075003\\\\u00750034");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(charSequenceTranslator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\\\u0075005C\\u007500\\\\u00750035\\\\u00750043\\\\u0075005C\\u007500\\\\u00750037\\\\u00750035\\\\u0075005C\\u00750030\\\\u0075005C\\u00750030\\\\u0075005C\\u00750033\\\\u0075005C\\u00750033\\\\u0075005C\\u007500\\\\u00750035\\\\u00750043\\\\u0075005C\\u007500\\\\u00750037\\\\u00750035\\\\u0075005C\\u00750030\\\\u0075005C\\u00750030\\\\u0075005C\\u00750033\\\\u0075005C\\u0075003\\\\u00750034" + "'", str21, "\\\\u0075005C\\u007500\\\\u00750035\\\\u00750043\\\\u0075005C\\u007500\\\\u00750037\\\\u00750035\\\\u0075005C\\u00750030\\\\u0075005C\\u00750030\\\\u0075005C\\u00750033\\\\u0075005C\\u00750033\\\\u0075005C\\u007500\\\\u00750035\\\\u00750043\\\\u0075005C\\u007500\\\\u00750037\\\\u00750035\\\\u0075005C\\u00750030\\\\u0075005C\\u00750030\\\\u0075005C\\u00750033\\\\u0075005C\\u0075003\\\\u00750034");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033" + "'", str4, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) (byte) -1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "23", 1, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper2.translate((int) (byte) 10, writer8);
        java.lang.String str11 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0041");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (byte) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(10);
        java.lang.String str18 = unicodeEscaper16.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper21.translate((int) (byte) 100, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str32 = unicodeEscaper30.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer38 = null;
        int int39 = unicodeEscaper35.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer38);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray46 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper35, unicodeEscaper41, unicodeEscaper42, unicodeEscaper45 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper30.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper27.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper21.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper16.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper14.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper53 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str58 = unicodeEscaper56.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str63 = unicodeEscaper61.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper66 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer69 = null;
        int int70 = unicodeEscaper66.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer69);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper72 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper73 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper76 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray77 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper66, unicodeEscaper72, unicodeEscaper73, unicodeEscaper76 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = unicodeEscaper61.with(charSequenceTranslatorArray77);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper56.with(charSequenceTranslatorArray77);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper53.with(charSequenceTranslatorArray77);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator81 = unicodeEscaper14.with(charSequenceTranslatorArray77);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator82 = unicodeEscaper2.with(charSequenceTranslatorArray77);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0041" + "'", str11, "\\u0041");
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str18, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(unicodeEscaper53);
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper72);
        org.junit.Assert.assertNotNull(unicodeEscaper76);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
        org.junit.Assert.assertNotNull(charSequenceTranslator81);
        org.junit.Assert.assertNotNull(charSequenceTranslator82);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (-1));
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (short) 100);
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
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031", 0, writer6);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", 0, writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer25 = null;
        int int26 = unicodeEscaper22.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray33 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper22, unicodeEscaper28, unicodeEscaper29, unicodeEscaper32 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper17.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper12.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper9.with(charSequenceTranslatorArray33);
        java.lang.String str38 = charSequenceTranslator36.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str43 = unicodeEscaper41.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str48 = unicodeEscaper46.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer54 = null;
        int int55 = unicodeEscaper51.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer54);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray62 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper51, unicodeEscaper57, unicodeEscaper58, unicodeEscaper61 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper46.with(charSequenceTranslatorArray62);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper41.with(charSequenceTranslatorArray62);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper67 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer70 = null;
        int int71 = unicodeEscaper67.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer70);
        java.io.Writer writer73 = null;
        boolean boolean74 = unicodeEscaper67.translate((int) (byte) -1, writer73);
        java.lang.String str76 = unicodeEscaper67.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper79 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str81 = unicodeEscaper79.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray82 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper67, unicodeEscaper79 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = unicodeEscaper41.with(charSequenceTranslatorArray82);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = charSequenceTranslator36.with(charSequenceTranslatorArray82);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = unicodeEscaper2.with(charSequenceTranslatorArray82);
        java.lang.CharSequence charSequence86 = null;
        java.io.Writer writer87 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator85.translate(charSequence86, writer87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str14, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\u0032\\u0033" + "'", str38, "\\u0032\\u0033");
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertNotNull(unicodeEscaper61);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(unicodeEscaper67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "0" + "'", str76, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) '#', writer3);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper1.translate((-1), writer6);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str22 = unicodeEscaper20.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer28 = null;
        int int29 = unicodeEscaper25.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray36 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper25, unicodeEscaper31, unicodeEscaper32, unicodeEscaper35 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper20.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper15.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper12.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper10.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper1.with(charSequenceTranslatorArray36);
        java.io.Writer writer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator41.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", writer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4, "\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) '4', writer3);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer25 = null;
        int int26 = unicodeEscaper22.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray33 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper22, unicodeEscaper28, unicodeEscaper29, unicodeEscaper32 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper17.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper12.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper9.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper7.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper1.with(charSequenceTranslatorArray33);
        java.lang.String str40 = charSequenceTranslator38.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033");
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033" + "'", str40, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0031");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer18 = null;
        int int19 = unicodeEscaper15.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper15, unicodeEscaper21, unicodeEscaper22, unicodeEscaper25 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper7.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str36 = unicodeEscaper34.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str41 = unicodeEscaper39.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer47 = null;
        int int48 = unicodeEscaper44.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer47);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray55 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper44, unicodeEscaper50, unicodeEscaper51, unicodeEscaper54 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper39.with(charSequenceTranslatorArray55);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper34.with(charSequenceTranslatorArray55);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer63 = null;
        int int64 = unicodeEscaper60.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer63);
        java.io.Writer writer66 = null;
        boolean boolean67 = unicodeEscaper60.translate((int) (byte) -1, writer66);
        java.lang.String str69 = unicodeEscaper60.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper72 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str74 = unicodeEscaper72.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray75 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper60, unicodeEscaper72 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator76 = unicodeEscaper34.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator77 = unicodeEscaper31.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = unicodeEscaper7.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper2.with(charSequenceTranslatorArray75);
        java.lang.Class<?> wildcardClass80 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray75);
        org.junit.Assert.assertNotNull(charSequenceTranslator76);
        org.junit.Assert.assertNotNull(charSequenceTranslator77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper8.translate((java.lang.CharSequence) "61", (int) (short) 0, writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str25 = unicodeEscaper23.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer31 = null;
        int int32 = unicodeEscaper28.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray39 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper28, unicodeEscaper34, unicodeEscaper35, unicodeEscaper38 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper23.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper18.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper15.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper8.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper5.with(charSequenceTranslatorArray39);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper2.with(charSequenceTranslatorArray39);
        java.io.Writer writer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator45.translate((java.lang.CharSequence) "\\u005C\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031", writer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str20, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
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
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer25 = null;
        int int26 = unicodeEscaper22.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray33 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper22, unicodeEscaper28, unicodeEscaper29, unicodeEscaper32 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper17.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper12.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper7.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper2.with(charSequenceTranslatorArray33);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper2.translate(0, writer39);
        java.io.Writer writer43 = null;
        int int44 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0031", (int) (short) 0, writer43);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9, "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str14, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(0, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (short) 1, writer7);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate(0, writer6);
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "20");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20" + "'", str9, "20");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 10, writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", 100, writer8);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0034\\u0031", (int) (byte) 100, writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.lang.String str6 = unicodeEscaper4.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str13 = unicodeEscaper11.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str18 = unicodeEscaper16.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer24 = null;
        int int25 = unicodeEscaper21.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer24);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray32 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper21, unicodeEscaper27, unicodeEscaper28, unicodeEscaper31 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper16.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper11.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper8.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer40 = null;
        boolean boolean41 = unicodeEscaper38.translate((int) (byte) 100, writer40);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str49 = unicodeEscaper47.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer55 = null;
        int int56 = unicodeEscaper52.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer55);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray63 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper52, unicodeEscaper58, unicodeEscaper59, unicodeEscaper62 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper47.with(charSequenceTranslatorArray63);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper44.with(charSequenceTranslatorArray63);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper38.with(charSequenceTranslatorArray63);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator67 = charSequenceTranslator35.with(charSequenceTranslatorArray63);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper4.with(charSequenceTranslatorArray63);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator69 = unicodeEscaper2.with(charSequenceTranslatorArray63);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertNotNull(unicodeEscaper47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(charSequenceTranslator67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
        org.junit.Assert.assertNotNull(charSequenceTranslator69);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str16 = unicodeEscaper14.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer22 = null;
        int int23 = unicodeEscaper19.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer22);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray30 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper25, unicodeEscaper26, unicodeEscaper29 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper14.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper9.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper6.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray42 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper6, unicodeEscaper36, unicodeEscaper39, unicodeEscaper41 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper4.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper1.with(charSequenceTranslatorArray42);
        java.lang.Class<?> wildcardClass45 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (short) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeEscaper2.translate(charSequence5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer20 = null;
        int int21 = unicodeEscaper17.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper17, unicodeEscaper23, unicodeEscaper24, unicodeEscaper27 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper12.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper9.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str38 = unicodeEscaper36.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str43 = unicodeEscaper41.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer49 = null;
        int int50 = unicodeEscaper46.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer49);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper53 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray57 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper46, unicodeEscaper52, unicodeEscaper53, unicodeEscaper56 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper41.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator59 = unicodeEscaper36.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = unicodeEscaper33.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = charSequenceTranslator30.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper2.with(charSequenceTranslatorArray57);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0031" + "'", str4, "\\u0031");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str38, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
        org.junit.Assert.assertNotNull(charSequenceTranslator59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u007500\\\\u00750035\\\\u00750043\\\\u0075005C\\u007500\\\\u00750037\\\\u00750035\\\\u0075005C\\u00750030\\\\u0075005C\\u00750030\\\\u0075005C\\u00750033\\\\u0075005C\\u00750033\\\\u0075005C\\u007500\\\\u00750035\\\\u00750043\\\\u0075005C\\u007500\\\\u00750037\\\\u00750035\\\\u0075005C\\u00750030\\\\u0075005C\\u00750030\\\\u0075005C\\u00750033\\\\u0075005C\\u0075003\\\\u00750034", 0, writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (byte) -1);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "\\u0036\\u0034");
        java.io.Writer writer13 = null;
        boolean boolean14 = unicodeEscaper9.translate((int) 'a', writer13);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str24 = unicodeEscaper22.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str29 = unicodeEscaper27.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer35 = null;
        int int36 = unicodeEscaper32.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer35);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray43 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper32, unicodeEscaper38, unicodeEscaper39, unicodeEscaper42 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper27.with(charSequenceTranslatorArray43);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper22.with(charSequenceTranslatorArray43);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper19.with(charSequenceTranslatorArray43);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper17.with(charSequenceTranslatorArray43);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper9.with(charSequenceTranslatorArray43);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 0);
        java.io.Writer writer59 = null;
        boolean boolean60 = unicodeEscaper57.translate((int) (short) 0, writer59);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper63 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper65 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper68 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str70 = unicodeEscaper68.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper73 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str75 = unicodeEscaper73.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper78 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer81 = null;
        int int82 = unicodeEscaper78.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer81);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper84 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper85 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper88 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray89 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper78, unicodeEscaper84, unicodeEscaper85, unicodeEscaper88 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator90 = unicodeEscaper73.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator91 = unicodeEscaper68.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator92 = unicodeEscaper65.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator93 = unicodeEscaper63.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator94 = unicodeEscaper57.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator95 = unicodeEscaper54.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator96 = unicodeEscaper51.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator97 = unicodeEscaper9.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator98 = unicodeEscaper2.with(charSequenceTranslatorArray89);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0036\\u0034" + "'", str11, "\\u0036\\u0034");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper63);
        org.junit.Assert.assertNotNull(unicodeEscaper65);
        org.junit.Assert.assertNotNull(unicodeEscaper68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper84);
        org.junit.Assert.assertNotNull(unicodeEscaper88);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray89);
        org.junit.Assert.assertNotNull(charSequenceTranslator90);
        org.junit.Assert.assertNotNull(charSequenceTranslator91);
        org.junit.Assert.assertNotNull(charSequenceTranslator92);
        org.junit.Assert.assertNotNull(charSequenceTranslator93);
        org.junit.Assert.assertNotNull(charSequenceTranslator94);
        org.junit.Assert.assertNotNull(charSequenceTranslator95);
        org.junit.Assert.assertNotNull(charSequenceTranslator96);
        org.junit.Assert.assertNotNull(charSequenceTranslator97);
        org.junit.Assert.assertNotNull(charSequenceTranslator98);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) '4', writer3);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper12.translate((int) (short) 0, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray19 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper12, unicodeEscaper16, unicodeEscaper18 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper9.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper7.with(charSequenceTranslatorArray19);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper1.with(charSequenceTranslatorArray19);
        java.lang.String str24 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str32 = unicodeEscaper30.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str37 = unicodeEscaper35.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer43 = null;
        int int44 = unicodeEscaper40.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer43);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray51 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper40, unicodeEscaper46, unicodeEscaper47, unicodeEscaper50 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper35.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper30.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper27.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper1.with(charSequenceTranslatorArray51);
        java.io.Writer writer57 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator55.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", writer57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str24, "\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str32, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (short) 1);
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
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((-1), writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) ' ', writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((int) (short) 10, writer10);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) '#', writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper8.translate((int) '4', writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str21 = unicodeEscaper19.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str26 = unicodeEscaper24.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer32 = null;
        int int33 = unicodeEscaper29.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer32);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray40 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper29, unicodeEscaper35, unicodeEscaper36, unicodeEscaper39 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper24.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper19.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper16.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper14.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper8.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper1.with(charSequenceTranslatorArray40);
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str6, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0030");
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper1.translate((int) (byte) 100, writer5);
        java.lang.Class<?> wildcardClass7 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0030" + "'", str3, "\\u0030");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "6\\u0031");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str10 = unicodeEscaper8.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str21 = unicodeEscaper19.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer27 = null;
        int int28 = unicodeEscaper24.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer27);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray35 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper24, unicodeEscaper30, unicodeEscaper31, unicodeEscaper34 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper19.with(charSequenceTranslatorArray35);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper16.with(charSequenceTranslatorArray35);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper13.with(charSequenceTranslatorArray35);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper8.with(charSequenceTranslatorArray35);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper1.with(charSequenceTranslatorArray35);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) 10);
        java.io.Writer writer46 = null;
        int int47 = unicodeEscaper43.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", 0, writer46);
        java.io.Writer writer49 = null;
        boolean boolean50 = unicodeEscaper43.translate((int) (short) -1, writer49);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper53 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer55 = null;
        boolean boolean56 = unicodeEscaper53.translate((int) (short) 0, writer55);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str61 = unicodeEscaper59.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str66 = unicodeEscaper64.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer72 = null;
        int int73 = unicodeEscaper69.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer72);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper75 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper76 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper79 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray80 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper69, unicodeEscaper75, unicodeEscaper76, unicodeEscaper79 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator81 = unicodeEscaper64.with(charSequenceTranslatorArray80);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator82 = unicodeEscaper59.with(charSequenceTranslatorArray80);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = unicodeEscaper53.with(charSequenceTranslatorArray80);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = unicodeEscaper43.with(charSequenceTranslatorArray80);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = charSequenceTranslator40.with(charSequenceTranslatorArray80);
        java.io.Writer writer87 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator40.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", writer87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6\\u0031" + "'", str3, "6\\u0031");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str5, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper75);
        org.junit.Assert.assertNotNull(unicodeEscaper79);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray80);
        org.junit.Assert.assertNotNull(charSequenceTranslator81);
        org.junit.Assert.assertNotNull(charSequenceTranslator82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((int) '4', writer6);
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031");
        java.lang.String str11 = unicodeEscaper2.translate((java.lang.CharSequence) "6\\\\u00750031");
        java.lang.String str13 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031" + "'", str4, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\\u00750036\\\\u00750031" + "'", str9, "\\\\u00750036\\\\u00750031");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6\\\\u00750031" + "'", str11, "6\\\\u00750031");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031" + "'", str13, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 10, writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0032\\u0033", 10, writer8);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\\\u00750075005C\\\\\\u007500750075\\\\\\u007500750030\\\\\\u007500750030\\\\\\u007500750033\\\\\\u007500750031");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\\\u00750075005C\\\\\\u007500750075\\\\\\u007500750030\\\\\\u007500750030\\\\\\u007500750033\\\\\\u007500750031" + "'", str4, "\\\\\\u00750075005C\\\\\\u007500750075\\\\\\u007500750030\\\\\\u007500750030\\\\\\u007500750033\\\\\\u007500750031");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer23 = null;
        int int24 = unicodeEscaper20.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray31 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper20, unicodeEscaper26, unicodeEscaper27, unicodeEscaper30 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper15.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper10.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer39 = null;
        int int40 = unicodeEscaper36.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer39);
        java.io.Writer writer42 = null;
        boolean boolean43 = unicodeEscaper36.translate((int) (byte) -1, writer42);
        java.lang.String str45 = unicodeEscaper36.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str50 = unicodeEscaper48.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray51 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper36, unicodeEscaper48 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper10.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper7.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper4.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper2.with(charSequenceTranslatorArray51);
        java.io.Writer writer57 = null;
        boolean boolean58 = unicodeEscaper2.translate((int) (short) 10, writer57);
        java.io.Writer writer60 = null;
        boolean boolean61 = unicodeEscaper2.translate(0, writer60);
        java.io.Writer writer63 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", writer63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (short) -1);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) (short) 0, writer12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray17 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper10, unicodeEscaper14, unicodeEscaper16 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator18 = unicodeEscaper7.with(charSequenceTranslatorArray17);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper5.with(charSequenceTranslatorArray17);
        java.io.Writer writer21 = null;
        boolean boolean22 = unicodeEscaper5.translate((int) ' ', writer21);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str27 = unicodeEscaper25.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str32 = unicodeEscaper30.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str37 = unicodeEscaper35.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer43 = null;
        int int44 = unicodeEscaper40.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer43);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray51 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper40, unicodeEscaper46, unicodeEscaper47, unicodeEscaper50 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper35.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper30.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer59 = null;
        int int60 = unicodeEscaper56.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer59);
        java.io.Writer writer62 = null;
        boolean boolean63 = unicodeEscaper56.translate((int) (byte) -1, writer62);
        java.lang.String str65 = unicodeEscaper56.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper68 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str70 = unicodeEscaper68.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray71 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper56, unicodeEscaper68 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator72 = unicodeEscaper30.with(charSequenceTranslatorArray71);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator73 = unicodeEscaper25.with(charSequenceTranslatorArray71);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator74 = unicodeEscaper5.with(charSequenceTranslatorArray71);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = unicodeEscaper2.with(charSequenceTranslatorArray71);
        java.lang.Class<?> wildcardClass76 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray17);
        org.junit.Assert.assertNotNull(charSequenceTranslator18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\u0031" + "'", str27, "\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray71);
        org.junit.Assert.assertNotNull(charSequenceTranslator72);
        org.junit.Assert.assertNotNull(charSequenceTranslator73);
        org.junit.Assert.assertNotNull(charSequenceTranslator74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (short) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(0, writer4);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer25 = null;
        int int26 = unicodeEscaper22.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray33 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper22, unicodeEscaper28, unicodeEscaper29, unicodeEscaper32 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper17.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper12.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper9.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray45 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper9, unicodeEscaper39, unicodeEscaper42, unicodeEscaper44 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper7.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper2.with(charSequenceTranslatorArray45);
        java.lang.Class<?> wildcardClass48 = charSequenceTranslatorArray45.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeEscaper2.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0034", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0031" + "'", str4, "\\u0031");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper4.translate((int) (short) 0, writer6);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer18 = null;
        int int19 = unicodeEscaper15.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper15, unicodeEscaper21, unicodeEscaper22, unicodeEscaper25 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str32 = unicodeEscaper30.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str37 = unicodeEscaper35.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer43 = null;
        int int44 = unicodeEscaper40.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer43);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray51 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper40, unicodeEscaper46, unicodeEscaper47, unicodeEscaper50 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper35.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper30.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = charSequenceTranslator27.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper4.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper2.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.lang.String str61 = unicodeEscaper59.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str66 = unicodeEscaper64.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str71 = unicodeEscaper69.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper74 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer77 = null;
        int int78 = unicodeEscaper74.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer77);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper80 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper81 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper84 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray85 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper74, unicodeEscaper80, unicodeEscaper81, unicodeEscaper84 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator86 = unicodeEscaper69.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator87 = unicodeEscaper64.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator88 = unicodeEscaper59.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator89 = unicodeEscaper2.with(charSequenceTranslatorArray85);
        java.io.Writer writer92 = null;
        int int93 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030", (int) (short) 0, writer92);
        java.io.Writer writer95 = null;
        boolean boolean96 = unicodeEscaper2.translate((int) '4', writer95);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str32, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
        org.junit.Assert.assertNotNull(unicodeEscaper59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "FFFFFFFF" + "'", str61, "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str66, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper80);
        org.junit.Assert.assertNotNull(unicodeEscaper84);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray85);
        org.junit.Assert.assertNotNull(charSequenceTranslator86);
        org.junit.Assert.assertNotNull(charSequenceTranslator87);
        org.junit.Assert.assertNotNull(charSequenceTranslator88);
        org.junit.Assert.assertNotNull(charSequenceTranslator89);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031", 0, writer6);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unicodeEscaper1.translate((int) (byte) -1, writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
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
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer18 = null;
        int int19 = unicodeEscaper15.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper15, unicodeEscaper21, unicodeEscaper22, unicodeEscaper25 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper5.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper2.with(charSequenceTranslatorArray26);
        java.io.Writer writer32 = null;
        int int33 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0031", (int) (byte) 0, writer32);
        java.io.Writer writer36 = null;
        int int37 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030", (int) ' ', writer36);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer47 = null;
        boolean boolean48 = unicodeEscaper45.translate((int) (short) 0, writer47);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray52 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper45, unicodeEscaper49, unicodeEscaper51 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper42.with(charSequenceTranslatorArray52);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper40.with(charSequenceTranslatorArray52);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper2.with(charSequenceTranslatorArray52);
        java.io.Writer writer58 = null;
        int int59 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031", (int) (byte) 100, writer58);
        java.io.Writer writer61 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u\\u0030\\u003075\\u0030\\u00305C\\\\u\\u0030\\u003075\\u0030\\u003075\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0030\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0030\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0033\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0032\\\\u\\u0030\\u003075\\u0030\\u00305C\\\\u\\u0030\\u003075\\u0030\\u003075\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0030\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0030\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0033\\\\u\\u0030\\u003075\\u0030\\u0030\\u0033\\u0033", writer61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str7, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer13 = null;
        int int14 = unicodeEscaper10.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer13);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray21 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper10, unicodeEscaper16, unicodeEscaper17, unicodeEscaper20 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper5.with(charSequenceTranslatorArray21);
        java.lang.String str24 = unicodeEscaper5.translate((java.lang.CharSequence) "\\u0033\\u0034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str32 = unicodeEscaper30.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer38 = null;
        int int39 = unicodeEscaper35.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer38);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray46 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper35, unicodeEscaper41, unicodeEscaper42, unicodeEscaper45 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper30.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper27.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper5.with(charSequenceTranslatorArray46);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper2.with(charSequenceTranslatorArray46);
        java.lang.Class<?> wildcardClass51 = charSequenceTranslator50.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\u0033\\u0034" + "'", str24, "\\u0033\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750034");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750034" + "'", str4, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750034");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(100, writer4);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate(0, writer7);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str13 = unicodeEscaper11.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str18 = unicodeEscaper16.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer24 = null;
        int int25 = unicodeEscaper21.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer24);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray32 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper21, unicodeEscaper27, unicodeEscaper28, unicodeEscaper31 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper16.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper11.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper8.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper5.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper2.with(charSequenceTranslatorArray32);
        java.io.Writer writer40 = null;
        int int41 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0033\\u0032\\u005Cu\\u0030\\u0030\\u0033\\u0030", (int) '4', writer40);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str13, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "6\\u0031");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper1.translate((int) (short) 100, writer7);
        java.lang.String str10 = unicodeEscaper1.translate((java.lang.CharSequence) "\\\\u0075\\u0030\\u00305C\\\\u0075\\u0030\\u00305C\\\\u0075\\u0030\\u003075\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u00337\\\\u0075\\u0030\\u0030\\u00335\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0033\\\\u0075\\u0030\\u0030\\u0033\\u0030");
        java.lang.String str12 = unicodeEscaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) 10);
        java.io.Writer writer27 = null;
        int int28 = unicodeEscaper24.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", 0, writer27);
        java.io.Writer writer30 = null;
        boolean boolean31 = unicodeEscaper24.translate((int) (short) -1, writer30);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer36 = null;
        boolean boolean37 = unicodeEscaper34.translate((int) (short) 0, writer36);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str42 = unicodeEscaper40.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str47 = unicodeEscaper45.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer53 = null;
        int int54 = unicodeEscaper50.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer53);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray61 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper50, unicodeEscaper56, unicodeEscaper57, unicodeEscaper60 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper45.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper40.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper34.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper24.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper21.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator67 = unicodeEscaper18.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper15.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator69 = unicodeEscaper1.with(charSequenceTranslatorArray61);
        java.lang.CharSequence charSequence70 = null;
        java.lang.String str71 = unicodeEscaper1.translate(charSequence70);
        java.io.Writer writer73 = null;
        boolean boolean74 = unicodeEscaper1.translate((int) ' ', writer73);
        java.lang.Class<?> wildcardClass75 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6\\u0031" + "'", str3, "6\\u0031");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str5, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\\u0075\\u0030\\u00305C\\\\u0075\\u0030\\u00305C\\\\u0075\\u0030\\u003075\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u00337\\\\u0075\\u0030\\u0030\\u00335\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0033\\\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str10, "\\\\u0075\\u0030\\u00305C\\\\u0075\\u0030\\u00305C\\\\u0075\\u0030\\u003075\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u00337\\\\u0075\\u0030\\u0030\\u00335\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0033\\\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "64" + "'", str12, "64");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(charSequenceTranslator67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
        org.junit.Assert.assertNotNull(charSequenceTranslator69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (short) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(0, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) 1, writer7);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer25 = null;
        int int26 = unicodeEscaper22.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray33 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper22, unicodeEscaper28, unicodeEscaper29, unicodeEscaper32 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper17.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper12.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper9.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str41 = unicodeEscaper39.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer47 = null;
        int int48 = unicodeEscaper44.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer47);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray55 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper44, unicodeEscaper50, unicodeEscaper51, unicodeEscaper54 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper39.with(charSequenceTranslatorArray55);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str61 = unicodeEscaper59.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str66 = unicodeEscaper64.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer72 = null;
        int int73 = unicodeEscaper69.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer72);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper75 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper76 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper79 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray80 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper69, unicodeEscaper75, unicodeEscaper76, unicodeEscaper79 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator81 = unicodeEscaper64.with(charSequenceTranslatorArray80);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator82 = unicodeEscaper59.with(charSequenceTranslatorArray80);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = charSequenceTranslator56.with(charSequenceTranslatorArray80);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = unicodeEscaper9.with(charSequenceTranslatorArray80);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = unicodeEscaper6.with(charSequenceTranslatorArray80);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator86 = unicodeEscaper4.with(charSequenceTranslatorArray80);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator87 = unicodeEscaper1.with(charSequenceTranslatorArray80);
        java.lang.String str89 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str14, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
        org.junit.Assert.assertNotNull(unicodeEscaper59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str61, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper75);
        org.junit.Assert.assertNotNull(unicodeEscaper79);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray80);
        org.junit.Assert.assertNotNull(charSequenceTranslator81);
        org.junit.Assert.assertNotNull(charSequenceTranslator82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
        org.junit.Assert.assertNotNull(charSequenceTranslator86);
        org.junit.Assert.assertNotNull(charSequenceTranslator87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str89, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer20 = null;
        int int21 = unicodeEscaper17.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper17, unicodeEscaper23, unicodeEscaper24, unicodeEscaper27 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper12.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper7.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper4.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str36 = unicodeEscaper34.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer42 = null;
        int int43 = unicodeEscaper39.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer42);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray50 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper39, unicodeEscaper45, unicodeEscaper46, unicodeEscaper49 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper34.with(charSequenceTranslatorArray50);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str56 = unicodeEscaper54.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str61 = unicodeEscaper59.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer67 = null;
        int int68 = unicodeEscaper64.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer67);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper70 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper71 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper74 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray75 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper64, unicodeEscaper70, unicodeEscaper71, unicodeEscaper74 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator76 = unicodeEscaper59.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator77 = unicodeEscaper54.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = charSequenceTranslator51.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper4.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper1.with(charSequenceTranslatorArray75);
        java.io.Writer writer82 = null;
        boolean boolean83 = unicodeEscaper1.translate((int) (byte) 1, writer82);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = unicodeEscaper1.with(charSequenceTranslatorArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str9, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str56, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper70);
        org.junit.Assert.assertNotNull(unicodeEscaper74);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray75);
        org.junit.Assert.assertNotNull(charSequenceTranslator76);
        org.junit.Assert.assertNotNull(charSequenceTranslator77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\\\u00750030");
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper1.translate((int) (short) 0, writer5);
        java.lang.String str8 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0034\\u0031", writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str3, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str8, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) (byte) 1, writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) (byte) 0, writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (short) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str23 = unicodeEscaper21.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str28 = unicodeEscaper26.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer34 = null;
        int int35 = unicodeEscaper31.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray42 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper31, unicodeEscaper37, unicodeEscaper38, unicodeEscaper41 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper26.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper21.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper18.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper15.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper9.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper2.with(charSequenceTranslatorArray42);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str23, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer10 = null;
        int int11 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", 1, writer10);
        java.io.Writer writer14 = null;
        int int15 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0034\\u0031", (int) (short) 0, writer14);
        java.io.Writer writer18 = null;
        int int19 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (int) (byte) 100, writer18);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str18 = unicodeEscaper16.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer24 = null;
        int int25 = unicodeEscaper21.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer24);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray32 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper21, unicodeEscaper27, unicodeEscaper28, unicodeEscaper31 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper16.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper13.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper10.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper5.with(charSequenceTranslatorArray32);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper2.with(charSequenceTranslatorArray32);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0041");
        java.lang.String str8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        java.io.Writer writer11 = null;
        int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033", (int) (byte) 1, writer11);
        java.lang.String str14 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033");
        java.lang.Class<?> wildcardClass15 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0041" + "'", str6, "\\u0041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str8, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033" + "'", str14, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) 'a', writer3);
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeEscaper1.translate(charSequence5);
        java.io.Writer writer9 = null;
        int int10 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (int) '4', writer9);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unicodeEscaper1.translate(10, writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) 'a');
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) 1, writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) -1);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "\\u0032\\u0030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str16 = unicodeEscaper14.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str21 = unicodeEscaper19.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer27 = null;
        int int28 = unicodeEscaper24.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer27);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray35 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper24, unicodeEscaper30, unicodeEscaper31, unicodeEscaper34 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper19.with(charSequenceTranslatorArray35);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper14.with(charSequenceTranslatorArray35);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper9.with(charSequenceTranslatorArray35);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str46 = unicodeEscaper44.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str51 = unicodeEscaper49.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer57 = null;
        int int58 = unicodeEscaper54.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer57);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray65 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper54, unicodeEscaper60, unicodeEscaper61, unicodeEscaper64 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper49.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator67 = unicodeEscaper44.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper72 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer74 = null;
        boolean boolean75 = unicodeEscaper72.translate((int) (short) 0, writer74);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper76 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper78 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray79 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper72, unicodeEscaper76, unicodeEscaper78 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper69.with(charSequenceTranslatorArray79);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator81 = charSequenceTranslator67.with(charSequenceTranslatorArray79);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator82 = unicodeEscaper41.with(charSequenceTranslatorArray79);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = unicodeEscaper9.with(charSequenceTranslatorArray79);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = unicodeEscaper2.with(charSequenceTranslatorArray79);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0032\\u0030" + "'", str11, "\\u0032\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str16, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str46, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(charSequenceTranslator67);
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertNotNull(unicodeEscaper72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper78);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
        org.junit.Assert.assertNotNull(charSequenceTranslator81);
        org.junit.Assert.assertNotNull(charSequenceTranslator82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer10 = null;
        int int11 = unicodeEscaper7.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper7, unicodeEscaper13, unicodeEscaper14, unicodeEscaper17 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper2.with(charSequenceTranslatorArray18);
        java.io.Writer writer21 = null;
        boolean boolean22 = unicodeEscaper2.translate(0, writer21);
        java.io.Writer writer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033", writer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\\\u00750030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer13 = null;
        boolean boolean14 = unicodeEscaper11.translate((int) (short) 0, writer13);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper11, unicodeEscaper15, unicodeEscaper17 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper8.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper6.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper1.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
        java.lang.String str29 = unicodeEscaper27.translate((java.lang.CharSequence) "\\u0030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str46 = unicodeEscaper44.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer52 = null;
        int int53 = unicodeEscaper49.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer52);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray60 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper49, unicodeEscaper55, unicodeEscaper56, unicodeEscaper59 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = unicodeEscaper44.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper41.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper38.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper35.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper32.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper27.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator67 = unicodeEscaper24.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper1.with(charSequenceTranslatorArray60);
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str3, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str29, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertNotNull(unicodeEscaper59);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(charSequenceTranslator67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer10 = null;
        int int11 = unicodeEscaper7.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper7, unicodeEscaper13, unicodeEscaper14, unicodeEscaper17 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper2.with(charSequenceTranslatorArray18);
        java.lang.String str21 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str26 = unicodeEscaper24.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str31 = unicodeEscaper29.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer37 = null;
        int int38 = unicodeEscaper34.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer37);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray45 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper34, unicodeEscaper40, unicodeEscaper41, unicodeEscaper44 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper29.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper24.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer54 = null;
        boolean boolean55 = unicodeEscaper52.translate((int) (short) 0, writer54);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray59 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper52, unicodeEscaper56, unicodeEscaper58 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = unicodeEscaper49.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = charSequenceTranslator47.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper2.with(charSequenceTranslatorArray59);
        java.lang.String str64 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str26, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "FFFFFFFF" + "'", str64, "FFFFFFFF");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str10 = unicodeEscaper8.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str15 = unicodeEscaper13.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer21 = null;
        int int22 = unicodeEscaper18.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer21);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray29 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper18, unicodeEscaper24, unicodeEscaper25, unicodeEscaper28 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper13.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper8.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper5.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper2.with(charSequenceTranslatorArray29);
        java.lang.String str35 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = unicodeEscaper2.translate((java.lang.CharSequence) "6\\u\\u0030\\u0030\\u0033\\u0031", (int) 'a', writer38);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str10, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer20 = null;
        int int21 = unicodeEscaper17.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper17, unicodeEscaper23, unicodeEscaper24, unicodeEscaper27 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper12.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper7.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer36 = null;
        int int37 = unicodeEscaper33.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer36);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper33.translate((int) (byte) -1, writer39);
        java.lang.String str42 = unicodeEscaper33.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str47 = unicodeEscaper45.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray48 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper33, unicodeEscaper45 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper7.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper4.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper1.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 100);
        java.io.Writer writer56 = null;
        boolean boolean57 = unicodeEscaper54.translate(10, writer56);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper63 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper66 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str71 = unicodeEscaper69.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper74 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer77 = null;
        int int78 = unicodeEscaper74.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer77);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper80 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper81 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper84 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray85 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper74, unicodeEscaper80, unicodeEscaper81, unicodeEscaper84 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator86 = unicodeEscaper69.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator87 = unicodeEscaper66.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator88 = unicodeEscaper63.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator89 = unicodeEscaper60.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator90 = unicodeEscaper54.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator91 = charSequenceTranslator51.with(charSequenceTranslatorArray85);
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertNotNull(unicodeEscaper63);
        org.junit.Assert.assertNotNull(unicodeEscaper66);
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper80);
        org.junit.Assert.assertNotNull(unicodeEscaper84);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray85);
        org.junit.Assert.assertNotNull(charSequenceTranslator86);
        org.junit.Assert.assertNotNull(charSequenceTranslator87);
        org.junit.Assert.assertNotNull(charSequenceTranslator88);
        org.junit.Assert.assertNotNull(charSequenceTranslator89);
        org.junit.Assert.assertNotNull(charSequenceTranslator90);
        org.junit.Assert.assertNotNull(charSequenceTranslator91);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (-1));
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) -1);
        java.io.Writer writer10 = null;
        int int11 = unicodeEscaper7.translate((java.lang.CharSequence) "FFFFFFFF", 1, writer10);
        java.io.Writer writer13 = null;
        boolean boolean14 = unicodeEscaper7.translate((int) '#', writer13);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        java.lang.String str18 = unicodeEscaper16.translate((java.lang.CharSequence) "\\\\u00750030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer28 = null;
        boolean boolean29 = unicodeEscaper26.translate((int) (short) 0, writer28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray33 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper26, unicodeEscaper30, unicodeEscaper32 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper23.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper21.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper16.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper7.with(charSequenceTranslatorArray33);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper7.translate((int) (byte) 0, writer39);
        java.lang.String str42 = unicodeEscaper7.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.io.Writer writer45 = null;
        int int46 = unicodeEscaper7.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030", (int) '#', writer45);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper53 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str58 = unicodeEscaper56.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str63 = unicodeEscaper61.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper66 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer69 = null;
        int int70 = unicodeEscaper66.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer69);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper72 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper73 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper76 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray77 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper66, unicodeEscaper72, unicodeEscaper73, unicodeEscaper76 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = unicodeEscaper61.with(charSequenceTranslatorArray77);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper56.with(charSequenceTranslatorArray77);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper53.with(charSequenceTranslatorArray77);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper83 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper86 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper88 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray89 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper53, unicodeEscaper83, unicodeEscaper86, unicodeEscaper88 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator90 = unicodeEscaper51.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator91 = unicodeEscaper48.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator92 = unicodeEscaper7.with(charSequenceTranslatorArray89);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator93 = unicodeEscaper2.with(charSequenceTranslatorArray89);
        java.lang.Class<?> wildcardClass94 = charSequenceTranslator93.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033" + "'", str4, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str18, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str42, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertNotNull(unicodeEscaper53);
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper72);
        org.junit.Assert.assertNotNull(unicodeEscaper76);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
        org.junit.Assert.assertNotNull(unicodeEscaper83);
        org.junit.Assert.assertNotNull(unicodeEscaper86);
        org.junit.Assert.assertNotNull(unicodeEscaper88);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray89);
        org.junit.Assert.assertNotNull(charSequenceTranslator90);
        org.junit.Assert.assertNotNull(charSequenceTranslator91);
        org.junit.Assert.assertNotNull(charSequenceTranslator92);
        org.junit.Assert.assertNotNull(charSequenceTranslator93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (byte) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033", (int) (short) 100, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate(0, writer10);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str4, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "64");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "64" + "'", str4, "64");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str16 = unicodeEscaper14.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer22 = null;
        int int23 = unicodeEscaper19.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer22);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray30 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper25, unicodeEscaper26, unicodeEscaper29 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper14.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper9.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper6.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray42 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper6, unicodeEscaper36, unicodeEscaper39, unicodeEscaper41 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper4.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper1.with(charSequenceTranslatorArray42);
        java.lang.String str46 = unicodeEscaper1.translate((java.lang.CharSequence) "6\\u0031");
        java.io.Writer writer49 = null;
        int int50 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033", 0, writer49);
        java.io.Writer writer53 = null;
        int int54 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", 100, writer53);
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "6\\\\u00750031" + "'", str46, "6\\\\u00750031");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) '#');
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
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030" + "'", str4, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031" + "'", str6, "\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str22 = unicodeEscaper20.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer28 = null;
        int int29 = unicodeEscaper25.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray36 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper25, unicodeEscaper31, unicodeEscaper32, unicodeEscaper35 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper20.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper15.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper10.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper5.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper2.with(charSequenceTranslatorArray36);
        java.io.Writer writer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0031", writer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FFFFFFFF" + "'", str12, "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str17, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (short) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate(0, writer6);
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper2.translate(1, writer9);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (short) 100);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper13.translate(10, writer15);
        java.lang.String str18 = unicodeEscaper13.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        java.io.Writer writer20 = null;
        boolean boolean21 = unicodeEscaper13.translate((int) (byte) 10, writer20);
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper13.translate(10, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) -1);
        java.io.Writer writer28 = null;
        boolean boolean29 = unicodeEscaper26.translate((int) '#', writer28);
        java.io.Writer writer31 = null;
        boolean boolean32 = unicodeEscaper26.translate((-1), writer31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str42 = unicodeEscaper40.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str47 = unicodeEscaper45.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer53 = null;
        int int54 = unicodeEscaper50.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer53);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray61 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper50, unicodeEscaper56, unicodeEscaper57, unicodeEscaper60 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper45.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper40.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper37.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper35.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper26.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator67 = unicodeEscaper13.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper2.with(charSequenceTranslatorArray61);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0030" + "'", str4, "\\u0030");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu0033\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu003\\u0034" + "'", str18, "\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu0033\\u005Cu00\\u0035\\u0043\\u005Cu00\\u0037\\u0035\\u005Cu0030\\u005Cu0030\\u005Cu0033\\u005Cu003\\u0034");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(charSequenceTranslator67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "64");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", (int) (byte) 10, writer8);
        java.lang.String str11 = unicodeEscaper1.translate((java.lang.CharSequence) "6\\u\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6\\u\\u0030\\u0030\\u0033\\u0031" + "'", str11, "6\\u\\u0030\\u0030\\u0033\\u0031");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (short) 0, writer3);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper1.translate((int) (short) 0, writer6);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) 'a');
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
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) ' ');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 1, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) 10);
        java.io.Writer writer14 = null;
        int int15 = unicodeEscaper11.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", 1, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer20 = null;
        boolean boolean21 = unicodeEscaper18.translate((int) (short) 0, writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str26 = unicodeEscaper24.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str31 = unicodeEscaper29.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer37 = null;
        int int38 = unicodeEscaper34.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer37);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray45 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper34, unicodeEscaper40, unicodeEscaper41, unicodeEscaper44 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper29.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper24.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper18.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper11.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper8.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper2.with(charSequenceTranslatorArray45);
        java.io.Writer writer53 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033", writer53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030" + "'", str4, "\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (byte) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0041");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0034\\u0031" + "'", str4, "\\u005Cu\\u0030\\u0030\\u0034\\u0031");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str22 = unicodeEscaper20.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer28 = null;
        int int29 = unicodeEscaper25.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray36 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper25, unicodeEscaper31, unicodeEscaper32, unicodeEscaper35 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper20.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper15.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper12.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper9.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper2.with(charSequenceTranslatorArray36);
        java.lang.String str43 = charSequenceTranslator41.translate((java.lang.CharSequence) "\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\u00750030" + "'", str6, "\\\\u00750030");
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str17, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str43, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer15 = null;
        int int16 = unicodeEscaper12.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray23 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper12, unicodeEscaper18, unicodeEscaper19, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper7.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator25 = unicodeEscaper2.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer32 = null;
        boolean boolean33 = unicodeEscaper30.translate((int) (short) 0, writer32);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray37 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper30, unicodeEscaper34, unicodeEscaper36 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper27.with(charSequenceTranslatorArray37);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = charSequenceTranslator25.with(charSequenceTranslatorArray37);
        java.lang.String str41 = charSequenceTranslator39.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer48 = null;
        boolean boolean49 = unicodeEscaper46.translate((int) (short) 0, writer48);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray53 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper46, unicodeEscaper50, unicodeEscaper52 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper43.with(charSequenceTranslatorArray53);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = charSequenceTranslator39.with(charSequenceTranslatorArray53);
        java.lang.String str57 = charSequenceTranslator55.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(charSequenceTranslator25);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str41, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031" + "'", str57, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str15 = unicodeEscaper13.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer26 = null;
        int int27 = unicodeEscaper23.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper23, unicodeEscaper29, unicodeEscaper30, unicodeEscaper33 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper18.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper13.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper10.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str42 = unicodeEscaper40.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer48 = null;
        int int49 = unicodeEscaper45.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer48);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray56 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper45, unicodeEscaper51, unicodeEscaper52, unicodeEscaper55 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper40.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str62 = unicodeEscaper60.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper65 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str67 = unicodeEscaper65.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper70 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer73 = null;
        int int74 = unicodeEscaper70.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer73);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper76 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper77 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper80 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray81 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper70, unicodeEscaper76, unicodeEscaper77, unicodeEscaper80 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator82 = unicodeEscaper65.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = unicodeEscaper60.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = charSequenceTranslator57.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = unicodeEscaper10.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator86 = unicodeEscaper7.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator87 = unicodeEscaper5.with(charSequenceTranslatorArray81);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator88 = unicodeEscaper2.with(charSequenceTranslatorArray81);
        java.io.Writer writer90 = null;
        boolean boolean91 = unicodeEscaper2.translate((int) (short) 10, writer90);
        java.lang.String str93 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str15, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str62, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper76);
        org.junit.Assert.assertNotNull(unicodeEscaper80);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray81);
        org.junit.Assert.assertNotNull(charSequenceTranslator82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
        org.junit.Assert.assertNotNull(charSequenceTranslator86);
        org.junit.Assert.assertNotNull(charSequenceTranslator87);
        org.junit.Assert.assertNotNull(charSequenceTranslator88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030" + "'", str93, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) ' ');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 100, writer4);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (short) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) -1, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper13.translate((int) (short) 0, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray20 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper13, unicodeEscaper17, unicodeEscaper19 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper10.with(charSequenceTranslatorArray20);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper8.with(charSequenceTranslatorArray20);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator23 = unicodeEscaper2.with(charSequenceTranslatorArray20);
        java.lang.Class<?> wildcardClass24 = charSequenceTranslator23.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(charSequenceTranslator23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) ' ');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0033\\u0032\\u005Cu\\u0030\\u0030\\u0033\\u0030");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\\\u007500750068\\\\\\u007500750069\\\\\\u007500750021", (int) (byte) 0, writer5);
        java.lang.String str8 = unicodeEscaper2.translate((java.lang.CharSequence) "20");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0037\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", (-1), writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20" + "'", str8, "20");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) -1, writer4);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) '4');
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "A", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030" + "'", str4, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(1, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (short) 10, writer7);
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate((-1), writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (short) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str21 = unicodeEscaper19.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str26 = unicodeEscaper24.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer32 = null;
        int int33 = unicodeEscaper29.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer32);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray40 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper29, unicodeEscaper35, unicodeEscaper36, unicodeEscaper39 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper24.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper19.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer48 = null;
        int int49 = unicodeEscaper45.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer48);
        java.io.Writer writer51 = null;
        boolean boolean52 = unicodeEscaper45.translate((int) (byte) -1, writer51);
        java.lang.String str54 = unicodeEscaper45.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str59 = unicodeEscaper57.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray60 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper45, unicodeEscaper57 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = unicodeEscaper19.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper16.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper13.with(charSequenceTranslatorArray60);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper2.with(charSequenceTranslatorArray60);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) (short) 0, writer12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray17 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper10, unicodeEscaper14, unicodeEscaper16 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator18 = unicodeEscaper7.with(charSequenceTranslatorArray17);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper5.with(charSequenceTranslatorArray17);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper2.with(charSequenceTranslatorArray17);
        java.lang.Class<?> wildcardClass21 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray17);
        org.junit.Assert.assertNotNull(charSequenceTranslator18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str7, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((-1), writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) 'a', writer7);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(100, writer4);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str15 = unicodeEscaper13.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer26 = null;
        int int27 = unicodeEscaper23.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper23, unicodeEscaper29, unicodeEscaper30, unicodeEscaper33 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper18.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper13.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper10.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper8.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        java.io.Writer writer41 = null;
        boolean boolean42 = unicodeEscaper2.translate((int) '#', writer41);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", (int) (short) 1, writer5);
        java.lang.Class<?> wildcardClass7 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) -1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 1, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper2.translate((int) '#', writer8);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        java.lang.String str13 = unicodeEscaper11.translate((java.lang.CharSequence) "\\\\u00750030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper21.translate((int) (short) 0, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper21, unicodeEscaper25, unicodeEscaper27 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper18.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper16.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper11.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper2.with(charSequenceTranslatorArray28);
        java.io.Writer writer34 = null;
        boolean boolean35 = unicodeEscaper2.translate((int) (byte) 0, writer34);
        java.lang.String str37 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.io.Writer writer40 = null;
        int int41 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030", (int) '#', writer40);
        java.io.Writer writer43 = null;
        boolean boolean44 = unicodeEscaper2.translate((int) (byte) 100, writer43);
        java.lang.String str46 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str13, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str37, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\u0031" + "'", str46, "\\u0031");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (-1));
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) (short) 0, writer11);
        java.io.Writer writer14 = null;
        boolean boolean15 = unicodeEscaper9.translate((int) (byte) 10, writer14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer25 = null;
        boolean boolean26 = unicodeEscaper23.translate((int) (short) 0, writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray30 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper23, unicodeEscaper27, unicodeEscaper29 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper20.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper18.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str44 = unicodeEscaper42.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str49 = unicodeEscaper47.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer55 = null;
        int int56 = unicodeEscaper52.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer55);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray63 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper52, unicodeEscaper58, unicodeEscaper59, unicodeEscaper62 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper47.with(charSequenceTranslatorArray63);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper42.with(charSequenceTranslatorArray63);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper39.with(charSequenceTranslatorArray63);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper72 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper74 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray75 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper39, unicodeEscaper69, unicodeEscaper72, unicodeEscaper74 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator76 = unicodeEscaper37.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator77 = unicodeEscaper34.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = charSequenceTranslator32.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper9.with(charSequenceTranslatorArray75);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper2.with(charSequenceTranslatorArray75);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030" + "'", str6, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertNotNull(unicodeEscaper72);
        org.junit.Assert.assertNotNull(unicodeEscaper74);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray75);
        org.junit.Assert.assertNotNull(charSequenceTranslator76);
        org.junit.Assert.assertNotNull(charSequenceTranslator77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0033\\u0032\\u005Cu\\u0030\\u0030\\u0033\\u0030", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (byte) -1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", 0, writer5);
        java.lang.String str8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031" + "'", str8, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0036\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (-1));
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) 10, writer7);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer18 = null;
        boolean boolean19 = unicodeEscaper16.translate((int) (short) 0, writer18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray23 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper16, unicodeEscaper20, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper13.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator25 = unicodeEscaper11.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str37 = unicodeEscaper35.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str42 = unicodeEscaper40.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer48 = null;
        int int49 = unicodeEscaper45.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer48);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray56 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper45, unicodeEscaper51, unicodeEscaper52, unicodeEscaper55 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper40.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper35.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator59 = unicodeEscaper32.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper65 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper67 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray68 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper32, unicodeEscaper62, unicodeEscaper65, unicodeEscaper67 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator69 = unicodeEscaper30.with(charSequenceTranslatorArray68);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator70 = unicodeEscaper27.with(charSequenceTranslatorArray68);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator71 = charSequenceTranslator25.with(charSequenceTranslatorArray68);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator72 = unicodeEscaper2.with(charSequenceTranslatorArray68);
        java.lang.Class<?> wildcardClass73 = charSequenceTranslatorArray68.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(charSequenceTranslator25);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
        org.junit.Assert.assertNotNull(charSequenceTranslator59);
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertNotNull(unicodeEscaper65);
        org.junit.Assert.assertNotNull(unicodeEscaper67);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray68);
        org.junit.Assert.assertNotNull(charSequenceTranslator69);
        org.junit.Assert.assertNotNull(charSequenceTranslator70);
        org.junit.Assert.assertNotNull(charSequenceTranslator71);
        org.junit.Assert.assertNotNull(charSequenceTranslator72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) (byte) -1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "23", 1, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper2.translate(100, writer8);
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper2.translate(0, writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer26 = null;
        int int27 = unicodeEscaper23.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper23, unicodeEscaper29, unicodeEscaper30, unicodeEscaper33 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper18.with(charSequenceTranslatorArray34);
        java.lang.String str37 = unicodeEscaper18.translate((java.lang.CharSequence) "\\u0033\\u0034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str45 = unicodeEscaper43.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer51 = null;
        int int52 = unicodeEscaper48.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer51);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray59 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper48, unicodeEscaper54, unicodeEscaper55, unicodeEscaper58 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = unicodeEscaper43.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = unicodeEscaper40.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper18.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper15.with(charSequenceTranslatorArray59);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper2.with(charSequenceTranslatorArray59);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\u0033\\u0034" + "'", str37, "\\u0033\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer12 = null;
        boolean boolean13 = unicodeEscaper10.translate((int) (short) 0, writer12);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray17 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper10, unicodeEscaper14, unicodeEscaper16 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator18 = unicodeEscaper7.with(charSequenceTranslatorArray17);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper5.with(charSequenceTranslatorArray17);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator20 = unicodeEscaper2.with(charSequenceTranslatorArray17);
        java.lang.String str22 = unicodeEscaper2.translate((java.lang.CharSequence) "61");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray17);
        org.junit.Assert.assertNotNull(charSequenceTranslator18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(charSequenceTranslator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "61" + "'", str22, "61");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750030");
        java.lang.String str8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750030");
        java.io.Writer writer10 = null;
        boolean boolean11 = unicodeEscaper2.translate(1, writer10);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\u00750030" + "'", str6, "\\\\u00750030");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\\u00750030" + "'", str8, "\\\\u00750030");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer20 = null;
        int int21 = unicodeEscaper17.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper17, unicodeEscaper23, unicodeEscaper24, unicodeEscaper27 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper12.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper7.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer36 = null;
        int int37 = unicodeEscaper33.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer36);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper33.translate((int) (byte) -1, writer39);
        java.lang.String str42 = unicodeEscaper33.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str47 = unicodeEscaper45.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray48 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper33, unicodeEscaper45 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper7.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper4.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper1.with(charSequenceTranslatorArray48);
        java.lang.String str53 = unicodeEscaper1.translate((java.lang.CharSequence) "20");
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "20" + "'", str53, "20");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) -1, writer7);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0030");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str10 = unicodeEscaper8.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str15 = unicodeEscaper13.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer21 = null;
        int int22 = unicodeEscaper18.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer21);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray29 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper18, unicodeEscaper24, unicodeEscaper25, unicodeEscaper28 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper13.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper8.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper5.with(charSequenceTranslatorArray29);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper2.with(charSequenceTranslatorArray29);
        java.lang.Class<?> wildcardClass34 = charSequenceTranslator33.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str10, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer10 = null;
        int int11 = unicodeEscaper7.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray18 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper7, unicodeEscaper13, unicodeEscaper14, unicodeEscaper17 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator19 = unicodeEscaper2.with(charSequenceTranslatorArray18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper21.translate(1, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str36 = unicodeEscaper34.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str41 = unicodeEscaper39.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer47 = null;
        int int48 = unicodeEscaper44.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer47);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray55 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper44, unicodeEscaper50, unicodeEscaper51, unicodeEscaper54 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator56 = unicodeEscaper39.with(charSequenceTranslatorArray55);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper34.with(charSequenceTranslatorArray55);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper31.with(charSequenceTranslatorArray55);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper66 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray67 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper31, unicodeEscaper61, unicodeEscaper64, unicodeEscaper66 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper29.with(charSequenceTranslatorArray67);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator69 = unicodeEscaper26.with(charSequenceTranslatorArray67);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator70 = unicodeEscaper21.with(charSequenceTranslatorArray67);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator71 = unicodeEscaper2.with(charSequenceTranslatorArray67);
        java.io.Writer writer73 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0037\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", writer73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray18);
        org.junit.Assert.assertNotNull(charSequenceTranslator19);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray55);
        org.junit.Assert.assertNotNull(charSequenceTranslator56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
        org.junit.Assert.assertNotNull(unicodeEscaper61);
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertNotNull(unicodeEscaper66);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
        org.junit.Assert.assertNotNull(charSequenceTranslator69);
        org.junit.Assert.assertNotNull(charSequenceTranslator70);
        org.junit.Assert.assertNotNull(charSequenceTranslator71);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "61", (int) (short) 0, writer5);
        java.io.Writer writer9 = null;
        int int10 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033", (int) (byte) 10, writer9);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030", (int) (byte) -1, writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (byte) 0, writer3);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        java.io.Writer writer10 = null;
        int int11 = unicodeEscaper7.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", 100, writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.lang.String str15 = unicodeEscaper13.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) -1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str23 = unicodeEscaper21.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer29 = null;
        int int30 = unicodeEscaper26.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer29);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray37 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper26, unicodeEscaper32, unicodeEscaper33, unicodeEscaper36 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper21.with(charSequenceTranslatorArray37);
        java.lang.String str40 = unicodeEscaper21.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str45 = unicodeEscaper43.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str50 = unicodeEscaper48.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper53 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer56 = null;
        int int57 = unicodeEscaper53.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer56);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper63 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray64 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper53, unicodeEscaper59, unicodeEscaper60, unicodeEscaper63 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper48.with(charSequenceTranslatorArray64);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper43.with(charSequenceTranslatorArray64);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper68 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper71 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer73 = null;
        boolean boolean74 = unicodeEscaper71.translate((int) (short) 0, writer73);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper75 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper77 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray78 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper71, unicodeEscaper75, unicodeEscaper77 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper68.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = charSequenceTranslator66.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator81 = unicodeEscaper21.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator82 = unicodeEscaper18.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = unicodeEscaper13.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = unicodeEscaper7.with(charSequenceTranslatorArray78);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = unicodeEscaper1.with(charSequenceTranslatorArray78);
        java.io.Writer writer87 = null;
        boolean boolean88 = unicodeEscaper1.translate(0, writer87);
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str45, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper59);
        org.junit.Assert.assertNotNull(unicodeEscaper63);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(unicodeEscaper68);
        org.junit.Assert.assertNotNull(unicodeEscaper71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper77);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
        org.junit.Assert.assertNotNull(charSequenceTranslator81);
        org.junit.Assert.assertNotNull(charSequenceTranslator82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", 0, writer5);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer25 = null;
        int int26 = unicodeEscaper22.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray33 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper22, unicodeEscaper28, unicodeEscaper29, unicodeEscaper32 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper17.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper12.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper9.with(charSequenceTranslatorArray33);
        java.lang.String str38 = charSequenceTranslator36.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str43 = unicodeEscaper41.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str48 = unicodeEscaper46.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer54 = null;
        int int55 = unicodeEscaper51.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer54);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray62 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper51, unicodeEscaper57, unicodeEscaper58, unicodeEscaper61 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper46.with(charSequenceTranslatorArray62);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper41.with(charSequenceTranslatorArray62);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper67 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer70 = null;
        int int71 = unicodeEscaper67.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer70);
        java.io.Writer writer73 = null;
        boolean boolean74 = unicodeEscaper67.translate((int) (byte) -1, writer73);
        java.lang.String str76 = unicodeEscaper67.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper79 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str81 = unicodeEscaper79.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray82 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper67, unicodeEscaper79 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator83 = unicodeEscaper41.with(charSequenceTranslatorArray82);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator84 = charSequenceTranslator36.with(charSequenceTranslatorArray82);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = unicodeEscaper2.with(charSequenceTranslatorArray82);
        java.io.Writer writer87 = null;
        boolean boolean88 = unicodeEscaper2.translate((-1), writer87);
        java.io.Writer writer90 = null;
        boolean boolean91 = unicodeEscaper2.translate((int) (byte) -1, writer90);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str14, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\u0032\\u0033" + "'", str38, "\\u0032\\u0033");
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertNotNull(unicodeEscaper61);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(unicodeEscaper67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "0" + "'", str76, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray82);
        org.junit.Assert.assertNotNull(charSequenceTranslator83);
        org.junit.Assert.assertNotNull(charSequenceTranslator84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) '4');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031", (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) ' ');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0041");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0041" + "'", str4, "\\u0041");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer10 = null;
        int int11 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", 1, writer10);
        java.io.Writer writer14 = null;
        int int15 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0034\\u0031", (int) (short) 0, writer14);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031", writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) '#', writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        java.lang.String str10 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046");
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "61" + "'", str6, "61");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str8, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046" + "'", str10, "\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (byte) 10);
        java.lang.String str10 = unicodeEscaper8.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        java.lang.String str18 = unicodeEscaper16.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.lang.String str23 = unicodeEscaper21.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str28 = unicodeEscaper26.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str33 = unicodeEscaper31.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer39 = null;
        int int40 = unicodeEscaper36.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer39);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray47 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper36, unicodeEscaper42, unicodeEscaper43, unicodeEscaper46 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator48 = unicodeEscaper31.with(charSequenceTranslatorArray47);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper26.with(charSequenceTranslatorArray47);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper21.with(charSequenceTranslatorArray47);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator51 = unicodeEscaper16.with(charSequenceTranslatorArray47);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper13.with(charSequenceTranslatorArray47);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper8.with(charSequenceTranslatorArray47);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper5.with(charSequenceTranslatorArray47);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper2.with(charSequenceTranslatorArray47);
        java.io.Writer writer57 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = unicodeEscaper2.translate((int) '4', writer57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str10, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "FFFFFFFF" + "'", str23, "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str28, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray47);
        org.junit.Assert.assertNotNull(charSequenceTranslator48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(charSequenceTranslator51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str16 = unicodeEscaper14.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer22 = null;
        int int23 = unicodeEscaper19.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer22);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray30 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper25, unicodeEscaper26, unicodeEscaper29 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper14.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper9.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper6.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer38 = null;
        boolean boolean39 = unicodeEscaper36.translate((int) (byte) 100, writer38);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper42 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str47 = unicodeEscaper45.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer53 = null;
        int int54 = unicodeEscaper50.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer53);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray61 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper50, unicodeEscaper56, unicodeEscaper57, unicodeEscaper60 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper45.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper42.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper36.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = charSequenceTranslator33.with(charSequenceTranslatorArray61);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper2.with(charSequenceTranslatorArray61);
        java.lang.CharSequence charSequence67 = null;
        java.lang.String str68 = charSequenceTranslator66.translate(charSequence67);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper42);
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "\\u0030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str24 = unicodeEscaper22.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer30 = null;
        int int31 = unicodeEscaper27.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer30);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray38 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper27, unicodeEscaper33, unicodeEscaper34, unicodeEscaper37 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper22.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper19.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper16.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper13.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper10.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper5.with(charSequenceTranslatorArray38);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator45 = unicodeEscaper2.with(charSequenceTranslatorArray38);
        java.io.Writer writer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033", writer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str7, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertNotNull(charSequenceTranslator45);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer23 = null;
        int int24 = unicodeEscaper20.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray31 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper20, unicodeEscaper26, unicodeEscaper27, unicodeEscaper30 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper15.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper10.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer39 = null;
        int int40 = unicodeEscaper36.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer39);
        java.io.Writer writer42 = null;
        boolean boolean43 = unicodeEscaper36.translate((int) (byte) -1, writer42);
        java.lang.String str45 = unicodeEscaper36.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str50 = unicodeEscaper48.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray51 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper36, unicodeEscaper48 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper10.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper7.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper4.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator55 = unicodeEscaper2.with(charSequenceTranslatorArray51);
        java.io.Writer writer57 = null;
        boolean boolean58 = unicodeEscaper2.translate((int) (short) 10, writer57);
        java.io.Writer writer61 = null;
        int int62 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033", 100, writer61);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(charSequenceTranslator55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer13 = null;
        int int14 = unicodeEscaper10.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer13);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray21 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper10, unicodeEscaper16, unicodeEscaper17, unicodeEscaper20 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper5.with(charSequenceTranslatorArray21);
        java.lang.String str24 = unicodeEscaper5.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str29 = unicodeEscaper27.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str34 = unicodeEscaper32.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper37 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer40 = null;
        int int41 = unicodeEscaper37.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer40);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray48 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper37, unicodeEscaper43, unicodeEscaper44, unicodeEscaper47 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper32.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper27.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer57 = null;
        boolean boolean58 = unicodeEscaper55.translate((int) (short) 0, writer57);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray62 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper55, unicodeEscaper59, unicodeEscaper61 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator63 = unicodeEscaper52.with(charSequenceTranslatorArray62);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = charSequenceTranslator50.with(charSequenceTranslatorArray62);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper5.with(charSequenceTranslatorArray62);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper2.with(charSequenceTranslatorArray62);
        java.io.Writer writer68 = null;
        boolean boolean69 = unicodeEscaper2.translate((-1), writer68);
        java.lang.String str71 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        java.io.Writer writer73 = null;
        boolean boolean74 = unicodeEscaper2.translate(0, writer73);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str29, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(unicodeEscaper47);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper61);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray62);
        org.junit.Assert.assertNotNull(charSequenceTranslator63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str71, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(1, writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033", (int) (short) 100, writer8);
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper2.translate((int) (byte) 10, writer11);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str14 = unicodeEscaper12.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer20 = null;
        int int21 = unicodeEscaper17.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper17, unicodeEscaper23, unicodeEscaper24, unicodeEscaper27 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper12.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper7.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer36 = null;
        int int37 = unicodeEscaper33.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer36);
        java.io.Writer writer39 = null;
        boolean boolean40 = unicodeEscaper33.translate((int) (byte) -1, writer39);
        java.lang.String str42 = unicodeEscaper33.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str47 = unicodeEscaper45.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray48 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper33, unicodeEscaper45 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator49 = unicodeEscaper7.with(charSequenceTranslatorArray48);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator50 = unicodeEscaper2.with(charSequenceTranslatorArray48);
        java.io.Writer writer52 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750068\\\\u00750069\\\\u00750021", writer52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0031" + "'", str4, "\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray48);
        org.junit.Assert.assertNotNull(charSequenceTranslator49);
        org.junit.Assert.assertNotNull(charSequenceTranslator50);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030", (int) (short) 10, writer5);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper2.translate((int) (short) 100, writer8);
        java.lang.String str11 = unicodeEscaper2.translate((java.lang.CharSequence) "61");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030" + "'", str4, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030" + "'", str6, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "61" + "'", str11, "61");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) '#', writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper1.translate((int) (byte) -1, writer8);
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "61" + "'", str6, "61");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str9 = unicodeEscaper7.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer15 = null;
        int int16 = unicodeEscaper12.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray23 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper12, unicodeEscaper18, unicodeEscaper19, unicodeEscaper22 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator24 = unicodeEscaper7.with(charSequenceTranslatorArray23);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator25 = unicodeEscaper2.with(charSequenceTranslatorArray23);
        java.lang.String str27 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        java.lang.String str29 = unicodeEscaper2.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper38 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str43 = unicodeEscaper41.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer49 = null;
        int int50 = unicodeEscaper46.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer49);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper53 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray57 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper46, unicodeEscaper52, unicodeEscaper53, unicodeEscaper56 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper41.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator59 = unicodeEscaper38.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator60 = unicodeEscaper35.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator61 = unicodeEscaper32.with(charSequenceTranslatorArray57);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator62 = unicodeEscaper2.with(charSequenceTranslatorArray57);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray23);
        org.junit.Assert.assertNotNull(charSequenceTranslator24);
        org.junit.Assert.assertNotNull(charSequenceTranslator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str27, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\u0036\\u0034" + "'", str29, "\\u0036\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper38);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper52);
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
        org.junit.Assert.assertNotNull(charSequenceTranslator59);
        org.junit.Assert.assertNotNull(charSequenceTranslator60);
        org.junit.Assert.assertNotNull(charSequenceTranslator61);
        org.junit.Assert.assertNotNull(charSequenceTranslator62);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "23", 0, writer7);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 10);
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper13.translate((int) (byte) 100, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer26 = null;
        boolean boolean27 = unicodeEscaper24.translate((int) (short) 0, writer26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str32 = unicodeEscaper30.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str37 = unicodeEscaper35.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer43 = null;
        int int44 = unicodeEscaper40.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer43);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray51 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper40, unicodeEscaper46, unicodeEscaper47, unicodeEscaper50 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator52 = unicodeEscaper35.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper30.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper24.with(charSequenceTranslatorArray51);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray63 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper18, unicodeEscaper21, charSequenceTranslator54, unicodeEscaper57, unicodeEscaper60, unicodeEscaper62 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator64 = unicodeEscaper13.with(charSequenceTranslatorArray63);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator65 = unicodeEscaper11.with(charSequenceTranslatorArray63);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper2.with(charSequenceTranslatorArray63);
        java.lang.Class<?> wildcardClass67 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033" + "'", str4, "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray51);
        org.junit.Assert.assertNotNull(charSequenceTranslator52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray63);
        org.junit.Assert.assertNotNull(charSequenceTranslator64);
        org.junit.Assert.assertNotNull(charSequenceTranslator65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030", (int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\\\u0075\\u0030\\u00305C\\\\u0075\\u0030\\u00305C\\\\u0075\\u0030\\u003075\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u00337\\\\u0075\\u0030\\u0030\\u00335\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0030\\\\u0075\\u0030\\u0030\\u0033\\u0033\\\\u0075\\u0030\\u0030\\u0033\\u0030", (int) (short) 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str16 = unicodeEscaper14.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer22 = null;
        int int23 = unicodeEscaper19.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer22);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray30 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper25, unicodeEscaper26, unicodeEscaper29 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper14.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper9.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper6.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray42 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper6, unicodeEscaper36, unicodeEscaper39, unicodeEscaper41 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper4.with(charSequenceTranslatorArray42);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator44 = unicodeEscaper1.with(charSequenceTranslatorArray42);
        java.lang.String str46 = unicodeEscaper1.translate((java.lang.CharSequence) "6\\u0031");
        java.lang.Class<?> wildcardClass47 = unicodeEscaper1.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(charSequenceTranslator44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "6\\\\u00750031" + "'", str46, "6\\\\u00750031");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str19 = unicodeEscaper17.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer25 = null;
        int int26 = unicodeEscaper22.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer25);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper28 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray33 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper22, unicodeEscaper28, unicodeEscaper29, unicodeEscaper32 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper17.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper14.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper11.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper8.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper5.with(charSequenceTranslatorArray33);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper2.with(charSequenceTranslatorArray33);
        java.lang.String str41 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0037\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertNotNull(unicodeEscaper17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper28);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0037\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str41, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0037\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer23 = null;
        int int24 = unicodeEscaper20.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray31 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper20, unicodeEscaper26, unicodeEscaper27, unicodeEscaper30 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper15.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator33 = unicodeEscaper10.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator34 = unicodeEscaper5.with(charSequenceTranslatorArray31);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper2.with(charSequenceTranslatorArray31);
        java.lang.Class<?> wildcardClass36 = charSequenceTranslatorArray31.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7, "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str12, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(unicodeEscaper30);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(charSequenceTranslator33);
        org.junit.Assert.assertNotNull(charSequenceTranslator34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (short) 1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) (short) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((-1), writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) 1, writer7);
        java.lang.String str10 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0032\\u0030");
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0031", 0, writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0033\\u0032\\u005Cu\\u0030\\u0030\\u0033\\u0030" + "'", str10, "\\u005Cu\\u0030\\u0030\\u0033\\u0032\\u005Cu\\u0030\\u0030\\u0033\\u0030");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) '4');
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\\\u00750075005C\\\\\\u007500750075\\\\\\u007500750030\\\\\\u007500750030\\\\\\u007500750033\\\\\\u007500750031", (int) (short) 1, writer5);
        java.io.Writer writer9 = null;
        int int10 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030", (int) '#', writer9);
        java.lang.Class<?> wildcardClass11 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0031", (int) (short) 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) -1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 1, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper2.translate((int) '#', writer8);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        java.lang.String str13 = unicodeEscaper11.translate((java.lang.CharSequence) "\\\\u00750030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper16 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer23 = null;
        boolean boolean24 = unicodeEscaper21.translate((int) (short) 0, writer23);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper27 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray28 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper21, unicodeEscaper25, unicodeEscaper27 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper18.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator30 = unicodeEscaper16.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper11.with(charSequenceTranslatorArray28);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper2.with(charSequenceTranslatorArray28);
        java.io.Writer writer34 = null;
        boolean boolean35 = unicodeEscaper2.translate((int) (byte) 0, writer34);
        java.lang.String str37 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.io.Writer writer40 = null;
        int int41 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030", (int) '#', writer40);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper43 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str53 = unicodeEscaper51.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper56 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str58 = unicodeEscaper56.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer64 = null;
        int int65 = unicodeEscaper61.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer64);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper67 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper68 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper71 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray72 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper61, unicodeEscaper67, unicodeEscaper68, unicodeEscaper71 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator73 = unicodeEscaper56.with(charSequenceTranslatorArray72);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator74 = unicodeEscaper51.with(charSequenceTranslatorArray72);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = unicodeEscaper48.with(charSequenceTranslatorArray72);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper78 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper81 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper83 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray84 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper48, unicodeEscaper78, unicodeEscaper81, unicodeEscaper83 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = unicodeEscaper46.with(charSequenceTranslatorArray84);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator86 = unicodeEscaper43.with(charSequenceTranslatorArray84);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator87 = unicodeEscaper2.with(charSequenceTranslatorArray84);
        java.lang.Class<?> wildcardClass88 = charSequenceTranslatorArray84.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030" + "'", str13, "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper16);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper27);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(charSequenceTranslator30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str37, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper43);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper48);
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper67);
        org.junit.Assert.assertNotNull(unicodeEscaper71);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray72);
        org.junit.Assert.assertNotNull(charSequenceTranslator73);
        org.junit.Assert.assertNotNull(charSequenceTranslator74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
        org.junit.Assert.assertNotNull(unicodeEscaper78);
        org.junit.Assert.assertNotNull(unicodeEscaper81);
        org.junit.Assert.assertNotNull(unicodeEscaper83);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
        org.junit.Assert.assertNotNull(charSequenceTranslator86);
        org.junit.Assert.assertNotNull(charSequenceTranslator87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (byte) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(10);
        java.lang.String str6 = unicodeEscaper4.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer11 = null;
        boolean boolean12 = unicodeEscaper9.translate((int) (byte) 100, writer11);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper18 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str20 = unicodeEscaper18.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper23 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer26 = null;
        int int27 = unicodeEscaper23.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper30 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper33 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray34 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper23, unicodeEscaper29, unicodeEscaper30, unicodeEscaper33 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator35 = unicodeEscaper18.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator36 = unicodeEscaper15.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper9.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper4.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper2.with(charSequenceTranslatorArray34);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str46 = unicodeEscaper44.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str51 = unicodeEscaper49.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer57 = null;
        int int58 = unicodeEscaper54.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer57);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper60 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray65 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper54, unicodeEscaper60, unicodeEscaper61, unicodeEscaper64 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator66 = unicodeEscaper49.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator67 = unicodeEscaper44.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator68 = unicodeEscaper41.with(charSequenceTranslatorArray65);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator69 = unicodeEscaper2.with(charSequenceTranslatorArray65);
        java.lang.CharSequence charSequence70 = null;
        java.lang.String str71 = charSequenceTranslator69.translate(charSequence70);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str6, "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertNotNull(unicodeEscaper18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(unicodeEscaper33);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray34);
        org.junit.Assert.assertNotNull(charSequenceTranslator35);
        org.junit.Assert.assertNotNull(charSequenceTranslator36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper60);
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray65);
        org.junit.Assert.assertNotNull(charSequenceTranslator66);
        org.junit.Assert.assertNotNull(charSequenceTranslator67);
        org.junit.Assert.assertNotNull(charSequenceTranslator68);
        org.junit.Assert.assertNotNull(charSequenceTranslator69);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "A");
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer18 = null;
        int int19 = unicodeEscaper15.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer18);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper21 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper22 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray26 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper15, unicodeEscaper21, unicodeEscaper22, unicodeEscaper25 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator27 = unicodeEscaper10.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator28 = unicodeEscaper5.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator29 = unicodeEscaper2.with(charSequenceTranslatorArray26);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str37 = unicodeEscaper35.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str42 = unicodeEscaper40.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer48 = null;
        int int49 = unicodeEscaper45.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer48);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray56 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper45, unicodeEscaper51, unicodeEscaper52, unicodeEscaper55 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper40.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper35.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator59 = unicodeEscaper32.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper61 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str66 = unicodeEscaper64.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str71 = unicodeEscaper69.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper74 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer77 = null;
        int int78 = unicodeEscaper74.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer77);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper80 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper81 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper84 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray85 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper74, unicodeEscaper80, unicodeEscaper81, unicodeEscaper84 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator86 = unicodeEscaper69.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator87 = unicodeEscaper64.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator88 = unicodeEscaper61.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator89 = charSequenceTranslator59.with(charSequenceTranslatorArray85);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator90 = unicodeEscaper2.with(charSequenceTranslatorArray85);
        java.io.Writer writer93 = null;
        int int94 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750041", 10, writer93);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str7, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper21);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray26);
        org.junit.Assert.assertNotNull(charSequenceTranslator27);
        org.junit.Assert.assertNotNull(charSequenceTranslator28);
        org.junit.Assert.assertNotNull(charSequenceTranslator29);
        org.junit.Assert.assertNotNull(unicodeEscaper32);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str37, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
        org.junit.Assert.assertNotNull(charSequenceTranslator59);
        org.junit.Assert.assertNotNull(unicodeEscaper61);
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper80);
        org.junit.Assert.assertNotNull(unicodeEscaper84);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray85);
        org.junit.Assert.assertNotNull(charSequenceTranslator86);
        org.junit.Assert.assertNotNull(charSequenceTranslator87);
        org.junit.Assert.assertNotNull(charSequenceTranslator88);
        org.junit.Assert.assertNotNull(charSequenceTranslator89);
        org.junit.Assert.assertNotNull(charSequenceTranslator90);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        java.lang.String str7 = unicodeEscaper5.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.lang.String str12 = unicodeEscaper10.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper15 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str17 = unicodeEscaper15.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper20 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str22 = unicodeEscaper20.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer28 = null;
        int int29 = unicodeEscaper25.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer28);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper32 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray36 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper25, unicodeEscaper31, unicodeEscaper32, unicodeEscaper35 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator37 = unicodeEscaper20.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator38 = unicodeEscaper15.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator39 = unicodeEscaper10.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator40 = unicodeEscaper5.with(charSequenceTranslatorArray36);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper2.with(charSequenceTranslatorArray36);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FFFFFFFF" + "'", str12, "FFFFFFFF");
        org.junit.Assert.assertNotNull(unicodeEscaper15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str17, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray36);
        org.junit.Assert.assertNotNull(charSequenceTranslator37);
        org.junit.Assert.assertNotNull(charSequenceTranslator38);
        org.junit.Assert.assertNotNull(charSequenceTranslator39);
        org.junit.Assert.assertNotNull(charSequenceTranslator40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (short) 0);
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
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper8 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper10 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer15 = null;
        boolean boolean16 = unicodeEscaper13.translate((int) (short) 0, writer15);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper17 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray20 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper13, unicodeEscaper17, unicodeEscaper19 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator21 = unicodeEscaper10.with(charSequenceTranslatorArray20);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator22 = unicodeEscaper8.with(charSequenceTranslatorArray20);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator23 = unicodeEscaper5.with(charSequenceTranslatorArray20);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str28 = unicodeEscaper26.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper31 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str33 = unicodeEscaper31.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str38 = unicodeEscaper36.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer44 = null;
        int int45 = unicodeEscaper41.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer44);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper47 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper48 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray52 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper41, unicodeEscaper47, unicodeEscaper48, unicodeEscaper51 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator53 = unicodeEscaper36.with(charSequenceTranslatorArray52);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator54 = unicodeEscaper31.with(charSequenceTranslatorArray52);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper57 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer60 = null;
        int int61 = unicodeEscaper57.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer60);
        java.io.Writer writer63 = null;
        boolean boolean64 = unicodeEscaper57.translate((int) (byte) -1, writer63);
        java.lang.String str66 = unicodeEscaper57.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str71 = unicodeEscaper69.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray72 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper57, unicodeEscaper69 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator73 = unicodeEscaper31.with(charSequenceTranslatorArray72);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator74 = unicodeEscaper26.with(charSequenceTranslatorArray72);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = charSequenceTranslator23.with(charSequenceTranslatorArray72);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator76 = unicodeEscaper2.with(charSequenceTranslatorArray72);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = unicodeEscaper2.with(charSequenceTranslatorArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        org.junit.Assert.assertNotNull(unicodeEscaper8);
        org.junit.Assert.assertNotNull(unicodeEscaper10);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray20);
        org.junit.Assert.assertNotNull(charSequenceTranslator21);
        org.junit.Assert.assertNotNull(charSequenceTranslator22);
        org.junit.Assert.assertNotNull(charSequenceTranslator23);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\u0031" + "'", str28, "\\u0031");
        org.junit.Assert.assertNotNull(unicodeEscaper31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper47);
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray52);
        org.junit.Assert.assertNotNull(charSequenceTranslator53);
        org.junit.Assert.assertNotNull(charSequenceTranslator54);
        org.junit.Assert.assertNotNull(unicodeEscaper57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0" + "'", str66, "0");
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray72);
        org.junit.Assert.assertNotNull(charSequenceTranslator73);
        org.junit.Assert.assertNotNull(charSequenceTranslator74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
        org.junit.Assert.assertNotNull(charSequenceTranslator76);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0032\\u0033");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\u00750032\\\\u00750033" + "'", str4, "\\\\u00750032\\\\u00750033");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper7 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer9 = null;
        boolean boolean10 = unicodeEscaper7.translate((int) (short) 0, writer9);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper11 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper13 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray14 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper7, unicodeEscaper11, unicodeEscaper13 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator15 = unicodeEscaper4.with(charSequenceTranslatorArray14);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator16 = unicodeEscaper2.with(charSequenceTranslatorArray14);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer22 = null;
        int int23 = unicodeEscaper19.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer22);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '#');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str31 = unicodeEscaper29.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper34 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer37 = null;
        int int38 = unicodeEscaper34.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer37);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper41 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper44 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray45 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper34, unicodeEscaper40, unicodeEscaper41, unicodeEscaper44 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator46 = unicodeEscaper29.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator47 = unicodeEscaper26.with(charSequenceTranslatorArray45);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper50 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper53 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str55 = unicodeEscaper53.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper58 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str60 = unicodeEscaper58.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper63 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer66 = null;
        int int67 = unicodeEscaper63.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer66);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper70 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper73 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray74 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper63, unicodeEscaper69, unicodeEscaper70, unicodeEscaper73 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = unicodeEscaper58.with(charSequenceTranslatorArray74);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator76 = unicodeEscaper53.with(charSequenceTranslatorArray74);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator77 = unicodeEscaper50.with(charSequenceTranslatorArray74);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = charSequenceTranslator47.with(charSequenceTranslatorArray74);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator79 = unicodeEscaper19.with(charSequenceTranslatorArray74);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator80 = unicodeEscaper2.with(charSequenceTranslatorArray74);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        org.junit.Assert.assertNotNull(unicodeEscaper7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper13);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray14);
        org.junit.Assert.assertNotNull(charSequenceTranslator15);
        org.junit.Assert.assertNotNull(charSequenceTranslator16);
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper26);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertNotNull(unicodeEscaper44);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray45);
        org.junit.Assert.assertNotNull(charSequenceTranslator46);
        org.junit.Assert.assertNotNull(charSequenceTranslator47);
        org.junit.Assert.assertNotNull(unicodeEscaper50);
        org.junit.Assert.assertNotNull(unicodeEscaper53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str55, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertNotNull(unicodeEscaper73);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
        org.junit.Assert.assertNotNull(charSequenceTranslator76);
        org.junit.Assert.assertNotNull(charSequenceTranslator77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNotNull(charSequenceTranslator79);
        org.junit.Assert.assertNotNull(charSequenceTranslator80);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper9 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str11 = unicodeEscaper9.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str16 = unicodeEscaper14.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer22 = null;
        int int23 = unicodeEscaper19.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer22);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper25 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper26 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray30 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper19, unicodeEscaper25, unicodeEscaper26, unicodeEscaper29 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator31 = unicodeEscaper14.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator32 = unicodeEscaper9.with(charSequenceTranslatorArray30);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str37 = unicodeEscaper35.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper40 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str42 = unicodeEscaper40.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper45 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer48 = null;
        int int49 = unicodeEscaper45.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer48);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper51 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper52 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper55 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray56 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper45, unicodeEscaper51, unicodeEscaper52, unicodeEscaper55 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator57 = unicodeEscaper40.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator58 = unicodeEscaper35.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator59 = charSequenceTranslator32.with(charSequenceTranslatorArray56);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper62 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper64 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper67 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer69 = null;
        boolean boolean70 = unicodeEscaper67.translate((int) (short) 0, writer69);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper71 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper73 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray74 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper67, unicodeEscaper71, unicodeEscaper73 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator75 = unicodeEscaper64.with(charSequenceTranslatorArray74);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator76 = unicodeEscaper62.with(charSequenceTranslatorArray74);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator77 = charSequenceTranslator32.with(charSequenceTranslatorArray74);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator78 = unicodeEscaper2.with(charSequenceTranslatorArray74);
        java.lang.CharSequence charSequence79 = null;
        java.lang.String str80 = charSequenceTranslator78.translate(charSequence79);
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str4, "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\u00750030" + "'", str6, "\\\\u00750030");
        org.junit.Assert.assertNotNull(unicodeEscaper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper25);
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray30);
        org.junit.Assert.assertNotNull(charSequenceTranslator31);
        org.junit.Assert.assertNotNull(charSequenceTranslator32);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str37, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper51);
        org.junit.Assert.assertNotNull(unicodeEscaper55);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray56);
        org.junit.Assert.assertNotNull(charSequenceTranslator57);
        org.junit.Assert.assertNotNull(charSequenceTranslator58);
        org.junit.Assert.assertNotNull(charSequenceTranslator59);
        org.junit.Assert.assertNotNull(unicodeEscaper62);
        org.junit.Assert.assertNotNull(unicodeEscaper64);
        org.junit.Assert.assertNotNull(unicodeEscaper67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper73);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray74);
        org.junit.Assert.assertNotNull(charSequenceTranslator75);
        org.junit.Assert.assertNotNull(charSequenceTranslator76);
        org.junit.Assert.assertNotNull(charSequenceTranslator77);
        org.junit.Assert.assertNotNull(charSequenceTranslator78);
        org.junit.Assert.assertNull(str80);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (byte) 0, writer3);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper1.translate((int) (short) 0, writer6);
        java.io.Writer writer10 = null;
        int int11 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0032\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0033", (int) (short) 100, writer10);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper14 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) -1);
        java.lang.String str16 = unicodeEscaper14.translate((java.lang.CharSequence) "\\u0032\\u0030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper19 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str21 = unicodeEscaper19.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper24 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str26 = unicodeEscaper24.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper29 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer32 = null;
        int int33 = unicodeEscaper29.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer32);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper35 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper36 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper39 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray40 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper29, unicodeEscaper35, unicodeEscaper36, unicodeEscaper39 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator41 = unicodeEscaper24.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator42 = unicodeEscaper19.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator43 = unicodeEscaper14.with(charSequenceTranslatorArray40);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper46 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper49 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str51 = unicodeEscaper49.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper54 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str56 = unicodeEscaper54.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper59 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer62 = null;
        int int63 = unicodeEscaper59.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer62);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper65 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper66 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper69 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray70 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper59, unicodeEscaper65, unicodeEscaper66, unicodeEscaper69 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator71 = unicodeEscaper54.with(charSequenceTranslatorArray70);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator72 = unicodeEscaper49.with(charSequenceTranslatorArray70);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper74 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper77 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) '#');
        java.io.Writer writer79 = null;
        boolean boolean80 = unicodeEscaper77.translate((int) (short) 0, writer79);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper81 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper83 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray84 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper77, unicodeEscaper81, unicodeEscaper83 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator85 = unicodeEscaper74.with(charSequenceTranslatorArray84);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator86 = charSequenceTranslator72.with(charSequenceTranslatorArray84);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator87 = unicodeEscaper46.with(charSequenceTranslatorArray84);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator88 = unicodeEscaper14.with(charSequenceTranslatorArray84);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator89 = unicodeEscaper1.with(charSequenceTranslatorArray84);
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\u0032\\u0030" + "'", str16, "\\u0032\\u0030");
        org.junit.Assert.assertNotNull(unicodeEscaper19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str21, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper35);
        org.junit.Assert.assertNotNull(unicodeEscaper39);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray40);
        org.junit.Assert.assertNotNull(charSequenceTranslator41);
        org.junit.Assert.assertNotNull(charSequenceTranslator42);
        org.junit.Assert.assertNotNull(charSequenceTranslator43);
        org.junit.Assert.assertNotNull(unicodeEscaper46);
        org.junit.Assert.assertNotNull(unicodeEscaper49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str51, "\\u0068\\u0069\\u0021");
        org.junit.Assert.assertNotNull(unicodeEscaper54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(unicodeEscaper59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(unicodeEscaper65);
        org.junit.Assert.assertNotNull(unicodeEscaper69);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray70);
        org.junit.Assert.assertNotNull(charSequenceTranslator71);
        org.junit.Assert.assertNotNull(charSequenceTranslator72);
        org.junit.Assert.assertNotNull(unicodeEscaper74);
        org.junit.Assert.assertNotNull(unicodeEscaper77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(unicodeEscaper83);
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray84);
        org.junit.Assert.assertNotNull(charSequenceTranslator85);
        org.junit.Assert.assertNotNull(charSequenceTranslator86);
        org.junit.Assert.assertNotNull(charSequenceTranslator87);
        org.junit.Assert.assertNotNull(charSequenceTranslator88);
        org.junit.Assert.assertNotNull(charSequenceTranslator89);
    }
}

