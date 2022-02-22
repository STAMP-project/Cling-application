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
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) 'a', (int) ' ');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(0.9760159905433325d, (double) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter((java.io.Writer) printWriter6, true);
        java.util.Locale locale12 = new java.util.Locale("\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)", "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)", "german");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.Object[] objArray16 = null;
        java.io.PrintWriter printWriter17 = printWriter6.printf(locale12, "ja_jp", objArray16);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)_german");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str13, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "und-german" + "'", str14, "und-german");
        org.junit.Assert.assertNotNull(printWriter17);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        java.io.PrintStream printStream1 = new java.io.PrintStream("it,IT");
        java.io.PrintWriter printWriter2 = new java.io.PrintWriter((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        printStream1.print((double) '#');
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale6 = new java.util.Locale("Italy", "anglais");
        java.lang.String str7 = locale1.getDisplayName(locale6);
        java.lang.String str8 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italy" + "'", str3, "Italy");
        org.junit.Assert.assertEquals(locale6.toString(), "italy_ANGLAIS");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double8 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7008547008546866d + "'", double10 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale4 = new java.util.Locale("English", "", "chinois");
        java.lang.String str5 = locale0.getDisplayName(locale4);
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = new java.util.Locale("zh_CN", "China", "");
        java.lang.String str11 = locale4.getDisplayName(locale10);
        java.lang.String str12 = locale4.getDisplayVariant();
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale14.getDisplayCountry();
        java.util.Locale locale17 = locale14.stripExtensions();
        java.lang.String str18 = locale4.getDisplayVariant(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = locale17.getUnicodeLocaleType("\uc774\ud0c8\ub9ac\uc544\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: org.apache.commons.math.MathException: ???????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale4.toString(), "english__chinois");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian (Italy)" + "'", str5, "Italian (Italy)");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_cn_CHINA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english (chinois)" + "'", str11, "english (chinois)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chinois" + "'", str12, "chinois");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chinois" + "'", str18, "chinois");
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        double double14 = hypergeometricDistributionImpl3.probability(97);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(0.6730769230769192d, 10.0d);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(12);
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.8610241643812307d);
        int int24 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int25 = hypergeometricDistributionImpl3.getPopulationSize();
        int int26 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 117 + "'", int25 == 117);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = new java.util.Locale("zh_CN", "English", "it_IT");
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("ITALY");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale15.getDisplayVariant();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale.Builder builder23 = builder19.setExtension('x', "italien");
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleKeys();
        java.lang.String str26 = locale24.getVariant();
        boolean boolean27 = locale24.hasExtensions();
        java.util.Locale locale28 = locale24.stripExtensions();
        java.util.Locale.Builder builder29 = builder19.setLocale(locale28);
        java.util.Locale.Builder builder32 = builder19.setExtension('a', "");
        java.util.Locale.Builder builder33 = builder19.clearExtensions();
        java.util.Locale.Builder builder34 = builder19.clearExtensions();
        java.util.Locale.Builder builder36 = builder19.setLanguage("ENGLISH");
        java.util.Locale.Builder builder37 = builder19.clear();
        java.util.Locale locale39 = new java.util.Locale("fra");
        java.lang.String str40 = locale39.toLanguageTag();
        java.lang.String str41 = locale39.getDisplayVariant();
        java.util.Locale.Builder builder42 = builder37.setLocale(locale39);
        java.lang.String str43 = locale39.getISO3Country();
        java.lang.String str44 = locale15.getDisplayCountry(locale39);
        java.util.Locale.setDefault(category0, locale15);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertEquals(locale6.toString(), "zh_cn_ENGLISH_it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_cn_ENGLISH_it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "italy");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals(locale39.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "fra" + "'", str40, "fra");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'x');
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(10);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl3.cumulativeProbability(120, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 120 + "'", int19 == 120);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
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
        printWriter1.flush();
        printWriter1.write("org.apache.commons.math.MathException: fr");
        printWriter1.print("anglais (Canada)");
        java.lang.CharSequence charSequence26 = null;
        java.io.PrintWriter printWriter27 = printWriter1.append(charSequence26);
        printWriter1.print(0.0f);
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("fr");
        printWriter31.println();
        boolean boolean33 = printWriter31.checkError();
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter((java.io.Writer) printWriter31, false);
        java.io.PrintWriter printWriter37 = printWriter35.append((java.lang.CharSequence) "English");
        printWriter1.println((java.lang.Object) printWriter35);
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
        org.junit.Assert.assertNotNull(printWriter27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(printWriter37);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
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
        printStream7.println("fr");
        java.io.PrintStream printStream33 = new java.io.PrintStream((java.io.OutputStream) printStream7, false);
        java.io.PrintStream printStream35 = new java.io.PrintStream("zh_CN");
        printStream35.print((float) (byte) -1);
        printStream35.println();
        printStream35.println();
        java.io.PrintStream printStream41 = new java.io.PrintStream((java.io.OutputStream) printStream35, true);
        printStream33.print((java.lang.Object) printStream41);
        printStream41.flush();
        printStream41.print("en_CA");
        printStream41.flush();
        printStream41.println((double) (-1.0f));
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
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream1.write(byteArray9);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        printStream1.print((java.lang.Object) locale11);
        printStream1.close();
        printStream1.println((long) (byte) 0);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
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
        printStream1.print((double) (short) 100);
        java.io.PrintStream printStream85 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        printStream1.println(32);
        printStream1.println((float) (byte) -1);
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
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'u');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(117);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) (-1));
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.317207034691968d);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        java.lang.Class<?> wildcardClass24 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.9999999999999717d);
        double double11 = hypergeometricDistributionImpl3.probability((double) 0);
        hypergeometricDistributionImpl3.setSampleSize(9);
        hypergeometricDistributionImpl3.setPopulationSize(116);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7008547008546866d + "'", double9 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7008547008546866d + "'", double11 == 0.7008547008546866d);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
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
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("", objArray64);
        java.lang.Throwable[] throwableArray68 = mathException67.getSuppressed();
        java.io.PrintWriter printWriter69 = printWriter12.format("\u30a4\u30bf\u30ea\u30a2", (java.lang.Object[]) throwableArray68);
        java.io.PrintWriter printWriter71 = printWriter12.append((java.lang.CharSequence) "fra");
        java.io.PrintStream printStream73 = new java.io.PrintStream("zh_CN");
        printStream73.print((float) (byte) -1);
        char[] charArray78 = new char[] { 'x', 'u' };
        printStream73.println(charArray78);
        printStream73.println(0);
        printStream73.flush();
        printStream73.println((float) ' ');
        java.io.PrintWriter printWriter85 = new java.io.PrintWriter((java.io.OutputStream) printStream73);
        java.io.PrintWriter printWriter87 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter89 = printWriter87.append(' ');
        char[] charArray92 = new char[] { 'x', 'a' };
        printWriter89.print(charArray92);
        printWriter85.write(charArray92);
        printWriter12.write(charArray92);
        printWriter12.print('x');
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
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(printWriter71);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[x, u]");
        org.junit.Assert.assertNotNull(printWriter89);
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray92), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray92), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray92), "[x, a]");
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        printWriter1.println(false);
        printWriter1.println();
        printWriter1.write((int) 'x');
        printWriter1.print(0.0f);
        org.junit.Assert.assertNotNull(printWriter3);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        java.io.PrintStream printStream1 = new java.io.PrintStream("chinois");
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getUnicodeLocaleType("CA");
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        boolean boolean8 = locale7.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.lang.String str10 = locale7.getDisplayName(locale9);
        java.util.Locale locale11 = java.util.Locale.ROOT;
        boolean boolean12 = locale11.hasExtensions();
        java.lang.String str13 = locale7.getDisplayCountry(locale11);
        java.util.Locale.setDefault(locale7);
        java.lang.String str15 = locale5.getDisplayScript(locale7);
        java.util.Locale locale18 = new java.util.Locale("hi! (ITALY)", "allemand (Allemagne)");
        java.util.Locale locale19 = java.util.Locale.ROOT;
        boolean boolean20 = locale19.hasExtensions();
        java.lang.String str21 = locale19.getCountry();
        java.lang.String str22 = locale19.getDisplayLanguage();
        boolean boolean23 = locale19.hasExtensions();
        java.util.Set<java.lang.String> strSet24 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale19.getISO3Language();
        java.lang.String str26 = locale18.getDisplayCountry(locale19);
        java.lang.String str27 = locale5.getDisplayLanguage(locale19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e" + "'", str6, "\u30c9\u30a4\u30c4\u8a9e");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale18.toString(), "hi! (italy)_ALLEMAND (ALLEMAGNE)");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ALLEMAND (ALLEMAGNE)" + "'", str26, "ALLEMAND (ALLEMAGNE)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "German" + "'", str27, "German");
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf(locale5, "it_IT", (java.lang.Object[]) throwableArray11);
        java.io.PrintWriter printWriter15 = new java.io.PrintWriter("fr");
        printWriter15.print("it_IT");
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter20 = printWriter15.printf("fr", objArray19);
        printWriter20.print((float) (byte) 100);
        printWriter20.write("english");
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
        java.util.Locale locale58 = java.util.Locale.JAPANESE;
        java.util.Locale locale59 = java.util.Locale.JAPANESE;
        java.lang.String str60 = locale58.getDisplayCountry(locale59);
        java.lang.String str61 = locale58.getVariant();
        java.lang.String str62 = locale58.getCountry();
        java.lang.String[] strArray64 = java.util.Locale.getISOCountries();
        java.io.PrintWriter printWriter65 = printWriter28.format(locale58, "fr-CA", (java.lang.Object[]) strArray64);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray64);
        java.io.PrintWriter printWriter67 = printWriter20.printf("deu", (java.lang.Object[]) strArray64);
        java.io.PrintWriter printWriter68 = printWriter12.format("fran\347ais (France)", (java.lang.Object[]) strArray64);
        printWriter12.println();
        printWriter12.write((int) '4');
        printWriter12.print('a');
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(printWriter20);
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
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ja");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(printWriter65);
        org.junit.Assert.assertNotNull(printWriter67);
        org.junit.Assert.assertNotNull(printWriter68);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
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
        java.io.PrintWriter printWriter41 = new java.io.PrintWriter("fr");
        printWriter41.print("it_IT");
        java.util.Locale locale44 = java.util.Locale.ROOT;
        boolean boolean45 = locale44.hasExtensions();
        java.util.Locale locale46 = java.util.Locale.ROOT;
        java.lang.String str47 = locale44.getDisplayName(locale46);
        java.util.Locale locale48 = java.util.Locale.ROOT;
        boolean boolean49 = locale48.hasExtensions();
        java.lang.String str50 = locale44.getDisplayCountry(locale48);
        java.lang.Object[] objArray53 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", objArray53);
        java.io.PrintWriter printWriter55 = printWriter41.printf(locale48, "it_IT", objArray53);
        java.io.PrintWriter printWriter58 = new java.io.PrintWriter("fr");
        printWriter58.print("it_IT");
        java.util.Locale locale62 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray65 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("hi!", objArray65);
        java.lang.Throwable[] throwableArray67 = mathException66.getSuppressed();
        java.lang.Throwable[] throwableArray68 = mathException66.getSuppressed();
        java.io.PrintWriter printWriter69 = printWriter58.printf(locale62, "it_IT", (java.lang.Object[]) throwableArray68);
        java.io.PrintWriter printWriter70 = printWriter41.format("it_IT", (java.lang.Object[]) throwableArray68);
        printWriter70.println();
        java.util.Locale locale72 = java.util.Locale.JAPANESE;
        java.util.Locale locale73 = java.util.Locale.JAPANESE;
        java.lang.String str74 = locale72.getDisplayCountry(locale73);
        java.lang.String str75 = locale72.getVariant();
        java.util.Locale locale76 = java.util.Locale.CANADA;
        java.lang.String str77 = locale72.getDisplayScript(locale76);
        java.util.Locale locale80 = new java.util.Locale("Italy", "Italy");
        java.lang.String str81 = locale76.getDisplayLanguage(locale80);
        boolean boolean82 = locale76.hasExtensions();
        org.apache.commons.math.MathException mathException85 = new org.apache.commons.math.MathException();
        java.lang.String str86 = mathException85.getPattern();
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException("italien", (java.lang.Throwable) mathException85);
        java.lang.Object[] objArray88 = mathException85.getArguments();
        java.io.PrintWriter printWriter89 = printWriter70.format(locale76, "cinese", objArray88);
        java.io.PrintWriter printWriter90 = printWriter36.format("FR", objArray88);
        java.io.PrintWriter printWriter92 = printWriter90.append((java.lang.CharSequence) "en");
        printWriter90.flush();
        printWriter90.println(false);
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
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(printWriter55);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "ja");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals(locale80.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "English" + "'", str81, "English");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[]");
        org.junit.Assert.assertNotNull(printWriter89);
        org.junit.Assert.assertNotNull(printWriter90);
        org.junit.Assert.assertNotNull(printWriter92);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream1.write(byteArray9);
        printStream1.write((int) 'a');
        printStream1.println((int) (short) 100);
        printStream1.print(false);
        printStream1.flush();
        printStream1.print((double) '#');
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter((java.io.OutputStream) printStream20);
        printWriter21.print(0.6014583705819962d);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, -1]");
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double8 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        hypergeometricDistributionImpl3.setPopulationSize(4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5555555555555439d + "'", double13 == 0.5555555555555439d);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
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
        printWriter36.print((long) (byte) 0);
        printWriter36.print("cinese (Cina)");
        java.io.PrintWriter printWriter44 = printWriter36.append((java.lang.CharSequence) "italien");
        printWriter36.print(' ');
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
        org.junit.Assert.assertNotNull(printWriter44);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("German (Germany)");
        java.util.Locale locale3 = new java.util.Locale("ja");
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
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
        java.io.PrintStream printStream18 = printStream1.append('4');
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter((java.io.OutputStream) printStream18, true);
        printWriter20.print(true);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter((java.io.Writer) printWriter20);
        printWriter23.print((float) (short) 0);
        printWriter23.println("\u53f0\u6e7e");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(printStream18);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', 0, (int) (short) 100);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), (double) 96);
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        java.util.Locale locale3 = new java.util.Locale("\u53f0\u6e7e", "IT,IT", "cor\351en");
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.lang.String str5 = locale4.getVariant();
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = locale4.getDisplayName();
        java.lang.String str8 = locale3.getDisplayName(locale4);
        org.junit.Assert.assertEquals(locale3.toString(), "\u53f0\u6e7e_IT,IT_cor\351en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e" + "'", str7, "\u30c9\u30a4\u30c4\u8a9e");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u53f0\u6e7e (IT,IT,cor\351en)" + "'", str8, "\u53f0\u6e7e (IT,IT,cor\351en)");
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
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
        printWriter30.println();
        java.util.Locale locale32 = java.util.Locale.JAPANESE;
        java.util.Locale locale33 = java.util.Locale.JAPANESE;
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.lang.String str35 = locale32.getVariant();
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.lang.String str37 = locale32.getDisplayScript(locale36);
        java.util.Locale locale40 = new java.util.Locale("Italy", "Italy");
        java.lang.String str41 = locale36.getDisplayLanguage(locale40);
        boolean boolean42 = locale36.hasExtensions();
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException();
        java.lang.String str46 = mathException45.getPattern();
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("italien", (java.lang.Throwable) mathException45);
        java.lang.Object[] objArray48 = mathException45.getArguments();
        java.io.PrintWriter printWriter49 = printWriter30.format(locale36, "cinese", objArray48);
        java.io.PrintWriter printWriter50 = new java.io.PrintWriter((java.io.Writer) printWriter49);
        printWriter50.print((float) 4);
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
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ja");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale40.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "English" + "'", str41, "English");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(printWriter49);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!", objArray1);
        java.lang.Object[] objArray3 = mathException2.getArguments();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!", objArray5);
        java.lang.Throwable[] throwableArray7 = mathException6.getSuppressed();
        mathException2.addSuppressed((java.lang.Throwable) mathException6);
        java.lang.String str9 = mathException6.getPattern();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(96);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 96 + "'", int12 == 96);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        printStream4.println('#');
        printStream4.println();
        printStream4.print("italien (Italie)");
        java.io.PrintStream printStream11 = new java.io.PrintStream((java.io.OutputStream) printStream4);
        printStream4.print("\u82f1\u8a9e");
        printStream4.print(false);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getVariant();
        boolean boolean19 = locale16.hasExtensions();
        java.io.PrintStream printStream22 = new java.io.PrintStream("zh_CN");
        printStream22.print((float) (byte) -1);
        printStream22.println();
        printStream22.println();
        java.io.PrintStream printStream28 = new java.io.PrintStream((java.io.OutputStream) printStream22, true);
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter("fr");
        printWriter30.print("it_IT");
        java.util.Locale locale33 = java.util.Locale.ROOT;
        boolean boolean34 = locale33.hasExtensions();
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.lang.String str36 = locale33.getDisplayName(locale35);
        java.util.Locale locale37 = java.util.Locale.ROOT;
        boolean boolean38 = locale37.hasExtensions();
        java.lang.String str39 = locale33.getDisplayCountry(locale37);
        java.lang.Object[] objArray42 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", objArray42);
        java.io.PrintWriter printWriter44 = printWriter30.printf(locale37, "it_IT", objArray42);
        printStream28.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream47 = printStream28.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream49 = new java.io.PrintStream((java.io.OutputStream) printStream47, false);
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter((java.io.OutputStream) printStream47, true);
        java.io.PrintStream printStream53 = printStream47.append('x');
        printStream53.print(false);
        printStream53.close();
        java.util.Locale locale57 = java.util.Locale.ENGLISH;
        printStream53.println((java.lang.Object) locale57);
        java.io.PrintWriter printWriter61 = new java.io.PrintWriter("fr");
        printWriter61.println();
        java.io.PrintWriter printWriter65 = new java.io.PrintWriter("fr");
        printWriter65.print("it_IT");
        java.util.Locale locale68 = java.util.Locale.ROOT;
        boolean boolean69 = locale68.hasExtensions();
        java.util.Locale locale70 = java.util.Locale.ROOT;
        java.lang.String str71 = locale68.getDisplayName(locale70);
        java.util.Locale locale72 = java.util.Locale.ROOT;
        boolean boolean73 = locale72.hasExtensions();
        java.lang.String str74 = locale68.getDisplayCountry(locale72);
        java.lang.Object[] objArray77 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("hi!", objArray77);
        java.io.PrintWriter printWriter79 = printWriter65.printf(locale72, "it_IT", objArray77);
        java.io.PrintWriter printWriter80 = printWriter61.printf("zh_CN", objArray77);
        java.io.PrintStream printStream81 = printStream53.format("fr_FR", objArray77);
        java.io.PrintStream printStream82 = printStream4.format(locale16, "zh_cn", objArray77);
        printStream82.print((int) 'x');
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(printStream47);
        org.junit.Assert.assertNotNull(printStream53);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertNotNull(printWriter79);
        org.junit.Assert.assertNotNull(printWriter80);
        org.junit.Assert.assertNotNull(printStream81);
        org.junit.Assert.assertNotNull(printStream82);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
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
        java.io.PrintStream printStream18 = printStream1.append('4');
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter((java.io.OutputStream) printStream18, true);
        printWriter20.print(true);
        java.io.PrintWriter printWriter24 = printWriter20.append('u');
        java.io.PrintWriter printWriter25 = new java.io.PrintWriter((java.io.Writer) printWriter20);
        printWriter20.println();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(printStream18);
        org.junit.Assert.assertNotNull(printWriter24);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
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
        printStream35.println((int) 'x');
        boolean boolean56 = printStream35.checkError();
        java.io.PrintStream printStream58 = new java.io.PrintStream((java.io.OutputStream) printStream35, true);
        java.io.PrintStream printStream59 = new java.io.PrintStream((java.io.OutputStream) printStream35);
        printStream35.println(true);
        printStream35.write(96);
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
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
        printStream1.println("\u82f1\u8a9e");
        java.io.PrintStream printStream21 = new java.io.PrintStream("zh_CN");
        printStream21.println();
        java.io.PrintStream printStream24 = printStream21.append('#');
        printStream21.close();
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream21.write(byteArray30);
        printStream21.print(false);
        printStream21.println("Italy");
        java.io.PrintStream printStream37 = new java.io.PrintStream("zh_CN");
        printStream37.println((float) (-1));
        java.io.PrintStream printStream41 = new java.io.PrintStream("zh_CN");
        printStream41.println();
        java.io.PrintStream printStream44 = printStream41.append('#');
        printStream41.close();
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream41.write(byteArray50);
        printStream37.write(byteArray50);
        printStream21.write(byteArray50);
        printStream21.println((double) (-1));
        printStream21.println(100L);
        java.io.PrintStream printStream59 = new java.io.PrintStream("zh_CN");
        printStream59.print((float) (byte) -1);
        char[] charArray64 = new char[] { 'x', 'u' };
        printStream59.println(charArray64);
        printStream21.println(charArray64);
        printStream1.print(charArray64);
        java.io.PrintStream printStream69 = printStream1.append('4');
        printStream69.println((float) 17);
        java.io.PrintWriter printWriter72 = new java.io.PrintWriter((java.io.OutputStream) printStream69);
        printWriter72.write("fr-CA");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(printStream24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(printStream44);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[x, u]");
        org.junit.Assert.assertNotNull(printStream69);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
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
        printStream26.print(false);
        java.util.Locale locale29 = java.util.Locale.ITALY;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale34 = new java.util.Locale("zh_CN", "English", "it_IT");
        java.util.Set<java.lang.Character> charSet35 = locale34.getExtensionKeys();
        java.util.Locale locale36 = java.util.Locale.UK;
        java.lang.String str37 = locale36.toLanguageTag();
        java.lang.String str38 = locale34.getDisplayVariant(locale36);
        java.lang.String str39 = locale29.getDisplayCountry(locale36);
        java.lang.Object[] objArray42 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", objArray42);
        java.io.PrintStream printStream44 = printStream26.printf(locale36, "Japanisch", objArray42);
        printStream26.close();
        printStream26.print((long) (byte) 1);
        java.io.PrintStream printStream49 = new java.io.PrintStream("ita");
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder51 = builder50.clearExtensions();
        java.util.Locale.Builder builder53 = builder50.setScript("");
        java.util.Locale.Builder builder55 = builder50.setScript("");
        printStream49.println((java.lang.Object) builder55);
        java.io.PrintStream printStream57 = new java.io.PrintStream((java.io.OutputStream) printStream49);
        java.io.PrintStream printStream59 = new java.io.PrintStream("zh_CN");
        printStream59.println();
        java.io.PrintStream printStream62 = printStream59.append('#');
        printStream59.close();
        byte[] byteArray68 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream59.write(byteArray68);
        printStream57.write(byteArray68);
        printStream26.write(byteArray68);
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
        org.junit.Assert.assertEquals(locale29.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str30, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertEquals(locale34.toString(), "zh_cn_ENGLISH_it_IT");
        org.junit.Assert.assertNotNull(charSet35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "en-GB" + "'", str37, "en-GB");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "it,IT" + "'", str38, "it,IT");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Italy" + "'", str39, "Italy");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(printStream44);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(printStream62);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[-1, 100, -1, -1]");
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        hypergeometricDistributionImpl3.setSampleSize(117);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        double double13 = hypergeometricDistributionImpl3.probability((int) (short) 1);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.9986450715497108d, (double) 1.0f);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        double double20 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        int int22 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 117 + "'", int21 == 117);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', 97, 10);
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0713460372617253E-9d + "'", double6 == 2.0713460372617253E-9d);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
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
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl26 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int27 = hypergeometricDistributionImpl26.getPopulationSize();
        double double29 = hypergeometricDistributionImpl26.cumulativeProbability((double) (short) -1);
        double double31 = hypergeometricDistributionImpl26.probability((double) (short) 100);
        double double33 = hypergeometricDistributionImpl26.cumulativeProbability((double) 117);
        printWriter1.print((java.lang.Object) 117);
        java.io.PrintWriter printWriter36 = printWriter1.append('4');
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", objArray40);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("fr", objArray40);
        java.io.PrintWriter printWriter43 = printWriter36.format("en-GB", objArray40);
        java.io.PrintWriter printWriter44 = new java.io.PrintWriter((java.io.Writer) printWriter36);
        printWriter44.println((int) 'x');
        printWriter44.write("org.apache.commons.math.MathException");
        printWriter44.print(true);
        printWriter44.print(100.0f);
        printWriter44.println(true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 117 + "'", int27 == 117);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(printWriter43);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.write("hi!");
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("fr");
        printWriter5.print("it_IT");
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter10 = printWriter5.printf("fr", objArray9);
        printWriter10.print((float) (byte) 100);
        java.io.PrintWriter printWriter14 = printWriter10.append((java.lang.CharSequence) "ja");
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
        printWriter14.write(charArray58);
        printWriter1.println(charArray58);
        printWriter1.print(false);
        printWriter1.println(119);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(printWriter14);
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
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("fr");
        printWriter5.print("it_IT");
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter10 = printWriter5.printf("fr", objArray9);
        printWriter5.println((float) 'u');
        printStream1.print((java.lang.Object) 'u');
        printStream1.println(0L);
        printStream1.print('a');
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.OutputStream) printStream1, true);
        boolean boolean20 = printStream1.checkError();
        java.io.PrintStream printStream22 = new java.io.PrintStream("fran\347ais (France)");
        java.util.Locale locale25 = new java.util.Locale("en-GB", "Italy");
        java.lang.String str26 = locale25.getCountry();
        boolean boolean27 = locale25.hasExtensions();
        printStream22.print((java.lang.Object) locale25);
        java.io.PrintStream printStream30 = printStream22.append(' ');
        printStream22.print((float) (short) 1);
        printStream1.print((java.lang.Object) (short) 1);
        printStream1.print((-1L));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals(locale25.toString(), "en-gb_ITALY");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ITALY" + "'", str26, "ITALY");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(printStream30);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        java.io.PrintStream printStream1 = new java.io.PrintStream("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        java.io.PrintStream printStream3 = printStream1.append((java.lang.CharSequence) "fra");
        java.io.PrintStream printStream5 = new java.io.PrintStream("fran\347ais (France)");
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
        java.io.PrintStream printStream34 = new java.io.PrintStream("zh_CN");
        printStream34.println();
        java.io.PrintStream printStream37 = printStream34.append('#');
        printStream34.close();
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream34.write(byteArray43);
        printStream34.print(false);
        printStream34.println("Italy");
        java.io.PrintStream printStream50 = new java.io.PrintStream("zh_CN");
        printStream50.println((float) (-1));
        java.io.PrintStream printStream54 = new java.io.PrintStream("zh_CN");
        printStream54.println();
        java.io.PrintStream printStream57 = printStream54.append('#');
        printStream54.close();
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream54.write(byteArray63);
        printStream50.write(byteArray63);
        printStream34.write(byteArray63);
        printStream32.write(byteArray63);
        printStream5.write(byteArray63);
        printStream1.write(byteArray63);
        java.util.Locale locale73 = new java.util.Locale("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", "de", "");
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException();
        java.lang.String str77 = mathException76.getPattern();
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("italien", (java.lang.Throwable) mathException76);
        java.lang.Object[] objArray79 = mathException76.getArguments();
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException76);
        java.lang.Throwable[] throwableArray81 = mathException76.getSuppressed();
        java.io.PrintStream printStream82 = printStream1.format(locale73, "FRENCH", (java.lang.Object[]) throwableArray81);
        printStream82.print(1.0f);
        org.junit.Assert.assertNotNull(printStream3);
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
        org.junit.Assert.assertNotNull(printStream37);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(printStream57);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-1, 100, -1, -1]");
        org.junit.Assert.assertEquals(locale73.toString(), "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)_DE");
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(printStream82);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability((int) '4');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.probability(3.723172347079774E-12d);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(9);
        double double23 = hypergeometricDistributionImpl3.probability(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.006311805927630829d + "'", double21 == 0.006311805927630829d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.7153313782775524E-17d + "'", double23 == 2.7153313782775524E-17d);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        boolean boolean6 = printStream1.checkError();
        printStream1.println((float) 10L);
        printStream1.println((-1.0f));
        java.io.PrintStream printStream13 = new java.io.PrintStream("zh_CN");
        printStream13.println();
        java.io.PrintStream printStream16 = printStream13.append('#');
        printStream13.close();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream13.write(byteArray21);
        printStream13.write((int) 'a');
        printStream13.println((int) (short) 100);
        printStream13.print(1L);
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("fr");
        printWriter31.print("it_IT");
        java.util.Locale locale34 = java.util.Locale.ROOT;
        boolean boolean35 = locale34.hasExtensions();
        java.util.Locale locale36 = java.util.Locale.ROOT;
        java.lang.String str37 = locale34.getDisplayName(locale36);
        java.util.Locale locale38 = java.util.Locale.ROOT;
        boolean boolean39 = locale38.hasExtensions();
        java.lang.String str40 = locale34.getDisplayCountry(locale38);
        java.lang.Object[] objArray43 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", objArray43);
        java.io.PrintWriter printWriter45 = printWriter31.printf(locale38, "it_IT", objArray43);
        java.io.PrintWriter printWriter48 = new java.io.PrintWriter("fr");
        printWriter48.print("it_IT");
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray55 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", objArray55);
        java.lang.Throwable[] throwableArray57 = mathException56.getSuppressed();
        java.lang.Throwable[] throwableArray58 = mathException56.getSuppressed();
        java.io.PrintWriter printWriter59 = printWriter48.printf(locale52, "it_IT", (java.lang.Object[]) throwableArray58);
        java.io.PrintWriter printWriter60 = printWriter31.format("it_IT", (java.lang.Object[]) throwableArray58);
        printWriter60.println();
        java.lang.Throwable throwable64 = null;
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException(throwable64);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException65);
        java.lang.Throwable[] throwableArray67 = mathException65.getSuppressed();
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray67);
        java.io.PrintWriter printWriter69 = printWriter60.format("Royaume-Uni", (java.lang.Object[]) throwableArray67);
        java.io.PrintStream printStream70 = printStream13.printf("Chinese (China)", (java.lang.Object[]) throwableArray67);
        java.io.PrintStream printStream71 = printStream1.printf("Franz\366sisch", (java.lang.Object[]) throwableArray67);
        printStream71.println('x');
        java.lang.Class<?> wildcardClass74 = printStream71.getClass();
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(printWriter45);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(printWriter59);
        org.junit.Assert.assertNotNull(printWriter60);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(printStream70);
        org.junit.Assert.assertNotNull(printStream71);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
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
        printStream16.print((int) (short) 1);
        printStream16.close();
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter26 = printWriter24.append(' ');
        printWriter26.println((double) '4');
        char[] charArray34 = new char[] { '4', ' ', 'x', 'u', 'a' };
        printWriter26.print(charArray34);
        printStream16.println(charArray34);
        printStream16.print((double) '4');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(printWriter26);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4 xua");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4 xua");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4,  , x, u, a]");
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        printStream4.println('#');
        java.lang.String[] strArray9 = java.util.Locale.getISOCountries();
        java.io.PrintStream printStream10 = printStream4.printf("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray9);
        java.io.PrintStream printStream11 = new java.io.PrintStream((java.io.OutputStream) printStream10);
        printStream11.println((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream16 = new java.io.PrintStream((java.io.OutputStream) printStream11, true, "franz\366sisch (frankreich) (Korean)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: franzo?sisch (frankreich) (Korean)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(printStream10);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(117);
        double double7 = hypergeometricDistributionImpl3.probability((double) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L), 0.0d);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7008547008546866d + "'", double7 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.001354928450285685d + "'", double14 == 0.001354928450285685d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
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
        printStream1.println("\u82f1\u8a9e");
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter((java.io.OutputStream) printStream1);
        printWriter20.print("en");
        printWriter20.write("org.apache.commons.math.MathException: China", 0, 0);
        printWriter20.println(false);
        printWriter20.flush();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        printStream1.print((float) 'u');
        printStream1.println((long) '#');
        java.lang.CharSequence charSequence10 = null;
        java.io.PrintStream printStream11 = printStream1.append(charSequence10);
        printStream11.println(1.0f);
        java.io.PrintStream printStream15 = printStream11.append('x');
        java.io.PrintStream printStream16 = new java.io.PrintStream((java.io.OutputStream) printStream11);
        printStream16.print((float) 0);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream16, true);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(printStream15);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 10L);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double19 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.001354928450285685d);
        hypergeometricDistributionImpl3.setSampleSize(31);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(120);
        int int26 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 117 + "'", int13 == 117);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7008547008546866d + "'", double21 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
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
        printWriter21.write(0);
        printWriter21.print('a');
        printWriter21.println(false);
        printWriter21.flush();
        printWriter21.write(5);
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
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
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
        printStream26.print(false);
        printStream26.print((float) (byte) 100);
        printStream26.print("GB");
        java.util.Locale locale34 = new java.util.Locale("italiano");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleKeys();
        printStream26.print((java.lang.Object) locale34);
        java.lang.String str37 = locale34.getLanguage();
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
        org.junit.Assert.assertEquals(locale34.toString(), "italiano");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "italiano" + "'", str37, "italiano");
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "italiano (italia)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: italiano (italia)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fra", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
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
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap33);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
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
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(languageRangeList34);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        java.lang.Object[] objArray1 = null;
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: italien (Italie)", objArray1, throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.probability(1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2991452991452851d + "'", double11 == 0.2991452991452851d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
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
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setLanguageTag("\u53f0\u6e7e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
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
        printWriter30.println((int) (short) 0);
        printWriter30.print(1L);
        printWriter30.print((int) (byte) 0);
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter((java.io.Writer) printWriter30, false);
        printWriter30.write((int) (short) 0);
        java.io.PrintWriter printWriter42 = printWriter30.append('#');
        boolean boolean43 = printWriter42.checkError();
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
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter9 = printWriter7.append(' ');
        char[] charArray12 = new char[] { 'x', 'a' };
        printWriter9.print(charArray12);
        printStream1.println(charArray12);
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter((java.io.OutputStream) printStream1, false);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter("fr");
        printWriter19.print("it_IT");
        java.util.Locale locale22 = java.util.Locale.ROOT;
        boolean boolean23 = locale22.hasExtensions();
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.lang.String str25 = locale22.getDisplayName(locale24);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        boolean boolean27 = locale26.hasExtensions();
        java.lang.String str28 = locale22.getDisplayCountry(locale26);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", objArray31);
        java.io.PrintWriter printWriter33 = printWriter19.printf(locale26, "it_IT", objArray31);
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter("fr");
        printWriter36.print("it_IT");
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray43 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", objArray43);
        java.lang.Throwable[] throwableArray45 = mathException44.getSuppressed();
        java.lang.Throwable[] throwableArray46 = mathException44.getSuppressed();
        java.io.PrintWriter printWriter47 = printWriter36.printf(locale40, "it_IT", (java.lang.Object[]) throwableArray46);
        java.io.PrintWriter printWriter48 = printWriter19.format("it_IT", (java.lang.Object[]) throwableArray46);
        java.io.PrintStream printStream49 = printStream1.printf("it_IT", (java.lang.Object[]) throwableArray46);
        printStream1.println(1.9394889923397905E-4d);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream55 = printStream1.append((java.lang.CharSequence) "deu (ANGLAIS,CA)", 35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -34");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(printWriter9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[x, a]");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(printWriter33);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(printWriter47);
        org.junit.Assert.assertNotNull(printWriter48);
        org.junit.Assert.assertNotNull(printStream49);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
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
        printWriter30.println((int) (short) 0);
        printWriter30.print(1L);
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter((java.io.Writer) printWriter30, false);
        printWriter30.print("org.apache.commons.math.MathException: cn");
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
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        printStream4.println('#');
        printStream4.println();
        printStream4.print("italien (Italie)");
        java.io.PrintStream printStream11 = new java.io.PrintStream((java.io.OutputStream) printStream4);
        printStream4.println('4');
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.util.Locale locale15 = java.util.Locale.JAPANESE;
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleKeys();
        java.lang.String str20 = locale17.getDisplayVariant(locale18);
        java.lang.String str21 = locale17.getDisplayLanguage();
        java.lang.String str22 = locale14.getDisplayVariant(locale17);
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
        java.io.PrintStream printStream41 = printStream4.printf(locale17, "JA", (java.lang.Object[]) throwableArray39);
        printStream41.close();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream45 = new java.io.PrintStream((java.io.OutputStream) printStream41, false, "japonais");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: japonais");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str21, "\u4e2d\u56fd\u8a9e");
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
        org.junit.Assert.assertNotNull(printStream41);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 10L);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double19 = hypergeometricDistributionImpl3.probability((int) (short) -1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(0.001354928450285685d);
        hypergeometricDistributionImpl3.setSampleSize(31);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(120);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize(32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 117 + "'", int13 == 117);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7008547008546866d + "'", double21 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter1.println((float) 'u');
        printWriter1.write("en-GB");
        printWriter1.println((java.lang.Object) 100L);
        printWriter1.println((double) (byte) 100);
        java.util.Locale locale16 = new java.util.Locale("Italy");
        java.lang.Object[] objArray18 = null;
        java.io.PrintWriter printWriter19 = printWriter1.format(locale16, "Italian", objArray18);
        printWriter1.print(26);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertEquals(locale16.toString(), "italy");
        org.junit.Assert.assertNotNull(printWriter19);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(file0, "\uc911\uad6d\uc5b4\uc911\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ???????? (??????)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        java.util.Locale locale1 = new java.util.Locale("deu (deu,italien)");
        org.junit.Assert.assertEquals(locale1.toString(), "deu (deu,italien)");
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        double double8 = hypergeometricDistributionImpl3.probability((double) 1);
        hypergeometricDistributionImpl3.setPopulationSize(117);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 119);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2991452991452851d + "'", double8 == 0.2991452991452851d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setVariant("anglais");
        java.util.Locale locale9 = builder8.build();
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter("fr");
        printWriter13.print("it_IT");
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.lang.String str19 = locale16.getDisplayName(locale18);
        java.util.Locale locale20 = java.util.Locale.ROOT;
        boolean boolean21 = locale20.hasExtensions();
        java.lang.String str22 = locale16.getDisplayCountry(locale20);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray25);
        java.io.PrintWriter printWriter27 = printWriter13.printf(locale20, "it_IT", objArray25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray25);
        java.lang.Object[] objArray29 = mathException28.getArguments();
        java.lang.Throwable[] throwableArray30 = mathException28.getSuppressed();
        java.io.PrintWriter printWriter31 = printWriter1.printf(locale9, "de", (java.lang.Object[]) throwableArray30);
        java.io.PrintWriter printWriter33 = new java.io.PrintWriter((java.io.Writer) printWriter31, false);
        java.util.Locale locale34 = java.util.Locale.ROOT;
        boolean boolean35 = locale34.hasExtensions();
        java.lang.String str36 = locale34.getCountry();
        java.util.Locale locale38 = new java.util.Locale("org.apache.commons.math.MathException");
        java.lang.String str39 = locale34.getDisplayCountry(locale38);
        java.lang.String str40 = locale38.getVariant();
        java.util.Locale locale41 = locale38.stripExtensions();
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        java.lang.String str44 = locale41.getExtension('x');
        printWriter31.println((java.lang.Object) str44);
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(printWriter27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale38.toString(), "org.apache.commons.math.mathexception");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "org.apache.commons.math.mathexception");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf(locale5, "it_IT", (java.lang.Object[]) throwableArray11);
        printWriter1.write("fr");
        java.io.PrintWriter printWriter15 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        java.io.PrintWriter printWriter17 = printWriter15.append('u');
        printWriter15.println((long) 2);
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter((java.io.Writer) printWriter15);
        printWriter15.close();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(printWriter17);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = new java.util.Locale("fr", "fr");
        java.lang.String str6 = locale5.getDisplayScript();
        java.util.Locale.setDefault(locale5);
        java.util.Locale.setDefault(category0, locale5);
        java.lang.String str9 = locale5.getDisplayScript();
        java.util.Locale locale10 = locale5.stripExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ITALY");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.util.Locale locale6 = new java.util.Locale("en-GB", "Italy");
        java.lang.String str7 = locale6.getCountry();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleAttributes();
        java.io.PrintStream printStream10 = new java.io.PrintStream("zh_CN");
        printStream10.println();
        java.io.PrintStream printStream13 = printStream10.append('#');
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter((java.io.OutputStream) printStream13);
        printStream13.println('#');
        printStream13.print("ja");
        java.io.PrintStream printStream20 = printStream13.append((java.lang.CharSequence) "org.apache.commons.math.MathException: ");
        printStream20.println();
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        java.util.Locale.Builder builder26 = builder24.setVariant("anglais");
        java.util.Locale locale27 = builder26.build();
        java.lang.String str28 = locale27.getLanguage();
        java.lang.String str29 = locale27.getDisplayVariant();
        java.lang.String str30 = locale27.getISO3Language();
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", objArray33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException34);
        java.lang.Object[] objArray37 = mathException36.getArguments();
        java.io.PrintStream printStream38 = printStream20.format(locale27, "French", objArray37);
        java.lang.String str39 = locale6.getDisplayLanguage(locale27);
        java.lang.String str40 = locale1.getDisplayName(locale6);
        java.lang.String str41 = locale6.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italy");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale6.toString(), "en-gb_ITALY");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITALY" + "'", str7, "ITALY");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(printStream13);
        org.junit.Assert.assertNotNull(printStream20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "anglais" + "'", str29, "anglais");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(printStream38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en-gb" + "'", str39, "en-gb");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "italy" + "'", str40, "italy");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "und" + "'", str41, "und");
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italian(italy)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
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
        java.io.PrintStream printStream35 = new java.io.PrintStream((java.io.OutputStream) printStream34);
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter((java.io.OutputStream) printStream35);
        printStream35.print((long) 87);
        printStream35.println('u');
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
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        java.util.Locale locale3 = new java.util.Locale("org.apache.commons.math.MathException: ALLEMAND (ALLEMAGNE)", "Germania", "Japanisch");
        org.junit.Assert.assertEquals(locale3.toString(), "org.apache.commons.math.mathexception: allemand (allemagne)_GERMANIA_Japanisch");
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("ita");
        java.util.Locale locale12 = java.util.Locale.JAPANESE;
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.lang.String str14 = locale12.getDisplayCountry(locale13);
        java.lang.String str15 = locale12.getVariant();
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = locale12.getDisplayScript(locale16);
        boolean boolean18 = locale12.hasExtensions();
        java.util.Locale.Builder builder19 = builder9.setLocale(locale12);
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.lang.String str23 = locale20.getVariant();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str25 = locale20.getDisplayScript(locale24);
        java.util.Locale locale28 = new java.util.Locale("Italy", "Italy");
        java.lang.String str29 = locale24.getDisplayLanguage(locale28);
        boolean boolean30 = locale24.hasExtensions();
        java.lang.String str31 = locale24.getISO3Language();
        boolean boolean32 = locale24.hasExtensions();
        java.util.Locale.Builder builder33 = builder9.setLocale(locale24);
        java.util.Locale.Builder builder34 = builder3.setLocale(locale24);
        java.util.Locale locale35 = java.util.Locale.JAPANESE;
        java.util.Locale locale36 = java.util.Locale.JAPANESE;
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.lang.String str38 = locale35.getVariant();
        java.util.Locale locale39 = java.util.Locale.CANADA;
        java.lang.String str40 = locale35.getDisplayScript(locale39);
        java.util.Locale locale41 = locale39.stripExtensions();
        java.util.Set<java.lang.Character> charSet42 = locale39.getExtensionKeys();
        java.lang.String str43 = locale24.getDisplayCountry(locale39);
        java.lang.String str44 = locale24.getLanguage();
        java.lang.String str45 = locale24.getDisplayLanguage();
        java.lang.String str46 = locale24.getDisplayScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale28.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "English" + "'", str29, "English");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "eng" + "'", str31, "eng");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_CA");
        org.junit.Assert.assertNotNull(charSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Canada" + "'", str43, "Canada");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "en" + "'", str44, "en");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "anglais" + "'", str45, "anglais");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        printWriter1.println('a');
        printWriter1.println((long) 0);
        printWriter1.print('a');
        printWriter1.print("ITALY");
        printWriter1.close();
        org.junit.Assert.assertNotNull(printWriter3);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
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
        java.lang.String str73 = locale55.getExtension('x');
        java.lang.String str74 = locale55.toString();
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
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getVariant();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayName(locale3);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder9 = builder7.setLanguage("Italia");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setRegion("\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ??? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        java.io.PrintStream printStream1 = new java.io.PrintStream("canada_CHINESE_Canada");
        java.io.PrintStream printStream3 = printStream1.append(' ');
        java.util.Locale locale5 = new java.util.Locale("\uc774\ud0c8\ub9ac\uc544\uc5b4\uc774\ud0c8\ub9ac\uc544)");
        java.io.PrintStream printStream8 = new java.io.PrintStream("zh_CN");
        printStream8.print((float) (byte) -1);
        printStream8.println();
        printStream8.println();
        java.io.PrintStream printStream14 = new java.io.PrintStream((java.io.OutputStream) printStream8, true);
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
        printStream8.print(charArray58);
        java.io.PrintWriter printWriter62 = new java.io.PrintWriter((java.io.OutputStream) printStream8);
        printStream8.print((int) (byte) -1);
        printStream8.println((float) 32);
        java.io.PrintStream printStream68 = printStream8.append((java.lang.CharSequence) "inglese (Stati Uniti)");
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException();
        java.lang.String str72 = mathException71.getPattern();
        java.lang.Object[] objArray73 = mathException71.getArguments();
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("de", (java.lang.Throwable) mathException71);
        java.lang.Object[] objArray75 = mathException74.getArguments();
        java.io.PrintStream printStream76 = printStream8.printf("Japanisch", objArray75);
        java.io.PrintStream printStream77 = printStream3.printf(locale5, "\u82f1\u8a9e", objArray75);
        printStream3.println(1.847264056867191E-7d);
        org.junit.Assert.assertNotNull(printStream3);
        org.junit.Assert.assertEquals(locale5.toString(), "\uc774\ud0c8\ub9ac\uc544\uc5b4\uc774\ud0c8\ub9ac\uc544)");
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
        org.junit.Assert.assertNotNull(printStream68);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertNotNull(printStream76);
        org.junit.Assert.assertNotNull(printStream77);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double14 = hypergeometricDistributionImpl3.probability((int) '4');
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(117);
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = mathException9.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf(locale5, "it_IT", (java.lang.Object[]) throwableArray11);
        printWriter1.write("fr");
        printWriter1.print(1.0f);
        java.lang.String[] strArray18 = java.util.Locale.getISOLanguages();
        java.io.PrintWriter printWriter19 = printWriter1.format("ita", (java.lang.Object[]) strArray18);
        printWriter19.print((double) 100L);
        java.io.PrintStream printStream23 = new java.io.PrintStream("zh_CN");
        printStream23.print((float) (byte) -1);
        printStream23.println();
        printStream23.println();
        printStream23.println((float) ' ');
        printStream23.print((long) 'u');
        printStream23.println();
        printStream23.print(' ');
        printStream23.println("zh_TW");
        printWriter19.println((java.lang.Object) printStream23);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(printWriter19);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        char[] charArray6 = new char[] { 'x', 'u' };
        printStream1.println(charArray6);
        printStream1.println(0);
        printStream1.println((float) (byte) 10);
        printStream1.print((float) 34);
        printStream1.print("Frankreich");
        printStream1.println(1.0d);
        printStream1.println("ALLEMAND (ALLEMAGNE)");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[x, u]");
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        java.io.PrintStream printStream3 = new java.io.PrintStream("zh_CN");
        printStream3.print((float) (byte) -1);
        printStream3.println();
        printStream3.print("ita");
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray14);
        java.lang.Throwable[] throwableArray16 = mathException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = mathException15.getSuppressed();
        java.io.PrintStream printStream18 = printStream3.printf(locale11, "fr", (java.lang.Object[]) throwableArray17);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", objArray20);
        java.lang.Object[] objArray22 = mathException21.getArguments();
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("italien (Italie)", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) mathException21);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray25);
        java.lang.Object[] objArray27 = mathException26.getArguments();
        mathException21.addSuppressed((java.lang.Throwable) mathException26);
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException(throwable29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException31);
        mathException21.addSuppressed((java.lang.Throwable) mathException32);
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", objArray37);
        java.lang.Object[] objArray39 = mathException38.getArguments();
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", objArray41);
        java.lang.Throwable[] throwableArray43 = mathException42.getSuppressed();
        mathException38.addSuppressed((java.lang.Throwable) mathException42);
        java.lang.Throwable[] throwableArray45 = mathException38.getSuppressed();
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException();
        java.lang.String str47 = mathException46.getPattern();
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray45, (java.lang.Throwable) mathException46);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray45);
        mathException21.addSuppressed((java.lang.Throwable) mathException49);
        java.lang.Object[] objArray53 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", objArray53);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException54);
        java.lang.Object[] objArray56 = mathException55.getArguments();
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("fran\347ais (France)", (java.lang.Throwable) mathException55);
        mathException49.addSuppressed((java.lang.Throwable) mathException57);
        java.lang.String str59 = mathException57.getPattern();
        java.lang.String str60 = mathException57.getPattern();
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("_ZH_CN", (java.lang.Throwable) mathException57);
        java.lang.String str62 = mathException57.toString();
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(printStream18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "fran\347ais (France)" + "'", str59, "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "fran\347ais (France)" + "'", str60, "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "org.apache.commons.math.MathException: fran\347ais (France)" + "'", str62, "org.apache.commons.math.MathException: fran\347ais (France)");
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream1.write(byteArray10);
        printStream1.print(false);
        printStream1.println("Italy");
        java.io.PrintStream printStream17 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        java.lang.Object[] objArray19 = null;
        java.io.PrintStream printStream20 = printStream17.printf("japonais", objArray19);
        printStream17.print('4');
        printStream17.print(' ');
        java.io.PrintStream printStream25 = new java.io.PrintStream((java.io.OutputStream) printStream17);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(printStream20);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
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
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.lang.String str20 = locale16.getDisplayName(locale18);
        java.util.Locale locale21 = locale16.stripExtensions();
        java.lang.String str22 = locale16.toLanguageTag();
        java.util.Set<java.lang.Character> charSet23 = locale16.getExtensionKeys();
        java.lang.String str24 = locale16.getDisplayVariant();
        java.lang.String str25 = locale16.getDisplayScript();
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = locale16.getDisplayLanguage(locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italien (Italie)" + "'", str8, "italien (Italie)");
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
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str20, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "it-IT" + "'", str22, "it-IT");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.io.PrintStream printStream5 = new java.io.PrintStream("zh_CN");
        printStream5.print((float) (byte) -1);
        printStream5.println();
        printStream5.println();
        java.io.PrintStream printStream11 = new java.io.PrintStream((java.io.OutputStream) printStream5, true);
        printStream5.println();
        printStream5.print((-1));
        boolean boolean15 = printStream5.checkError();
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.lang.String str19 = locale16.getDisplayName(locale18);
        java.util.Locale locale20 = java.util.Locale.ROOT;
        boolean boolean21 = locale20.hasExtensions();
        java.lang.String str22 = locale16.getDisplayCountry(locale20);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException();
        java.lang.String str25 = mathException24.getPattern();
        java.lang.Object[] objArray26 = mathException24.getArguments();
        java.io.PrintStream printStream27 = printStream5.format(locale20, "Chinese (China)", objArray26);
        java.util.Locale.Builder builder28 = builder1.setLocale(locale20);
        java.util.Locale.Builder builder30 = builder1.addUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder32 = builder30.setVariant("Italia");
        java.util.Locale.Builder builder35 = builder32.setExtension('u', "Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder38 = builder35.setUnicodeLocaleKeyword("ORG.APACHE.COMMONS.MATH.MATHEXCEPTION: TWN", "Deutsch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ORG.APACHE.COMMONS.MATH.MATHEXCEPTION: TWN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(printStream27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("fr");
        printWriter5.print("it_IT");
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter10 = printWriter5.printf("fr", objArray9);
        printWriter5.println((float) 'u');
        printStream1.print((java.lang.Object) 'u');
        printStream1.println(0L);
        printStream1.print('a');
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.OutputStream) printStream1, true);
        printWriter19.flush();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        java.util.Locale.Builder builder24 = builder21.setScript("");
        java.util.Locale.Builder builder26 = builder21.setScript("");
        java.util.Locale.Builder builder27 = builder21.clear();
        java.util.Locale.Builder builder28 = builder21.clear();
        java.util.Locale locale29 = java.util.Locale.UK;
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.lang.String str31 = locale29.getDisplayScript(locale30);
        java.lang.String str32 = locale30.getDisplayScript();
        java.util.Locale.Builder builder33 = builder28.setLocale(locale30);
        java.util.Set<java.lang.Character> charSet34 = locale30.getExtensionKeys();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("italiano (Italia)");
        java.lang.Object[] objArray38 = mathException37.getArguments();
        java.io.PrintWriter printWriter39 = printWriter19.format(locale30, "\uc77c\ubcf8\uc5b4 (ja)", objArray38);
        java.io.PrintWriter printWriter40 = new java.io.PrintWriter((java.io.Writer) printWriter39);
        boolean boolean41 = printWriter39.checkError();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(printWriter39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
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
        printWriter1.print(1L);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter("fr");
        printWriter22.print("it_IT");
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray29);
        java.lang.Throwable[] throwableArray31 = mathException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = mathException30.getSuppressed();
        java.io.PrintWriter printWriter33 = printWriter22.printf(locale26, "it_IT", (java.lang.Object[]) throwableArray32);
        printWriter22.print('x');
        printWriter22.print('4');
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", objArray40);
        java.lang.Throwable[] throwableArray42 = mathException41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = mathException41.getSuppressed();
        java.io.PrintWriter printWriter44 = printWriter22.printf("fr_CA", (java.lang.Object[]) throwableArray43);
        java.io.PrintWriter printWriter45 = printWriter19.printf("german (germany) (FRENCH,italiano)", (java.lang.Object[]) throwableArray43);
        java.io.PrintWriter printWriter46 = new java.io.PrintWriter((java.io.Writer) printWriter19);
        printWriter19.print(false);
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
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(printWriter33);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(printWriter45);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'u');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(1);
        hypergeometricDistributionImpl3.setSampleSize(12);
        hypergeometricDistributionImpl3.setPopulationSize(43);
        hypergeometricDistributionImpl3.setSampleSize(117);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
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
        printWriter1.println('#');
        printWriter1.println((float) 10L);
        printWriter1.println('u');
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
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        java.util.Locale locale1 = new java.util.Locale("GB");
        org.junit.Assert.assertEquals(locale1.toString(), "gb");
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
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
        printWriter1.println((float) (-1));
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl22 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int23 = hypergeometricDistributionImpl22.getPopulationSize();
        double double25 = hypergeometricDistributionImpl22.cumulativeProbability((int) (short) 100);
        int int26 = hypergeometricDistributionImpl22.getPopulationSize();
        double double29 = hypergeometricDistributionImpl22.cumulativeProbability(0, (int) 'a');
        double double31 = hypergeometricDistributionImpl22.cumulativeProbability((int) (short) 10);
        hypergeometricDistributionImpl22.setNumberOfSuccesses((int) (byte) 1);
        double double35 = hypergeometricDistributionImpl22.cumulativeProbability((int) (byte) 1);
        hypergeometricDistributionImpl22.setNumberOfSuccesses((int) (byte) 10);
        printWriter1.println((java.lang.Object) hypergeometricDistributionImpl22);
        int int39 = hypergeometricDistributionImpl22.getSampleSize();
        hypergeometricDistributionImpl22.setSampleSize(97);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 117 + "'", int23 == 117);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 117 + "'", int26 == 117);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter9 = printWriter7.append(' ');
        char[] charArray12 = new char[] { 'x', 'a' };
        printWriter9.print(charArray12);
        printStream1.println(charArray12);
        java.io.PrintStream printStream17 = new java.io.PrintStream("zh_CN");
        printStream17.print((float) (byte) -1);
        printStream17.println();
        printStream17.println();
        java.io.PrintStream printStream23 = new java.io.PrintStream((java.io.OutputStream) printStream17, true);
        printStream17.println();
        printStream17.print((-1));
        java.io.PrintStream printStream28 = new java.io.PrintStream("zh_CN");
        printStream28.println();
        java.io.PrintStream printStream31 = printStream28.append('#');
        printStream28.close();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream28.write(byteArray36);
        printStream17.write(byteArray36);
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("italien");
        java.io.PrintWriter printWriter44 = new java.io.PrintWriter("fr");
        printWriter44.print("it_IT");
        java.util.Locale locale47 = java.util.Locale.ROOT;
        boolean boolean48 = locale47.hasExtensions();
        java.util.Locale locale49 = java.util.Locale.ROOT;
        java.lang.String str50 = locale47.getDisplayName(locale49);
        java.util.Locale locale51 = java.util.Locale.ROOT;
        boolean boolean52 = locale51.hasExtensions();
        java.lang.String str53 = locale47.getDisplayCountry(locale51);
        java.lang.Object[] objArray56 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", objArray56);
        java.io.PrintWriter printWriter58 = printWriter44.printf(locale51, "it_IT", objArray56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("", objArray56);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException59);
        java.lang.Object[] objArray61 = mathException59.getArguments();
        java.io.PrintStream printStream62 = printStream17.printf(locale40, "it_IT", objArray61);
        java.io.PrintStream printStream63 = printStream1.format("Chinesisch (Taiwan)", objArray61);
        printStream63.println(true);
        java.io.PrintStream printStream67 = new java.io.PrintStream((java.io.OutputStream) printStream63, false);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(printWriter9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[x, a]");
        org.junit.Assert.assertNotNull(printStream31);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "italien");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNotNull(printWriter58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNotNull(printStream62);
        org.junit.Assert.assertNotNull(printStream63);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category4, locale5);
        java.lang.String str7 = locale5.getScript();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("fr");
        java.util.Locale locale12 = builder11.build();
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale5.getDisplayScript(locale12);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale5.getDisplayCountry(locale15);
        java.lang.String str17 = locale15.getDisplayVariant();
        java.lang.String str18 = locale0.getDisplayScript(locale15);
        java.lang.String str19 = locale15.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str20, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "\u53f0\u6e7e");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ??");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.probability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'u');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, 0.44444444444442294d);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(117);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1, 0.15590747020451431d);
        double double20 = hypergeometricDistributionImpl3.probability(27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7008547008546866d + "'", double6 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7008547008546866d + "'", double12 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 117 + "'", int13 == 117);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.7008547008546866d + "'", double18 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 10L);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0.8290598290598294d);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.6500000000000139d);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.8547008547008489d);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(87);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7008547008546866d + "'", double14 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
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
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter("fr");
        printWriter36.print("it_IT");
        java.util.Locale locale39 = java.util.Locale.ROOT;
        boolean boolean40 = locale39.hasExtensions();
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.lang.String str42 = locale39.getDisplayName(locale41);
        java.util.Locale locale43 = java.util.Locale.ROOT;
        boolean boolean44 = locale43.hasExtensions();
        java.lang.String str45 = locale39.getDisplayCountry(locale43);
        java.lang.Object[] objArray48 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", objArray48);
        java.io.PrintWriter printWriter50 = printWriter36.printf(locale43, "it_IT", objArray48);
        java.io.PrintWriter printWriter53 = new java.io.PrintWriter("fr");
        printWriter53.print("it_IT");
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray60 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!", objArray60);
        java.lang.Throwable[] throwableArray62 = mathException61.getSuppressed();
        java.lang.Throwable[] throwableArray63 = mathException61.getSuppressed();
        java.io.PrintWriter printWriter64 = printWriter53.printf(locale57, "it_IT", (java.lang.Object[]) throwableArray63);
        java.io.PrintWriter printWriter65 = printWriter36.format("it_IT", (java.lang.Object[]) throwableArray63);
        java.io.PrintWriter printWriter67 = printWriter36.append('u');
        printWriter36.print((int) (byte) -1);
        java.io.PrintStream printStream71 = new java.io.PrintStream("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        java.io.PrintWriter printWriter73 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter75 = printWriter73.append(' ');
        char[] charArray78 = new char[] { 'x', 'a' };
        printWriter75.print(charArray78);
        printStream71.print(charArray78);
        printWriter36.println(charArray78);
        printStream34.println(charArray78);
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
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(printWriter50);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(printWriter64);
        org.junit.Assert.assertNotNull(printWriter65);
        org.junit.Assert.assertNotNull(printWriter67);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[x, a]");
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getUnicodeLocaleType("CA");
        java.lang.String str5 = locale0.getDisplayName();
        boolean boolean6 = locale0.hasExtensions();
        java.util.Locale locale7 = locale0.stripExtensions();
        java.io.PrintStream printStream9 = new java.io.PrintStream("zh_CN");
        printStream9.print((float) (byte) -1);
        printStream9.println();
        printStream9.println();
        java.io.PrintStream printStream15 = new java.io.PrintStream((java.io.OutputStream) printStream9, true);
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
        printStream15.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream34 = printStream15.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream35 = new java.io.PrintStream((java.io.OutputStream) printStream15);
        printStream15.println("");
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder38.clearExtensions();
        java.util.Locale.Builder builder41 = builder39.setLanguageTag("fr");
        java.util.Locale locale42 = builder41.build();
        java.util.Locale.Builder builder43 = builder41.clearExtensions();
        printStream15.print((java.lang.Object) builder43);
        java.util.Locale.Builder builder45 = builder43.clear();
        java.util.Locale locale46 = builder45.build();
        java.lang.String str47 = locale7.getDisplayCountry(locale46);
        java.util.Set<java.lang.Character> charSet48 = locale7.getExtensionKeys();
        java.util.Locale.Category category49 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale50 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category49, locale50);
        java.util.Locale locale52 = java.util.Locale.getDefault(category49);
        java.util.Locale locale53 = java.util.Locale.ITALY;
        java.util.Locale locale54 = java.util.Locale.ROOT;
        boolean boolean55 = locale54.hasExtensions();
        java.lang.String str56 = locale53.getDisplayCountry(locale54);
        java.util.Locale locale59 = new java.util.Locale("Italy", "anglais");
        java.lang.String str60 = locale54.getDisplayName(locale59);
        java.util.Locale.setDefault(category49, locale59);
        java.util.Locale locale62 = java.util.Locale.ITALY;
        java.util.Locale locale63 = java.util.Locale.ROOT;
        boolean boolean64 = locale63.hasExtensions();
        java.lang.String str65 = locale62.getDisplayCountry(locale63);
        java.util.Locale locale68 = new java.util.Locale("Italy", "anglais");
        java.lang.String str69 = locale63.getDisplayName(locale68);
        java.util.Locale locale70 = locale68.stripExtensions();
        java.util.Locale.setDefault(category49, locale68);
        java.util.Locale locale72 = java.util.Locale.getDefault(category49);
        java.io.PrintWriter printWriter74 = new java.io.PrintWriter("fr");
        printWriter74.print("it_IT");
        java.util.Locale locale78 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray81 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("hi!", objArray81);
        java.lang.Throwable[] throwableArray83 = mathException82.getSuppressed();
        java.lang.Throwable[] throwableArray84 = mathException82.getSuppressed();
        java.io.PrintWriter printWriter85 = printWriter74.printf(locale78, "it_IT", (java.lang.Object[]) throwableArray84);
        java.util.Locale locale86 = java.util.Locale.KOREAN;
        java.lang.String str87 = locale78.getDisplayScript(locale86);
        java.util.Locale.setDefault(category49, locale78);
        java.lang.String str89 = locale7.getDisplayVariant(locale78);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e" + "'", str5, "\u30c9\u30a4\u30c4\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
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
        org.junit.Assert.assertNotNull(printStream34);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charSet48);
        org.junit.Assert.assertTrue("'" + category49 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category49.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ja");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ja");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Italy" + "'", str56, "Italy");
        org.junit.Assert.assertEquals(locale59.toString(), "italy_ANGLAIS");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Italy" + "'", str65, "Italy");
        org.junit.Assert.assertEquals(locale68.toString(), "italy_ANGLAIS");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "italy_ANGLAIS");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "italy_ANGLAIS");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(printWriter85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
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
        java.io.PrintStream printStream84 = printStream82.append((java.lang.CharSequence) "fra");
        printStream84.println(10);
        printStream84.println((int) 'x');
        printStream84.println("inglese (Canada)");
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
        org.junit.Assert.assertNotNull(printStream84);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException(throwable2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray5, throwable6);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: Chinesisch (Taiwan)");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("coreano", objArray8, (java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale3.getDisplayLanguage(locale4);
        java.util.Locale.Builder builder7 = builder2.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ??? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ita" + "'", str5, "ita");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tedesco" + "'", str6, "tedesco");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.MathException: English");
        printStream1.println(1L);
        java.io.PrintStream printStream7 = printStream1.append((java.lang.CharSequence) "German (Germany)", (int) (short) 1, (int) (byte) 1);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter((java.io.OutputStream) printStream7, true);
        printStream7.println((long) (short) 100);
        printStream7.flush();
        java.io.PrintStream printStream13 = new java.io.PrintStream((java.io.OutputStream) printStream7);
        java.io.PrintStream printStream15 = new java.io.PrintStream((java.io.OutputStream) printStream13, true);
        org.junit.Assert.assertNotNull(printStream7);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
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
        printWriter1.close();
        printWriter1.println(true);
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
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
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
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray22);
        java.lang.Object[] objArray24 = mathException23.getArguments();
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", objArray26);
        java.lang.Throwable[] throwableArray28 = mathException27.getSuppressed();
        mathException23.addSuppressed((java.lang.Throwable) mathException27);
        java.lang.Throwable[] throwableArray30 = mathException23.getSuppressed();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException();
        java.lang.String str32 = mathException31.getPattern();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray30, (java.lang.Throwable) mathException31);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", objArray36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("fr", objArray36);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("it_IT", (java.lang.Object[]) throwableArray30, (java.lang.Throwable) mathException38);
        java.io.PrintWriter printWriter40 = printWriter15.printf("italy", (java.lang.Object[]) throwableArray30);
        printWriter40.print(false);
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
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(printWriter40);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.14529914529914542d, (double) (byte) 10);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability(4);
        hypergeometricDistributionImpl3.setPopulationSize(17);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2991452991452851d + "'", double11 == 0.2991452991452851d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2991452991452851d + "'", double14 == 0.2991452991452851d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2991452991453134d + "'", double17 == 0.2991452991453134d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
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
        printWriter1.print(1L);
        printWriter1.println("");
        printWriter1.close();
        printWriter1.flush();
        printWriter1.write((int) '#');
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
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        java.io.PrintStream printStream3 = new java.io.PrintStream("zh_CN");
        printStream3.print((float) (byte) -1);
        printStream3.println();
        printStream3.println();
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream3, true);
        printStream3.println();
        printStream3.print((-1));
        java.io.PrintStream printStream15 = new java.io.PrintStream("zh_CN");
        printStream15.println();
        java.io.PrintStream printStream18 = printStream15.append('#');
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter((java.io.OutputStream) printStream15, true);
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter((java.io.OutputStream) printStream15, false);
        printWriter22.print((int) (byte) 100);
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.lang.String str29 = locale28.getISO3Language();
        boolean boolean30 = locale28.hasExtensions();
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
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("", objArray46);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException49);
        java.lang.Object[] objArray51 = mathException49.getArguments();
        java.io.PrintWriter printWriter52 = printWriter22.format(locale28, "ITA", objArray51);
        java.io.PrintStream printStream53 = printStream3.format("org.apache.commons.math.MathException: anglais", objArray51);
        java.lang.Throwable throwable55 = null;
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException(throwable55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException56);
        java.lang.String str59 = mathException58.getPattern();
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException58);
        java.lang.Throwable[] throwableArray61 = mathException58.getSuppressed();
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("Regno Unito", objArray51, (java.lang.Throwable) mathException58);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("deu-x-lvariant-CA", (java.lang.Throwable) mathException58);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException63);
        org.junit.Assert.assertNotNull(printStream18);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
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
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(printWriter52);
        org.junit.Assert.assertNotNull(printStream53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double11 = hypergeometricDistributionImpl3.probability((double) 10L);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 117 + "'", int13 == 117);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("\u30ab\u30ca\u30c0");
        printWriter1.println((float) (byte) 1);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("org.apache.commons.math.MathException");
        java.util.Locale locale5 = new java.util.Locale("ja", "", "ja");
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale5.getDisplayCountry(locale6);
        java.util.Set<java.lang.Character> charSet9 = locale5.getExtensionKeys();
        java.lang.String str10 = locale5.getISO3Language();
        printWriter1.println((java.lang.Object) locale5);
        java.lang.String str12 = locale5.toLanguageTag();
        org.junit.Assert.assertEquals(locale5.toString(), "ja__ja");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "jpn" + "'", str10, "jpn");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ja-x-lvariant-ja" + "'", str12, "ja-x-lvariant-ja");
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("ita");
        java.util.Locale locale12 = java.util.Locale.JAPANESE;
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.lang.String str14 = locale12.getDisplayCountry(locale13);
        java.lang.String str15 = locale12.getVariant();
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = locale12.getDisplayScript(locale16);
        boolean boolean18 = locale12.hasExtensions();
        java.util.Locale.Builder builder19 = builder9.setLocale(locale12);
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.lang.String str23 = locale20.getVariant();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str25 = locale20.getDisplayScript(locale24);
        java.util.Locale locale28 = new java.util.Locale("Italy", "Italy");
        java.lang.String str29 = locale24.getDisplayLanguage(locale28);
        boolean boolean30 = locale24.hasExtensions();
        java.lang.String str31 = locale24.getISO3Language();
        boolean boolean32 = locale24.hasExtensions();
        java.util.Locale.Builder builder33 = builder9.setLocale(locale24);
        java.util.Locale.Builder builder34 = builder3.setLocale(locale24);
        java.util.Locale.Builder builder35 = builder3.clear();
        java.util.Locale.Builder builder36 = builder3.clear();
        java.util.Locale.Builder builder38 = builder36.setLanguage("CAN");
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        java.util.Locale locale40 = java.util.Locale.JAPANESE;
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.lang.String str42 = locale39.getVariant();
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.lang.String str44 = locale39.getDisplayScript(locale43);
        java.util.Locale.Builder builder45 = builder36.setLocale(locale39);
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("uni");
        java.lang.String str48 = locale39.getDisplayCountry(locale47);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale28.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "English" + "'", str29, "English");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "eng" + "'", str31, "eng");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "uni");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double17 = hypergeometricDistributionImpl3.probability(0.08547008547008297d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        java.util.Locale locale3 = new java.util.Locale("org.apache.commons.math.MathException", "tedesco", "fra");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "org.apache.commons.math.mathexception_TEDESCO_fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra" + "'", str4, "fra");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category1);
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayName(locale3);
        java.lang.String str7 = locale0.getCountry();
        java.util.Locale locale9 = new java.util.Locale("org.apache.commons.math.MathException: chinois");
        java.lang.String str10 = locale0.getDisplayLanguage(locale9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cinese (Taiwan)" + "'", str6, "cinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TW" + "'", str7, "TW");
        org.junit.Assert.assertEquals(locale9.toString(), "org.apache.commons.math.mathexception: chinois");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese" + "'", str10, "Chinese");
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getVariant();
        boolean boolean3 = locale0.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        java.util.Locale locale2 = new java.util.Locale("fr", "fr");
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.lang.String str9 = locale2.getDisplayVariant(locale8);
        java.util.Locale locale10 = locale2.stripExtensions();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category11, locale12);
        java.util.Locale locale15 = java.util.Locale.getDefault(category11);
        java.util.Locale locale16 = java.util.Locale.getDefault(category11);
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category11, locale17);
        java.lang.String str20 = locale2.getDisplayCountry(locale17);
        java.lang.String str21 = locale17.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u6cd5\u570b" + "'", str20, "\u6cd5\u570b");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        java.util.Locale locale3 = new java.util.Locale("tedesco", "ja", "italien (Italie)");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter("fr");
        printWriter7.print("it_IT");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray14);
        java.lang.Throwable[] throwableArray16 = mathException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = mathException15.getSuppressed();
        java.io.PrintWriter printWriter18 = printWriter7.printf(locale11, "it_IT", (java.lang.Object[]) throwableArray17);
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.lang.String str20 = locale11.getDisplayScript(locale19);
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale11.getDisplayCountry(locale21);
        java.lang.String str23 = locale5.getDisplayCountry(locale11);
        java.util.Set<java.lang.Character> charSet24 = locale5.getExtensionKeys();
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Locale locale26 = java.util.Locale.JAPANESE;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.lang.String str28 = locale25.getVariant();
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.lang.String str30 = locale25.getDisplayScript(locale29);
        java.util.Set<java.lang.Character> charSet31 = locale29.getExtensionKeys();
        java.lang.String str32 = locale29.getDisplayLanguage();
        java.lang.String str33 = locale29.getDisplayCountry();
        java.util.Locale locale36 = new java.util.Locale("en-GB", "Italy");
        java.lang.String str37 = locale36.toLanguageTag();
        java.util.Locale.Category category38 = java.util.Locale.Category.FORMAT;
        java.io.PrintWriter printWriter40 = new java.io.PrintWriter("fr");
        printWriter40.write("hi!");
        printWriter40.println((java.lang.Object) (-1L));
        java.util.Locale locale45 = java.util.Locale.ITALY;
        java.lang.String str46 = locale45.getDisplayName();
        java.lang.Object[] objArray49 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("hi!", objArray49);
        java.lang.Object[] objArray51 = mathException50.getArguments();
        java.io.PrintWriter printWriter52 = printWriter40.format(locale45, "anglais", objArray51);
        java.util.Locale.setDefault(category38, locale45);
        java.util.Locale locale54 = java.util.Locale.getDefault(category38);
        java.util.Locale locale55 = java.util.Locale.JAPANESE;
        java.util.Locale locale56 = java.util.Locale.JAPANESE;
        java.lang.String str57 = locale55.getDisplayCountry(locale56);
        java.lang.String str58 = locale54.getDisplayName(locale56);
        java.lang.String str59 = locale36.getDisplayLanguage(locale54);
        java.lang.String str60 = locale29.getDisplayName(locale54);
        java.lang.String str61 = locale5.getDisplayCountry(locale54);
        java.lang.String str62 = locale3.getDisplayVariant(locale54);
        java.lang.String str63 = locale54.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "tedesco_JA_italien (Italie)");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(printWriter18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "anglais" + "'", str32, "anglais");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Canada" + "'", str33, "Canada");
        org.junit.Assert.assertEquals(locale36.toString(), "en-gb_ITALY");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "und" + "'", str37, "und");
        org.junit.Assert.assertTrue("'" + category38 + "' != '" + java.util.Locale.Category.FORMAT + "'", category38.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "italien (Italie)" + "'", str46, "italien (Italie)");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(printWriter52);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ja");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str58, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "en-gb" + "'", str59, "en-gb");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "inglese (Canada)" + "'", str60, "inglese (Canada)");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "italien (Italie)" + "'", str62, "italien (Italie)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("chinois", 0.0d);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
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
        printStream1.print((int) (byte) -1);
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.OutputStream) printStream1, true);
        java.io.PrintStream printStream61 = printStream1.append((java.lang.CharSequence) "cinese");
        java.util.Locale locale65 = new java.util.Locale("it_IT", "giapponese", "fr-ca");
        java.lang.String str66 = locale65.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet67 = locale65.getExtensionKeys();
        java.lang.String str68 = locale65.getDisplayLanguage();
        java.util.Locale.setDefault(locale65);
        printStream61.println((java.lang.Object) locale65);
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
        org.junit.Assert.assertNotNull(printStream61);
        org.junit.Assert.assertEquals(locale65.toString(), "it_it_GIAPPONESE_fr-ca");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "fr-ca" + "'", str66, "fr-ca");
        org.junit.Assert.assertNotNull(charSet67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "it_it" + "'", str68, "it_it");
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setPopulationSize(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
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
        printWriter30.write((int) (byte) 0);
        java.lang.Object[] objArray34 = null;
        java.io.PrintWriter printWriter35 = printWriter30.printf("CA", objArray34);
        boolean boolean36 = printWriter35.checkError();
        printWriter35.close();
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
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
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
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        printWriter22.write((int) (byte) 100);
        printWriter22.println(true);
        printWriter22.println();
        printWriter22.println();
        printWriter22.println(0.0d);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("FR");
        java.lang.Throwable[] throwableArray33 = mathException32.getSuppressed();
        printWriter22.println((java.lang.Object) throwableArray33);
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter("hi!_ITALY");
        java.util.Locale locale41 = new java.util.Locale("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", "de", "");
        java.io.PrintStream printStream44 = new java.io.PrintStream("zh_CN");
        printStream44.println();
        java.io.PrintStream printStream47 = printStream44.append('#');
        printStream44.close();
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream44.write(byteArray53);
        printStream44.print(false);
        printStream44.println("Italy");
        java.io.PrintStream printStream60 = new java.io.PrintStream("zh_CN");
        printStream60.println((float) (-1));
        java.io.PrintStream printStream64 = new java.io.PrintStream("zh_CN");
        printStream64.println();
        java.io.PrintStream printStream67 = printStream64.append('#');
        printStream64.close();
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream64.write(byteArray73);
        printStream60.write(byteArray73);
        printStream44.write(byteArray73);
        printStream44.println((double) (-1));
        printStream44.close();
        java.io.PrintWriter printWriter82 = new java.io.PrintWriter("fr");
        printWriter82.print("it_IT");
        java.util.Locale locale85 = java.util.Locale.ROOT;
        boolean boolean86 = locale85.hasExtensions();
        java.util.Locale locale87 = java.util.Locale.ROOT;
        java.lang.String str88 = locale85.getDisplayName(locale87);
        java.util.Locale locale89 = java.util.Locale.ROOT;
        boolean boolean90 = locale89.hasExtensions();
        java.lang.String str91 = locale85.getDisplayCountry(locale89);
        java.lang.Object[] objArray94 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException95 = new org.apache.commons.math.MathException("hi!", objArray94);
        java.io.PrintWriter printWriter96 = printWriter82.printf(locale89, "it_IT", objArray94);
        java.io.PrintStream printStream97 = printStream44.format("zh_cn", objArray94);
        java.io.PrintWriter printWriter98 = printWriter37.format(locale41, "org.apache.commons.math.MathException: francese", objArray94);
        java.io.PrintWriter printWriter99 = printWriter22.format("Italienisch (Italien)", objArray94);
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
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals(locale41.toString(), "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)_DE");
        org.junit.Assert.assertNotNull(printStream47);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(printStream67);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray94), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray94), "[]");
        org.junit.Assert.assertNotNull(printWriter96);
        org.junit.Assert.assertNotNull(printStream97);
        org.junit.Assert.assertNotNull(printWriter98);
        org.junit.Assert.assertNotNull(printWriter99);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str2 = locale0.getExtension('u');
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.lang.String str5 = locale0.getExtension('a');
        java.lang.String str6 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet7 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CHN" + "'", str6, "CHN");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, 120);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 34, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        printStream1.println((float) ' ');
        printStream1.println("hi!");
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.OutputStream) printStream1, true);
        printStream1.close();
        printStream1.print('#');
        java.io.PrintStream printStream15 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        printStream1.println(false);
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.lang.String str19 = locale18.getVariant();
        java.lang.String str20 = locale18.toLanguageTag();
        java.lang.String str21 = locale18.getISO3Country();
        java.util.Locale locale24 = new java.util.Locale("zh_TW", "CN");
        java.lang.String str25 = locale18.getDisplayScript(locale24);
        java.io.PrintStream printStream28 = new java.io.PrintStream("zh_CN");
        printStream28.print((float) (byte) -1);
        printStream28.println();
        printStream28.println();
        printStream28.println((float) ' ');
        printStream28.println("hi!");
        printStream28.println('4');
        printStream28.println(true);
        printStream28.print('4');
        java.io.PrintWriter printWriter46 = new java.io.PrintWriter("fr");
        printWriter46.print("it_IT");
        java.util.Locale locale49 = java.util.Locale.ROOT;
        boolean boolean50 = locale49.hasExtensions();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.lang.String str52 = locale49.getDisplayName(locale51);
        java.util.Locale locale53 = java.util.Locale.ROOT;
        boolean boolean54 = locale53.hasExtensions();
        java.lang.String str55 = locale49.getDisplayCountry(locale53);
        java.lang.Object[] objArray58 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("hi!", objArray58);
        java.io.PrintWriter printWriter60 = printWriter46.printf(locale53, "it_IT", objArray58);
        java.io.PrintWriter printWriter63 = new java.io.PrintWriter("fr");
        printWriter63.print("it_IT");
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray70 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("hi!", objArray70);
        java.lang.Throwable[] throwableArray72 = mathException71.getSuppressed();
        java.lang.Throwable[] throwableArray73 = mathException71.getSuppressed();
        java.io.PrintWriter printWriter74 = printWriter63.printf(locale67, "it_IT", (java.lang.Object[]) throwableArray73);
        java.io.PrintWriter printWriter75 = printWriter46.format("it_IT", (java.lang.Object[]) throwableArray73);
        java.util.Locale locale76 = java.util.Locale.JAPANESE;
        java.util.Locale locale77 = java.util.Locale.JAPANESE;
        java.lang.String str78 = locale76.getDisplayCountry(locale77);
        java.lang.String str79 = locale76.getVariant();
        java.lang.String str80 = locale76.getCountry();
        java.lang.String[] strArray82 = java.util.Locale.getISOCountries();
        java.io.PrintWriter printWriter83 = printWriter46.format(locale76, "fr-CA", (java.lang.Object[]) strArray82);
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("ANGLAIS", (java.lang.Object[]) strArray82);
        java.io.PrintStream printStream85 = printStream28.printf("English", (java.lang.Object[]) strArray82);
        java.io.PrintStream printStream86 = printStream1.format(locale18, "kor", (java.lang.Object[]) strArray82);
        printStream1.flush();
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "de" + "'", str20, "de");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale24.toString(), "zh_tw_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(printWriter60);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(printWriter74);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ja");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(printWriter83);
        org.junit.Assert.assertNotNull(printStream85);
        org.junit.Assert.assertNotNull(printStream86);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("jpn");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.Object obj3 = null;
        boolean boolean4 = languageRange1.equals(obj3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        java.util.Locale locale2 = new java.util.Locale("\u30a4\u30ae\u30ea\u30b9", "ita");
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str4 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "\u30a4\u30ae\u30ea\u30b9_ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream1.write(byteArray9);
        printStream1.write((int) 'a');
        printStream1.println((int) (short) 100);
        printStream1.print(false);
        printStream1.flush();
        printStream1.print((double) '#');
        printStream1.print(0);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale.Builder builder25 = builder23.setLanguageTag("fr");
        java.util.Locale.Builder builder27 = builder25.setLanguageTag("fr-CA");
        java.util.Locale.Builder builder28 = builder25.clear();
        java.util.Locale.Builder builder29 = builder25.clear();
        java.util.Locale locale30 = builder25.build();
        java.util.Locale locale31 = builder25.build();
        java.lang.String str32 = locale31.getISO3Country();
        java.io.PrintStream printStream35 = new java.io.PrintStream("zh_CN");
        printStream35.print((float) (byte) -1);
        java.io.PrintWriter printWriter39 = new java.io.PrintWriter("fr");
        printWriter39.print("it_IT");
        java.lang.Object[] objArray43 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter44 = printWriter39.printf("fr", objArray43);
        printWriter39.println((float) 'u');
        printStream35.print((java.lang.Object) 'u');
        printStream35.println(false);
        printStream35.println(0L);
        java.io.PrintWriter printWriter54 = new java.io.PrintWriter("fr");
        printWriter54.print("it_IT");
        java.util.Locale locale57 = java.util.Locale.ROOT;
        boolean boolean58 = locale57.hasExtensions();
        java.util.Locale locale59 = java.util.Locale.ROOT;
        java.lang.String str60 = locale57.getDisplayName(locale59);
        java.util.Locale locale61 = java.util.Locale.ROOT;
        boolean boolean62 = locale61.hasExtensions();
        java.lang.String str63 = locale57.getDisplayCountry(locale61);
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!", objArray66);
        java.io.PrintWriter printWriter68 = printWriter54.printf(locale61, "it_IT", objArray66);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("", objArray66);
        java.lang.Object[] objArray70 = mathException69.getArguments();
        printStream35.print((java.lang.Object) objArray70);
        java.io.PrintStream printStream72 = printStream1.format(locale31, "org.apache.commons.math.MathException: Chinesisch (Taiwan)", objArray70);
        java.io.PrintWriter printWriter74 = new java.io.PrintWriter((java.io.OutputStream) printStream72, false);
        printWriter74.write(117);
        printWriter74.println(0.06685210443059315d);
        printWriter74.print("org.apache.commons.math.MathException: CA");
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(printWriter68);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertNotNull(printStream72);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi! (ITALY)");
        printWriter1.println('x');
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getVariant();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayName(locale3);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder9 = builder7.setLanguage("Italia");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.clear();
        java.util.Locale locale12 = builder9.build();
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=117.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
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
        printWriter1.print((int) (short) 0);
        java.io.PrintStream printStream27 = new java.io.PrintStream("zh_CN");
        printStream27.println();
        java.io.PrintStream printStream30 = printStream27.append('#');
        printStream27.print(0);
        printStream27.print('u');
        java.io.PrintStream printStream38 = new java.io.PrintStream("zh_CN");
        printStream38.println();
        java.io.PrintStream printStream41 = printStream38.append('#');
        java.io.PrintStream printStream43 = new java.io.PrintStream((java.io.OutputStream) printStream38, false);
        java.util.Locale locale47 = new java.util.Locale("ja", "", "ja");
        java.util.Locale locale48 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleKeys();
        java.lang.String str50 = locale47.getDisplayCountry(locale48);
        java.lang.String str51 = locale47.getISO3Country();
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("hi!", objArray54);
        java.lang.Throwable[] throwableArray56 = mathException55.getSuppressed();
        java.io.PrintStream printStream57 = printStream38.format(locale47, "japonais", (java.lang.Object[]) throwableArray56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("tedesco", (java.lang.Object[]) throwableArray56);
        java.io.PrintStream printStream59 = printStream27.format("\u53f0\u6e7e", (java.lang.Object[]) throwableArray56);
        java.io.PrintWriter printWriter60 = printWriter1.format("\u52a0\u62ff\u5927 (ORG.APACHE.COMMONS.MATH.MATHEXCEPTION: FR,german)", (java.lang.Object[]) throwableArray56);
        printWriter60.print((long) 5);
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
        org.junit.Assert.assertNotNull(printStream30);
        org.junit.Assert.assertNotNull(printStream41);
        org.junit.Assert.assertEquals(locale47.toString(), "ja__ja");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(printStream57);
        org.junit.Assert.assertNotNull(printStream59);
        org.junit.Assert.assertNotNull(printWriter60);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("org.apache.commons.math.MathException: ja", "fran\347ais (france)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: franc?ais (france)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        printStream4.println('#');
        printStream4.println();
        printStream4.print("italien (Italie)");
        java.io.PrintStream printStream11 = new java.io.PrintStream((java.io.OutputStream) printStream4);
        printStream4.print("\u82f1\u8a9e");
        printStream4.print(false);
        printStream4.println("");
        java.io.PrintStream printStream19 = new java.io.PrintStream("zh_CN");
        printStream19.println();
        java.io.PrintStream printStream22 = printStream19.append('#');
        printStream19.close();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream19.write(byteArray27);
        printStream19.write((int) 'a');
        printStream19.println((int) (short) 100);
        printStream19.print(false);
        java.io.PrintStream printStream36 = printStream19.append((java.lang.CharSequence) "CAN");
        java.io.PrintStream printStream38 = new java.io.PrintStream("zh_CN");
        printStream38.println();
        java.io.PrintStream printStream41 = printStream38.append('#');
        printStream38.close();
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream38.write(byteArray47);
        printStream19.write(byteArray47, (int) (byte) 1, (int) (byte) 100);
        printStream4.write(byteArray47);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(printStream36);
        org.junit.Assert.assertNotNull(printStream41);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1, 100, -1, -1]");
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        java.io.PrintStream printStream1 = new java.io.PrintStream("FRANKREICH");
        printStream1.print(true);
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u56fd\u8a9e", "it_IT");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd\u8a9e_IT_IT");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.MathException: org.apache.commons.math.MathException: italien (Italie)");
        java.io.PrintStream printStream3 = new java.io.PrintStream("zh_CN");
        printStream3.print((float) (byte) -1);
        printStream3.println();
        printStream3.print("ita");
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter((java.io.OutputStream) printStream3, false);
        printStream3.println(true);
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale13.getVariant();
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = locale13.getDisplayScript(locale17);
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category19, locale20);
        java.util.Locale locale24 = new java.util.Locale("fr", "fr");
        java.lang.String str25 = locale24.getDisplayScript();
        java.util.Locale.setDefault(locale24);
        java.util.Locale.setDefault(category19, locale24);
        java.lang.String str28 = locale17.getDisplayScript(locale24);
        java.util.Set<java.lang.Character> charSet29 = locale24.getExtensionKeys();
        printStream3.println((java.lang.Object) locale24);
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.util.Locale locale32 = java.util.Locale.ROOT;
        boolean boolean33 = locale32.hasExtensions();
        java.lang.String str34 = locale31.getDisplayCountry(locale32);
        java.lang.String str35 = locale31.getDisplayVariant();
        boolean boolean36 = locale31.hasExtensions();
        java.util.Locale.setDefault(locale31);
        java.util.Set<java.lang.String> strSet38 = locale31.getUnicodeLocaleKeys();
        boolean boolean39 = locale31.hasExtensions();
        java.lang.String str40 = locale31.getVariant();
        java.lang.String str41 = locale24.getDisplayLanguage(locale31);
        java.lang.String str42 = locale24.getISO3Country();
        java.io.PrintStream printStream45 = new java.io.PrintStream("zh_CN");
        printStream45.print((float) (byte) -1);
        printStream45.println();
        printStream45.println();
        java.io.PrintStream printStream51 = new java.io.PrintStream((java.io.OutputStream) printStream45, true);
        printStream45.println();
        printStream45.print((-1));
        printStream45.print((double) '#');
        java.io.PrintWriter printWriter60 = new java.io.PrintWriter("fr");
        printWriter60.print("it_IT");
        java.util.Locale locale63 = java.util.Locale.ROOT;
        boolean boolean64 = locale63.hasExtensions();
        java.util.Locale locale65 = java.util.Locale.ROOT;
        java.lang.String str66 = locale63.getDisplayName(locale65);
        java.util.Locale locale67 = java.util.Locale.ROOT;
        boolean boolean68 = locale67.hasExtensions();
        java.lang.String str69 = locale63.getDisplayCountry(locale67);
        java.lang.Object[] objArray72 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("hi!", objArray72);
        java.io.PrintWriter printWriter74 = printWriter60.printf(locale67, "it_IT", objArray72);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("", objArray72);
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException75);
        java.lang.Object[] objArray77 = mathException75.getArguments();
        java.io.PrintStream printStream78 = printStream45.format("italiano (Italia)", objArray77);
        java.io.PrintStream printStream80 = printStream45.append('a');
        printStream45.println((long) (byte) 1);
        printStream45.println("Italy");
        java.io.PrintStream printStream86 = printStream45.append('u');
        java.io.PrintWriter printWriter87 = new java.io.PrintWriter((java.io.OutputStream) printStream86);
        printStream86.write((int) (byte) 100);
        java.io.PrintWriter printWriter92 = new java.io.PrintWriter("fr");
        printWriter92.print("it_IT");
        java.lang.Object[] objArray96 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter97 = printWriter92.printf("fr", objArray96);
        java.io.PrintStream printStream98 = printStream86.printf("inglese (Canada)", objArray96);
        java.io.PrintStream printStream99 = printStream1.format(locale24, "fr_CA", objArray96);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Italy" + "'", str34, "Italy");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "francese" + "'", str41, "francese");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "FRA" + "'", str42, "FRA");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(printWriter74);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertNotNull(printStream78);
        org.junit.Assert.assertNotNull(printStream80);
        org.junit.Assert.assertNotNull(printStream86);
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray96), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray96), "[]");
        org.junit.Assert.assertNotNull(printWriter97);
        org.junit.Assert.assertNotNull(printStream98);
        org.junit.Assert.assertNotNull(printStream99);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        boolean boolean3 = printWriter1.checkError();
        printWriter1.println(0.0f);
        printWriter1.write("fr");
        printWriter1.println((int) 'u');
        java.io.PrintStream printStream13 = new java.io.PrintStream("zh_CN");
        printStream13.print((float) (byte) -1);
        printStream13.println();
        printStream13.println();
        java.io.PrintStream printStream19 = new java.io.PrintStream((java.io.OutputStream) printStream13, true);
        printStream13.println();
        printStream13.print((-1));
        printStream13.write((int) (byte) 1);
        printStream13.print(true);
        java.io.PrintStream printStream29 = new java.io.PrintStream("zh_CN");
        printStream29.println();
        java.io.PrintStream printStream32 = printStream29.append('#');
        printStream29.close();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream29.write(byteArray37);
        printStream29.write((int) 'a');
        printStream29.println((int) (short) 100);
        printStream29.print(1L);
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter("fr");
        printWriter47.print("it_IT");
        java.util.Locale locale50 = java.util.Locale.ROOT;
        boolean boolean51 = locale50.hasExtensions();
        java.util.Locale locale52 = java.util.Locale.ROOT;
        java.lang.String str53 = locale50.getDisplayName(locale52);
        java.util.Locale locale54 = java.util.Locale.ROOT;
        boolean boolean55 = locale54.hasExtensions();
        java.lang.String str56 = locale50.getDisplayCountry(locale54);
        java.lang.Object[] objArray59 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("hi!", objArray59);
        java.io.PrintWriter printWriter61 = printWriter47.printf(locale54, "it_IT", objArray59);
        java.io.PrintWriter printWriter64 = new java.io.PrintWriter("fr");
        printWriter64.print("it_IT");
        java.util.Locale locale68 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray71 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("hi!", objArray71);
        java.lang.Throwable[] throwableArray73 = mathException72.getSuppressed();
        java.lang.Throwable[] throwableArray74 = mathException72.getSuppressed();
        java.io.PrintWriter printWriter75 = printWriter64.printf(locale68, "it_IT", (java.lang.Object[]) throwableArray74);
        java.io.PrintWriter printWriter76 = printWriter47.format("it_IT", (java.lang.Object[]) throwableArray74);
        printWriter76.println();
        java.lang.Throwable throwable80 = null;
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException(throwable80);
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException81);
        java.lang.Throwable[] throwableArray83 = mathException81.getSuppressed();
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray83);
        java.io.PrintWriter printWriter85 = printWriter76.format("Royaume-Uni", (java.lang.Object[]) throwableArray83);
        java.io.PrintStream printStream86 = printStream29.printf("Chinese (China)", (java.lang.Object[]) throwableArray83);
        java.io.PrintStream printStream87 = printStream13.printf("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray83);
        org.apache.commons.math.MathException mathException89 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException");
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException("fr", (java.lang.Object[]) throwableArray83, (java.lang.Throwable) mathException89);
        java.io.PrintWriter printWriter91 = printWriter1.format("fr-CA", (java.lang.Object[]) throwableArray83);
        java.io.PrintWriter printWriter92 = new java.io.PrintWriter((java.io.Writer) printWriter91);
        printWriter92.println(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(printStream32);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(printWriter61);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(printWriter76);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(printWriter85);
        org.junit.Assert.assertNotNull(printStream86);
        org.junit.Assert.assertNotNull(printStream87);
        org.junit.Assert.assertNotNull(printWriter91);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
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
        printWriter21.close();
        printWriter21.print((long) 17);
        printWriter21.flush();
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
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'x');
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d, (double) 10L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(4);
        int int25 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 120 + "'", int19 == 120);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 117 + "'", int25 == 117);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        java.lang.Object obj3 = null;
        printWriter1.print(obj3);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("fr", objArray8);
        java.lang.Throwable[] throwableArray11 = mathException10.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf("ita", (java.lang.Object[]) throwableArray11);
        printWriter1.println(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray17);
        java.lang.Throwable[] throwableArray19 = mathException18.getSuppressed();
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", objArray24);
        java.lang.Object[] objArray26 = mathException25.getArguments();
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", objArray28);
        java.lang.Throwable[] throwableArray30 = mathException29.getSuppressed();
        mathException25.addSuppressed((java.lang.Throwable) mathException29);
        java.lang.Throwable[] throwableArray32 = mathException25.getSuppressed();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException();
        java.lang.String str34 = mathException33.getPattern();
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray32);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("zh_cn", (java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) mathException36);
        java.lang.Throwable throwable40 = null;
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("cn", throwable40);
        mathException36.addSuppressed((java.lang.Throwable) mathException41);
        printWriter1.print((java.lang.Object) mathException36);
        printWriter1.close();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category1);
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayName(locale3);
        java.lang.String str7 = locale0.getCountry();
        java.util.Locale.setDefault(locale0);
        java.lang.String str9 = locale0.getScript();
        java.lang.String str10 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet11 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cinese (Taiwan)" + "'", str6, "cinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TW" + "'", str7, "TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u53f0\u7063" + "'", str10, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(charSet11);
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
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
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter("fr");
        printWriter20.print("it_IT");
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray27);
        java.lang.Throwable[] throwableArray29 = mathException28.getSuppressed();
        java.lang.Throwable[] throwableArray30 = mathException28.getSuppressed();
        java.io.PrintWriter printWriter31 = printWriter20.printf(locale24, "it_IT", (java.lang.Object[]) throwableArray30);
        java.io.PrintWriter printWriter32 = printWriter3.format("it_IT", (java.lang.Object[]) throwableArray30);
        java.lang.Throwable throwable35 = null;
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException(throwable35);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException36);
        java.lang.Throwable[] throwableArray38 = mathException37.getSuppressed();
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray38, throwable39);
        java.lang.Object[] objArray41 = mathException40.getArguments();
        java.io.PrintWriter printWriter44 = new java.io.PrintWriter("fr");
        printWriter44.print("it_IT");
        java.util.Locale locale47 = java.util.Locale.ROOT;
        boolean boolean48 = locale47.hasExtensions();
        java.util.Locale locale49 = java.util.Locale.ROOT;
        java.lang.String str50 = locale47.getDisplayName(locale49);
        java.util.Locale locale51 = java.util.Locale.ROOT;
        boolean boolean52 = locale51.hasExtensions();
        java.lang.String str53 = locale47.getDisplayCountry(locale51);
        java.lang.Object[] objArray56 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", objArray56);
        java.io.PrintWriter printWriter58 = printWriter44.printf(locale51, "it_IT", objArray56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("", objArray56);
        java.lang.Object[] objArray60 = mathException59.getArguments();
        java.lang.Throwable[] throwableArray61 = mathException59.getSuppressed();
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("China", objArray41, (java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("\u30c9\u30a4\u30c4\u8a9e", (java.lang.Object[]) throwableArray30, (java.lang.Throwable) mathException63);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: italien (Italie)", (java.lang.Throwable) mathException64);
        java.lang.String str66 = mathException64.toString();
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
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter32);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNotNull(printWriter58);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertNotNull(throwableArray61);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e" + "'", str66, "\u30c9\u30a4\u30c4\u8a9e");
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setExtension('x', "italien");
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.getVariant();
        boolean boolean9 = locale6.hasExtensions();
        java.util.Locale locale10 = locale6.stripExtensions();
        java.util.Locale.Builder builder11 = builder1.setLocale(locale10);
        java.util.Locale.Builder builder14 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder15 = builder1.clearExtensions();
        java.util.Locale.Builder builder16 = builder1.clearExtensions();
        java.util.Locale.Builder builder18 = builder1.setLanguage("ENGLISH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder1.setVariant("\u4e2d\u56fd\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: org.apache.commons.math.mathexception: fr_??_??????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        char[] charArray6 = new char[] { 'x', 'a' };
        printWriter3.print(charArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray11);
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("fr", (java.lang.Object[]) throwableArray13);
        java.io.PrintWriter printWriter15 = printWriter3.printf("en-GB", (java.lang.Object[]) throwableArray13);
        char[] charArray20 = new char[] { 'a', ' ', 'u', 'x' };
        printWriter15.write(charArray20);
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter((java.io.Writer) printWriter15);
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        java.util.Locale locale24 = java.util.Locale.JAPANESE;
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        boolean boolean26 = locale24.hasExtensions();
        java.util.Locale.setDefault(locale24);
        java.lang.String str28 = locale24.getLanguage();
        java.lang.String str30 = locale24.getExtension('u');
        java.util.Set<java.lang.String> strSet31 = locale24.getUnicodeLocaleKeys();
        java.io.PrintWriter printWriter33 = new java.io.PrintWriter("fr");
        printWriter33.print("it_IT");
        java.util.Locale locale36 = java.util.Locale.ROOT;
        boolean boolean37 = locale36.hasExtensions();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.lang.String str39 = locale36.getDisplayName(locale38);
        java.util.Locale locale40 = java.util.Locale.ROOT;
        boolean boolean41 = locale40.hasExtensions();
        java.lang.String str42 = locale36.getDisplayCountry(locale40);
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", objArray45);
        java.io.PrintWriter printWriter47 = printWriter33.printf(locale40, "it_IT", objArray45);
        java.util.Locale locale50 = new java.util.Locale("Italy", "Italy");
        java.lang.String str51 = locale40.getDisplayScript(locale50);
        java.lang.String str52 = locale24.getDisplayScript(locale50);
        boolean boolean53 = locale24.hasExtensions();
        java.io.PrintStream printStream56 = new java.io.PrintStream("zh_CN");
        printStream56.println();
        java.io.PrintStream printStream59 = printStream56.append('#');
        java.io.PrintWriter printWriter61 = new java.io.PrintWriter((java.io.OutputStream) printStream56, true);
        java.io.PrintWriter printWriter63 = new java.io.PrintWriter((java.io.OutputStream) printStream56, false);
        printWriter63.print((int) (byte) 100);
        java.util.Locale locale69 = new java.util.Locale("", "", "");
        java.lang.String str70 = locale69.getISO3Language();
        boolean boolean71 = locale69.hasExtensions();
        java.io.PrintWriter printWriter75 = new java.io.PrintWriter("fr");
        printWriter75.print("it_IT");
        java.util.Locale locale78 = java.util.Locale.ROOT;
        boolean boolean79 = locale78.hasExtensions();
        java.util.Locale locale80 = java.util.Locale.ROOT;
        java.lang.String str81 = locale78.getDisplayName(locale80);
        java.util.Locale locale82 = java.util.Locale.ROOT;
        boolean boolean83 = locale82.hasExtensions();
        java.lang.String str84 = locale78.getDisplayCountry(locale82);
        java.lang.Object[] objArray87 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException("hi!", objArray87);
        java.io.PrintWriter printWriter89 = printWriter75.printf(locale82, "it_IT", objArray87);
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException("", objArray87);
        org.apache.commons.math.MathException mathException91 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException90);
        java.lang.Object[] objArray92 = mathException90.getArguments();
        java.io.PrintWriter printWriter93 = printWriter63.format(locale69, "ITA", objArray92);
        java.io.PrintWriter printWriter94 = printWriter15.printf(locale24, "ANGLAIS", objArray92);
        java.io.PrintWriter printWriter96 = printWriter94.append((java.lang.CharSequence) "\u30a4\u30ae\u30ea\u30b9");
        java.io.PrintWriter printWriter98 = printWriter96.append((java.lang.CharSequence) "org.apache.commons.math.MathException: hi!");
        boolean boolean99 = printWriter96.checkError();
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
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "a ux");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "a ux");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a,  , u, x]");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ja" + "'", str28, "ja");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(printWriter47);
        org.junit.Assert.assertEquals(locale50.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(printStream59);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[]");
        org.junit.Assert.assertNotNull(printWriter89);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[]");
        org.junit.Assert.assertNotNull(printWriter93);
        org.junit.Assert.assertNotNull(printWriter94);
        org.junit.Assert.assertNotNull(printWriter96);
        org.junit.Assert.assertNotNull(printWriter98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("hi! (ITALY)", "China");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: China");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("allemand-x-lvariant-US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: allemand-x-lvariant-US [at index 9]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 30, 0.44444444444442294d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
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
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category27, locale28);
        java.util.Locale locale31 = java.util.Locale.getDefault(category27);
        java.io.PrintStream printStream34 = new java.io.PrintStream("zh_CN");
        printStream34.print((float) (byte) -1);
        printStream34.println();
        printStream34.println();
        printStream34.println((float) ' ');
        printStream34.println("hi!");
        printStream34.println('4');
        printStream34.println(true);
        java.lang.Throwable throwable49 = null;
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException(throwable49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException50);
        java.lang.Throwable[] throwableArray52 = mathException51.getSuppressed();
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray52, throwable53);
        java.lang.Object[] objArray55 = mathException54.getArguments();
        java.io.PrintStream printStream56 = printStream34.format("org.apache.commons.math.MathException", objArray55);
        java.io.PrintStream printStream57 = printStream7.printf(locale31, "fr_FR", objArray55);
        printStream57.close();
        java.io.PrintStream printStream61 = new java.io.PrintStream("zh_CN");
        printStream61.print((float) (byte) -1);
        printStream61.println();
        printStream61.println();
        java.io.PrintStream printStream67 = new java.io.PrintStream((java.io.OutputStream) printStream61, true);
        java.lang.Object[] objArray72 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("hi!", objArray72);
        java.lang.Object[] objArray74 = mathException73.getArguments();
        java.lang.Object[] objArray76 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("hi!", objArray76);
        java.lang.Throwable[] throwableArray78 = mathException77.getSuppressed();
        mathException73.addSuppressed((java.lang.Throwable) mathException77);
        java.lang.Throwable[] throwableArray80 = mathException73.getSuppressed();
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException();
        java.lang.String str82 = mathException81.getPattern();
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray80, (java.lang.Throwable) mathException81);
        java.lang.Object[] objArray86 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException("hi!", objArray86);
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException("fr", objArray86);
        org.apache.commons.math.MathException mathException89 = new org.apache.commons.math.MathException("it_IT", (java.lang.Object[]) throwableArray80, (java.lang.Throwable) mathException88);
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException("\u4e2d\u56fd", (java.lang.Object[]) throwableArray80);
        printStream67.print((java.lang.Object) throwableArray80);
        java.io.PrintStream printStream92 = printStream57.printf("zh", (java.lang.Object[]) throwableArray80);
        printStream92.print(true);
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
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.FORMAT + "'", category27.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(printStream56);
        org.junit.Assert.assertNotNull(printStream57);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[]");
        org.junit.Assert.assertNotNull(printStream92);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double5 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double14 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 117 + "'", int10 == 117);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getDisplayScript();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category3);
        java.util.Locale locale9 = new java.util.Locale("zh_CN", "English", "it_IT");
        java.util.Locale.setDefault(category3, locale9);
        java.util.Locale locale11 = java.util.Locale.getDefault(category3);
        java.lang.String str12 = locale1.getDisplayCountry(locale11);
        java.lang.String str13 = locale11.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale9.toString(), "zh_cn_ENGLISH_it_IT");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_cn_ENGLISH_it_IT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Germany" + "'", str12, "Germany");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh_cn (ENGLISH,it,IT)" + "'", str13, "zh_cn (ENGLISH,it,IT)");
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 0);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        double double17 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        java.util.Locale.Builder builder4 = builder2.setLanguage("japonais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setLanguageTag("italienisch (italien)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: italienisch (italien) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(117);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, 0.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 31);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'x');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7008547008546866d + "'", double9 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
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
        java.io.PrintWriter printWriter29 = new java.io.PrintWriter((java.io.OutputStream) printStream28);
        printStream28.println("fr-CA");
        printStream28.write((int) (byte) 1);
        printStream28.print((long) '#');
        java.util.Locale.Category category36 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale37 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category36, locale37);
        java.lang.String str39 = locale37.getDisplayLanguage();
        java.util.Locale locale42 = new java.util.Locale("en-GB", "Italy");
        java.lang.String str43 = locale42.getCountry();
        java.lang.String str44 = locale42.getDisplayName();
        java.lang.String str45 = locale37.getDisplayVariant(locale42);
        java.util.Locale locale46 = locale37.stripExtensions();
        printStream28.println((java.lang.Object) locale37);
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
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category36.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str39, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertEquals(locale42.toString(), "en-gb_ITALY");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ITALY" + "'", str43, "ITALY");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "en-gb (ITALY)" + "'", str44, "en-gb (ITALY)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ja");
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
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
        java.io.PrintWriter printWriter18 = new java.io.PrintWriter((java.io.OutputStream) printStream1, false);
        java.util.Locale locale22 = new java.util.Locale("zh", "zh", "\u30a4\u30ae\u30ea\u30b9");
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", objArray26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("fr", objArray26);
        java.io.PrintStream printStream29 = printStream1.printf(locale22, "ita", objArray26);
        printStream1.print((int) 'x');
        java.util.Locale locale32 = java.util.Locale.ROOT;
        boolean boolean33 = locale32.hasExtensions();
        java.lang.String str34 = locale32.getCountry();
        java.util.Locale locale36 = new java.util.Locale("org.apache.commons.math.MathException");
        java.lang.String str37 = locale32.getDisplayCountry(locale36);
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleKeys();
        java.lang.String str39 = locale36.getDisplayName();
        java.lang.String str40 = locale36.getCountry();
        java.util.Locale locale41 = java.util.Locale.JAPANESE;
        java.util.Locale locale42 = java.util.Locale.JAPANESE;
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.lang.String str44 = locale41.getVariant();
        java.util.Locale locale45 = java.util.Locale.CANADA;
        java.lang.String str46 = locale41.getDisplayScript(locale45);
        java.lang.String str47 = locale36.getDisplayVariant(locale41);
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", objArray50);
        java.lang.Throwable[] throwableArray52 = mathException51.getSuppressed();
        java.lang.Throwable[] throwableArray53 = mathException51.getSuppressed();
        java.io.PrintStream printStream54 = printStream1.format(locale41, "it,IT", (java.lang.Object[]) throwableArray53);
        java.io.PrintWriter printWriter56 = new java.io.PrintWriter((java.io.OutputStream) printStream54, true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(printStream29);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale36.toString(), "org.apache.commons.math.mathexception");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.math.mathexception" + "'", str39, "org.apache.commons.math.mathexception");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ja");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(printStream54);
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) '4');
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double14 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        double double16 = hypergeometricDistributionImpl3.probability(1.9394889923397905E-4d);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
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
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter("fr");
        printWriter35.print("it_IT");
        java.util.Locale locale38 = java.util.Locale.ROOT;
        boolean boolean39 = locale38.hasExtensions();
        java.util.Locale locale40 = java.util.Locale.ROOT;
        java.lang.String str41 = locale38.getDisplayName(locale40);
        java.util.Locale locale42 = java.util.Locale.ROOT;
        boolean boolean43 = locale42.hasExtensions();
        java.lang.String str44 = locale38.getDisplayCountry(locale42);
        java.lang.Object[] objArray47 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", objArray47);
        java.io.PrintWriter printWriter49 = printWriter35.printf(locale42, "it_IT", objArray47);
        printWriter49.print((double) 100L);
        java.util.Locale locale52 = java.util.Locale.JAPANESE;
        java.util.Locale locale53 = java.util.Locale.JAPANESE;
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.lang.String str55 = locale52.getVariant();
        java.lang.String str56 = locale52.getCountry();
        java.io.PrintStream printStream59 = new java.io.PrintStream("zh_CN");
        printStream59.print((float) (byte) -1);
        printStream59.println();
        printStream59.print("ita");
        java.util.Locale locale65 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleKeys();
        java.util.Locale locale67 = locale65.stripExtensions();
        java.lang.Object[] objArray70 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("hi!", objArray70);
        java.lang.Throwable[] throwableArray72 = mathException71.getSuppressed();
        java.lang.Throwable[] throwableArray73 = mathException71.getSuppressed();
        java.io.PrintStream printStream74 = printStream59.printf(locale67, "fr", (java.lang.Object[]) throwableArray73);
        java.io.PrintWriter printWriter75 = printWriter49.format(locale52, "fra", (java.lang.Object[]) throwableArray73);
        java.io.PrintWriter printWriter76 = printWriter32.printf("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray73);
        printWriter32.write("chinois (Chine)");
        printWriter32.println();
        printWriter32.println('a');
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
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ja");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(printStream74);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(printWriter76);
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double8 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.probability((int) ' ');
        hypergeometricDistributionImpl3.setSampleSize((int) 'x');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, 117);
        double double18 = hypergeometricDistributionImpl3.probability(1.8472640568670461E-7d);
        double double20 = hypergeometricDistributionImpl3.probability((double) 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("org.apache.commons.math.MathException: Regno Unito", "en-gb (ITALY)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: en-gb (ITALY)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        printStream1.println();
        printStream1.println((float) ' ');
        printStream1.println((double) 0L);
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.OutputStream) printStream1, true);
        printWriter11.println(true);
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("fr");
        printWriter16.print("it_IT");
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter21 = printWriter16.printf("fr", objArray20);
        printWriter21.print((float) (byte) 100);
        java.io.PrintWriter printWriter25 = printWriter21.append((java.lang.CharSequence) "ja");
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.util.Locale locale30 = locale29.stripExtensions();
        java.lang.String str31 = locale30.getISO3Country();
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter("fr");
        printWriter35.println();
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
        java.io.PrintWriter printWriter54 = printWriter35.printf("English", objArray51);
        java.io.PrintWriter printWriter56 = new java.io.PrintWriter((java.io.Writer) printWriter35, false);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl60 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int61 = hypergeometricDistributionImpl60.getPopulationSize();
        double double63 = hypergeometricDistributionImpl60.cumulativeProbability((double) (short) -1);
        double double65 = hypergeometricDistributionImpl60.probability((double) (short) 100);
        double double67 = hypergeometricDistributionImpl60.cumulativeProbability((double) 117);
        printWriter35.print((java.lang.Object) 117);
        java.io.PrintWriter printWriter70 = printWriter35.append('4');
        java.lang.Object[] objArray74 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("hi!", objArray74);
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException("fr", objArray74);
        java.io.PrintWriter printWriter77 = printWriter70.format("en-GB", objArray74);
        java.lang.Object[] objArray79 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("hi!", objArray79);
        java.lang.Object[] objArray81 = mathException80.getArguments();
        java.lang.Object[] objArray83 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("hi!", objArray83);
        java.lang.Throwable[] throwableArray85 = mathException84.getSuppressed();
        mathException80.addSuppressed((java.lang.Throwable) mathException84);
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException84);
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException("chinois", objArray74, (java.lang.Throwable) mathException84);
        java.io.PrintWriter printWriter89 = printWriter21.printf(locale30, "ita", objArray74);
        java.io.PrintWriter printWriter90 = printWriter11.format("\u53f0\u6e7e", objArray74);
        printWriter11.println(100L);
        printWriter11.print((double) (short) 100);
        printWriter11.println((float) 30);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(printWriter21);
        org.junit.Assert.assertNotNull(printWriter25);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
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
        org.junit.Assert.assertNotNull(printWriter54);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 117 + "'", int61 == 117);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 1.0d + "'", double67 == 1.0d);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertNotNull(printWriter77);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[]");
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(printWriter89);
        org.junit.Assert.assertNotNull(printWriter90);
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
        java.util.Locale locale3 = new java.util.Locale("org.apache.commons.math.MathException: Canada", "org.apache.commons.math.MathException: eng", "\u82f1\u8a9e\u30ab\u30ca\u30c0)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30ab\u30ca\u30c0)");
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setRegion("Franz\366sisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Franzo?sisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u65e5\u672c");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
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
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.util.Locale locale23 = new java.util.Locale("fra", "it_IT", "fran\347ais (France)");
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.lang.String str26 = locale23.getExtension('x');
        java.util.Locale.setDefault(category0, locale23);
        java.util.Locale locale28 = java.util.Locale.getDefault(category0);
        java.lang.String str29 = locale28.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_cn_ENGLISH_it_IT");
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
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale23.toString(), "fra_IT_IT_fran\347ais (France)");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fra_IT_IT_fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IT_IT" + "'", str29, "IT_IT");
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(117);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((-1), 10);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', 97, 10);
        double double5 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'x');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(7.009401437221889E-12d);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        printWriter1.write("Italy", 0, (int) (short) -1);
        printWriter1.print(0);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        java.io.PrintStream printStream11 = new java.io.PrintStream("zh_CN");
        printStream11.println();
        java.io.PrintStream printStream14 = printStream11.append('#');
        printStream11.close();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream11.write(byteArray19);
        printStream11.println((int) (byte) -1);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter((java.io.OutputStream) printStream11);
        printWriter23.print((long) 97);
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleKeys();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        boolean boolean29 = locale28.hasExtensions();
        java.lang.String str30 = locale28.getCountry();
        java.lang.String str31 = locale28.getDisplayLanguage();
        java.lang.String str32 = locale28.getISO3Country();
        java.lang.String str33 = locale26.getDisplayScript(locale28);
        java.io.PrintStream printStream36 = new java.io.PrintStream("zh_CN");
        printStream36.println();
        java.io.PrintStream printStream39 = printStream36.append('#');
        printStream36.close();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream36.write(byteArray44);
        printStream36.write((int) 'a');
        java.io.PrintStream printStream48 = new java.io.PrintStream((java.io.OutputStream) printStream36);
        printStream48.print(false);
        printStream48.print(false);
        java.util.Locale locale55 = new java.util.Locale("hi!", "Italy");
        boolean boolean56 = locale55.hasExtensions();
        java.lang.String str57 = locale55.getVariant();
        java.util.Locale.setDefault(locale55);
        java.io.PrintStream printStream61 = new java.io.PrintStream("zh_CN");
        printStream61.print((float) (byte) -1);
        printStream61.println();
        java.lang.Throwable throwable66 = null;
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException(throwable66);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException67);
        java.lang.Throwable[] throwableArray69 = mathException67.getSuppressed();
        java.io.PrintStream printStream70 = printStream61.format("italien (Italie)", (java.lang.Object[]) throwableArray69);
        java.util.Locale locale71 = java.util.Locale.FRENCH;
        java.lang.Object[] objArray74 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("hi!", objArray74);
        java.lang.Throwable[] throwableArray76 = mathException75.getSuppressed();
        java.io.PrintStream printStream77 = printStream61.printf(locale71, "ja", (java.lang.Object[]) throwableArray76);
        java.io.PrintStream printStream78 = printStream48.printf(locale55, "CN", (java.lang.Object[]) throwableArray76);
        java.io.PrintWriter printWriter79 = printWriter23.printf(locale26, "Regno Unito", (java.lang.Object[]) throwableArray76);
        printWriter9.print((java.lang.Object) printWriter79);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl84 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'a', (int) 'a', (int) ' ');
        int int85 = hypergeometricDistributionImpl84.getPopulationSize();
        double double88 = hypergeometricDistributionImpl84.cumulativeProbability(52, (int) 'x');
        int int90 = hypergeometricDistributionImpl84.inverseCumulativeProbability(0.9999999972520074d);
        printWriter9.println((java.lang.Object) int90);
        printWriter9.println((long) (short) -1);
        printWriter9.println('#');
        printWriter9.println("org.apache.commons.math.MathException: org.apache.commons.math.MathException: italien (Italie)");
        org.junit.Assert.assertNotNull(printStream14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(printStream39);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 10, -1]");
        org.junit.Assert.assertEquals(locale55.toString(), "hi!_ITALY");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(printStream70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(printStream77);
        org.junit.Assert.assertNotNull(printStream78);
        org.junit.Assert.assertNotNull(printWriter79);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 97 + "'", int85 == 97);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 31 + "'", int90 == 31);
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: franc?ais (France)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
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
        java.io.PrintWriter printWriter18 = new java.io.PrintWriter((java.io.OutputStream) printStream1, false);
        java.util.Locale locale22 = new java.util.Locale("zh", "zh", "\u30a4\u30ae\u30ea\u30b9");
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", objArray26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("fr", objArray26);
        java.io.PrintStream printStream29 = printStream1.printf(locale22, "ita", objArray26);
        java.util.Set<java.lang.Character> charSet30 = locale22.getExtensionKeys();
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale31.getCountry();
        java.lang.String str33 = locale31.getDisplayLanguage();
        java.lang.String str34 = locale22.getDisplayName(locale31);
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder35.setLanguageTag("ita");
        java.util.Locale locale38 = java.util.Locale.JAPANESE;
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.lang.String str41 = locale38.getVariant();
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.lang.String str43 = locale38.getDisplayScript(locale42);
        boolean boolean44 = locale38.hasExtensions();
        java.util.Locale.Builder builder45 = builder35.setLocale(locale38);
        java.util.Locale locale46 = java.util.Locale.JAPANESE;
        java.util.Locale locale47 = java.util.Locale.JAPANESE;
        java.lang.String str48 = locale46.getDisplayCountry(locale47);
        java.lang.String str49 = locale46.getVariant();
        java.util.Locale locale50 = java.util.Locale.CANADA;
        java.lang.String str51 = locale46.getDisplayScript(locale50);
        java.util.Locale locale54 = new java.util.Locale("Italy", "Italy");
        java.lang.String str55 = locale50.getDisplayLanguage(locale54);
        boolean boolean56 = locale50.hasExtensions();
        java.lang.String str57 = locale50.getISO3Language();
        boolean boolean58 = locale50.hasExtensions();
        java.util.Locale.Builder builder59 = builder35.setLocale(locale50);
        java.lang.String str60 = locale50.getDisplayScript();
        java.lang.String str61 = locale50.getDisplayName();
        java.lang.String str62 = locale22.getDisplayName(locale50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = locale22.getUnicodeLocaleType("\u30ab\u30ca\u30c0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(printStream29);
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "CA" + "'", str32, "CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "English" + "'", str33, "English");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u30a4\u30ae\u30ea\u30b9)" + "'", str34, "\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ja");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale54.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "English" + "'", str55, "English");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "eng" + "'", str57, "eng");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "English (Canada)" + "'", str61, "English (Canada)");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u30a4\u30ae\u30ea\u30b9)" + "'", str62, "\u30a4\u30ae\u30ea\u30b9)");
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("ITALY");
        java.util.Locale.Builder builder6 = builder0.setLanguage("CN");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "cn");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getVariant();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayName(locale3);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder14 = builder11.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = builder17.build();
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
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
        printStream32.close();
        java.util.Locale locale36 = java.util.Locale.ENGLISH;
        printStream32.println((java.lang.Object) locale36);
        java.lang.CharSequence charSequence38 = null;
        java.io.PrintStream printStream39 = printStream32.append(charSequence38);
        java.io.PrintWriter printWriter41 = new java.io.PrintWriter((java.io.OutputStream) printStream39, false);
        boolean boolean42 = printStream39.checkError();
        printStream39.print((double) (byte) 0);
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
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en");
        org.junit.Assert.assertNotNull(printStream39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
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
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.lang.String str20 = locale19.getISO3Language();
        java.lang.String str21 = locale18.getDisplayLanguage(locale19);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("fr");
        printWriter24.print("it_IT");
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter29 = printWriter24.printf("fr", objArray28);
        printWriter29.print((float) (byte) 100);
        java.io.PrintWriter printWriter33 = printWriter29.append((java.lang.CharSequence) "ja");
        java.util.Locale locale37 = new java.util.Locale("", "", "");
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = locale38.getISO3Country();
        java.io.PrintWriter printWriter43 = new java.io.PrintWriter("fr");
        printWriter43.println();
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter("fr");
        printWriter47.print("it_IT");
        java.util.Locale locale50 = java.util.Locale.ROOT;
        boolean boolean51 = locale50.hasExtensions();
        java.util.Locale locale52 = java.util.Locale.ROOT;
        java.lang.String str53 = locale50.getDisplayName(locale52);
        java.util.Locale locale54 = java.util.Locale.ROOT;
        boolean boolean55 = locale54.hasExtensions();
        java.lang.String str56 = locale50.getDisplayCountry(locale54);
        java.lang.Object[] objArray59 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("hi!", objArray59);
        java.io.PrintWriter printWriter61 = printWriter47.printf(locale54, "it_IT", objArray59);
        java.io.PrintWriter printWriter62 = printWriter43.printf("English", objArray59);
        java.io.PrintWriter printWriter64 = new java.io.PrintWriter((java.io.Writer) printWriter43, false);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl68 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int69 = hypergeometricDistributionImpl68.getPopulationSize();
        double double71 = hypergeometricDistributionImpl68.cumulativeProbability((double) (short) -1);
        double double73 = hypergeometricDistributionImpl68.probability((double) (short) 100);
        double double75 = hypergeometricDistributionImpl68.cumulativeProbability((double) 117);
        printWriter43.print((java.lang.Object) 117);
        java.io.PrintWriter printWriter78 = printWriter43.append('4');
        java.lang.Object[] objArray82 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("hi!", objArray82);
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("fr", objArray82);
        java.io.PrintWriter printWriter85 = printWriter78.format("en-GB", objArray82);
        java.lang.Object[] objArray87 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException("hi!", objArray87);
        java.lang.Object[] objArray89 = mathException88.getArguments();
        java.lang.Object[] objArray91 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException92 = new org.apache.commons.math.MathException("hi!", objArray91);
        java.lang.Throwable[] throwableArray93 = mathException92.getSuppressed();
        mathException88.addSuppressed((java.lang.Throwable) mathException92);
        org.apache.commons.math.MathException mathException95 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException92);
        org.apache.commons.math.MathException mathException96 = new org.apache.commons.math.MathException("chinois", objArray82, (java.lang.Throwable) mathException92);
        java.io.PrintWriter printWriter97 = printWriter29.printf(locale38, "ita", objArray82);
        java.io.PrintStream printStream98 = printStream1.printf(locale18, "en-gb", objArray82);
        java.lang.String str99 = locale18.getDisplayVariant();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(printStream17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ita" + "'", str20, "ita");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "tedesco" + "'", str21, "tedesco");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(printWriter29);
        org.junit.Assert.assertNotNull(printWriter33);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(printWriter61);
        org.junit.Assert.assertNotNull(printWriter62);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 117 + "'", int69 == 117);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertNotNull(printWriter78);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[]");
        org.junit.Assert.assertNotNull(printWriter85);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[]");
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[]");
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[]");
        org.junit.Assert.assertNotNull(throwableArray93);
        org.junit.Assert.assertNotNull(printWriter97);
        org.junit.Assert.assertNotNull(printStream98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.removeUnicodeLocaleAttribute("ENGLISH");
        java.util.Locale.Builder builder9 = builder4.removeUnicodeLocaleAttribute("inglese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("USA", "fr_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: USA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(21);
        double double15 = hypergeometricDistributionImpl3.probability(31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7008547008546866d + "'", double11 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!_ITALY");
        java.util.Locale locale5 = new java.util.Locale("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", "de", "");
        java.io.PrintStream printStream8 = new java.io.PrintStream("zh_CN");
        printStream8.println();
        java.io.PrintStream printStream11 = printStream8.append('#');
        printStream8.close();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream8.write(byteArray17);
        printStream8.print(false);
        printStream8.println("Italy");
        java.io.PrintStream printStream24 = new java.io.PrintStream("zh_CN");
        printStream24.println((float) (-1));
        java.io.PrintStream printStream28 = new java.io.PrintStream("zh_CN");
        printStream28.println();
        java.io.PrintStream printStream31 = printStream28.append('#');
        printStream28.close();
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream28.write(byteArray37);
        printStream24.write(byteArray37);
        printStream8.write(byteArray37);
        printStream8.println((double) (-1));
        printStream8.close();
        java.io.PrintWriter printWriter46 = new java.io.PrintWriter("fr");
        printWriter46.print("it_IT");
        java.util.Locale locale49 = java.util.Locale.ROOT;
        boolean boolean50 = locale49.hasExtensions();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.lang.String str52 = locale49.getDisplayName(locale51);
        java.util.Locale locale53 = java.util.Locale.ROOT;
        boolean boolean54 = locale53.hasExtensions();
        java.lang.String str55 = locale49.getDisplayCountry(locale53);
        java.lang.Object[] objArray58 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("hi!", objArray58);
        java.io.PrintWriter printWriter60 = printWriter46.printf(locale53, "it_IT", objArray58);
        java.io.PrintStream printStream61 = printStream8.format("zh_cn", objArray58);
        java.io.PrintWriter printWriter62 = printWriter1.format(locale5, "org.apache.commons.math.MathException: francese", objArray58);
        printWriter62.print(0.44444444444442294d);
        org.junit.Assert.assertEquals(locale5.toString(), "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)_DE");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(printStream31);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(printWriter60);
        org.junit.Assert.assertNotNull(printStream61);
        org.junit.Assert.assertNotNull(printWriter62);
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
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
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.io.PrintStream printStream21 = new java.io.PrintStream("zh_CN");
        printStream21.print((float) (byte) -1);
        printStream21.println();
        printStream21.print("ita");
        java.util.Locale locale28 = new java.util.Locale("Italy");
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", objArray31);
        java.lang.Throwable[] throwableArray33 = mathException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = mathException32.getSuppressed();
        java.io.PrintStream printStream35 = printStream21.printf(locale28, "chinois", (java.lang.Object[]) throwableArray34);
        java.util.Locale.setDefault(category0, locale28);
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter("fr");
        printWriter38.print("it_IT");
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", objArray45);
        java.lang.Throwable[] throwableArray47 = mathException46.getSuppressed();
        java.lang.Throwable[] throwableArray48 = mathException46.getSuppressed();
        java.io.PrintWriter printWriter49 = printWriter38.printf(locale42, "it_IT", (java.lang.Object[]) throwableArray48);
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.lang.String str51 = locale42.getDisplayScript(locale50);
        java.lang.String str52 = locale50.getVariant();
        java.util.Locale.setDefault(category0, locale50);
        java.util.Locale locale54 = java.util.Locale.getDefault(category0);
        java.util.Locale locale56 = java.util.Locale.forLanguageTag("ITALY");
        java.util.Locale.setDefault(category0, locale56);
        java.util.Locale.Builder builder58 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder59 = builder58.clearExtensions();
        java.util.Locale.Builder builder61 = builder58.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale62 = builder58.build();
        java.util.Locale.Builder builder63 = builder58.clearExtensions();
        java.util.Locale.Category category64 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale65 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category64, locale65);
        java.util.Locale locale67 = java.util.Locale.getDefault(category64);
        java.util.Locale.Builder builder68 = builder58.setLocale(locale67);
        java.util.Locale.setDefault(category0, locale67);
        java.util.Set<java.lang.String> strSet70 = locale67.getUnicodeLocaleAttributes();
        java.lang.String str71 = locale67.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!_ITALY");
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
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale28.toString(), "italy");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(printStream35);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "italy");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertTrue("'" + category64 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category64.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ja");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ja");
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str71, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        char[] charArray6 = new char[] { 'x', 'u' };
        printStream1.println(charArray6);
        printStream1.print('a');
        java.io.PrintStream printStream11 = printStream1.append('a');
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl15 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int16 = hypergeometricDistributionImpl15.getPopulationSize();
        double double18 = hypergeometricDistributionImpl15.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl15.setNumberOfSuccesses(0);
        double double22 = hypergeometricDistributionImpl15.cumulativeProbability((int) (short) 1);
        double double25 = hypergeometricDistributionImpl15.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        hypergeometricDistributionImpl15.setNumberOfSuccesses(0);
        int int28 = hypergeometricDistributionImpl15.getPopulationSize();
        double double30 = hypergeometricDistributionImpl15.cumulativeProbability(0.7142857142857143d);
        printStream1.println((java.lang.Object) hypergeometricDistributionImpl15);
        printStream1.write((int) (short) 100);
        java.io.PrintWriter printWriter34 = new java.io.PrintWriter((java.io.OutputStream) printStream1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[x, u]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 117 + "'", int16 == 117);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 117 + "'", int28 == 117);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(117);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '4');
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double24 = hypergeometricDistributionImpl3.probability((double) (short) -1);
        double double27 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 117 + "'", int20 == 117);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2.307949844372216E-14d + "'", double27 == 2.307949844372216E-14d);
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.JAPANESE;
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.lang.String str4 = locale2.getDisplayCountry(locale3);
        java.lang.String str5 = locale2.getLanguage();
        java.util.Locale.setDefault(category0, locale2);
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter("fr");
        printWriter8.print("it_IT");
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", objArray15);
        java.lang.Throwable[] throwableArray17 = mathException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = mathException16.getSuppressed();
        java.io.PrintWriter printWriter19 = printWriter8.printf(locale12, "it_IT", (java.lang.Object[]) throwableArray18);
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.lang.String str21 = locale12.getDisplayScript(locale20);
        java.lang.String str22 = locale20.getVariant();
        java.util.Locale.setDefault(category0, locale20);
        java.util.Locale locale27 = new java.util.Locale("English", "", "chinois");
        java.util.Locale locale28 = java.util.Locale.JAPANESE;
        java.util.Locale locale29 = java.util.Locale.JAPANESE;
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        boolean boolean31 = locale29.hasExtensions();
        java.lang.String str32 = locale27.getDisplayLanguage(locale29);
        java.lang.String str33 = locale29.getDisplayName();
        java.util.Locale.setDefault(category0, locale29);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ja" + "'", str5, "ja");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals(locale27.toString(), "english__chinois");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "english" + "'", str32, "english");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str33, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
        java.util.Locale locale1 = new java.util.Locale("ita");
        java.lang.String str3 = locale1.getExtension('u');
        java.io.PrintStream printStream5 = new java.io.PrintStream("zh_CN");
        printStream5.print((float) (byte) -1);
        printStream5.println();
        printStream5.println();
        java.io.PrintStream printStream11 = new java.io.PrintStream((java.io.OutputStream) printStream5, true);
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter("fr");
        printWriter13.print("it_IT");
        java.util.Locale locale16 = java.util.Locale.ROOT;
        boolean boolean17 = locale16.hasExtensions();
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.lang.String str19 = locale16.getDisplayName(locale18);
        java.util.Locale locale20 = java.util.Locale.ROOT;
        boolean boolean21 = locale20.hasExtensions();
        java.lang.String str22 = locale16.getDisplayCountry(locale20);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray25);
        java.io.PrintWriter printWriter27 = printWriter13.printf(locale20, "it_IT", objArray25);
        printStream11.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream30 = printStream11.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream31 = new java.io.PrintStream((java.io.OutputStream) printStream11);
        printStream11.println("");
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder34.clearExtensions();
        java.util.Locale.Builder builder37 = builder35.setLanguageTag("fr");
        java.util.Locale locale38 = builder37.build();
        java.util.Locale.Builder builder39 = builder37.clearExtensions();
        printStream11.print((java.lang.Object) builder39);
        java.util.Locale.Builder builder41 = builder39.clear();
        java.util.Locale.Builder builder42 = builder41.clear();
        java.util.Locale locale43 = builder42.build();
        java.lang.String str44 = locale43.getVariant();
        java.lang.String str45 = locale43.getVariant();
        java.util.Locale.Category category46 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale47 = java.util.Locale.GERMANY;
        java.util.Locale locale48 = java.util.Locale.ITALY;
        java.lang.String str49 = locale48.getISO3Language();
        java.lang.String str50 = locale47.getDisplayLanguage(locale48);
        java.util.Locale.setDefault(category46, locale48);
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale48.getDisplayScript(locale52);
        java.lang.String str54 = locale43.getDisplayScript(locale48);
        java.lang.String str55 = locale1.getDisplayScript(locale48);
        org.junit.Assert.assertEquals(locale1.toString(), "ita");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(printWriter27);
        org.junit.Assert.assertNotNull(printStream30);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category46.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ita" + "'", str49, "ita");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "tedesco" + "'", str50, "tedesco");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(120, 120, 27);
        double double5 = hypergeometricDistributionImpl3.probability(0.8290598290598216d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("allemand (Allemagne)");
        printWriter1.write(52);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "CHINOIS (TAIWAN)");
        java.io.PrintWriter printWriter7 = printWriter1.append((java.lang.CharSequence) "en-CA");
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(printWriter7);
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
        java.io.PrintStream printStream1 = new java.io.PrintStream("ko");
        printStream1.print(false);
        printStream1.print(117);
        java.io.PrintStream printStream6 = new java.io.PrintStream((java.io.OutputStream) printStream1);
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        java.util.Locale locale1 = new java.util.Locale("allemand (Allemagne)");
        org.junit.Assert.assertEquals(locale1.toString(), "allemand (allemagne)");
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\uc774\ud0c8\ub9ac\uc544");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        java.util.Locale locale2 = new java.util.Locale("\uc77c\ubcf8\uc5b4", "italy (ITALY)");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "\uc77c\ubcf8\uc5b4_ITALY (ITALY)");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) '#', (int) '#');
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        hypergeometricDistributionImpl3.setSampleSize(16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999999998812d + "'", double5 == 0.9999999999998812d);
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
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
        printStream16.close();
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder37.setLanguageTag("ita");
        java.util.Locale locale40 = java.util.Locale.JAPANESE;
        java.util.Locale locale41 = java.util.Locale.JAPANESE;
        java.lang.String str42 = locale40.getDisplayCountry(locale41);
        java.lang.String str43 = locale40.getVariant();
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str45 = locale40.getDisplayScript(locale44);
        boolean boolean46 = locale40.hasExtensions();
        java.util.Locale.Builder builder47 = builder37.setLocale(locale40);
        java.util.Locale locale48 = builder47.build();
        java.util.Locale locale49 = builder47.build();
        java.lang.String str50 = locale49.getDisplayVariant();
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException();
        java.lang.String str54 = mathException53.getPattern();
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("italien", (java.lang.Throwable) mathException53);
        java.lang.Throwable[] throwableArray56 = mathException55.getSuppressed();
        java.io.PrintStream printStream57 = printStream16.format(locale49, "allemand (Allemagne)", (java.lang.Object[]) throwableArray56);
        java.io.PrintStream printStream59 = printStream16.append((java.lang.CharSequence) "zh_CN");
        printStream59.write(1);
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
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ja");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ja");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(printStream57);
        org.junit.Assert.assertNotNull(printStream59);
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = new java.util.Locale("fr", "fr");
        java.lang.String str6 = locale5.getDisplayScript();
        java.util.Locale.setDefault(locale5);
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale locale11 = java.util.Locale.getDefault(category9);
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str14 = locale12.getExtension('u');
        java.util.Locale locale17 = new java.util.Locale("it_IT", "ITA");
        java.lang.String str18 = locale12.getDisplayLanguage(locale17);
        java.util.Set<java.lang.Character> charSet19 = locale17.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet20 = locale17.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale17);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals(locale17.toString(), "it_it_ITA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "French" + "'", str18, "French");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertNotNull(charSet20);
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
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
        printStream1.print((int) (byte) -1);
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.OutputStream) printStream1, true);
        java.io.PrintStream printStream61 = printStream1.append((java.lang.CharSequence) "cinese");
        printStream61.println(0);
        java.io.PrintStream printStream65 = printStream61.append('a');
        printStream61.print((long) 35);
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
        org.junit.Assert.assertNotNull(printStream61);
        org.junit.Assert.assertNotNull(printStream65);
    }

    @Test
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
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
        printWriter1.println('x');
        printWriter1.println(' ');
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        java.util.Locale.Builder builder26 = builder24.setLanguageTag("fr");
        java.util.Locale.Builder builder28 = builder26.setLanguageTag("fr-CA");
        java.util.Locale.Builder builder29 = builder26.clear();
        java.util.Locale locale30 = java.util.Locale.JAPANESE;
        java.util.Locale locale31 = java.util.Locale.JAPANESE;
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.lang.String str33 = locale30.getVariant();
        java.util.Locale.Builder builder34 = builder26.setLocale(locale30);
        java.util.Locale.Builder builder36 = builder26.setLanguageTag("fr-FR");
        java.util.Locale.Builder builder38 = builder36.setLanguageTag("ITA");
        java.util.Locale locale39 = builder36.build();
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
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("", objArray55);
        java.lang.Throwable[] throwableArray59 = mathException58.getSuppressed();
        java.lang.Throwable[] throwableArray60 = mathException58.getSuppressed();
        java.io.PrintWriter printWriter61 = printWriter1.format(locale39, "Italian", (java.lang.Object[]) throwableArray60);
        java.io.PrintWriter printWriter63 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter65 = printWriter63.append(' ');
        printWriter65.println((double) '4');
        char[] charArray73 = new char[] { '4', ' ', 'x', 'u', 'a' };
        printWriter65.print(charArray73);
        printWriter1.write(charArray73);
        printWriter1.println((long) 'x');
        printWriter1.println("tedesco (ORG.APACHE.COMMONS.MATH.MATHEXCEPTION: ,org.apache.commons.math.MathException: hi!)");
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
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ita");
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
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(printWriter61);
        org.junit.Assert.assertNotNull(printWriter65);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "4 xua");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "4 xua");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[4,  , x, u, a]");
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        java.io.PrintStream printStream1 = new java.io.PrintStream("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        java.io.PrintStream printStream3 = printStream1.append((java.lang.CharSequence) "fra");
        java.io.PrintStream printStream5 = new java.io.PrintStream("fran\347ais (France)");
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
        java.io.PrintStream printStream34 = new java.io.PrintStream("zh_CN");
        printStream34.println();
        java.io.PrintStream printStream37 = printStream34.append('#');
        printStream34.close();
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream34.write(byteArray43);
        printStream34.print(false);
        printStream34.println("Italy");
        java.io.PrintStream printStream50 = new java.io.PrintStream("zh_CN");
        printStream50.println((float) (-1));
        java.io.PrintStream printStream54 = new java.io.PrintStream("zh_CN");
        printStream54.println();
        java.io.PrintStream printStream57 = printStream54.append('#');
        printStream54.close();
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream54.write(byteArray63);
        printStream50.write(byteArray63);
        printStream34.write(byteArray63);
        printStream32.write(byteArray63);
        printStream5.write(byteArray63);
        printStream1.write(byteArray63);
        printStream1.println((double) 27);
        org.junit.Assert.assertNotNull(printStream3);
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
        org.junit.Assert.assertNotNull(printStream37);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(printStream57);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-1, 100, -1, -1]");
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream1.write(byteArray9);
        printStream1.write((int) 'a');
        java.io.PrintStream printStream13 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream15 = printStream1.append((java.lang.CharSequence) "italiano (Italia)");
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter((java.io.OutputStream) printStream15, false);
        printStream15.print(0.001354928450285685d);
        printStream15.print((float) (short) -1);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(printStream15);
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("org.apache.commons.math.mathexception: hi!", "org.apache.commons.math.mathexception: tedesco (ORG.APACHE.COMMONS.MATH.MATHEXCEPTION: ITALIANO (ITALIA),jpn)");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: org.apache.commons.math.mathexception: tedesco (ORG.APACHE.COMMONS.MATH.MATHEXCEPTION: ITALIANO (ITALIA),jpn)");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder9 = builder3.setExtension('a', "italiano");
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("cinese");
        java.util.Locale.Builder builder14 = builder9.setExtension('x', "ANGLAIS");
        java.util.Locale.Builder builder16 = builder9.setVariant("ENGLISH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder16.setExtension('4', "Italienisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'x');
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(100);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(10);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(34);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = hypergeometricDistributionImpl3.cumulativeProbability(0.12646209577280407d, 0.09567808682240089d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 120 + "'", int19 == 120);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.probability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'u');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, 0.44444444444442294d);
        double double14 = hypergeometricDistributionImpl3.probability(0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double18 = hypergeometricDistributionImpl3.probability(0);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7008547008546866d + "'", double6 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7008547008546866d + "'", double12 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7008547008546866d + "'", double14 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6500000000000139d + "'", double18 == 0.6500000000000139d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.addUnicodeLocaleAttribute("chinois");
        java.util.Locale locale5 = java.util.Locale.ROOT;
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale5.getCountry();
        java.lang.String str8 = locale5.getDisplayLanguage();
        boolean boolean9 = locale5.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale5.getISO3Language();
        java.util.Locale.Builder builder12 = builder0.setLocale(locale5);
        java.util.Locale locale13 = builder0.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
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
        printStream15.print("ja");
        java.io.PrintStream printStream21 = new java.io.PrintStream((java.io.OutputStream) printStream15, true);
        java.io.PrintStream printStream23 = printStream15.append('x');
        printStream23.print(false);
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter("fr");
        printWriter27.print("it_IT");
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter32 = printWriter27.printf("fr", objArray31);
        printWriter32.print((float) (byte) 100);
        java.io.PrintWriter printWriter36 = printWriter32.append((java.lang.CharSequence) "ja");
        printWriter32.print((java.lang.Object) "\u4e2d\u56fd\u8a9e");
        java.io.PrintWriter printWriter39 = new java.io.PrintWriter((java.io.Writer) printWriter32);
        java.io.PrintWriter printWriter41 = new java.io.PrintWriter("fr");
        printWriter41.print("it_IT");
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter46 = printWriter41.printf("fr", objArray45);
        printWriter41.println((float) 'u');
        printWriter41.write("en-GB");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl54 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int55 = hypergeometricDistributionImpl54.getSampleSize();
        int int56 = hypergeometricDistributionImpl54.getPopulationSize();
        double double58 = hypergeometricDistributionImpl54.upperCumulativeProbability((int) '#');
        int int59 = hypergeometricDistributionImpl54.getPopulationSize();
        int int60 = hypergeometricDistributionImpl54.getNumberOfSuccesses();
        hypergeometricDistributionImpl54.setNumberOfSuccesses((int) (byte) 10);
        printWriter41.print((java.lang.Object) hypergeometricDistributionImpl54);
        printWriter41.close();
        java.io.PrintStream printStream66 = new java.io.PrintStream("zh_CN");
        printStream66.println((float) (-1));
        java.io.PrintStream printStream70 = new java.io.PrintStream("zh_CN");
        printStream70.print((float) (byte) -1);
        char[] charArray75 = new char[] { 'x', 'u' };
        printStream70.println(charArray75);
        printStream66.println(charArray75);
        printWriter41.println(charArray75);
        printWriter39.print(charArray75);
        printStream23.println(charArray75);
        org.junit.Assert.assertEquals(locale8.toString(), "italy");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(printStream15);
        org.junit.Assert.assertNotNull(printStream17);
        org.junit.Assert.assertNotNull(printStream23);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(printWriter32);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(printWriter46);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 117 + "'", int56 == 117);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 117 + "'", int59 == 117);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[x, u]");
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double5 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) 'x');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(12);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'a');
        double double18 = hypergeometricDistributionImpl3.probability((double) 59);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double14 = hypergeometricDistributionImpl3.probability((int) '4');
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability(119);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1709401709401705d + "'", double16 == 0.1709401709401705d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
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
        java.util.Locale.Builder builder11 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder0.setLanguage("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ???????? (??????) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
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
        java.io.PrintWriter printWriter18 = new java.io.PrintWriter((java.io.OutputStream) printStream1, false);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.Writer) printWriter18);
        printWriter18.print("english");
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.lang.String str24 = locale23.getDisplayScript();
        java.lang.String str25 = locale23.getDisplayLanguage();
        java.lang.String str26 = locale23.getVariant();
        java.lang.Object[] objArray28 = null;
        java.io.PrintWriter printWriter29 = printWriter18.format(locale23, "zh_CN", objArray28);
        printWriter29.print((float) (byte) 0);
        printWriter29.println((float) 'a');
        printWriter29.println(false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "French" + "'", str25, "French");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(printWriter29);
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        printStream4.println('#');
        printStream4.println();
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
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter("fr");
        printWriter27.print("it_IT");
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", objArray34);
        java.lang.Throwable[] throwableArray36 = mathException35.getSuppressed();
        java.lang.Throwable[] throwableArray37 = mathException35.getSuppressed();
        java.io.PrintWriter printWriter38 = printWriter27.printf(locale31, "it_IT", (java.lang.Object[]) throwableArray37);
        java.io.PrintWriter printWriter39 = printWriter10.format("it_IT", (java.lang.Object[]) throwableArray37);
        printWriter39.println('x');
        java.io.PrintWriter printWriter42 = new java.io.PrintWriter((java.io.Writer) printWriter39);
        java.io.PrintWriter printWriter44 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter46 = new java.io.PrintWriter("fr");
        printWriter46.print("it_IT");
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray53 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", objArray53);
        java.lang.Throwable[] throwableArray55 = mathException54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = mathException54.getSuppressed();
        java.io.PrintWriter printWriter57 = printWriter46.printf(locale50, "it_IT", (java.lang.Object[]) throwableArray56);
        java.io.PrintWriter printWriter60 = new java.io.PrintWriter("fr");
        printWriter60.print("it_IT");
        java.util.Locale locale63 = java.util.Locale.ROOT;
        boolean boolean64 = locale63.hasExtensions();
        java.util.Locale locale65 = java.util.Locale.ROOT;
        java.lang.String str66 = locale63.getDisplayName(locale65);
        java.util.Locale locale67 = java.util.Locale.ROOT;
        boolean boolean68 = locale67.hasExtensions();
        java.lang.String str69 = locale63.getDisplayCountry(locale67);
        java.lang.Object[] objArray72 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("hi!", objArray72);
        java.io.PrintWriter printWriter74 = printWriter60.printf(locale67, "it_IT", objArray72);
        java.io.PrintWriter printWriter75 = printWriter44.printf(locale50, "fr", objArray72);
        char[] charArray79 = new char[] { '#', ' ', 'x' };
        printWriter44.write(charArray79);
        printWriter42.write(charArray79);
        printStream4.print(charArray79);
        org.junit.Assert.assertNotNull(printStream4);
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
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(printWriter38);
        org.junit.Assert.assertNotNull(printWriter39);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(printWriter57);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(printWriter74);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "# x");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "# x");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[#,  , x]");
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
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
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException25);
        java.lang.Object[] objArray29 = mathException25.getArguments();
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
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter((java.io.OutputStream) printStream1, true);
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter((java.io.OutputStream) printStream1, false);
        printWriter8.println(10.0d);
        java.io.PrintWriter printWriter12 = new java.io.PrintWriter("fr");
        printWriter12.print("it_IT");
        java.util.Locale locale15 = java.util.Locale.ROOT;
        boolean boolean16 = locale15.hasExtensions();
        java.util.Locale locale17 = java.util.Locale.ROOT;
        java.lang.String str18 = locale15.getDisplayName(locale17);
        java.util.Locale locale19 = java.util.Locale.ROOT;
        boolean boolean20 = locale19.hasExtensions();
        java.lang.String str21 = locale15.getDisplayCountry(locale19);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", objArray24);
        java.io.PrintWriter printWriter26 = printWriter12.printf(locale19, "it_IT", objArray24);
        printWriter12.println();
        printWriter12.print(10);
        java.io.PrintWriter printWriter33 = printWriter12.append((java.lang.CharSequence) "fr", (int) (short) 0, (int) (byte) 1);
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter((java.io.Writer) printWriter12, true);
        printWriter8.print((java.lang.Object) printWriter35);
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter((java.io.Writer) printWriter8);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(printWriter26);
        org.junit.Assert.assertNotNull(printWriter33);
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
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
        printWriter15.print((double) 100.0f);
        java.io.PrintWriter printWriter44 = new java.io.PrintWriter((java.io.Writer) printWriter15);
        printWriter44.println(119);
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
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) '4');
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 117 + "'", int19 == 117);
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.probability(52);
        double double16 = hypergeometricDistributionImpl3.probability(0.5075062466329527d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 117 + "'", int10 == 117);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
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
        java.io.PrintStream printStream57 = new java.io.PrintStream("zh_CN");
        printStream57.println();
        java.io.PrintStream printStream60 = printStream57.append('#');
        printStream57.close();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream57.write(byteArray65);
        printStream1.write(byteArray65);
        printStream1.print((int) (short) 100);
        java.io.PrintStream printStream70 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        printStream70.println();
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
        org.junit.Assert.assertNotNull(printStream60);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 10, -1]");
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) (short) 100);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'u');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability(0.9986450715497108d);
        hypergeometricDistributionImpl3.setPopulationSize(33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6500000000000139d + "'", double23 == 0.6500000000000139d);
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
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
        printStream1.print((int) (byte) -1);
        printStream1.println((float) 17);
        printStream1.print(3.72317234707988E-12d);
        printStream1.println((long) 4);
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
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
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
        printWriter1.print((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write("ja__ja", 5, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 38");
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
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        boolean boolean3 = printWriter1.checkError();
        java.io.PrintWriter printWriter5 = printWriter1.append('x');
        printWriter1.println((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(printWriter5);
    }

    @Test
    public void test16721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16721");
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
        printWriter30.println((int) (short) 0);
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        boolean boolean34 = locale33.hasExtensions();
        printWriter30.print((java.lang.Object) locale33);
        java.util.Locale locale39 = new java.util.Locale("tedesco", "org.apache.commons.math.MathException: ", "org.apache.commons.math.MathException: hi!");
        java.io.PrintWriter printWriter42 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter44 = printWriter42.append(' ');
        printWriter42.println('a');
        printWriter42.println((float) 'a');
        java.util.Locale locale49 = java.util.Locale.UK;
        java.util.Locale locale50 = java.util.Locale.JAPAN;
        java.lang.String str51 = locale49.getDisplayScript(locale50);
        java.io.PrintWriter printWriter54 = new java.io.PrintWriter("fr");
        printWriter54.print("it_IT");
        java.util.Locale locale57 = java.util.Locale.ROOT;
        boolean boolean58 = locale57.hasExtensions();
        java.util.Locale locale59 = java.util.Locale.ROOT;
        java.lang.String str60 = locale57.getDisplayName(locale59);
        java.util.Locale locale61 = java.util.Locale.ROOT;
        boolean boolean62 = locale61.hasExtensions();
        java.lang.String str63 = locale57.getDisplayCountry(locale61);
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!", objArray66);
        java.io.PrintWriter printWriter68 = printWriter54.printf(locale61, "it_IT", objArray66);
        java.io.PrintWriter printWriter71 = new java.io.PrintWriter("fr");
        printWriter71.print("it_IT");
        java.util.Locale locale75 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray78 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("hi!", objArray78);
        java.lang.Throwable[] throwableArray80 = mathException79.getSuppressed();
        java.lang.Throwable[] throwableArray81 = mathException79.getSuppressed();
        java.io.PrintWriter printWriter82 = printWriter71.printf(locale75, "it_IT", (java.lang.Object[]) throwableArray81);
        java.io.PrintWriter printWriter83 = printWriter54.format("it_IT", (java.lang.Object[]) throwableArray81);
        java.util.Locale locale84 = java.util.Locale.JAPANESE;
        java.util.Locale locale85 = java.util.Locale.JAPANESE;
        java.lang.String str86 = locale84.getDisplayCountry(locale85);
        java.lang.String str87 = locale84.getVariant();
        java.lang.String str88 = locale84.getCountry();
        java.lang.String[] strArray90 = java.util.Locale.getISOCountries();
        java.io.PrintWriter printWriter91 = printWriter54.format(locale84, "fr-CA", (java.lang.Object[]) strArray90);
        java.io.PrintWriter printWriter92 = printWriter42.format(locale49, "Italian (Italy)", (java.lang.Object[]) strArray90);
        java.io.PrintWriter printWriter93 = printWriter30.format(locale39, "\uc77c\ubcf8\uc5b4", (java.lang.Object[]) strArray90);
        java.util.Set<java.lang.Character> charSet94 = locale39.getExtensionKeys();
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
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals(locale39.toString(), "tedesco_ORG.APACHE.COMMONS.MATH.MATHEXCEPTION: _org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(printWriter68);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(printWriter82);
        org.junit.Assert.assertNotNull(printWriter83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "ja");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(printWriter91);
        org.junit.Assert.assertNotNull(printWriter92);
        org.junit.Assert.assertNotNull(printWriter93);
        org.junit.Assert.assertNotNull(charSet94);
    }

    @Test
    public void test16722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16722");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("jpn");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("Italian (CANADA)", (java.lang.Throwable) mathException2);
    }

    @Test
    public void test16723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16723");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.lang.String str3 = locale0.getDisplayName(locale2);
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
        printWriter19.print((double) 100L);
        java.util.Locale locale22 = java.util.Locale.JAPANESE;
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.lang.String str25 = locale22.getVariant();
        java.lang.String str26 = locale22.getCountry();
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
        java.io.PrintWriter printWriter45 = printWriter19.format(locale22, "fra", (java.lang.Object[]) throwableArray43);
        java.util.Set<java.lang.String> strSet46 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str47 = locale22.toLanguageTag();
        java.lang.String str48 = locale2.getDisplayLanguage(locale22);
        java.util.Locale locale51 = new java.util.Locale("en-GB", "Italy");
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        java.lang.String str53 = locale2.getDisplayVariant(locale51);
        java.lang.String str54 = locale2.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
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
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ja");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
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
        org.junit.Assert.assertNotNull(printWriter45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ja" + "'", str47, "ja");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals(locale51.toString(), "en-gb_ITALY");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test16724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16724");
        java.io.PrintStream printStream1 = new java.io.PrintStream("fran\347ais (France)");
        printStream1.print("\u30ab\u30ca\u30c0");
        java.io.PrintStream printStream5 = printStream1.append((java.lang.CharSequence) "ja");
        printStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream10 = printStream1.append((java.lang.CharSequence) "\uce90\ub098\ub2e4", 43, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream5);
    }

    @Test
    public void test16725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16725");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter9 = printWriter7.append(' ');
        char[] charArray12 = new char[] { 'x', 'a' };
        printWriter9.print(charArray12);
        printStream1.println(charArray12);
        java.io.PrintStream printStream17 = new java.io.PrintStream("zh_CN");
        printStream17.print((float) (byte) -1);
        printStream17.println();
        printStream17.println();
        java.io.PrintStream printStream23 = new java.io.PrintStream((java.io.OutputStream) printStream17, true);
        printStream17.println();
        printStream17.print((-1));
        java.io.PrintStream printStream28 = new java.io.PrintStream("zh_CN");
        printStream28.println();
        java.io.PrintStream printStream31 = printStream28.append('#');
        printStream28.close();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream28.write(byteArray36);
        printStream17.write(byteArray36);
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("italien");
        java.io.PrintWriter printWriter44 = new java.io.PrintWriter("fr");
        printWriter44.print("it_IT");
        java.util.Locale locale47 = java.util.Locale.ROOT;
        boolean boolean48 = locale47.hasExtensions();
        java.util.Locale locale49 = java.util.Locale.ROOT;
        java.lang.String str50 = locale47.getDisplayName(locale49);
        java.util.Locale locale51 = java.util.Locale.ROOT;
        boolean boolean52 = locale51.hasExtensions();
        java.lang.String str53 = locale47.getDisplayCountry(locale51);
        java.lang.Object[] objArray56 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", objArray56);
        java.io.PrintWriter printWriter58 = printWriter44.printf(locale51, "it_IT", objArray56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("", objArray56);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException59);
        java.lang.Object[] objArray61 = mathException59.getArguments();
        java.io.PrintStream printStream62 = printStream17.printf(locale40, "it_IT", objArray61);
        java.io.PrintStream printStream63 = printStream1.format("Chinesisch (Taiwan)", objArray61);
        printStream1.print((float) (short) 1);
        java.io.PrintStream printStream67 = printStream1.append('a');
        java.io.PrintWriter printWriter68 = new java.io.PrintWriter((java.io.OutputStream) printStream67);
        printWriter68.print((float) 35);
        printWriter68.print(' ');
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(printWriter9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[x, a]");
        org.junit.Assert.assertNotNull(printStream31);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "italien");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNotNull(printWriter58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNotNull(printStream62);
        org.junit.Assert.assertNotNull(printStream63);
        org.junit.Assert.assertNotNull(printStream67);
    }

    @Test
    public void test16726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16726");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        boolean boolean3 = printWriter1.checkError();
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        java.io.PrintWriter printWriter7 = printWriter5.append((java.lang.CharSequence) "English");
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter((java.io.Writer) printWriter5);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Collection<java.util.Locale> localeCollection12 = null;
        java.util.Locale locale13 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, localeCollection12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "fr", "", "Italy", "", "fr" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList28);
        java.util.Locale.FilteringMode filteringMode31 = null;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList28, filteringMode31);
        printWriter5.println((java.lang.Object) languageRangeList10);
        printWriter5.close();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(printWriter7);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test16727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16727");
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
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        printStream27.write(byteArray34);
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter("fr");
        printWriter38.print("it_IT");
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", objArray45);
        java.lang.Throwable[] throwableArray47 = mathException46.getSuppressed();
        java.lang.Throwable[] throwableArray48 = mathException46.getSuppressed();
        java.io.PrintWriter printWriter49 = printWriter38.printf(locale42, "it_IT", (java.lang.Object[]) throwableArray48);
        java.util.Locale locale50 = java.util.Locale.ITALY;
        java.util.Locale locale51 = java.util.Locale.ROOT;
        boolean boolean52 = locale51.hasExtensions();
        java.lang.String str53 = locale50.getDisplayCountry(locale51);
        java.lang.String str54 = locale50.getDisplayVariant();
        java.lang.Object[] objArray57 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!", objArray57);
        java.lang.Throwable[] throwableArray59 = mathException58.getSuppressed();
        java.io.PrintWriter printWriter60 = printWriter49.format(locale50, "", (java.lang.Object[]) throwableArray59);
        printWriter60.print(false);
        printWriter60.println(true);
        java.io.PrintWriter printWriter66 = new java.io.PrintWriter((java.io.Writer) printWriter60, true);
        java.util.Locale locale67 = java.util.Locale.JAPANESE;
        java.util.Locale locale68 = java.util.Locale.JAPANESE;
        java.lang.String str69 = locale67.getDisplayCountry(locale68);
        boolean boolean70 = locale68.hasExtensions();
        java.util.Locale.setDefault(locale68);
        java.lang.String str72 = locale68.getLanguage();
        java.lang.String str74 = locale68.getExtension('u');
        java.util.Set<java.lang.String> strSet75 = locale68.getUnicodeLocaleKeys();
        java.lang.String str76 = locale68.getDisplayLanguage();
        java.util.Locale locale77 = java.util.Locale.ROOT;
        boolean boolean78 = locale77.hasExtensions();
        java.util.Locale locale79 = java.util.Locale.ROOT;
        java.lang.String str80 = locale77.getDisplayName(locale79);
        java.lang.String str81 = locale77.toLanguageTag();
        java.lang.String str82 = locale77.getScript();
        java.lang.String str83 = locale68.getDisplayName(locale77);
        java.util.Locale.setDefault(locale77);
        java.lang.Throwable throwable88 = null;
        org.apache.commons.math.MathException mathException89 = new org.apache.commons.math.MathException(throwable88);
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException89);
        java.lang.Throwable[] throwableArray91 = mathException90.getSuppressed();
        java.lang.Throwable throwable92 = null;
        org.apache.commons.math.MathException mathException93 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray91, throwable92);
        java.lang.Object[] objArray94 = mathException93.getArguments();
        org.apache.commons.math.MathException mathException95 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException93);
        java.lang.Object[] objArray96 = mathException93.getArguments();
        java.io.PrintWriter printWriter97 = printWriter60.printf(locale77, "allemand-x-lvariant-US", objArray96);
        java.io.PrintStream printStream98 = printStream27.format("tedesco (Germania)", objArray96);
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
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, -1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Italy" + "'", str53, "Italy");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(printWriter60);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ja");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ja" + "'", str72, "ja");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str76, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "und" + "'", str81, "und");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Japanese" + "'", str83, "Japanese");
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray94), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray94), "[]");
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray96), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray96), "[]");
        org.junit.Assert.assertNotNull(printWriter97);
        org.junit.Assert.assertNotNull(printStream98);
    }

    @Test
    public void test16728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16728");
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
        printWriter32.close();
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("fr-ca");
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("fr", (java.lang.Throwable) mathException36);
        printWriter32.println((java.lang.Object) mathException36);
        printWriter32.print((-1.0d));
        java.io.PrintWriter printWriter42 = new java.io.PrintWriter("fr");
        printWriter42.print("it_IT");
        java.lang.Object[] objArray46 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter47 = printWriter42.printf("fr", objArray46);
        printWriter42.println((float) 'u');
        printWriter42.println("English");
        printWriter42.println((java.lang.Object) "it_IT");
        printWriter42.flush();
        printWriter42.println();
        printWriter42.print(0.44444444444442294d);
        printWriter42.print('u');
        printWriter32.print((java.lang.Object) 'u');
        printWriter32.print((double) 2);
        java.lang.Object obj63 = null;
        printWriter32.println(obj63);
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
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(printWriter47);
    }

    @Test
    public void test16729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16729");
        java.util.Locale locale3 = new java.util.Locale("", "french", "jpn");
        org.junit.Assert.assertEquals(locale3.toString(), "_FRENCH_jpn");
    }

    @Test
    public void test16730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16730");
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
        hypergeometricDistributionImpl39.setPopulationSize(10);
        double double57 = hypergeometricDistributionImpl39.cumulativeProbability((int) (byte) -1);
        double double60 = hypergeometricDistributionImpl39.cumulativeProbability(10, 16);
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
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test16731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16731");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("eng");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("ja__ja (GERMAN,en,CA)", (java.lang.Throwable) mathException2);
    }

    @Test
    public void test16732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16732");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.probability(1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f), 0.02999999999999997d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability(1.1211251798381178E-14d, 0.06685210443059315d);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2991452991452851d + "'", double17 == 0.2991452991452851d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.7008547008546866d + "'", double22 == 0.7008547008546866d);
    }

    @Test
    public void test16733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16733");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.clear();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder12 = builder10.setLanguage("chinois");
        java.util.Locale.Builder builder14 = builder12.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder14.setExtension(' ', "org.apache.commons.math.MathException: IT_IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test16734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16734");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(117);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.2991452991453134d);
        double double21 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        int int25 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.15590747020451431d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test16735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16735");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
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
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.io.PrintStream printStream21 = new java.io.PrintStream("zh_CN");
        printStream21.print((float) (byte) -1);
        printStream21.println();
        printStream21.print("ita");
        java.util.Locale locale28 = new java.util.Locale("Italy");
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", objArray31);
        java.lang.Throwable[] throwableArray33 = mathException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = mathException32.getSuppressed();
        java.io.PrintStream printStream35 = printStream21.printf(locale28, "chinois", (java.lang.Object[]) throwableArray34);
        java.util.Locale.setDefault(category0, locale28);
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.ROOT;
        boolean boolean39 = locale38.hasExtensions();
        java.lang.String str40 = locale38.getCountry();
        java.lang.String str41 = locale38.getScript();
        java.lang.String str42 = locale37.getDisplayCountry(locale38);
        java.lang.String str43 = locale28.getDisplayLanguage(locale37);
        java.lang.String str44 = locale37.getCountry();
        java.util.Set<java.lang.String> strSet45 = locale37.getUnicodeLocaleAttributes();
        java.lang.String str46 = locale37.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
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
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale28.toString(), "italy");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(printStream35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "China" + "'", str42, "China");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "italy" + "'", str43, "italy");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "CN" + "'", str44, "CN");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "CN" + "'", str46, "CN");
    }

    @Test
    public void test16736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16736");
        java.io.PrintStream printStream1 = new java.io.PrintStream("org.apache.commons.math.MathException: Italia");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.setVariant("anglais");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale locale13 = builder12.build();
        java.lang.String str14 = locale13.getDisplayName();
        java.util.Locale.Builder builder15 = builder5.setLocale(locale13);
        java.lang.Object[] objArray17 = null;
        java.io.PrintStream printStream18 = printStream1.format(locale13, "chn", objArray17);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
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
        java.util.Locale.setDefault(category19, locale29);
        java.util.Locale locale38 = java.util.Locale.getDefault(category19);
        java.io.PrintStream printStream40 = new java.io.PrintStream("zh_CN");
        printStream40.print((float) (byte) -1);
        printStream40.println();
        printStream40.print("ita");
        java.util.Locale locale47 = new java.util.Locale("Italy");
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", objArray50);
        java.lang.Throwable[] throwableArray52 = mathException51.getSuppressed();
        java.lang.Throwable[] throwableArray53 = mathException51.getSuppressed();
        java.io.PrintStream printStream54 = printStream40.printf(locale47, "chinois", (java.lang.Object[]) throwableArray53);
        java.util.Locale.setDefault(category19, locale47);
        java.io.PrintWriter printWriter57 = new java.io.PrintWriter("fr");
        printWriter57.print("it_IT");
        java.util.Locale locale61 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray64 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", objArray64);
        java.lang.Throwable[] throwableArray66 = mathException65.getSuppressed();
        java.lang.Throwable[] throwableArray67 = mathException65.getSuppressed();
        java.io.PrintWriter printWriter68 = printWriter57.printf(locale61, "it_IT", (java.lang.Object[]) throwableArray67);
        java.util.Locale locale69 = java.util.Locale.KOREAN;
        java.lang.String str70 = locale61.getDisplayScript(locale69);
        java.lang.String str71 = locale69.getVariant();
        java.util.Locale.setDefault(category19, locale69);
        java.util.Locale locale73 = java.util.Locale.getDefault(category19);
        java.util.Locale locale74 = java.util.Locale.getDefault(category19);
        java.lang.String str75 = locale13.getDisplayLanguage(locale74);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(printStream18);
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "italy");
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
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals(locale47.toString(), "italy");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(printStream54);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(printWriter68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ko");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test16737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16737");
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
        printStream1.println('x');
        boolean boolean16 = printStream1.checkError();
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.util.Locale locale18 = java.util.Locale.ROOT;
        boolean boolean19 = locale18.hasExtensions();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.lang.String str21 = locale18.getDisplayName(locale20);
        java.lang.String str22 = locale17.getDisplayCountry(locale18);
        java.lang.Object[] objArray24 = null;
        java.io.PrintStream printStream25 = printStream1.printf(locale17, "Franz\366sisch (Frankreich)", objArray24);
        java.lang.String str26 = locale17.getDisplayVariant();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Japan" + "'", str22, "Japan");
        org.junit.Assert.assertNotNull(printStream25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test16738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16738");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter3 = printWriter1.append(' ');
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category4, locale5);
        java.lang.Throwable throwable9 = null;
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException(throwable9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        java.lang.Throwable[] throwableArray12 = mathException10.getSuppressed();
        java.io.PrintWriter printWriter13 = printWriter1.format(locale5, "Italy", (java.lang.Object[]) throwableArray12);
        printWriter13.println(false);
        java.io.PrintStream printStream17 = new java.io.PrintStream("zh_CN");
        printStream17.print((float) (byte) -1);
        printStream17.println();
        printStream17.println();
        printStream17.println((float) ' ');
        printStream17.println((double) 0L);
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter((java.io.OutputStream) printStream17, true);
        printWriter27.println(10.0f);
        printWriter27.println((double) 'a');
        java.io.PrintWriter printWriter33 = new java.io.PrintWriter("fr");
        printWriter33.print("it_IT");
        printWriter33.print(0.0f);
        java.io.PrintStream printStream39 = new java.io.PrintStream("zh_CN");
        printStream39.println();
        java.io.PrintStream printStream42 = printStream39.append('#');
        printStream39.close();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream39.write(byteArray47);
        printStream39.write((int) 'a');
        java.io.PrintStream printStream52 = new java.io.PrintStream("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        java.io.PrintWriter printWriter54 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter56 = printWriter54.append(' ');
        char[] charArray59 = new char[] { 'x', 'a' };
        printWriter56.print(charArray59);
        printStream52.print(charArray59);
        printStream39.print(charArray59);
        printWriter33.print(charArray59);
        printWriter27.write(charArray59);
        printWriter13.println(charArray59);
        java.io.PrintWriter printWriter67 = printWriter13.append(' ');
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(printWriter13);
        org.junit.Assert.assertNotNull(printStream42);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(printWriter56);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[x, a]");
        org.junit.Assert.assertNotNull(printWriter67);
    }

    @Test
    public void test16739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16739");
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
        java.io.PrintStream printStream19 = new java.io.PrintStream("zh_CN");
        printStream19.println();
        java.io.PrintStream printStream22 = printStream19.append('#');
        printStream19.close();
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream19.write(byteArray28);
        printStream19.print(false);
        printStream19.println("Italy");
        java.io.PrintStream printStream35 = new java.io.PrintStream("zh_CN");
        printStream35.println((float) (-1));
        java.io.PrintStream printStream39 = new java.io.PrintStream("zh_CN");
        printStream39.println();
        java.io.PrintStream printStream42 = printStream39.append('#');
        printStream39.close();
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream39.write(byteArray48);
        printStream35.write(byteArray48);
        printStream19.write(byteArray48);
        printStream19.println((double) (-1));
        printStream19.println(100L);
        java.io.PrintStream printStream57 = new java.io.PrintStream("zh_CN");
        printStream57.print((float) (byte) -1);
        char[] charArray62 = new char[] { 'x', 'u' };
        printStream57.println(charArray62);
        printStream19.println(charArray62);
        printStream17.println(charArray62);
        printStream17.write(99);
        java.io.PrintStream printStream69 = printStream17.append('x');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(printStream17);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(printStream42);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[x, u]");
        org.junit.Assert.assertNotNull(printStream69);
    }

    @Test
    public void test16740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16740");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CN", 0.14529914529914542d);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14529914529914542d + "'", double3 == 0.14529914529914542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14529914529914542d + "'", double4 == 0.14529914529914542d);
    }

    @Test
    public void test16741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16741");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter1.println((float) 'u');
        printWriter1.println("English");
        printWriter1.write((int) (byte) 1);
        java.io.PrintStream printStream14 = new java.io.PrintStream("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        java.io.PrintStream printStream16 = printStream14.append((java.lang.CharSequence) "fra");
        java.io.PrintStream printStream18 = new java.io.PrintStream("fran\347ais (France)");
        java.io.PrintStream printStream20 = new java.io.PrintStream("zh_CN");
        printStream20.print((float) (byte) -1);
        printStream20.println();
        printStream20.println();
        java.io.PrintStream printStream26 = new java.io.PrintStream((java.io.OutputStream) printStream20, true);
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
        printStream26.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream45 = printStream26.append((java.lang.CharSequence) "fr");
        java.io.PrintStream printStream47 = new java.io.PrintStream("zh_CN");
        printStream47.println();
        java.io.PrintStream printStream50 = printStream47.append('#');
        printStream47.close();
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream47.write(byteArray56);
        printStream47.print(false);
        printStream47.println("Italy");
        java.io.PrintStream printStream63 = new java.io.PrintStream("zh_CN");
        printStream63.println((float) (-1));
        java.io.PrintStream printStream67 = new java.io.PrintStream("zh_CN");
        printStream67.println();
        java.io.PrintStream printStream70 = printStream67.append('#');
        printStream67.close();
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream67.write(byteArray76);
        printStream63.write(byteArray76);
        printStream47.write(byteArray76);
        printStream45.write(byteArray76);
        printStream18.write(byteArray76);
        printStream14.write(byteArray76);
        printWriter1.println((java.lang.Object) byteArray76);
        printWriter1.println('a');
        printWriter1.close();
        java.io.PrintWriter printWriter87 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter87.write("allemand (Allemagne)");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertNotNull(printStream16);
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
        org.junit.Assert.assertNotNull(printStream45);
        org.junit.Assert.assertNotNull(printStream50);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(printStream70);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1, 100, -1, -1]");
    }

    @Test
    public void test16742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16742");
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
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl26 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int27 = hypergeometricDistributionImpl26.getPopulationSize();
        double double29 = hypergeometricDistributionImpl26.cumulativeProbability((double) (short) -1);
        double double31 = hypergeometricDistributionImpl26.probability((double) (short) 100);
        double double33 = hypergeometricDistributionImpl26.cumulativeProbability((double) 117);
        printWriter1.print((java.lang.Object) 117);
        java.io.PrintWriter printWriter36 = printWriter1.append('4');
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", objArray40);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("fr", objArray40);
        java.io.PrintWriter printWriter43 = printWriter36.format("en-GB", objArray40);
        java.io.PrintStream printStream45 = new java.io.PrintStream("zh_CN");
        printStream45.println();
        java.io.PrintStream printStream48 = printStream45.append('#');
        java.io.PrintWriter printWriter50 = new java.io.PrintWriter((java.io.OutputStream) printStream45, true);
        printWriter36.print((java.lang.Object) printStream45);
        printWriter36.print((-1.0f));
        java.io.PrintWriter printWriter55 = printWriter36.append('u');
        java.io.PrintWriter printWriter57 = new java.io.PrintWriter((java.io.Writer) printWriter36, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 117 + "'", int27 == 117);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(printWriter43);
        org.junit.Assert.assertNotNull(printStream48);
        org.junit.Assert.assertNotNull(printWriter55);
    }

    @Test
    public void test16743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16743");
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
        java.io.PrintStream printStream18 = printStream1.append('4');
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter((java.io.OutputStream) printStream18, true);
        printWriter20.print(true);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter((java.io.Writer) printWriter20);
        printWriter23.print((float) (short) 0);
        boolean boolean26 = printWriter23.checkError();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(printStream18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test16744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16744");
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", objArray4);
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = mathException5.getSuppressed();
        java.lang.Object[] objArray8 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException();
        java.lang.String str12 = mathException11.getPattern();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("italien", (java.lang.Throwable) mathException11);
        mathException9.addSuppressed((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("inglese", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("Italia", (java.lang.Throwable) mathException13);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16745");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("ITA", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = mathException4.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("zh_cn", (java.lang.Throwable) mathException4);
        java.lang.Throwable throwable8 = null;
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException(throwable8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException9);
        mathException4.addSuppressed((java.lang.Throwable) mathException9);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test16746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16746");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d, (double) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.probability(0.9658119658119504d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test16747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16747");
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
        printWriter1.close();
        printWriter1.print("hi! (ITALY)");
        printWriter1.write("CAN");
        java.io.PrintWriter printWriter25 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter1.write((int) 'a');
        printWriter1.print("Kanada");
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
    public void test16748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16748");
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
        printStream15.print("ja");
        java.io.PrintStream printStream21 = new java.io.PrintStream((java.io.OutputStream) printStream15, true);
        java.io.PrintStream printStream23 = printStream15.append('x');
        printStream15.println("Taiwan");
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        java.util.Locale.Builder builder29 = builder26.setScript("");
        java.util.Locale.Builder builder31 = builder29.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder32 = builder29.clearExtensions();
        java.util.Locale.Builder builder35 = builder29.setExtension('a', "italiano");
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder36.clearExtensions();
        java.util.Locale.Builder builder39 = builder36.setScript("");
        java.util.Locale.Builder builder41 = builder39.removeUnicodeLocaleAttribute("Italy");
        java.util.Locale.Builder builder43 = builder39.setRegion("ja");
        java.util.Locale.Builder builder46 = builder43.setExtension('a', "italien");
        java.util.Locale.Builder builder48 = builder43.setLanguage("jpn");
        java.util.Locale.Builder builder50 = builder48.setLanguage("");
        java.util.Locale.Builder builder51 = builder50.clear();
        java.util.Locale locale52 = builder50.build();
        java.util.Locale locale53 = locale52.stripExtensions();
        java.util.Locale.setDefault(locale52);
        java.util.Locale.Builder builder55 = builder35.setLocale(locale52);
        java.util.Locale.Builder builder56 = builder55.clear();
        java.util.Locale locale57 = builder56.build();
        printStream15.print((java.lang.Object) locale57);
        org.junit.Assert.assertEquals(locale8.toString(), "italy");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(printStream15);
        org.junit.Assert.assertNotNull(printStream17);
        org.junit.Assert.assertNotNull(printStream23);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
    }

    @Test
    public void test16749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16749");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream4.println((int) 'a');
        printStream4.print(' ');
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.OutputStream) printStream4, false);
        printWriter11.write("Japanisch");
        printWriter11.print(' ');
        printWriter11.write((int) (byte) 0);
        java.io.PrintStream printStream19 = new java.io.PrintStream("zh_CN");
        printStream19.println();
        java.io.PrintStream printStream22 = printStream19.append('#');
        printStream19.close();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream19.write(byteArray27);
        printStream19.write((int) 'a');
        java.io.PrintStream printStream31 = new java.io.PrintStream((java.io.OutputStream) printStream19);
        printStream19.println("Chinese (China)");
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter("fr");
        printWriter37.print("it_IT");
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray44 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("hi!", objArray44);
        java.lang.Throwable[] throwableArray46 = mathException45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = mathException45.getSuppressed();
        java.io.PrintWriter printWriter48 = printWriter37.printf(locale41, "it_IT", (java.lang.Object[]) throwableArray47);
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter("fr");
        printWriter51.print("it_IT");
        java.util.Locale locale54 = java.util.Locale.ROOT;
        boolean boolean55 = locale54.hasExtensions();
        java.util.Locale locale56 = java.util.Locale.ROOT;
        java.lang.String str57 = locale54.getDisplayName(locale56);
        java.util.Locale locale58 = java.util.Locale.ROOT;
        boolean boolean59 = locale58.hasExtensions();
        java.lang.String str60 = locale54.getDisplayCountry(locale58);
        java.lang.Object[] objArray63 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!", objArray63);
        java.io.PrintWriter printWriter65 = printWriter51.printf(locale58, "it_IT", objArray63);
        java.io.PrintWriter printWriter66 = printWriter35.printf(locale41, "fr", objArray63);
        char[] charArray70 = new char[] { '#', ' ', 'x' };
        printWriter35.write(charArray70);
        printStream19.print(charArray70);
        printWriter11.write(charArray70);
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(printWriter48);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(printWriter65);
        org.junit.Assert.assertNotNull(printWriter66);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "# x");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "# x");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[#,  , x]");
    }

    @Test
    public void test16750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16750");
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
        hypergeometricDistributionImpl39.setNumberOfSuccesses(0);
        double double57 = hypergeometricDistributionImpl39.upperCumulativeProbability(10);
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
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
    }

    @Test
    public void test16751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16751");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
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
        java.util.Locale.setDefault(category2, locale12);
        java.util.Locale locale21 = java.util.Locale.getDefault(category2);
        java.io.PrintStream printStream23 = new java.io.PrintStream("zh_CN");
        printStream23.print((float) (byte) -1);
        printStream23.println();
        printStream23.print("ita");
        java.util.Locale locale30 = new java.util.Locale("Italy");
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", objArray33);
        java.lang.Throwable[] throwableArray35 = mathException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = mathException34.getSuppressed();
        java.io.PrintStream printStream37 = printStream23.printf(locale30, "chinois", (java.lang.Object[]) throwableArray36);
        java.util.Locale.setDefault(category2, locale30);
        java.io.PrintWriter printWriter40 = new java.io.PrintWriter("fr");
        printWriter40.print("it_IT");
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray47 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", objArray47);
        java.lang.Throwable[] throwableArray49 = mathException48.getSuppressed();
        java.lang.Throwable[] throwableArray50 = mathException48.getSuppressed();
        java.io.PrintWriter printWriter51 = printWriter40.printf(locale44, "it_IT", (java.lang.Object[]) throwableArray50);
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.lang.String str53 = locale44.getDisplayScript(locale52);
        java.lang.String str54 = locale52.getVariant();
        java.util.Locale.setDefault(category2, locale52);
        java.util.Locale locale56 = java.util.Locale.getDefault(category2);
        java.util.Locale locale57 = java.util.Locale.JAPANESE;
        java.lang.String str58 = locale57.getISO3Country();
        java.lang.String str59 = locale57.getDisplayCountry();
        java.util.Locale.setDefault(category2, locale57);
        java.util.Locale locale64 = new java.util.Locale("", "", "");
        java.util.Locale locale67 = new java.util.Locale("hi!", "Italy");
        java.lang.String str68 = locale64.getDisplayCountry(locale67);
        java.lang.String str69 = locale67.getScript();
        java.lang.String str70 = locale67.getScript();
        java.util.Locale.setDefault(category2, locale67);
        boolean boolean72 = languageRange1.equals((java.lang.Object) locale67);
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "italy");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(printStream37);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertEquals(locale67.toString(), "hi!_ITALY");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test16752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16752");
        java.io.PrintStream printStream1 = new java.io.PrintStream("anglais");
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray10 = mathException9.getArguments();
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", objArray12);
        java.lang.Throwable[] throwableArray14 = mathException13.getSuppressed();
        mathException9.addSuppressed((java.lang.Throwable) mathException13);
        java.lang.Throwable[] throwableArray16 = mathException9.getSuppressed();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException();
        java.lang.String str18 = mathException17.getPattern();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) mathException17);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("fr", objArray22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("it_IT", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) mathException24);
        java.io.PrintStream printStream26 = printStream1.format("deu", (java.lang.Object[]) throwableArray16);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(printStream26);
    }

    @Test
    public void test16753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16753");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        char[] charArray6 = new char[] { 'x', 'u' };
        printStream1.println(charArray6);
        printStream1.print('u');
        printStream1.print((-1.0f));
        printStream1.print((double) 0L);
        printStream1.println((long) 32);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[x, u]");
    }

    @Test
    public void test16754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16754");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fra", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("english");
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Collection<java.util.Locale> localeCollection8 = null;
        java.util.Locale locale9 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, localeCollection8);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Collection<java.util.Locale> localeCollection20 = null;
        java.util.Locale locale21 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, localeCollection20);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.lang.String str26 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale27 = java.util.Locale.ROOT;
        boolean boolean28 = locale27.hasExtensions();
        java.lang.String str29 = locale27.getCountry();
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Locale locale35 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale27, locale30, locale31, locale35 };
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Collection<java.util.Locale> localeCollection43 = null;
        java.util.Locale locale44 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, localeCollection43);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList47);
        java.util.Locale locale50 = java.util.Locale.ROOT;
        boolean boolean51 = locale50.hasExtensions();
        java.lang.String str52 = locale50.getCountry();
        java.util.Locale locale53 = java.util.Locale.JAPAN;
        java.util.Locale locale54 = java.util.Locale.FRENCH;
        java.util.Locale locale58 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale50, locale53, locale54, locale58 };
        java.util.ArrayList<java.util.Locale> localeList60 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList60, localeArray59);
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList60);
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter(languageRangeList16, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale locale65 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale locale66 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale locale67 = java.util.Locale.JAPANESE;
        java.util.Locale locale68 = java.util.Locale.JAPANESE;
        java.lang.String str69 = locale67.getDisplayCountry(locale68);
        java.lang.String str70 = locale67.getVariant();
        java.util.Locale locale71 = java.util.Locale.CANADA;
        java.lang.String str72 = locale67.getDisplayScript(locale71);
        java.util.Set<java.lang.Character> charSet73 = locale71.getExtensionKeys();
        java.util.Set<java.lang.String> strSet74 = locale71.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet74);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.parse("ja");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap78 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList79 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList77, strMap78);
        java.util.Locale locale80 = java.util.Locale.CHINA;
        java.util.Set<java.lang.String> strSet81 = locale80.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList77, (java.util.Collection<java.lang.String>) strSet81, filteringMode82);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList83);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(locale44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr");
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(localeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNull(locale65);
        org.junit.Assert.assertNull(locale66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ja");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charSet73);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(languageRangeList79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode82.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
    }

    @Test
    public void test16755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16755");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(117);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        hypergeometricDistributionImpl3.setPopulationSize(5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2991452991452851d + "'", double9 == 0.2991452991452851d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test16756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16756");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = locale2.getDisplayName();
        boolean boolean5 = locale2.hasExtensions();
        java.lang.String str6 = locale2.getCountry();
        java.lang.String str7 = locale2.getDisplayCountry();
        java.util.Set<java.lang.String> strSet8 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!_ITALY");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_ITALY");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! (ITALY)" + "'", str4, "hi! (ITALY)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITALY" + "'", str6, "ITALY");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITALY" + "'", str7, "ITALY");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test16757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16757");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.lang.String str7 = locale3.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!_ITALY");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test16758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16758");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("ita");
        java.util.Locale.Builder builder4 = builder2.setLanguage("japonais");
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter("fr");
        printWriter6.print("it_IT");
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray13);
        java.lang.Throwable[] throwableArray15 = mathException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = mathException14.getSuppressed();
        java.io.PrintWriter printWriter17 = printWriter6.printf(locale10, "it_IT", (java.lang.Object[]) throwableArray16);
        printWriter6.println((float) (byte) 10);
        printWriter6.print(true);
        java.util.Locale locale22 = java.util.Locale.JAPANESE;
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.lang.String str25 = locale22.getVariant();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale22.getDisplayScript(locale26);
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter("fr");
        printWriter30.write("hi!");
        printWriter30.println((java.lang.Object) (-1L));
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getDisplayName();
        java.lang.Object[] objArray39 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", objArray39);
        java.lang.Object[] objArray41 = mathException40.getArguments();
        java.io.PrintWriter printWriter42 = printWriter30.format(locale35, "anglais", objArray41);
        java.io.PrintWriter printWriter43 = printWriter6.format(locale26, "Italy", objArray41);
        java.lang.String str44 = locale26.getDisplayLanguage();
        java.lang.String str45 = locale26.getCountry();
        java.util.Set<java.lang.String> strSet46 = locale26.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder47 = builder4.setLocale(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder49 = builder4.removeUnicodeLocaleAttribute("tedesco_JA_italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: tedesco_JA_italien (Italie) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(printWriter17);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ja");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Italian (Italy)" + "'", str36, "Italian (Italy)");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(printWriter43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "English" + "'", str44, "English");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "CA" + "'", str45, "CA");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test16759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16759");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        printStream1.close();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream1.write(byteArray9);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        printStream1.print((java.lang.Object) locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale11.getUnicodeLocaleType("japonais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: japonais");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test16760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16760");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0.7142857142857143d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setSampleSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 117 + "'", int16 == 117);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test16761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16761");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.2991452991453134d);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, 2.1858624747371538E-10d);
        double double22 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = hypergeometricDistributionImpl3.cumulativeProbability((double) 16, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.02999999999999997d + "'", double17 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.02999999999999997d + "'", double20 == 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test16762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16762");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.util.Locale> localeCollection3 = null;
        java.util.Locale locale4 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "it_IT", "Italy", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale locale18 = new java.util.Locale("en-GB", "Italy");
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str20 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("fra", strMap22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList23, strMap24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList25, strMap26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Collection<java.util.Locale> localeCollection31 = null;
        java.util.Locale locale32 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, localeCollection31);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList35);
        java.util.Locale locale38 = java.util.Locale.ROOT;
        boolean boolean39 = locale38.hasExtensions();
        java.lang.String str40 = locale38.getCountry();
        java.util.Locale locale41 = java.util.Locale.JAPAN;
        java.util.Locale locale42 = java.util.Locale.FRENCH;
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale38, locale41, locale42, locale46 };
        java.util.ArrayList<java.util.Locale> localeList48 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList48, localeArray47);
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList48);
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter(languageRangeList25, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.Locale locale52 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.Locale locale56 = new java.util.Locale("fra", "it_IT", "fran\347ais (France)");
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.lang.String str59 = locale56.getExtension('x');
        java.util.Set<java.lang.String> strSet60 = locale56.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet60);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap62);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertEquals(locale18.toString(), "en-gb_ITALY");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(localeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNull(locale52);
        org.junit.Assert.assertEquals(locale56.toString(), "fra_IT_IT_fran\347ais (France)");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(languageRangeList63);
    }

    @Test
    public void test16763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16763");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        java.lang.Object obj3 = null;
        printWriter1.print(obj3);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("fr", objArray8);
        java.lang.Throwable[] throwableArray11 = mathException10.getSuppressed();
        java.io.PrintWriter printWriter12 = printWriter1.printf("ita", (java.lang.Object[]) throwableArray11);
        printWriter1.println('a');
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(printWriter12);
    }

    @Test
    public void test16764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16764");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.println();
        printWriter1.write("Italy", 0, (int) (short) -1);
        printWriter1.print(0);
        printWriter1.print('a');
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter1.println(false);
        printWriter1.print((float) 0L);
        java.lang.Object[] objArray17 = null;
        java.io.PrintWriter printWriter18 = printWriter1.printf("", objArray17);
        org.junit.Assert.assertNotNull(printWriter18);
    }

    @Test
    public void test16765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16765");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("italiano");
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str3 = locale1.getLanguage();
        java.util.Locale locale5 = new java.util.Locale("zh_cn (ENGLISH,it,IT)");
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("fr-CA", strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Collection<java.util.Locale> localeCollection13 = null;
        java.util.Locale locale14 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, localeCollection13);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList17);
        java.util.Locale locale20 = java.util.Locale.ROOT;
        boolean boolean21 = locale20.hasExtensions();
        java.lang.String str22 = locale20.getCountry();
        java.util.Locale locale23 = java.util.Locale.JAPAN;
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale23, locale24, locale28 };
        java.util.ArrayList<java.util.Locale> localeList30 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList30, localeArray29);
        java.util.List<java.util.Locale> localeList32 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Collection<java.util.Locale> localeCollection36 = null;
        java.util.Locale locale37 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, localeCollection36);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList40);
        java.util.Locale locale43 = java.util.Locale.ROOT;
        boolean boolean44 = locale43.hasExtensions();
        java.lang.String str45 = locale43.getCountry();
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.util.Locale locale47 = java.util.Locale.FRENCH;
        java.util.Locale locale51 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale43, locale46, locale47, locale51 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.List<java.util.Locale> localeList55 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList53);
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap57);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.util.Collection<java.util.Locale> localeCollection62 = null;
        java.util.Locale locale63 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, localeCollection62);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.lang.String str68 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList66);
        java.util.Locale locale69 = java.util.Locale.ROOT;
        boolean boolean70 = locale69.hasExtensions();
        java.lang.String str71 = locale69.getCountry();
        java.util.Locale locale72 = java.util.Locale.JAPAN;
        java.util.Locale locale73 = java.util.Locale.FRENCH;
        java.util.Locale locale77 = new java.util.Locale("", "", "");
        java.util.Locale[] localeArray78 = new java.util.Locale[] { locale69, locale72, locale73, locale77 };
        java.util.ArrayList<java.util.Locale> localeList79 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList79, localeArray78);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter(languageRangeList58, (java.util.Collection<java.util.Locale>) localeList79, filteringMode82);
        java.util.Locale locale84 = java.util.Locale.lookup(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList79);
        java.lang.String str85 = locale84.getISO3Language();
        java.util.Locale locale86 = locale84.stripExtensions();
        java.lang.String str87 = locale1.getDisplayLanguage(locale86);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italiano");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italiano" + "'", str3, "italiano");
        org.junit.Assert.assertEquals(locale5.toString(), "zh_cn (english,it,it)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(localeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localeList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(localeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(localeList55);
        org.junit.Assert.assertNotNull(localeList56);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(locale63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr");
        org.junit.Assert.assertEquals(locale77.toString(), "");
        org.junit.Assert.assertNotNull(localeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode82.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "fra" + "'", str85, "fra");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "italiano" + "'", str87, "italiano");
    }

    @Test
    public void test16766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16766");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(32);
        double double16 = hypergeometricDistributionImpl3.probability(0.023984009456667447d);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(35);
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        double double21 = hypergeometricDistributionImpl3.probability(0.914529914529871d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 117 + "'", int7 == 117);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test16767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16767");
        java.io.PrintStream printStream3 = new java.io.PrintStream("zh_CN");
        printStream3.print((float) (byte) -1);
        printStream3.println();
        printStream3.print("ita");
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray14);
        java.lang.Throwable[] throwableArray16 = mathException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = mathException15.getSuppressed();
        java.io.PrintStream printStream18 = printStream3.printf(locale11, "fr", (java.lang.Object[]) throwableArray17);
        printStream18.print((int) 'a');
        java.io.PrintStream printStream22 = new java.io.PrintStream((java.io.OutputStream) printStream18, false);
        java.lang.CharSequence charSequence23 = null;
        java.io.PrintStream printStream24 = printStream22.append(charSequence23);
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray27);
        java.lang.Throwable[] throwableArray29 = mathException28.getSuppressed();
        java.lang.Throwable[] throwableArray30 = mathException28.getSuppressed();
        java.io.PrintStream printStream31 = printStream24.printf("italiano", (java.lang.Object[]) throwableArray30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("Germany", (java.lang.Object[]) throwableArray30);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("Chinese (Taiwan)", (java.lang.Throwable) mathException32);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(printStream18);
        org.junit.Assert.assertNotNull(printStream24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(printStream31);
    }

    @Test
    public void test16768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16768");
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
        java.lang.Object obj33 = null;
        printWriter32.print(obj33);
        boolean boolean35 = printWriter32.checkError();
        printWriter32.println('#');
        printWriter32.println((float) 5);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test16769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16769");
        java.util.Locale locale3 = new java.util.Locale("cinese (Cina)", "Japan", "French (France)");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "cinese (cina)_JAPAN_French (France)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "cinese (cina)_JAPAN_French (France)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (cina)_JAPAN_French (France)" + "'", str5, "cinese (cina)_JAPAN_French (France)");
    }

    @Test
    public void test16770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16770");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("fr");
        printWriter1.print("it_IT");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter6 = printWriter1.printf("fr", objArray5);
        printWriter6.print((float) (byte) 100);
        java.io.PrintWriter printWriter10 = printWriter6.append((java.lang.CharSequence) "ja");
        java.io.PrintWriter printWriter12 = printWriter10.append((java.lang.CharSequence) "German");
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter16 = printWriter14.append(' ');
        char[] charArray19 = new char[] { 'x', 'a' };
        printWriter16.print(charArray19);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", objArray24);
        java.lang.Throwable[] throwableArray26 = mathException25.getSuppressed();
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("fr", (java.lang.Object[]) throwableArray26);
        java.io.PrintWriter printWriter28 = printWriter16.printf("en-GB", (java.lang.Object[]) throwableArray26);
        printWriter16.println();
        printWriter10.println((java.lang.Object) printWriter16);
        printWriter16.println(1.0f);
        java.io.PrintStream printStream34 = new java.io.PrintStream("zh_CN");
        printStream34.print((float) (byte) -1);
        printStream34.println();
        printStream34.println();
        java.io.PrintStream printStream40 = new java.io.PrintStream((java.io.OutputStream) printStream34, true);
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
        printStream40.println((java.lang.Object) "it_IT");
        java.io.PrintStream printStream59 = printStream40.append((java.lang.CharSequence) "fr");
        printStream40.print((int) (byte) 1);
        printStream40.println();
        printStream40.print((long) 35);
        printStream40.println((int) (short) 10);
        printStream40.flush();
        printWriter16.println((java.lang.Object) printStream40);
        printWriter16.println((long) 3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(printWriter16);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[x, a]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(printWriter28);
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
        org.junit.Assert.assertNotNull(printStream59);
    }

    @Test
    public void test16771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16771");
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
        printStream7.print((int) (byte) 1);
        byte[] byteArray29 = new byte[] {};
        printStream7.write(byteArray29);
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", objArray33);
        java.lang.Throwable[] throwableArray35 = mathException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = mathException34.getSuppressed();
        java.lang.Object[] objArray37 = mathException34.getArguments();
        java.io.PrintStream printStream38 = printStream7.format("", objArray37);
        java.io.PrintStream printStream40 = new java.io.PrintStream((java.io.OutputStream) printStream38, false);
        printStream40.print("Japanese (Japan)");
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
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(printStream38);
    }

    @Test
    public void test16772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16772");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setVariant("anglais");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.lang.Class<?> wildcardClass10 = locale7.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16773");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double8 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 117);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'u');
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double19 = hypergeometricDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 117 + "'", int13 == 117);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 117 + "'", int14 == 117);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test16774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16774");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.print((float) (byte) -1);
        printStream1.println();
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException(throwable6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException7);
        java.lang.Throwable[] throwableArray9 = mathException7.getSuppressed();
        java.io.PrintStream printStream10 = printStream1.format("italien (Italie)", (java.lang.Object[]) throwableArray9);
        printStream10.flush();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(printStream10);
    }

    @Test
    public void test16775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16775");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        printStream4.println('#');
        printStream4.println();
        printStream4.print("italien (Italie)");
        printStream4.println('a');
        printStream4.print('x');
        printStream4.println((float) (short) 0);
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter((java.io.OutputStream) printStream4);
        printStream4.close();
        printStream4.flush();
        org.junit.Assert.assertNotNull(printStream4);
    }

    @Test
    public void test16776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16776");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 35);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability(0.11499182616210182d);
        double double15 = hypergeometricDistributionImpl3.probability(0.6500000000000139d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7008547008546866d + "'", double7 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test16777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16777");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double12 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double17 = hypergeometricDistributionImpl3.probability(0.9699999999999995d);
        double double19 = hypergeometricDistributionImpl3.probability((int) ' ');
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(2);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability(2.307949844372216E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.3269230769230756d + "'", double23 == 0.3269230769230756d);
    }

    @Test
    public void test16778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16778");
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
        printWriter30.print(0.0d);
        printWriter30.println();
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter("fr");
        printWriter35.print("it_IT");
        java.lang.Object[] objArray39 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter40 = printWriter35.printf("fr", objArray39);
        printWriter40.print((float) (byte) 100);
        java.io.PrintWriter printWriter44 = printWriter40.append((java.lang.CharSequence) "ja");
        printWriter40.print((java.lang.Object) "\u4e2d\u56fd\u8a9e");
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter((java.io.Writer) printWriter40);
        java.io.PrintWriter printWriter49 = new java.io.PrintWriter("fr");
        printWriter49.print("it_IT");
        java.lang.Object[] objArray53 = new java.lang.Object[] {};
        java.io.PrintWriter printWriter54 = printWriter49.printf("fr", objArray53);
        printWriter49.println((float) 'u');
        printWriter49.write("en-GB");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl62 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int63 = hypergeometricDistributionImpl62.getSampleSize();
        int int64 = hypergeometricDistributionImpl62.getPopulationSize();
        double double66 = hypergeometricDistributionImpl62.upperCumulativeProbability((int) '#');
        int int67 = hypergeometricDistributionImpl62.getPopulationSize();
        int int68 = hypergeometricDistributionImpl62.getNumberOfSuccesses();
        hypergeometricDistributionImpl62.setNumberOfSuccesses((int) (byte) 10);
        printWriter49.print((java.lang.Object) hypergeometricDistributionImpl62);
        printWriter49.close();
        java.io.PrintStream printStream74 = new java.io.PrintStream("zh_CN");
        printStream74.println((float) (-1));
        java.io.PrintStream printStream78 = new java.io.PrintStream("zh_CN");
        printStream78.print((float) (byte) -1);
        char[] charArray83 = new char[] { 'x', 'u' };
        printStream78.println(charArray83);
        printStream74.println(charArray83);
        printWriter49.println(charArray83);
        printWriter47.print(charArray83);
        printWriter30.write(charArray83);
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
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(printWriter40);
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(printWriter54);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 117 + "'", int64 == 117);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 117 + "'", int67 == 117);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "xu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "xu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[x, u]");
    }

    @Test
    public void test16779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16779");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("fr");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray4 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("italiano (Italia)");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("ja", objArray4, (java.lang.Throwable) mathException6);
        java.lang.Throwable[] throwableArray8 = mathException6.getSuppressed();
        java.lang.String str9 = mathException6.getPattern();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italiano (Italia)" + "'", str9, "italiano (Italia)");
    }

    @Test
    public void test16780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16780");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setExtension('x', "italien");
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.getVariant();
        boolean boolean9 = locale6.hasExtensions();
        java.util.Locale locale10 = locale6.stripExtensions();
        java.util.Locale.Builder builder11 = builder1.setLocale(locale10);
        java.util.Locale.Builder builder14 = builder1.setExtension('a', "");
        java.io.PrintStream printStream16 = new java.io.PrintStream("zh_CN");
        printStream16.print((float) (byte) -1);
        printStream16.println();
        printStream16.println();
        printStream16.println((float) ' ');
        printStream16.println("hi!");
        printStream16.println('4');
        printStream16.println(true);
        java.util.Locale.Category category29 = java.util.Locale.Category.FORMAT;
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("fr");
        printWriter31.write("hi!");
        printWriter31.println((java.lang.Object) (-1L));
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.lang.String str37 = locale36.getDisplayName();
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", objArray40);
        java.lang.Object[] objArray42 = mathException41.getArguments();
        java.io.PrintWriter printWriter43 = printWriter31.format(locale36, "anglais", objArray42);
        java.util.Locale.setDefault(category29, locale36);
        java.util.Locale locale45 = java.util.Locale.getDefault(category29);
        java.util.Locale locale46 = java.util.Locale.JAPANESE;
        java.util.Locale locale47 = java.util.Locale.JAPANESE;
        java.lang.String str48 = locale46.getDisplayCountry(locale47);
        java.lang.String str49 = locale45.getDisplayName(locale47);
        java.util.Locale locale50 = locale45.stripExtensions();
        java.lang.String str51 = locale45.toLanguageTag();
        java.io.PrintStream printStream54 = new java.io.PrintStream("zh_CN");
        printStream54.print((float) (byte) -1);
        printStream54.println();
        printStream54.println();
        printStream54.println((float) ' ');
        printStream54.println("hi!");
        printStream54.println('4');
        printStream54.println(true);
        java.lang.Throwable throwable69 = null;
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException(throwable69);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException70);
        java.lang.Throwable[] throwableArray72 = mathException71.getSuppressed();
        java.lang.Throwable throwable73 = null;
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("anglais", (java.lang.Object[]) throwableArray72, throwable73);
        java.lang.Object[] objArray75 = mathException74.getArguments();
        java.io.PrintStream printStream76 = printStream54.format("org.apache.commons.math.MathException", objArray75);
        java.io.PrintStream printStream77 = printStream16.printf(locale45, "org.apache.commons.math.MathException: English", objArray75);
        java.util.Set<java.lang.String> strSet78 = locale45.getUnicodeLocaleAttributes();
        java.lang.String str79 = locale45.getISO3Country();
        java.util.Locale.Builder builder80 = builder14.setLocale(locale45);
        java.lang.String str81 = locale45.getScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.FORMAT + "'", category29.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Italian (Italy)" + "'", str37, "Italian (Italy)");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(printWriter43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ja");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str49, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "it-IT" + "'", str51, "it-IT");
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertNotNull(printStream76);
        org.junit.Assert.assertNotNull(printStream77);
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ITA" + "'", str79, "ITA");
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test16781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16781");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        double double5 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'u');
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, 117);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(17);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test16782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16782");
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
        printStream16.print((int) 'a');
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream16, false);
        java.lang.CharSequence charSequence21 = null;
        java.io.PrintStream printStream22 = printStream20.append(charSequence21);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter26 = printWriter24.append(' ');
        printWriter26.println((double) '4');
        char[] charArray34 = new char[] { '4', ' ', 'x', 'u', 'a' };
        printWriter26.print(charArray34);
        java.util.Locale locale38 = new java.util.Locale("fr", "fr");
        java.lang.String str39 = locale38.getDisplayScript();
        java.util.Locale.setDefault(locale38);
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.lang.String str45 = locale38.getDisplayVariant(locale44);
        java.lang.String str46 = locale44.getDisplayCountry();
        java.lang.String str47 = locale44.getCountry();
        java.io.PrintStream printStream50 = new java.io.PrintStream("zh_CN");
        printStream50.println();
        java.io.PrintStream printStream53 = printStream50.append('#');
        printStream50.close();
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        printStream50.write(byteArray59);
        printStream50.print(false);
        java.io.PrintStream printStream66 = new java.io.PrintStream("zh_CN");
        printStream66.print((float) (byte) -1);
        printStream66.println();
        printStream66.print("ita");
        java.util.Locale locale72 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleKeys();
        java.util.Locale locale74 = locale72.stripExtensions();
        java.lang.Object[] objArray77 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("hi!", objArray77);
        java.lang.Throwable[] throwableArray79 = mathException78.getSuppressed();
        java.lang.Throwable[] throwableArray80 = mathException78.getSuppressed();
        java.io.PrintStream printStream81 = printStream66.printf(locale74, "fr", (java.lang.Object[]) throwableArray80);
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray80);
        java.io.PrintStream printStream83 = printStream50.format("it_IT", (java.lang.Object[]) throwableArray80);
        java.io.PrintWriter printWriter84 = printWriter26.printf(locale44, "cinese (Taiwan)", (java.lang.Object[]) throwableArray80);
        printStream22.println((java.lang.Object) "cinese (Taiwan)");
        printStream22.println((float) 4);
        java.lang.Throwable throwable90 = null;
        org.apache.commons.math.MathException mathException91 = new org.apache.commons.math.MathException(throwable90);
        org.apache.commons.math.MathException mathException92 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException91);
        org.apache.commons.math.MathException mathException93 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException92);
        java.lang.Object[] objArray94 = mathException92.getArguments();
        org.apache.commons.math.MathException mathException95 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException92);
        org.apache.commons.math.MathException mathException96 = new org.apache.commons.math.MathException("italiano", (java.lang.Throwable) mathException92);
        java.lang.Throwable[] throwableArray97 = mathException92.getSuppressed();
        java.lang.Throwable[] throwableArray98 = mathException92.getSuppressed();
        java.io.PrintStream printStream99 = printStream22.printf("\uc774\ud0c8\ub9ac\uc544\uc5b4\uc774\ud0c8\ub9ac\uc544)", (java.lang.Object[]) throwableArray98);
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
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertNotNull(printWriter26);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4 xua");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4 xua");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4,  , x, u, a]");
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(printStream53);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1, 100, -1, -1]");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "fr");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(printStream81);
        org.junit.Assert.assertNotNull(printStream83);
        org.junit.Assert.assertNotNull(printWriter84);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray94), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray94), "[]");
        org.junit.Assert.assertNotNull(throwableArray97);
        org.junit.Assert.assertNotNull(throwableArray98);
        org.junit.Assert.assertNotNull(printStream99);
    }

    @Test
    public void test16783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16783");
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
        printWriter1.println((double) (short) 0);
        printWriter1.write("english", (int) (short) 10, 0);
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.lang.String str39 = locale37.getDisplayVariant();
        java.lang.String str40 = locale37.getDisplayName();
        java.io.PrintStream printStream43 = new java.io.PrintStream("zh_CN");
        printStream43.println();
        java.io.PrintStream printStream46 = printStream43.append('#');
        printStream43.close();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        printStream43.write(byteArray51);
        printStream43.write((int) 'a');
        java.io.PrintStream printStream55 = new java.io.PrintStream((java.io.OutputStream) printStream43);
        java.io.PrintStream printStream57 = printStream43.append((java.lang.CharSequence) "italiano (Italia)");
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.OutputStream) printStream57, false);
        java.lang.Object[] objArray62 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("hi!", objArray62);
        java.lang.Throwable[] throwableArray64 = mathException63.getSuppressed();
        java.io.PrintStream printStream65 = printStream57.printf("en-gb", (java.lang.Object[]) throwableArray64);
        java.io.PrintWriter printWriter66 = printWriter1.printf(locale37, "Chinesisch (Taiwan)", (java.lang.Object[]) throwableArray64);
        printWriter66.println(7.009401437221889E-12d);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter72 = printWriter66.append((java.lang.CharSequence) "CA", 59, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
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
        org.junit.Assert.assertNotNull(printWriter30);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "cor\351en" + "'", str40, "cor\351en");
        org.junit.Assert.assertNotNull(printStream46);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(printStream57);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(printStream65);
        org.junit.Assert.assertNotNull(printWriter66);
    }

    @Test
    public void test16784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16784");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale locale11 = new java.util.Locale("zh_CN", "English", "it_IT");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale13 = java.util.Locale.UK;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.lang.String str16 = locale6.getDisplayCountry(locale13);
        java.lang.String str17 = locale13.getDisplayScript();
        java.util.Locale.Builder builder18 = builder0.setLocale(locale13);
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italien (Italie)" + "'", str7, "italien (Italie)");
        org.junit.Assert.assertEquals(locale11.toString(), "zh_cn_ENGLISH_it_IT");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-GB" + "'", str14, "en-GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "it,IT" + "'", str15, "it,IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italy" + "'", str16, "Italy");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test16785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16785");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability(117);
        double double8 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'x');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999717d + "'", double8 == 0.9999999999999717d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test16786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16786");
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
        printWriter1.println('u');
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
        java.io.PrintWriter printWriter53 = printWriter22.append('u');
        printWriter22.print((int) (byte) -1);
        java.io.PrintStream printStream57 = new java.io.PrintStream("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter("fr");
        java.io.PrintWriter printWriter61 = printWriter59.append(' ');
        char[] charArray64 = new char[] { 'x', 'a' };
        printWriter61.print(charArray64);
        printStream57.print(charArray64);
        printWriter22.println(charArray64);
        printWriter1.println(charArray64);
        printWriter1.close();
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
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(printWriter50);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(printWriter53);
        org.junit.Assert.assertNotNull(printWriter61);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "xa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "xa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[x, a]");
    }

    @Test
    public void test16787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16787");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        int int5 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.probability(1);
        double double13 = hypergeometricDistributionImpl3.probability(117);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(5, 34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2991452991452851d + "'", double11 == 0.2991452991452851d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test16788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16788");
        java.io.PrintStream printStream1 = new java.io.PrintStream("zh_CN");
        printStream1.println();
        java.io.PrintStream printStream4 = printStream1.append('#');
        java.io.PrintStream printStream6 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        java.util.Locale locale10 = new java.util.Locale("ja", "", "ja");
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale10.getDisplayCountry(locale11);
        java.lang.String str14 = locale10.getISO3Country();
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray17);
        java.lang.Throwable[] throwableArray19 = mathException18.getSuppressed();
        java.io.PrintStream printStream20 = printStream1.format(locale10, "japonais", (java.lang.Object[]) throwableArray19);
        java.util.Set<java.lang.Character> charSet21 = locale10.getExtensionKeys();
        java.lang.String str22 = locale10.getDisplayVariant();
        java.lang.String str23 = locale10.getISO3Country();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setLanguageTag("ita");
        java.util.Locale locale27 = java.util.Locale.JAPANESE;
        java.util.Locale locale28 = java.util.Locale.JAPANESE;
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.lang.String str30 = locale27.getVariant();
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale27.getDisplayScript(locale31);
        boolean boolean33 = locale27.hasExtensions();
        java.util.Locale.Builder builder34 = builder24.setLocale(locale27);
        java.util.Locale locale35 = java.util.Locale.JAPANESE;
        java.util.Locale locale36 = java.util.Locale.JAPANESE;
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.lang.String str38 = locale35.getVariant();
        java.util.Locale locale39 = java.util.Locale.CANADA;
        java.lang.String str40 = locale35.getDisplayScript(locale39);
        java.util.Locale locale43 = new java.util.Locale("Italy", "Italy");
        java.lang.String str44 = locale39.getDisplayLanguage(locale43);
        boolean boolean45 = locale39.hasExtensions();
        java.lang.String str46 = locale39.getISO3Language();
        boolean boolean47 = locale39.hasExtensions();
        java.util.Locale.Builder builder48 = builder24.setLocale(locale39);
        java.lang.String str49 = locale10.getDisplayCountry(locale39);
        boolean boolean50 = locale39.hasExtensions();
        org.junit.Assert.assertNotNull(printStream4);
        org.junit.Assert.assertEquals(locale10.toString(), "ja__ja");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(printStream20);
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ja" + "'", str22, "ja");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals(locale43.toString(), "italy_ITALY");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "English" + "'", str44, "English");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "eng" + "'", str46, "eng");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test16789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16789");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) 'u', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistributionImpl3.getSampleSize();
        double double6 = hypergeometricDistributionImpl3.probability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) 'u');
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 99, 1.8472640568670461E-7d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7008547008546866d + "'", double6 == 0.7008547008546866d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 117 + "'", int10 == 117);
    }
}
