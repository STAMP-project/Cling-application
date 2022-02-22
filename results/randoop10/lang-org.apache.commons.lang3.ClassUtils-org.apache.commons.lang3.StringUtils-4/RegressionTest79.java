import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest79 {

    public static boolean debug = false;

    @Test
    public void test39501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39501");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "GNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.gngnal", (java.lang.CharSequence) "                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...               ...esl.avaj#ecafretnielbazilaires.oi.avaj#ecafretni4elbaenolc.gnal.avaj#ecafretn", (java.lang.CharSequence) "a rrr rrr rrr rrr rrr rrr rrr rrr rrr rrr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                 JAVAlLANGJ  ", "###########################j#########################################################################ArrjjArrjjArrjjArrjjArrjjArrjjArrj", "interface java.lang.Cloneable                       javaulangr...interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                 JAVAlLANGJ  " + "'", str3, "                                                                                 JAVAlLANGJ  ");
    }

    @Test
    public void test39504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ti.tiCLASSJAVALANGCLASSJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG", "ATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJSTRINGATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ti.tiCLASSJAVALANGCLASSJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG" + "'", str2, "ti.tiCLASSJAVALANGCLASSJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
    }

    @Test
    public void test39506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa                                  aa", (java.lang.CharSequence) "######################                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39507");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", "ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNAL", "AA..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
    }

    @Test
    public void test39508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39508");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                                                  litu                                                                                                                                                                                                                                                                                                                                                                                                  ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: litu");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("nterface java.lang.Cloneable.......java..........java..........java..........java..........java.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA." + "'", str1, "NTERFACE JAVA.LANG.CLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA.");
    }

    @Test
    public void test39510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4rr4ylist", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39511");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Java                      INTEGER                       gjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("   aaaa   ", "HI!ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLISTAVAJ                                                                                                                                                                                                                                              JAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLESERIALIZABLESERIALIJAVASTRINSERIALIZABLESERIALIZABLE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39513");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("######################################################################                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################################################                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-        " + "'", str1, "######################################################################                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-                                                                                 ][gnirtslitu.avaj1-        ");
    }

    @Test
    public void test39514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                           GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                            ", 444, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                           GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                           GnalAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test39515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Arralitu.avajlitu.ava", "jjjjjjjjjjjjjjjjjjjjjjaa  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Arralitu.avajlitu.ava" + "'", str2, "Arralitu.avajlitu.ava");
    }

    @Test
    public void test39517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39517");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$ArrayList", '4');
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray3, "NAL....................");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray8);
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray9, true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test39518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" ..", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " .." + "'", str2, " ..");
    }

    @Test
    public void test39519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39519");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("               ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(".uti4444444444444444444444444444444444444444444444444444444444444444444444444ava4444444444444444444444444444444444444444444444444444444444444444444444444j");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".UTI4444444444444444444444444444444444444444444444444444444444444444444444444AVA4444444444444444444444444444444444444444444444444444444444444444444444444J" + "'", str1, ".UTI4444444444444444444444444444444444444444444444444444444444444444444444444AVA4444444444444444444444444444444444444444444444444444444444444444444444444J");
    }

    @Test
    public void test39521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ArrayListArrayListArrayList");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("JAVATSILYARRATSILYARRATSILYARRA", "4444444string44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.ly..                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#agnaaaaaaaaGnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39524");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("rgnaluavaj", ".langGNAL..langjava.langAGNAL.AVAJ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterfacejava.io.Serializable", "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 693);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("...                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..                                            ..", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test39525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAV...", 501);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAV...                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAV...                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test39526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39526");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                     classjava.langa...                                                      ", ".lang.Stringclass java.lang.Stringclass java.lang.Stringclas");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39527");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                            rrayList", "JAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALI...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39528");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                            #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39529");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("BYTEINTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BYTEINTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE" + "'", str3, "BYTEINTERFACE GAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACE GAGA.IO.SERIALIZABLE");
    }

    @Test
    public void test39530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44444444a..AYL A.44444444444444444444444444444444444", "efcevlngcloneble#intefceviointefcevlngcloneble#intefceviointefcevl");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###############################A..yLA.44444444444444444444444444###############################", 248);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "LANGaGNALJAVAaLANGAVAJaGNALJAVAaLANGAVAJaGNALJAVAaLANGAVAJaGNALJAVAaLA", (java.lang.CharSequence) "LlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39533");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", ' ');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("JAVA.LANG", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                   ", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("ArrayListArrayListArrayListavaj.gnal", "################################", 0);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("...", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang", strArray5, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang" + "'", str14, "vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ArrayListArrayListArrayListavaj.gnal" + "'", str16, "ArrayListArrayListArrayListavaj.gnal");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ArrayListArrayListArrayListavaj.gnal" + "'", str17, "ArrayListArrayListArrayListavaj.gnal");
    }

    @Test
    public void test39534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39534");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABLE...SAITUJAIRTSSAIJAVAULAINTERFACE JAVA.LANG.CLONEABLE4INTERFACE JAVA.IO.SERIALIZABL");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                            $         $         $         $         $         $         $         $         $         $         $         $ ...", 1000, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                            $         $         $         $         $         $         $         $         $         $         $         $ ...#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "                                                                                                                                                                                                                                                                                                                                            $         $         $         $         $         $         $         $         $         $         $         $ ...#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test39536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test39537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39537");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("LANG", "ng", 386);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                        gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi                        ", 34, 881);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "istArrayListArrayListavaj.gnalArrayListArrayListArrayLi                        " + "'", str3, "istArrayListArrayListavaj.gnalArrayListArrayListArrayLi                        ");
    }

    @Test
    public void test39539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 416);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test39540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39540");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "IIIEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEIII44IIIEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE44444$EEEEEEEEE", (java.lang.CharSequence) "       #############################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "IIIEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEIII44IIIEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE44444$EEEEEEEEE" + "'", charSequence2, "IIIEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEIII44IIIEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE44444$EEEEEEEEE");
    }

    @Test
    public void test39541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39541");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Lassjava.lang");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39542");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "class java.util.AbstractListgn lu v j                       ....................................................................class java.util.AbstractCollectiongn lu v j                       ....................................................................class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39543");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("siLyrrA", 737);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39544");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("IO                          ", "                                                                              interface java.lang.cloneable...                                 interface java.io.serializable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39545");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("   A..iyL ziirSoifri.oCfri");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: A//iyLziirSoifri/oCfri");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39546");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AVALITU.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AVALITU." + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AVALITU.");
    }

    @Test
    public void test39547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39547");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("util", "gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", 9);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("interface java.lang.Cloneable4iGNIRTinterface java.lang.Cloneable4i", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray4, "NTERFACE JAVA.LANG.cLONEABLE....$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$galaa$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "util" + "'", str6, "util");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "util" + "'", str8, "util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
    }

    @Test
    public void test39548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39548");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       CLASSjava.langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang", "interface java.lang.Cloneable                       javaulangr...interface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("CHARACTER             UTILSTRI", 35, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".....CHARACTER             UTILSTRI" + "'", str3, ".....CHARACTER             UTILSTRI");
    }

    @Test
    public void test39550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39550");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("l.ngAGNALelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSe");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "......javaulainterface java.lang.Cloneable4interface java.io.Serializable.......ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACharacterCharacterCharacterCharacterclassjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ArrayListArrayListArrayListavaj.gnalAVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                               LANG.JAVATSILYARRATSILYARRATSILYARRA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39553");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("INTERFACEJAVA.LANG.cLONEABLE4IgnirtINTERFACEJAVA.LANG.cLONEABLE4I", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                javaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaulangrraylistjavaula", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                               ", 723, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                               ...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                     ...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                     ...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                     ...       AAAAAAAAAAAAAAA" + "'", str3, "                                                                                                                                                                                                                                               ...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                     ...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                     ...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                     ...       AAAAAAAAAAAAAAA");
    }

    @Test
    public void test39555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("j.v...........j.v...........j.v.......", "...AA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j.v...........j.v...........j.v......." + "'", str2, "j.v...........j.v...........j.v.......");
    }

    @Test
    public void test39556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39556");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...####java.uti###############################...", "java..........java..........java..........java..........java..........java..........ja...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####java.uti###############################..." + "'", str3, "...####java.uti###############################...");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...####java.uti###############################..." + "'", str4, "...####java.uti###############################...");
    }

    @Test
    public void test39557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39557");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        ", (java.lang.CharSequence) "gnl$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test39558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("gnlvj                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnlvj                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str3, "gnlvj                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test39559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "RChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahactaRChahact", 275);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39560");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Llitu...O.gn$l.$v$j ss$lcr4444444444444444444444444444444444444444444444444444444444444444444444444444444...O.                                                                                                                                                                                                                                                                                                                                                                                                                                              ", " ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ssalc gnirtsagnalaavaj", "GNAL.AL.ARRAYLIST");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssalc gnirtsagnalaavaj" + "'", str2, "ssalc gnirtsagnalaavaj");
    }

    @Test
    public void test39562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39562");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("la                                                               ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: la");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "       util");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       util" + "'", str1, "       util");
    }

    @Test
    public void test39564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str3, "avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
    }

    @Test
    public void test39565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("interface#java.lang.Cloneable4interface#java.io.Serializable", 515, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################################################################################################################################################################################################interface#java.lang.Cloneable4interface#java.io.Serializable####################################################################################################################################################################################################################################" + "'", str3, "###################################################################################################################################################################################################################################interface#java.lang.Cloneable4interface#java.io.Serializable####################################################################################################################################################################################################################################");
    }

    @Test
    public void test39566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39566");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39567");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyList", "Y", 832);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444444444444444g4444#444444444444444444444444444444444444444444444444444444444444g4444#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444444444444444g4444#444444444444444444444444444444444444444444444444444444444444g4444#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444444444444444g4444#444444444444444444444444444444444444444444444444444444444444g4444#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...AVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgna...", "... ... ... ... ... ... ... ... ... ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgna..." + "'", str2, "...AVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgna...");
    }

    @Test
    public void test39570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39570");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("iNTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(".........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "interface java.lang.Cloneableaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaainterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByt" + "'", str1, "ByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteyteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByteByt");
    }

    @Test
    public void test39573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                       REGETNI                      ", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       REGETNI                      " + "'", str2, "                       REGETNI                      ");
    }

    @Test
    public void test39574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("     ", 118);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test39575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(".................................................................................................................................................", 92, 81);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "................................................................................." + "'", str3, ".................................................................................");
    }

    @Test
    public void test39577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39577");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".......JAVA..........JAVA..........JAVA..........JAVA..........J");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39578");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                       Serializabl...     java44444444444444444.4444", "                                          StringUtil", 19);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test39579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaa                       javaulangrraylist", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Serializabl...     java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Serializabl...     jav" + "'", str1, "Serializabl...     jav");
    }

    @Test
    public void test39581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39581");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                           ][gnirtSlitu.avaj1-                                                                              ", "javalgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.aG.JAVAGNAL.AVAJLANG.J######################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39582");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("ELBAZILAIREs.OI.AVAJ ECAFRETNIAVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ..........AVAJ.......ELBAENOLc.GNAL.AVAJ ECAFRETNI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39583");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("tringcla#######################vj.gn vj.gn vj.gn #######################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39584");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$AVAJEGNALN          JAVALEAGN          JAVALEAGN          JAVALEAGN          JAVALEAGN          J$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "class java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.Stringclass java.lang.String########################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi!arraylistarraylistarraylis.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39586");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aa...                                                                                                                                   #############################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39587");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("interface java.lang.Cloneable.######################################################################interface java.io.Serializable");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test39588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String", "JAVA.UTILhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String" + "'", str2, "RJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAVAARRARJAlass java.lang.String");
    }

    @Test
    public void test39589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39589");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "STRING.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39590");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaara                                            INTERFACE JAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACE JAVA.IO.SERIALIZABLE", "...gnal.avaaaaaaaaaavaJ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39591");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "4444444444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test39592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("arrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", 315);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arrrrrrrrrrrrrrrrrrrrrrrrrrrrrr" + "'", str2, "arrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    }

    @Test
    public void test39593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39593");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39594");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("$$$$$$jav", "..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...rrA", (int) '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$$$$$$jav" + "'", str5, "$$$$$$jav");
    }

    @Test
    public void test39595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.alya..a                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$", 675, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.alya..a                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$        " + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.alya..a                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                  $$$$$$$$$$$$$$$$$$$$$$$        ");
    }

    @Test
    public void test39596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39596");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "         util         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39597");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("javastring..g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.gg.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test39598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....                                                                                         GNAL.AVAJGNAL..langGNAL.AVAJGNAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....GNAL.AVAJGNAL..langGNAL.AVAJGNAL" + "'", str1, "######################################################################################################################..aaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....GNAL.AVAJGNAL..langGNAL.AVAJGNAL");
    }

    @Test
    public void test39599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39599");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "             Character             ", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "UTILsTRING.UTILsTRING-1JAVA.-1JAVA", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "sAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtSsAitUJAirtS", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test39600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("gnal.avajgnal..LANGgnal.avajgnal.", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnal.avajgnal..LANGgnal.avajgnal." + "'", str2, "gnal.avajgnal..LANGgnal.avajgnal.");
    }

    @Test
    public void test39601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                       ", 384, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..........a       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..       a..........###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "..       a..........###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test39603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39603");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                   GNAL", 583);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39604");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          javaaaaaaaaaa", 32);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "lvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnl", 893, 651);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test39605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39605");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnaaaaaaaaaaaaaaaLNuaaaaaaaaaaaaaaaaaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39606");
        java.lang.String[] strArray3 = new java.lang.String[] { "                                   " };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "                                   " };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       ", strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3, strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Class", "$######################################################################");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA", strArray8, strArray16);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", "interface java.lang.CloneableLANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAinterface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                   " + "'", str4, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                   " + "'", str9, "                                   ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str12, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA" + "'", str17, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "String" + "'", str22, "String");
    }

    @Test
    public void test39607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39607");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("$$$$$$$$", "e");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("jAVA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test39608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39608");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("#####################################################################################################################################################################################################################################################################################################################################tS.gnal.avaj#####################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################################################################################################################################################################################################################################################################################################################tS.gnal.avaj#####################################################################################################################################################################################################################################################################################################################################" + "'", str1, "#####################################################################################################################################################################################################################################################################################################################################tS.gnal.avaj#####################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test39609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39609");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(".lnG", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str4, "rLLryLiyyALLryLiyyALLryLiyyrrrALrAriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test39610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlIS", "tSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlIS" + "'", str2, "HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlIS");
    }

    @Test
    public void test39611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39611");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(".............................................................................................................................................................................................................................................................................................................................................................................LANG.LANG.LANG.LANG", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39612");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 936 + "'", int1 == 936);
    }

    @Test
    public void test39613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39613");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("....................................................................                       JAVAULANG", "... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "G");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "....................................................................                       JAVAULANG" + "'", str4, "....................................................................                       JAVAULANG");
    }

    @Test
    public void test39614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("interface java.lang.CloneableJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAinterface java.io.Serializable", "       Arrclass java......................Arrclass java......................ArtringArrclass java......................Arrclass java......................Ar        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interface java.lang.CloneableJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAinterface java.io.Serializable" + "'", str2, "interface java.lang.CloneableJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAJAVAinterface java.io.Serializable");
    }

    @Test
    public void test39615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39615");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihLITU.AVAJ                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $", "ss.lcgnirtS.gn.l..v");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("......javaulainterface java.lang.Cloneable4interface java.io.Serializable.......", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......javaulainterface java." + "'", str2, "......javaulainterface java.");
    }

    @Test
    public void test39618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                    ...44...                                 44444$         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("US", "GNL$ $VJ", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39620");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaVAJ", "javaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLijavaStringnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "VJ" + "'", str3, "VJ");
    }

    @Test
    public void test39621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39621");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("a rrr rrr rrr rrr rrr rrr rrr rrr rrr rrr", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39622");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.util", "slitUgnirtS");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("String[]String[]StLlitung[]String[]String[]String[]String[]String[]", "gNAL", 3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("avaj.gnal", "$       ");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi", strArray10, strArray14);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("avaj.gnal");
        boolean boolean20 = org.apache.commons.lang3.StringUtils.endsWithAny("tring", strArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!ArrayListArrayListArrayListavajhhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhh AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("class java.lang.Class", strArray10, strArray19);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3, strArray10);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Interface java.lang.Cloneableaaaaaaaaaaainterface java.io.Serializable", 675, 479);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.util" + "'", str4, "java.util");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi" + "'", str15, "gagnAAAAAAAAAAistArrayListArrayListavaj.gnalArrayListArrayListArrayLi");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "class java.lang.Class" + "'", str22, "class java.lang.Class");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str23, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test39623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39623");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                  aA", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0, 66);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJ", "A avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnal.avaa aaalsrrA avaj ssaS rvngA avaj ssalc.gnal.avaa aaalsrrA avaj ssalc.gnal.avaa aaalsrrAva.langGNAa..langaava.langAGNAa.AVAJA avaj ssalc.gnaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJ" + "'", str2, "AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJ");
    }

    @Test
    public void test39625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "aaaaaa...                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test39626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...................................................................................................................................................................................................................................................AyLis", "tringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringclatringcla");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39627");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...ARRAYLISTARRAY");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39628");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASS JAVA.LANG.OBJECTYLISTARRCLASS JAVA.LANG.OBJECTYLISTA                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASS JAVA.LANG.OBJECTYLISTARRCLASS JAVA.LANG" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASS JAVA.LANG.OBJECTYLISTARRCLASS JAVA.LANG");
    }

    @Test
    public void test39629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39629");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ss.lc gnirtS.gn.l..v.j", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(".LANGa.                                                     ClassJAVA", "uavajtutututututut...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".LANGa.                                                     ClassJAVA" + "'", str2, ".LANGa.                                                     ClassJAVA");
    }

    @Test
    public void test39631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39631");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang" + "'", str1, "hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
    }

    @Test
    public void test39633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......ja                                                                                                            interface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......ja");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39635");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                            ...                     INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFAC...                                                                                                                                                                                                                                                             ", "gnal.avaj ecafretni", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("lass java.lang.String$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....", "..........");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39637");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("A..ayLA..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39638");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("javal#.#agn", "", 6);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', (int) ' ', 28);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "interface#java.lang.Cloneable....................................................................##################...       interface#java.lang.Cloneable....................................................................##################", 96, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "javal#.#agn" + "'", str5, "javal#.#agn");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "javal#.#agn" + "'", str10, "javal#.#agn");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test39639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39639");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaaajaval.agnaaaaaaaaaaaaaaaaaaa                      Integer                       ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....................................................................................................................................................................................................................................................................................................", 264);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "...AAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("AtsiLytcejbO.gnal.avajssalcrrAtsiLytcejbO", "]tu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39641");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(". ", "                                  ", 90);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?> wildcardClass9 = null;
        java.lang.Class[] classArray11 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass9;
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray12, true);
        java.lang.Class[] classArray19 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray21, "...                                 ");
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
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
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray32);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray50, true);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray50, false);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
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
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test39642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39642");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                   ", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                        4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "rrayLi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39645");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("b$YTE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang", "litulitulitulitulitul####litulitulitulitulitul                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$java$.lang.Stringclass java.lang.Stringclass java.lang.Stringclas.lang.Stringclass java.lang");
    }

    @Test
    public void test39647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", 49, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn" + "'", str3, "javal       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn");
    }

    @Test
    public void test39648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("interfacejava.lang.cloneable.interfacejava.io.serializable", "hi!ArrayLis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                -1String[.VJ.VJ.VJ.VJ.VJ.VJ.V            ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1String[.VJ.VJ.VJ.VJ.VJ.VJ.V            ..." + "'", str1, "-1String[.VJ.VJ.VJ.VJ.VJ.VJ.V            ...");
    }

    @Test
    public void test39650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("####java.uti###############################...", "JAVA.IO.SERIALIZABLE JAVA.LANG.cLONEABLESTRINGINTERFA.E INTERFA.E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####java.uti###############################" + "'", str2, "####java.uti###############################");
    }

    @Test
    public void test39651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRs                                    cafretni", 135);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRs                                    cafretni" + "'", str2, "A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        A##RyLRsA##RyLRs                                    cafretni");
    }

    @Test
    public void test39652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("interface java.lang.Cloneableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.io.Serializable", 409, "                                                                                                                                                                                                                                                                                                                                                          javal#.#agn       aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                  interface java.lang.Cloneableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.io.Serializable" + "'", str3, "                                                                                                                                                                                                                                                                                                  interface java.lang.Cloneableinterface java.lang.Cloneable$interface java.io.Serializableinterface java.io.Serializable");
    }

    @Test
    public void test39653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39653");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1java", "JAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITUJAVALITU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("javastring..444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "blealiza.io.Seriavacejable#interfang.Clonea.lavacejainterf44444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ARRAYLIS", "                                                                                                                                                                                                                                             HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ARRAYLIS" + "'", str2, "ARRAYLIS");
    }

    @Test
    public void test39656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("javaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljavaGnaljava", "u                                                                                                                                                                                                                                                                                                       Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test39658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("INTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO", "javaStrinSerializableSerializableSerializableSeriali");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("java.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avajjava.litu.avajlitu.avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJ" + "'", str1, "JAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJJAVA.LITU.AVAJLITU.AVAJ");
    }

    @Test
    public void test39660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39660");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("gnl$.$vj", "interface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableinterface#java.lang.cloneable4interface#java.io.serializableaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                               JAVAlLANG                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                               JAVAlLANG                                                                                " + "'", str1, "                                                                               JAVAlLANG                                                                                ");
    }

    @Test
    public void test39662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39662");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "E" + "'", str1, "E");
    }

    @Test
    public void test39663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("I.......                                                                                                                                                  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i.......                                                                                                                                                  ..." + "'", str1, "i.......                                                                                                                                                  ...");
    }

    @Test
    public void test39664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("afretnignirtSelbaenolC.gnal.avaj ecafretni....................LANfretnignirtSelbaenolC.gnal.avaj ecafretni");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "afretnignirtSelbaenolC.gnal.avaj ecafretni....................LANfretnignirtSelbaenolC.gnal.avaj ecafretni" + "'", str1, "afretnignirtSelbaenolC.gnal.avaj ecafretni....................LANfretnignirtSelbaenolC.gnal.avaj ecafretni");
    }

    @Test
    public void test39665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "hI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIShI!aRRAYlIS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39666");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("INTERFACE JAVAaLANGacLONEABLEaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAaaaaaaaaaaJAVAINTERFACE JAVAaIOasERIALIZABLE", ".lnG                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39667");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("java.utiljava.util", "hi!ArrayLis", (int) (short) 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", "", 102);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("A..ayL A##############", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("nterface java#io#erializable", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A..ayL A##############" + "'", str10, "A..ayL A##############");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test39668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39668");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "JAVA..........JAVA..........JAVA..........JA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("OI.AVAJ ECAFRETNIGNIRTSELBAENOLC.GNAL.A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OI.AVAJ ECAFRETNIGNIRTSELBAENOLC.GNAL.A" + "'", str1, "OI.AVAJ ECAFRETNIGNIRTSELBAENOLC.GNAL.A");
    }

    @Test
    public void test39670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39670");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...aaaaaaaaj v aaaaaaaaaaj v aaaaaaaaaaj v interf ceaj v aioaSeri liz ble");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaag");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39672");
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
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray33);
        java.lang.String str36 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) str34, "ARRAYLISTARRAYLISTARRAYLISTAVAJ.GNAL");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang" + "'", str36, "java.lang");
    }

    @Test
    public void test39673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39673");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("TRING", "][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCrChahacta][sslC][ssl][sslC][sslCGNALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39674");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("NTERFACEJAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACEJAVA.IO.sERIALIZABLE", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("tsilyrrgnluvj                       tsilyrrgnluvj", "J#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ngj#v#.l#ng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tsilyrrgnluvj                       tsilyrrgnluvj" + "'", str2, "tsilyrrgnluvj                       tsilyrrgnluvj");
    }

    @Test
    public void test39676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaa$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 117, "loneable#interfacejava.io");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "loneable#interfacaaaaaaa$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "loneable#interfacaaaaaaa$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39677");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("                                                                                                                                                                                                                                                            ...                     INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFAC...                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                            ...                     INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFAC.." + "'", str1, "                                                                                                                                                                                                                                                            ...                     INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFAC..");
    }

    @Test
    public void test39678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39678");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("lC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretni$gnal.avaj", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", "", 723);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "lC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretni$gnal.avaj" + "'", str4, "lC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretnielbazilaireS.oi.avaj ecafretni$elbaenolC.gnal.avaj ecafretni$gnal.avaj");
    }

    @Test
    public void test39679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("elbazilaireS.oi.avaj ecafretniav...", "                                                                                                                                                                                                                                                                                                                                                                                                          J4V4.L4NGJ4V4.L4NGJ4V4.L4NGJ4V4.L4NGJ4V4.L4NGJ4V4.L4                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "elbazilaireS.oi.avaj ecafretniav" + "'", str2, "elbazilaireS.oi.avaj ecafretniav");
    }

    @Test
    public void test39680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39680");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("oi.agagecafretnignirAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAnga.lagagAAAAAAAAAAelbaenolC.gnal.agagecafretniTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSTRINGUTILSSSALC", "Class java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Objectclass java.lang.Object", 662);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39681");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsinterf ce j v  l ng Clone ble inte$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa", "...$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                              ", 0, 305);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                              ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsinterf ce j v  l ng Clone ble inte$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa" + "'", str4, "...$$$$$$$$$$$$$$$...                                                                                                                                                                                                                                                              ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsinterf ce j v  l ng Clone ble inte$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa");
    }

    @Test
    public void test39682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ssalC", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39683");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "interface java.lang.cloneableinterface java.lang.cloneableinterface ja][sslC][sslCrChahacta][sslC][sslCinterface java.lang.cloneableinterface java.lang.cloneableinterface ja", (java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "interface java.lang.cloneableinterface java.lang.cloneableinterface ja][sslC][sslCrChahacta][sslC][sslCinterface java.lang.cloneableinterface java.lang.cloneableinterface ja" + "'", charSequence2, "interface java.lang.cloneableinterface java.lang.cloneableinterface ja][sslC][sslCrChahacta][sslC][sslCinterface java.lang.cloneableinterface java.lang.cloneableinterface ja");
    }

    @Test
    public void test39684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39684");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("se...  ...", "                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39685");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("jvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryli-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-", 456, 950);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tring-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-" + "'", str3, "tring-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-");
    }

    @Test
    public void test39686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39686");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AVAJ.GNAL", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444             Character             ");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444             Character             ", "...avaj..........avaj..........avaj...      Chara...TUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUTUT");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "String" + "'", str4, "String");
    }

    @Test
    public void test39687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 358, "tu]tu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "gnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ssalcgnirtS.gnal.avaj ... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... .... .4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39688");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("arjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.stringA..iyL ziirSoifri.oCfriCLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG         ", "interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lSE...               ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39689");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...sAitUJAirtSsAijavaulainterface java.lang.Cloneable4interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...SaITujaIRTsSaIJAVAULAINTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABLE" + "'", str1, "...SaITujaIRTsSaIJAVAULAINTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABLE");
    }

    @Test
    public void test39690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("..........IrfCo$irfioSrii", "javaJ.Jla", "        jvl#.#gn       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39691");
        char[] charArray13 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray13);
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) charArray13, "class java.lang.String");
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A..ayL A.44444444444444444444444444      ", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                interface java.lang.CloneableStringinterface java.io", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aAAAAAAAAAAA                                  ", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaava.langjava.langjava.lang... .... .java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang... ....", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test39692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(".ALya..A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".ALya..A" + "'", str1, ".ALya..A");
    }

    @Test
    public void test39693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHLITU.AVAJ                                                                                                                                                                                                                                                                                                                                                       ", 193);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                 ");
    }

    @Test
    public void test39694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39694");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("lituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlituLlitu", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39695");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("se..", "                                       -1javaJAVATSILYARRATSILYARRATSILYARRA", 105);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39696");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                  litu                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39697");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("INTERFACE JAV...    ....JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.SERIALIZABLE", "                                                                                                                                                                                                                                                                                                                                                                                                                 ##################################################java.uti#########################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 110);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39698");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("....................................................................                       JAVAULANG", "                                                                                                                                                                                                                          ........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................INTERFACE JAVA.LANG.cLONEABLE4INTERFACE JAVA.IO.sERIALIZABL", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...aaaaaaaaaaaaaaaaaaaaaaaaaa...", "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 100);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "javastring...", 545, 151);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "...O.gnal.avaj ssalcrrAtsiLytcejbO.gnal.avaj ssalcrrAva.langGNAL..langjava.langAGNAL.AVA", 675, 83);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test39700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39700");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ssalcrrA tsiLytcejbO.gnal.avaj", (-1), ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssalcrrA tsiLytcejbO.gnal.avaj" + "'", str3, "ssalcrrA tsiLytcejbO.gnal.avaj");
    }

    @Test
    public void test39701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaara", "interfacejava.lang.cloneable#interfacejava.io");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaara" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaara");
    }

    @Test
    public void test39702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39702");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "javastringslitUgnirtSarraylistarraylistavaj.gnalarraylistarraylistarrayli", 667);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("GNIRTS.GNAL.AVAJ SSALC", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                     ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl                                                                                                                                                     ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test39703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39703");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "sTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS", "class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;class [Ljava.lang.Class;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39704");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("avaj.gnalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       cHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARACTERcHARA", "..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................GNIRTSLITU.AVAJ1-GNIRTSLITU.AVAJ1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39705");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("JAVA LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "JAVA LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39706");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJSTRINGATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJBO.GNAL.AVAJSSALCRRAVA.LANGGNAL..LANGJAVA.LANGAGNAL.AVAJATSILYTCEJBO.GNAL.AVAJSSALCRRATSILYTCEJB", "4444444aaaaaa.44444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39707");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "                                   ", (int) 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                    ", strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1java.utilString[]    ", "avaj", 89);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("litulitulitulitulitul####litulitulitulitulitul", strArray7, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("RChahacta", strArray13);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "");
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray13);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu                                             ...                                                    avajlitu                                             ...                                                    avaj", (java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "litulitulitulitulitul####litulitulitulitulitul" + "'", str14, "litulitulitulitulitul####litulitulitulitulitul");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1java.utilString[]    " + "'", str19, "-1java.utilString[]    ");
    }

    @Test
    public void test39708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39708");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "interface java.lang.Cloneable4444444444444JAVA.LANGAGNAL.AVAJGNAL..LANGGNAL.AVARRCLASSJAVA.LANG.OBJECTYLISTARRCLASSJAVA.LANG.OBJECTYLISTAinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39709");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("sa.lass.Cl");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39710");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       ", "hi!", (int) (byte) 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...       " + "'", str4, "...       ");
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void test39711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("vajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajva                                                                                                                                                   ..", "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RRR RRRINTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajva                                                                                                                                                   .." + "'", str2, "vajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajva                                                                                                                                                   ..");
    }

    @Test
    public void test39712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39712");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "gnal..Array..List..Array..List..Array..Li");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39713");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "INTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IO");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "4444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444" + "'", str2, "4444444444444444444444");
    }

    @Test
    public void test39715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!Array...", "JAVAJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN..........JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGNJAVAJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN..........JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGNJAVAJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGN...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Array..." + "'", str2, "hi!Array...");
    }

    @Test
    public void test39716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAG", "########################################################nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn########################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAG" + "'", str2, "JAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAG");
    }

    @Test
    public void test39717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG....", 576, "interface java.lang.Cloneablevv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$avalitu.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "interface java.lang.Cloneablevv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG...." + "'", str3, "interface java.lang.Cloneablevv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444vv4yL444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu.avajArrayListArrayListArrayListavajGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG....");
    }

    @Test
    public void test39718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                  aaaaaaaaaaaa", "$         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $       siLyarrA!iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  aaaaaaaaaaaa" + "'", str2, "                                  aaaaaaaaaaaa");
    }

    @Test
    public void test39719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39719");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("avaJ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "444444444444INTERFACE JAVA.LANG.cLONEABLEsTRINGINTERFACE JAVA.IO.sERIALIZABLE444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "Java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test39720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                         REGETNi", 888, 525);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "....................................................................................................................................................................jvstringnlrrylistrrylistrrylistv.............................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39722");
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
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.String str19 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray17, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   avaj ssalc");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang" + "'", str19, "java.lang");
    }

    @Test
    public void test39723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39723");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 " + "'", str1, "                 ");
    }

    @Test
    public void test39724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39724");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA" + "'", str4, "AAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAAnga.lavajAAAAAAAAAA");
    }

    @Test
    public void test39725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39725");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL", "44444444444444444.4...", 924);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "gn gnal.avaj", 200, 410);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39726");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("TRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLATRINGCLA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Gnl$.$vj....................................................................................................................................................................................", 119);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39727");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
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
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray10);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray28);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray28, "                                                       Serializabl...     java44444444444444444.4444");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test39728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("###############################                                               aaaaJAVAL.AGNaaaaaaaaaaJAVAL.AGNaaaaaaaaaaJA########ava#########################################################################j", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnaaaaaaaaaaaaaaaLNuaaaaaaaaaaaaaaaaaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAring");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39729");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##############################################################################################################################################################################################################################################################################################################################################Stringc##############################################################################################################################################################################################################################################################################################################################################", "ArrayListArrayListArrayListArrayLis", 545);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39730");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("interface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......ja                                                                                                            interface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
    }

    @Test
    public void test39731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39731");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("   AAAAAA...   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA..." + "'", str1, "AAAAAA...");
    }

    @Test
    public void test39732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39732");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AVA", "ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39733");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("     aaaaaaaaaa      javaStrinSerializableSerializableSerializableSeriali", 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     aaaaaaaaaa      javaStrinSerializableSerializableSerializableSeriali" + "'", str3, "     aaaaaaaaaa      javaStrinSerializableSerializableSerializableSeriali");
    }

    @Test
    public void test39734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(".lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, ".lang.Stringclass j...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test39735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39735");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("avaj.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39736");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".langjava.langjava.langjava.langjava...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...      ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39737");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AVAJgnl", 168);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39738");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 0, 80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39739");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("RFACE JAVALANGCLONEABLELANGGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJGNALJAVALANGAVAJ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("arrayListArrayListArrayListavaj                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test39740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39740");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) ".......                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39741");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("$$$$$$$$$$$$$$$$$$$...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i..." + "'", str3, "$$$$$$$$$$$$$$$$$$$interfacejava.lang.Cloneable4iGNIRTinterfacejava.lang.Cloneable4i...");
    }

    @Test
    public void test39742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39742");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("GNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNAL.lang.lang.lang.lang.lang.lang.lLITUAVA.LA", "AAAAAAAAAAAAAAAAAAA", 47);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClassArray7);
    }

    @Test
    public void test39743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39743");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("JAVA");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "$");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray7);
        java.lang.Class<?> wildcardClass11 = null;
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass11;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "                                   " };
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray19);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray19);
        java.lang.Class<?> wildcardClass22 = null;
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass22;
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray25);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray25);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray25, true);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray25, false);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray25, '#', (int) ' ', 10);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray25);
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
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray68);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray68);
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.concatWith("        GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       GNALUAVAJ                       SSALCGNALAVAJ SSALC", (java.lang.Object[]) wildcardClassArray68);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray68);
        java.lang.Class[] classArray74 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray75 = (java.lang.Class<?>[]) classArray74;
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray75);
        java.lang.Class<?> wildcardClass77 = null;
        java.lang.Class[] classArray79 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass77;
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray80);
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray75, wildcardClassArray80, true);
        java.lang.Class[] classArray87 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray88 = (java.lang.Class<?>[]) classArray87;
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray88);
        java.lang.String str91 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray89, "...                                 ");
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray80, wildcardClassArray89);
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray89);
        boolean boolean94 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray89);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                   " + "'", str20, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
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
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "class java.lang.String" + "'", str71, "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(classArray87);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test39744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39744");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...nAAAAAAAAAAjaval.agnAAAAAAAAAA...", "aj  ", 231);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39745");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.L", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39746");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "ArrayListArrayListArrayListavajgnal", (int) '#', 502);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test39747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39747");
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
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray29);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray29, true);
        java.lang.Class[] classArray36 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray38, "...                                 ");
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray38);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray38, false);
        java.lang.Class<?> wildcardClass44 = null;
        java.lang.Class[] classArray46 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        wildcardClassArray47[0] = wildcardClass44;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "                                   " };
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray52);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray52);
        java.lang.Class<?> wildcardClass55 = null;
        java.lang.Class[] classArray57 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        wildcardClassArray58[0] = wildcardClass55;
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray58);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray58);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray58, true);
        java.lang.String[] strArray67 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray69 = org.apache.commons.lang3.StringUtils.stripAll(strArray67, "$");
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray67);
        java.lang.Class<?> wildcardClass71 = null;
        java.lang.Class[] classArray73 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray74 = (java.lang.Class<?>[]) classArray73;
        wildcardClassArray74[0] = wildcardClass71;
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray74);
        java.lang.String[] strArray79 = new java.lang.String[] { "                                   " };
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray79);
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray79);
        java.lang.Class<?> wildcardClass82 = null;
        java.lang.Class[] classArray84 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray85 = (java.lang.Class<?>[]) classArray84;
        wildcardClassArray85[0] = wildcardClass82;
        java.lang.Class<?>[] wildcardClassArray88 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray85);
        boolean boolean89 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray81, wildcardClassArray85);
        boolean boolean91 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray74, wildcardClassArray85, true);
        boolean boolean93 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray70, wildcardClassArray85, false);
        java.lang.String str94 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray85);
        boolean boolean95 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, wildcardClassArray85);
        boolean boolean96 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray58);
        java.lang.String str97 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray38);
        java.lang.String str99 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray38, "interface java.lang.Cloneable....................................................................                       JAVAULANGinterface java.io.Serializable");
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
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "                                   " + "'", str53, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertNotNull(classArray73);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "                                   " + "'", str80, "                                   ");
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertNotNull(classArray84);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test39748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39748");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAA                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39749");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AVAJ.GNAL......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "classjava.util.AbstractListgnluvj....................................................................classjava.util.AbstractCollectiongnluvj....................................................................classjava.lang.Object");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                              " + "'", str1, "...                                              ");
    }

    @Test
    public void test39751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39751");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...                                   ...       ....       .", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass java.lang.Stringaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 69);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#", "A$L.AVAj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39753");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "va.langGNAL..la.$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA", 44, 106);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "va.langGNAL..la.$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA" + "'", str4, "va.langGNAL..la.$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA$$$$$$$$$$JAVA");
    }

    @Test
    public void test39754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39754");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...44444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     interface java.lang.CloneableAvaj.gnalinterface java.io.Serializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("... java.lang.Stringclass java.lang.Stringclass...                                                                                                                              interface java.lang.Cloneable4interface java.io.Serializabl                                                                                                            ... java.lang.Stringclass java.l                        L.Arr#yList", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... java.lang.Stringclass java.lang.Stringclass...                                                                                                                              interface java.lang.Cloneable4interface java.io.Serializabl                                                                                                            ... java.lang.Stringclass java.l                        L.Arr#yList" + "'", str2, "... java.lang.Stringclass java.lang.Stringclass...                                                                                                                              interface java.lang.Cloneable4interface java.io.Serializabl                                                                                                            ... java.lang.Stringclass java.l                        L.Arr#yList");
    }

    @Test
    public void test39756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39756");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("utiljava.util444444444444444444444444444444444444444444444444444444444444444444444444444444444ELBAZILAIREs.OI.AVAJ ECAFRETNIGNIRTsELBAENOLc.GNAL.AVAJ ECAFRETNI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39757");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "GnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", (java.lang.CharSequence) "JAVA.IO.sERIALIZABLE JAVA.LANG.cLONEABLEsTRINGINTERFACE INTERFACE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                      ][GNIRTSLITU.AVAJ1", "nterface java#io#erializable");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39759");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("AAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAA" + "'", str1, "AAAAAAAAAA");
    }

    @Test
    public void test39760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39760");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AVALITU", ".class javalangClass                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG        rayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi.                       javaulang");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39761");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 0, 620);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 401);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("vvayLasa", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasa" + "'", str2, "vvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasavvayLasa");
    }

    @Test
    public void test39764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39764");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                            #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "INTERFACEGAGA.LANG.CLONEABLEAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAAGAGAL.AGNAAAAAAAAAARINGINTERFACEGAGA.IO");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39765");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("loneable#interfacejava.io");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "loneable#interfacejava.io" + "'", str1, "loneable#interfacejava.io");
    }

    @Test
    public void test39766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                               JLANGAVLANGALLANGANG     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                               JLANGAVLANGALLANGANG    " + "'", str1, "                                                                               JLANGAVLANGALLANGANG    ");
    }

    @Test
    public void test39767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaa                                  ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Jvstringnlrrylistrrylistrrylistvj...sAitUJAirt", "interface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......ja                                                                                                            interface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......java.......Objectava..........javainterface java.iointerface java.lang.Cloneable.......ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Jvstringnlrrylistrrylistrrylistvj...sAitUJAirt" + "'", str2, "Jvstringnlrrylistrrylistrrylistvj...sAitUJAirt");
    }

    @Test
    public void test39769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("yLis", "Jvstringnlrrylistrrylistrrylistvj...sAitUJAirt", 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yLis" + "'", str3, "yLis");
    }

    @Test
    public void test39770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39770");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("interface java.lang.Cloneableinterface java.lang.CloneableNG.Llitinterface java.io.Serializableinterface java.io.Serializable", "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaava.lang", 22);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("      aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa", "interface java.lang.Cloneable                                                                                                                                                                                                                                                Java.io.Serializable interface java.lang.Cloneable... interface                                                                                                                                                                                                                                                 interface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa" + "'", str2, "      aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa                                                                                                                                              aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39772");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("###############################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################################################################################################################" + "'", str1, "##############################################################################################################################################################");
    }

    @Test
    public void test39774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39774");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444rrayList44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 119);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("AJaaaaaaaaaaNGA.LAVAJaaaaaaaaaaNGA.LAVAJaaaa                                               ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test39775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("interfacejava.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interfacejava.io", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "interfacejava.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interfacejava.io" + "'", str2, "interfacejava.lang.Cloneablegnal.avajgnal..LANGgnal.avajgnal.interfacejava.io");
    }

    @Test
    public void test39776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                    JAVAlLANGJ", "INTERFACE JAVA.LANG.CLONEABLE...                                 INTERFACE JAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                    JAVAlLANGJ" + "'", str2, "                                                                                                                                                                                                                                                                    JAVAlLANGJ");
    }

    @Test
    public void test39777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39777");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("GNAL.AVAJGNAL..langGNAL.AVAJGNAL.                                                           ", "L.ArryList", 544);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39778");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                ARRAYLISTARRAYLISTARRAYLISTAVAJ                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#...# #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39780");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("....................................................................                       javaulang");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("          GNALgn", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39781");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "INTERFACE JAVA.LANG.cLONEABLEi", "...rgnaluavajtutututututut..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test39782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AAAAAAAAAAjaval.agnAAAAAAAAAA", "..................................................................................................................................................................................................................................................................................................................................................................................................................................................................tsilyarrgnaluavajtsilyarrgnaluavaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39783");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("sERIA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny(" aRRAYlISTaRRAYlISTaRRAYlISTAVAJgnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajlang.javagnal.avajGNAL", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 52, 479);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test39784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ][gnirtslitu.avaj1-                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39785");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa", "##################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                    ...44...                                 44444$         ", 448);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                    ...44...                                 44444$                                                                                                                                                                                                                                                                         " + "'", str2, "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                    ...44...                                 44444$                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test39787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39787");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("......", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "interface java.lang.CloneableAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAringinterface java.io.Serializable", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444JAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal..LANGgnal.avJAVA.LANGAgnal.avajgnal.", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsinterf ce j v  l ng Clone ble inte$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test39788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39788");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39789");
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...nAAAAAAAAAAjaval.agnAAAAAAAAAA...", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!ArrayLis", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "interface java.lang.Cloneable interface java.io.Serializable", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################....java......##############################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test39790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                    JAVAlLANGJ", "interface java.lang.Cloneable.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javainterface java.io.Serializable");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVAlLANGJ" + "'", str2, "JAVAlLANGJ");
    }

    @Test
    public void test39791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39791");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringclass......java.lang.Stringclassjava.lang.Stringcl...avaj..........avaj.........", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaylist", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39792");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("TRING", "... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringclass...... java.lang.Stringclass java.lang.Stringcl...avaj..........avaj..........avaj");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39794");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                        ", "JAVA.UTIL", "#############################################################...", 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                        " + "'", str4, "                        ");
    }

    @Test
    public void test39795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39795");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("lvj", "                                                          VA1J", 924);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "nterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablevajgnalinterfae javaioSerializablenterfae javalangloneablegnalavaj ssalr4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39797");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      ", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("javastring...", strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "javastring...", "                                                                                                                                                                                                  interface java.lang.CloneableString[]Strijavaulang[]String[]interface java.io.Serializable                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 13 + "'", int5 == 13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
    }

    @Test
    public void test39798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ARR... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.." + "'", str1, "arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..");
    }

    @Test
    public void test39799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39799");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("CLASS JAVALANGCLASS                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39800");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("       ", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("$$$$$$$$$$$$.", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) int6, "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjavGNALgnnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAri");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
    }

    @Test
    public void test39801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39801");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR R", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                    ..$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39802");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $$$$$$$$$$$$$$$$$$$$$$$$$$$$$aaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39803");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       INTEGER        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 380);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39804");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ArryListArryListArryListvjGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJLANG.JAVAGNAL.AVAJgnl");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArryListArryListArryListvjGNAL/AVAJLANG/JAVAGNAL/AVAJLANG/JAVAGNAL/AVAJLANG/JAVAGNAL/AVAJLANG/JAVAGNAL/AVAJLANG/JAVAGNAL/AVAJLANG/JAVAGNAL/AVAJLANG/JAVAGNAL/AVAJLANG/JAVAGNAL/AVAJgnl");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39805");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNAL" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNALNAL");
    }

    @Test
    public void test39806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39806");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("CLASS JAVA.LANG.cLASS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: CLASSJAVA.LANG.cLASS");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39807");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 466 + "'", int1 == 466);
    }

    @Test
    public void test39808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39808");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                      irfSeriaCoSeria$SeriairfioSeriInterface java.lang.Cloneable             Character             interface java.io.SerializableirfSeriaCoSeria$SeriairfioSeria                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaa...", "44444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test39810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39810");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "VAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LAN", "Arr.....java..........java..........java.........Arr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test39811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                         slitugnirtsslitugnirtsslitugnirtsslitugnirtssl                                                                          ", (int) '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              " + "'", str2, "                                              ");
    }

    @Test
    public void test39812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39812");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "vaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarrayli                                 ...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39813");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$H$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RAYLIT$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$T");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 514 + "'", int1 == 514);
    }

    @Test
    public void test39814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39814");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                #########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################                                                                                                                                                                                                                                                                                                                                                                                                                                        Serializabl                         ", 58, 472);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                                                                                                      #########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################                                                                                                                     ..." + "'", str3, "...                                                                                                                                                                                      #########################sClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS##########################                                                                                                                     ...");
    }

    @Test
    public void test39815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                             ...aaaaaaaaaaaaaaaaaaaaaaaaaa...                              java.lang$                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaa...                              java.lang$" + "'", str1, "...aaaaaaaaaaaaaaaaaaaaaaaaaa...                              java.lang$");
    }

    @Test
    public void test39816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39816");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Airfco$irfiosriizcirfco$irfiosriizObirfco$irfiosriizecirfco$irfiosriizL", "     aaaaaaaaaa      gnAls4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39817");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AVAJGNALjavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavainterface javaioSerializable", "TsiLytcejbclass", 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AVAJGNA4v4v4v4v4v4v4v4v4vajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavainterface javaioSerializable" + "'", str5, "AVAJGNA4v4v4v4v4v4v4v4v4vajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavainterface javaioSerializable");
    }

    @Test
    public void test39818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("siLyrrA][sslC][sslCrChahaAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA", "JAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANGJAVAULANG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "siLyrrA][sslC][sslCrChahaAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA" + "'", str2, "siLyrrA][sslC][sslCrChahaAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
    }

    @Test
    public void test39819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39819");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAAJAVALgAGNAAAAAAAAAARING", "                                                                    ...nAAAAAAAAAAjaval.agnAAAAAAAAAA...                                                                    ", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("lvj.gnl", "       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lvj.gnl" + "'", str2, "lvj.gnl");
    }

    @Test
    public void test39821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39821");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String", 723);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                            #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                                            #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test39823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39823");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Serializabl...     jav");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test39824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("ArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListA", "rface java.lang.cloneablelang.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListA" + "'", str2, "ArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListAArrayListA");
    }

    @Test
    public void test39825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39825");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("javajavajavajavajavajav");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javajavajavajavajavajav" + "'", str1, "javajavajavajavajavajav");
    }

    @Test
    public void test39826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39826");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCh", "##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#V##RR#RJ#lass java#lang#String");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39827");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("liza.io.Seriavace jable4interfang.Clonea.lavaJ", "ETYbjava..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java...java..........java..........java");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39828");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "javal.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjabytejaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnjaval.agnja", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...                                   ...       ....       .", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                   ...       ....       ." + "'", str2, "...                                   ...       ....       .");
    }

    @Test
    public void test39830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39830");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("  TU ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39831");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         util          ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("Arr... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "CHARACTER             UTILSTRI");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         util          " + "'", str4, "         util          ");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test39832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39832");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...nAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39833");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444444444.4....ArrayListArrayListArrayListArrayLis.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59 + "'", int1 == 59);
    }

    @Test
    public void test39834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "444444444444444444444444444.alya..arsoifri$ocfri");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444.alya..arsoifri$ocfri" + "'", str1, "444444444444444444444444444.alya..arsoifri$ocfri");
    }

    @Test
    public void test39835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39835");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       ", "                            rrayList", 3);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "     " + "'", str5, "     ");
    }

    @Test
    public void test39836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA", "j.gnalnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...                           HI!aRRAYlISTaRRAYlISTaRRAYlISTAVAJ.GNALaRRAYlISTaRRAYlISTaRRAYlIST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39838");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL.AVAJGNAL", "interface java.lang.Cloneable....................................................................                  ", 489);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39839");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("vj.gnlvj.gnlvj.gnl", "rrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrrayListrra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vj.gnlvj.gnlvj.gnl" + "'", str2, "vj.gnlvj.gnlvj.gnl");
    }

    @Test
    public void test39841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39841");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                    String[]", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39842");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("CLASS JAVA.LANG.oBJECT", "$$$NAL", "INTERFACE JAVA.LANG.cLONEABLEvajINTERFACE JAVA.IO.sERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLASS JAVA.LANG.oBJECT" + "'", str3, "CLASS JAVA.LANG.oBJECT");
    }

    @Test
    public void test39843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39843");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("GnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avajssalcgnirtS.gnal.avaj........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang........java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang.......", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: GnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avajssalcgnirtS/gnal/avaj////////java/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/lang////////java/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/lang////////java/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/lang////////java/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/lang////////java/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/langjava/lang///////");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39844");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                   GNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LANG                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "JAVA.LANG                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIILLLLLLLLLLLLLLLLLLLLLLLLITIULINGsTRINGuTILSuTuIssISINsuNszuNNI", "aaaa                       java...       ....       ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("CLASSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTSSLITUGNIRTinterfacegaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterfacegaga.io", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIILLLLLLLLLLLLLLLLLLLLLLLLITIULINGsTRINGuTILSuTuIssISINsuNszuNNI" + "'", str4, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIILLLLLLLLLLLLLLLLLLLLLLLLITIULINGsTRINGuTILSuTuIssISINsuNszuNNI");
    }

    @Test
    public void test39846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39846");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Javalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaagn", "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39847");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("JAVA");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39848");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("..........................aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "lass java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.Stringlass java.lang.StringClassslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test39850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1java.utilString-1java.utilString", "                                                                              javaulainterface java.lang.Cloneable4interface java.io.Serializable");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39851");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", "##RR#RJ                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39852");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 0, 667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39853");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("INTERFACEJAVA.LANG.CLONEABLEINTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLEINTERFACEJAVA.IO.SERIALIZABLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INTERFACEJAVA.LANG.CLONEABLEINTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLEINTERFACEJAVA.IO.SERIALIZABLE" + "'", str1, "INTERFACEJAVA.LANG.CLONEABLEINTERFACEJAVA.LANG.CLONEABLELANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVAINTERFACEJAVA.IO.SERIALIZABLEINTERFACEJAVA.IO.SERIALIZABLE");
    }

    @Test
    public void test39855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39855");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.util", "slitUgnirtS");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("$       ", strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "AVAJ.GNAL", 18);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", strArray4, strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang" + "'", str11, "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test39856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                 String                                                   ", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 String                                                   " + "'", str2, "                                                 String                                                   ");
    }

    @Test
    public void test39857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39857");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("NTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JA...", "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Aaaaaaaautilaaaaaaaaa", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaautilaaaaaaaaa" + "'", str2, "Aaaaaaaautilaaaaaaaaa");
    }

    @Test
    public void test39859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39859");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 118, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RFACE JAVA.LANG.CLONEA#                                   J.GNALJAVA.LANGAVAJ.GN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test39860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa.LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS", 641);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                       ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa.LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS                                                                                                                       " + "'", str2, "                                                                                                                       ylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsa.LANG.STRINGCLASS JAVA.LANG.STRINGCLASS JAVA.LANG.STRINGCLAS                                                                                                                       ");
    }

    @Test
    public void test39861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44-1java.utilString[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "][gnirtSlitu.avaj1-44" + "'", str1, "][gnirtSlitu.avaj1-44");
    }

    @Test
    public void test39862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39862");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("TRING", "L.ArryList");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRING" + "'", str3, "TRING");
    }

    @Test
    public void test39863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ".............................................................................................ang", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("rayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis..." + "'", str1, "rayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayLis...");
    }

    @Test
    public void test39865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("elbazilaireS.oi.avaj ecafretniavaj..........avatcejbO.......avaj.......elbaenolC.gnal");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39866");
        java.lang.String[] strArray23 = new java.lang.String[] { "####", "..", "java", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... ...", "################################", "                                    ", "-1java.utilString[]", "                                  ", "aaaaaaaaaa", "                       JAVAULANG", "class java.lang.Object", "####", "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "sERIALIZABLE", "hi!ArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayListavaj.gnalArrayListArrayListArrayLi", "JAVA.UTIL.", "javal.agn", "1java", "..", "JAVA.UTIL", "iNTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVAINTERFACE JAVA.IO.sERIALIZABLE", "                                  ", "                       JAVAULANGrrayList" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.Class<?>> wildcardClassList26 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.Class<?>> wildcardClassList27 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.Class<?>> wildcardClassList28 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList24);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClassList26);
        org.junit.Assert.assertNotNull(wildcardClassList27);
        org.junit.Assert.assertNotNull(wildcardClassList28);
    }

    @Test
    public void test39867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("............................", "AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAja                                              AAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjava");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "............................" + "'", str2, "............................");
    }

    @Test
    public void test39868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39868");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("java..........java..classjavalangClassJAVAULANGJAVAULANGJAVAULANGJAVAULirtS$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "                                                                             SE...               ...", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ", ".................................................................................................................................................................................................................................JAVA.LANG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    .................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39870");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                           ", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "JAVA.LANGAgnal.avajgnal..LANGgnal.av");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39872");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class java.lang.Class", "CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCha", 482);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39873");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("langGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test39874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39874");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aRR...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                    se...                                                                             ..........", 735);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...AVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgna...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#############################################################...", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYLIST");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39876");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                            i4elbaenolc.gnal.avajecafretnitringi4elbaenolc.gnal.avajecafretni                                                                                                                                                                                                                                                                                                           ", "a..AYl a##############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39877");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                   #############################################################...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   #############################################################..." + "'", str2, "                                   #############################################################...");
    }

    @Test
    public void test39878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39878");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "jliava444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39879");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJAVAL AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test39880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39880");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(".......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........jav");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAV" + "'", str1, ".......JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAVA..........JAV");
    }

    @Test
    public void test39881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39881");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                ...VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALGNALG", "INTERFACE JAVA.LANG.cLONEABLE.......JAVA..........JAVA.........ArrayListArrayListArrayListavaj.gnal                                           INTEGER                                       ", 844);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("     aaaaaaaaaa                          ", 35, "loneable#interfacaaaaaaa$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     aaaaaaaaaa                          " + "'", str3, "     aaaaaaaaaa                          ");
    }

    @Test
    public void test39883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str1, "...       OI.AVAJECAFRETNI#ELBAENOLc.GNAL.AVAJECAFRETNIsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILSsTRINGuTILS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test39884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39884");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("NG", "                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              ", 168, 457);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NG                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              " + "'", str4, "NG                                                                                                                                                                                                                                                                              ArrayListArrayListArrayListavajagnal                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test39885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39885");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "class java.lang.Class                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG                       JAVAULANG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39886");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("........", "ssalc gnirtS.gnal.avajaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39887");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("             Character             utilStri", "             Character             utilStri", (-1));
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("CLASclass java.lang.StringCLAS", strArray4, strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "Lytcejb");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLASclass java.lang.StringCLAS" + "'", str6, "CLASclass java.lang.StringCLAS");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test39888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                       sl..Ug..r.S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       sl..Ug..r.S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "                                       sl..Ug..r.S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test39889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             jvstringnlrrylistrrylistrrylistv", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '4', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39891");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "class [Ljava.lang.Class;4class [Ljava.lang.Class;4class [Ljava.lang.Class;4class [Ljava.lang.Class;", 83);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39892");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...                                   ...       ....       .", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39893");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "interface java.io.Serializable                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39894");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "#############################", (java.lang.CharSequence) "interface gaga.lang.CloneableAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAgagal.agnAAAAAAAAAAringinterface gaga.io.Serializable");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Aaaaaaaaaaaa                                  ", "                                                                                      INTEGER                                                                                       ", 516);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaa                                  " + "'", str3, "Aaaaaaaaaaaa                                  ");
    }

    @Test
    public void test39896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                       ...                                                    ", 605);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                       ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test39897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test39898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA.", "tavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarraylistarraylistarraylitavaj.gnalarrayli                                 ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA" + "'", str2, "INTERFACE JAVA.LANG.cLONEABLEa RRR RRR RRR RRR RRR RRR RRR RRR RNAL....................INTERFACE JAVA");
    }

    @Test
    public void test39899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "gnal$.$avaj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39900");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39901");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("interface#java.lang.Cloneable....................................................................#######################JAVAULANGinterface#java.io.Serializable", '.');
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = null;
        boolean boolean6 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray4, false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test39902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("vA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG.utiljava.u", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "vA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG.utiljava.u" + "'", str3, "vA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG.utiljava.u");
    }

    @Test
    public void test39903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("avaj.gnalavaj.gnalavaj.gnal44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ".utiljava.util");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnalavaj.gnalavaj.gnal44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "gnalavaj.gnalavaj.gnal44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39904");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       util", '$');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       util" + "'", str3, "       util");
    }

    @Test
    public void test39905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39905");
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
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray36 = org.apache.commons.lang3.StringUtils.stripAll(strArray34, "$");
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray34);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray38, '#', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass43 = null;
        java.lang.Class[] classArray45 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        wildcardClassArray46[0] = wildcardClass43;
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray50);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray38);
        java.lang.String[] strArray54 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA... AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray54);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray57);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray57, true);
        java.lang.String[] strArray64 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String[] strArray66 = org.apache.commons.lang3.StringUtils.stripAll(strArray64, "$");
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray64);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray68);
        java.lang.String str73 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray68, '4', 665, 0);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray57, wildcardClassArray68, true);
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
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test39906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("###################################################################################################################################################################################################################################################################################", "JAVA.UTILhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################################################################################################################################################################################################################################################" + "'", str2, "###################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test39907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39907");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "langAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAulang");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39908");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("langAGNALelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSelbazilaireSe", '.');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaastrinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 494, 93);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 494, "class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String4444444444444JAVASTRINGSLITUGNIRTSARRAYLISTARRAYLISTAVAJ.GNALARRAYLISTARRAYLISTARRAYLI44444444444444class java.lang.String");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
    }

    @Test
    public void test39909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                               Jvstringnlrrylistrrylistrrylistvj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Jvstringnlrrylistrrylistrrylistvj" + "'", str1, "Jvstringnlrrylistrrylistrrylistvj");
    }

    @Test
    public void test39911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39911");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.g.", "...gnal.avaaaaaaaaaavaJ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test39912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39912");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                            Arra                                             ", "lit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("TSILYARRGNALUAVAJTSILYARRGNALUAVAJ", 357);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TSILYARRGNALUAVAJTSILYARRGNALUAVAJ" + "'", str2, "TSILYARRGNALUAVAJTSILYARRGNALUAVAJ");
    }

    @Test
    public void test39914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("jvcclng");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jvcclng" + "'", str1, "jvcclng");
    }

    @Test
    public void test39915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39915");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ssalcrrA tsiLytcejbO.gnal.avaj", "AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA", 940, 482);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ssalcrrA tsiLytcejbO.gnal.avajAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA" + "'", str4, "ssalcrrA tsiLytcejbO.gnal.avajAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39916");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "]tuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                interf...", 942);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                interf..." + "'", str2, "                                                interf...");
    }

    @Test
    public void test39918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39918");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("java.u", 660, 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                         444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu                                                                                                                                                                                                                                                                                                                                                                                                         ", "interface java.io.serializable                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                         444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                         444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444litu.avajlitu                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test39920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39920");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39921");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!ArrayLis       $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $         $", "                                                                                                                                                                                                                               arjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjavaarrarjalass java.lang.string                                                                                                                                                                                                                               ", 931);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("IIIEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEIII44IIIEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE44444$EEEEEEEEE", 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEIII44IIIE" + "'", str2, "IIIEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEIII44IIIE");
    }

    @Test
    public void test39923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39923");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal.avajgnal");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39924");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) ".         44444444444444444444444444444444444444444444444444444444444444444444444444444444                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39925");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Java                      INTEGER                       gjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java                      INTEGER                       gjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava" + "'", str1, "Java                      INTEGER                       gjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
    }

    @Test
    public void test39926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39926");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "$       ", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "String", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "tsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.a.lantsiyarr.asaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvsaylavvs", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "INTERFACE JAVA.LANG.cLONEABLE#INTERFACE JAVA.IO.sERIALIZABLE                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...               ...esl.avaj#ecafretnielbazilaires.oi.avaj#ecafretni4elbaenolc.gnal.avaj#ecafretn", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test39927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("stJAVAGNAL                                                           ", "ArrayListArrayListArrayListavaj.gnal                                           INTEGER                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "stJAVAGNAL                                                           " + "'", str2, "stJAVAGNAL                                                           ");
    }

    @Test
    public void test39928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39928");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AVAJ.GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARACTERCHARA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("etyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyBetyB", "aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39930");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                                                                                                                                                                                                                        JAVAlLANGJ                                                                                                                                                                                                                                                                                        ", "hi!ArrayListArrayListArrayListavaj....AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39931");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39932");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#############################################################################################################################################################################################################################################################################", 47, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################################################################################################################################################################################################################################################" + "'", str3, "#############################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test39933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39933");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAAAAAAAAAAAAAAAAAAAAAA", "JLVLlaLN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39934");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "aaaaaaaaaS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r..gU..lsS.r", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaaaaS/r//gU//lsS/r//gU//lsS/r//gU//lsS/r//gU//lsS/r//gU//lsS/r//gU//lsS/r//gU//lsS/r//gU//lsS/r");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("gnirtS.ge       .", "...O.gnal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gnirtS.ge       ." + "'", str2, "gnirtS.ge       .");
    }

    @Test
    public void test39936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39936");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "tring", (java.lang.CharSequence) "JAVA.LANG                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 131);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39938");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("               ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.hi!arraylistarraylistarraylis", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                               ...", 664);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                               ..." + "'", str2, "                                                                                                                                               ...");
    }

    @Test
    public void test39940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39940");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...A", "vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj..........vj.......", 248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!ArrayListArrayListArrayListavaj....1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava", 822, 693);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava" + "'", str3, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava");
    }

    @Test
    public void test39942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39942");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "GNAL");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test39943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39943");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "LNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLNuLinterface java.io.Serializable", "cterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChar");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test39944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$JAVA.IO.SERIALIZABLE INTERFACE JAVA.LANG.CLONEABLE... INTERFACE$$$$$$$$$$$$$");
    }

    @Test
    public void test39945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39945");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ...     javaulangrraylist                   ...", "INTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...$$$$$$$$$$$$$$$$$$$$$$$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVABooleanINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVA.LANG.cLONEABLE#INTERFACEJAVA.IOINTERFACEJAVAIN", 136);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39946");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("        ....................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$GNAL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JAVAULANG", "interface java.lang.Cloneable....................................................................                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test39947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444444444444444444444444444", 66, (int) '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444444444444444444444444444444" + "'", str3, "...444444444444444444444444444444444");
    }

    @Test
    public void test39948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39948");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("etyBetyBetyBetyBetyBetyBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...etyBetyBetyBetyBetyBetyBe                                                                             ", "arjavaarrarjavaarrarjavaarrarjavaarrarjavaarra                                                                                                                                                                                                                                                                                                                                                                               ", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39949");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalgnalLANGLANGLANGLANGLANGLANGLlituava                  ...                         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Arrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Arrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyList" + "'", str1, "Arrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyListArrclassjava.lang.ObjectyList");
    }

    @Test
    public void test39951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("vA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA", 168);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      vA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA                                      " + "'", str2, "                                      vA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA                                      ");
    }

    @Test
    public void test39952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Ar", "JAVA.LANG                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ar" + "'", str2, "Ar");
    }

    @Test
    public void test39953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39953");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444GNL$4$VJ44444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("       ][sslC][sslCrChahacta][sslC][LAutil][sslC][sslCrChahacta][sslC][LA                                                                               ", 502, 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39955");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "...avaj..........avaj..........avajJAVA..........JAVA..........JAVA..........JA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39956");
        char[] charArray17 = new char[] { ' ', ' ', '#', 'a', '4', 'a' };
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("$", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray17);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "java.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.langjava.lang", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "LANG.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.JAVA", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "STRING", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("                       JAVAULANGRRAYLIST", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "$ArrayList", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "interface java.lang.CloneableAVAJGNALjavajavajavajavajavajavajavgnal                                                                interface java.io.Serializable", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  #a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , #, a, 4, a]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test39957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39957");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("interface#java.lang.Cloneable4interface#java.io.Serializableinterface#java.lSE...               ", "", "gnirtSlitu.avaj1-gnirtSlitu.avaj1-");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...avagnal.avajlang.javagnal.avajlang....VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG", 135);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...avagnal.avajlang.javagnal.avajlang....VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAV..." + "'", str2, "...avagnal.avajlang.javagnal.avajlang....VA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAV...");
    }

    @Test
    public void test39959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39959");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListArrclss jv.lng.ObjectyListA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListArrclss jv.lng.ObjectyListA" + "'", str1, "JAVA.LANGAgnl.vjgnl..LANGgnl.vArrclss jv.lng.ObjectyListArrclss jv.lng.ObjectyListA");
    }

    @Test
    public void test39960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39960");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39961");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("....................................................", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    JAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANGAVAJ.GNALJAVA.LANG");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39963");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("interface#java.lang.Cloneable4interface#java.io.Serializable", "4444444444444AAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agnAAAAAAAAAAjaval.agn");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                       JAVAULANGrrayList", 5, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  JAVAULANGrrayLis" + "'", str3, "                  JAVAULANGrrayLis");
    }

    @Test
    public void test39965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Jvstringnlrrylistrrylistrrylistvj.gnlrrylistrrylistrryli-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-", 115, 482);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "g-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.u" + "'", str3, "g-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.utilString-1jv.u");
    }

    @Test
    public void test39966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                            ", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       ..." + "'", str2, "                       ...");
    }

    @Test
    public void test39967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#                                              AAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAj#v##.#gnAAAAAAAAAAring");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("elbazilaireS.oi.avaj ecafretniavaj..........avatcejbO.......avaj.......elbaenolC.gnal.avaj ecafretni", "                                                                                                                                                                                                                                             hi!arraylistarraylistarraylistavaj.gnalarraylistarraylistarraylist");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39969");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("interface java.lang.CloneableString[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]String[]interface java.io.Serializable", 110, 871);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39970");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                        L.Arr#yList", "tu]tu", 878);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$vaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.langavaj.gnaljava.lang$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("JAVA.........................................................................................................................................................................................................................................................................................", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39973");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                    CAFRETNI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39974");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("lvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnlvj.gnl", 830, 53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39975");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39976");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE", "UTIL", "ElbazilaireS.......java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javanignirtSelbaenolC.gnal", 669);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE" + "'", str4, "NTERF CEAJ V AL NGAcLONE BLEAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V AAAAAAAAAAJ V INTERF CEAJ V AIOAsERI LIZ BLE");
    }

    @Test
    public void test39977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                             se...               ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAAAA                       JAVAULANGrrayLLLLLLLLLLL......          JAVAULANGrrayListAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("....................................", "l.ngAGNALelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSelb.zil.ireSe");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS", "io                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS" + "'", str2, "slitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtSslitUgnirtS");
    }

    @Test
    public void test39980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39980");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...RGNALUAVAJTUTUTUTUTUTUT..", "                                   ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 563);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39981");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(".........ava..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........java..........javaj", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /////////ava//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////java//////////javaj");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39982");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJGNALUAVAJSSALCGNALAVAJSSALC");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Vaj", strArray2, strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vaj" + "'", str5, "Vaj");
    }

    @Test
    public void test39983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39983");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "avaj.gnal", (int) 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("JAVAULANG", "");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("java.util", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.util" + "'", str8, "java.util");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "..." + "'", str10, "...");
    }

    @Test
    public void test39984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39984");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("JAVA.LANGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "BYAA", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39985");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "][sslC", (java.lang.CharSequence) "interfacejava.lang.CloneableStringinterfacejava");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39986");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444444444444444444444                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444                                                 " + "'", str1, "44444444444444444444444444                                                 ");
    }

    @Test
    public void test39987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39987");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                       REGETNI                      ", 678, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39988");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "aaAyLAsAaaAyLAsAaAaAu.A.tefAceaAaA..A...C.o.eAb.e4.tefAceaAaA.o.SeA.zAb.eaaAyLAsAaaAyLAsA", 832);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39989");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("g.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.JAVA.L$ArrayListg.", "javal$agn", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39990");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       JAVAULANGrrayList", "java.lang", (int) (short) 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $");
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".44444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                       JAVAULANGrrayList" + "'", str6, "                       JAVAULANGrrayList");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".44444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str8, ".44444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39991");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#########A##RyLRsA##RyLRsA##RyLRsA##RyLRsA##        #########", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...java..........java..", "                                                                                                                 sAitUJAirtSsAitUJAirtSsAitUJAi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara", 629, "aaaaaaaaaaaa######aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara" + "'", str3, "GNALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA CharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterCharacterChara");
    }

    @Test
    public void test39993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39993");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                LUTILUTILUTILUTILUTIL####LUTILUTILUTILUTILUTIL", '$', '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                LUTILUTILUTILUTILUTIL####LUTILUTILUTILUTILUTIL" + "'", str3, "                                                LUTILUTILUTILUTILUTIL####LUTILUTILUTILUTILUTIL");
    }

    @Test
    public void test39994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("langagnaljavaalangavajagnaljavaalangavajagnaljavaalangavajagnaljavaal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LANGAGNALJAVAALANGAVAJAGNALJAVAALANGAVAJAGNALJAVAALANGAVAJAGNALJAVAAL" + "'", str1, "LANGAGNALJAVAALANGAVAJAGNALJAVAALANGAVAJAGNALJAVAALANGAVAJAGNALJAVAAL");
    }

    @Test
    public void test39995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39995");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$$$$$$$$$$$$$$$.....$$$$", "4v4j.gn4lnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAAj4v4l.4gnAAAAAAAAAA", 840);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("vajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajva                                                                                                                                                   ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "vajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajva .." + "'", str1, "vajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajvajva ..");
    }

    @Test
    public void test39997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39997");
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
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray7);
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
    }

    @Test
    public void test39998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39998");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT.ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclass j...");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIT/ITaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaclassj///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39999");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajavaulangrraylist", "                                                                                                                                                                                JAVA.LANGAgnal.avajgnal..LANGgnal.avArrclass java.lang.ObjectyListAr...                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test40000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("JavaStringnalArrayListArrayListArrainterface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializabl", "java.lang.stringclass java.lang.stringclass java.lang.stringclas.lang.stringclass java.lang.stringcinterface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializableinterface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializableinterface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializableinterface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializableinterface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializableinterface java.lang.Cloneable... ... ... ... ... ... ... ... interface java.io.Serializableinterface java.la");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JavaStringnalArrayListArrayListArrainterface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializabl" + "'", str2, "JavaStringnalArrayListArrayListArrainterface java.lang.Cloneable44444444444444444444444444444444444444444444444444interface java.io.Serializabl");
    }
}

