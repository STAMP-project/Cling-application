import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(bigInteger6);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigInteger bigInteger10 = bigDecimal8.toBigInteger();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger17 = bigInteger15.pow((int) 'a');
        byte[] byteArray18 = bigInteger15.toByteArray();
        long long19 = bigInteger15.longValueExact();
        java.math.BigInteger bigInteger20 = bigInteger10.or(bigInteger15);
        byte[] byteArray23 = new byte[] { (byte) 1 };
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray23);
        java.math.BigInteger bigInteger25 = new java.math.BigInteger((int) (short) -1, byteArray23);
        java.math.BigInteger bigInteger27 = bigInteger25.pow((int) 'a');
        byte[] byteArray28 = bigInteger25.toByteArray();
        long long29 = bigInteger25.longValueExact();
        java.lang.String str31 = bigInteger25.toString(0);
        int int32 = bigInteger25.intValueExact();
        java.math.BigInteger bigInteger33 = bigInteger20.subtract(bigInteger25);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal39 = bigDecimal35.subtract(bigDecimal38);
        java.math.BigInteger bigInteger40 = bigDecimal39.toBigInteger();
        java.math.BigInteger bigInteger41 = bigInteger40.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        double double43 = bigDecimal42.doubleValue();
        java.math.BigInteger bigInteger44 = bigDecimal42.toBigInteger();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        byte byte48 = org.apache.commons.lang3.math.NumberUtils.min(byteArray47);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger((int) (short) -1, byteArray47);
        java.math.BigInteger bigInteger51 = bigInteger49.pow((int) 'a');
        byte[] byteArray52 = bigInteger49.toByteArray();
        long long53 = bigInteger49.longValueExact();
        java.math.BigInteger bigInteger54 = bigInteger44.or(bigInteger49);
        byte[] byteArray57 = new byte[] { (byte) 1 };
        byte byte58 = org.apache.commons.lang3.math.NumberUtils.min(byteArray57);
        java.math.BigInteger bigInteger59 = new java.math.BigInteger((int) (short) -1, byteArray57);
        java.math.BigInteger bigInteger61 = bigInteger59.pow((int) 'a');
        byte[] byteArray62 = bigInteger59.toByteArray();
        long long63 = bigInteger59.longValueExact();
        java.lang.String str65 = bigInteger59.toString(0);
        int int66 = bigInteger59.intValueExact();
        java.math.BigInteger bigInteger67 = bigInteger54.subtract(bigInteger59);
        java.math.BigInteger bigInteger68 = bigInteger40.min(bigInteger54);
        java.math.BigInteger bigInteger69 = bigInteger33.gcd(bigInteger68);
        int int70 = bigInteger33.bitLength();
        java.math.BigInteger bigInteger71 = bigInteger6.andNot(bigInteger33);
        int int72 = bigInteger6.intValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1]");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 1 + "'", byte24 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1]");
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 1 + "'", byte48 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1]");
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 1 + "'", byte58 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1]");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "-1" + "'", str65, "-1");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.lang.String str6 = bigDecimal1.toPlainString();
        java.lang.String str7 = bigDecimal1.toPlainString();
        int int8 = bigDecimal1.signum();
        java.math.BigDecimal bigDecimal9 = bigDecimal1.ulp();
        java.math.BigDecimal bigDecimal10 = bigDecimal1.plus();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal13 = bigDecimal11.negate();
        java.lang.String str14 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(objArray19, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean24 = bigDecimal16.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal25 = bigDecimal11.max(bigDecimal16);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal33 = bigDecimal30.min(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = bigDecimal33.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal36 = bigDecimal11.min(bigDecimal33);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.TEN;
        long long38 = bigDecimal37.longValueExact();
        int int39 = bigDecimal37.intValue();
        java.math.BigDecimal[] bigDecimalArray40 = bigDecimal33.divideAndRemainder(bigDecimal37);
        java.math.BigDecimal bigDecimal41 = bigDecimal37.abs();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal45 = bigDecimal43.min(bigDecimal44);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal47 = bigDecimal46.negate();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal51 = bigDecimal47.subtract(bigDecimal50);
        java.math.BigDecimal[] bigDecimalArray52 = bigDecimal44.divideAndRemainder(bigDecimal50);
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal54 = bigDecimal53.negate();
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal58 = bigDecimal54.subtract(bigDecimal57);
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal60 = bigDecimal57.min(bigDecimal59);
        java.math.BigDecimal bigDecimal61 = bigDecimal50.divideToIntegralValue(bigDecimal60);
        java.lang.String str62 = bigDecimal60.toEngineeringString();
        long long63 = bigDecimal60.longValue();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger((int) (short) -1, byteArray66);
        java.math.BigInteger bigInteger70 = bigInteger68.pow((int) 'a');
        java.math.BigInteger bigInteger72 = bigInteger68.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal74 = new java.math.BigDecimal(bigInteger68, 34);
        java.math.BigDecimal bigDecimal77 = bigDecimal60.divide(bigDecimal74, 100, 7);
        java.math.BigDecimal bigDecimal78 = bigDecimal37.add(bigDecimal60);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal81 = bigDecimal1.divide(bigDecimal60, 33, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(bigDecimalArray40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "10.0E-99" + "'", str62, "10.0E-99");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 1 + "'", byte67 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal78);
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                         French (France)                                         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         French (France)                                         " + "'", str2, "                                         French (France)                                         ");
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale8.getDisplayCountry();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Locale.Builder builder12 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("eng");
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder18 = builder16.setLocale(locale17);
        java.util.Locale.Builder builder20 = builder18.addUnicodeLocaleAttribute("engcn");
        java.util.Locale locale21 = builder18.build();
        java.util.Locale.Builder builder22 = builder5.setLocale(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder22.setRegion("zh-cnzh-cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh-cnzh-cn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French" + "'", str11, "French");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Korean", "CN", (int) (short) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = java.util.Locale.getISOLanguages();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("jpn", strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("UitdStts", strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("   JA", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 188");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Korean" + "'", str5, "Korean");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TW" + "'", str1, "TW");
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((double) 10, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "und ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        java.math.BigInteger bigInteger21 = bigInteger17.shiftLeft((int) (short) 1);
        boolean boolean23 = bigInteger21.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger24 = bigInteger7.divide(bigInteger21);
        long long25 = bigInteger7.longValue();
        byte byte26 = bigInteger7.byteValueExact();
        java.math.BigInteger bigInteger28 = bigInteger7.shiftRight(11);
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(bigInteger7, 117);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigInteger bigInteger37 = bigDecimal36.toBigInteger();
        java.math.BigDecimal bigDecimal38 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal39 = bigDecimal30.add(bigDecimal38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.TEN;
        long long41 = bigDecimal40.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.ulp();
        java.math.BigDecimal bigDecimal44 = bigDecimal42.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal46 = bigDecimal44.movePointRight(30);
        java.math.MathContext mathContext47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal48 = bigDecimal30.remainder(bigDecimal46, mathContext47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal46);
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-c" + "'", str2, "zh-c");
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        double double4 = bigDecimal3.doubleValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal3.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal8 = bigDecimal3.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        double double10 = bigDecimal9.doubleValue();
        int int11 = bigDecimal8.compareTo(bigDecimal9);
        byte[] byteArray14 = new byte[] { (byte) 1 };
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray14);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger((int) (short) -1, byteArray14);
        java.math.BigInteger bigInteger18 = bigInteger16.pow((int) 'a');
        byte[] byteArray19 = bigInteger16.toByteArray();
        long long20 = bigInteger16.longValueExact();
        java.lang.String str22 = bigInteger16.toString(0);
        int int23 = bigInteger16.intValueExact();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger16);
        java.math.BigDecimal bigDecimal25 = bigDecimal8.max(bigDecimal24);
        java.lang.String str26 = bigDecimal25.toString();
        java.math.MathContext mathContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal28 = bigDecimal2.divideToIntegralValue(bigDecimal25, mathContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1]");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1" + "'", str22, "-1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger(byteArray13);
        boolean boolean17 = bigInteger4.equals((java.lang.Object) byteArray13);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger(byteArray13);
        byte[] byteArray21 = new byte[] { (byte) 1 };
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray21);
        java.math.BigInteger bigInteger23 = new java.math.BigInteger((int) (short) -1, byteArray21);
        java.math.BigInteger bigInteger25 = bigInteger23.pow((int) 'a');
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        double double33 = bigInteger32.doubleValue();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger39 = bigInteger32.gcd(bigInteger38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal45 = bigDecimal41.subtract(bigDecimal44);
        java.math.BigInteger bigInteger46 = bigDecimal45.toBigInteger();
        java.math.BigInteger bigInteger47 = bigInteger38.or(bigInteger46);
        java.math.BigInteger bigInteger48 = bigInteger25.min(bigInteger47);
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        byte[] byteArray56 = bigInteger53.toByteArray();
        long long57 = bigInteger53.longValueExact();
        java.lang.String str59 = bigInteger53.toString(0);
        byte[] byteArray62 = new byte[] { (byte) 1 };
        byte byte63 = org.apache.commons.lang3.math.NumberUtils.min(byteArray62);
        java.math.BigInteger bigInteger64 = new java.math.BigInteger((int) (short) -1, byteArray62);
        java.math.BigInteger bigInteger65 = bigInteger53.and(bigInteger64);
        java.math.BigInteger bigInteger66 = bigInteger64.abs();
        java.math.BigInteger bigInteger67 = bigInteger25.max(bigInteger64);
        java.math.BigInteger bigInteger68 = bigInteger18.or(bigInteger25);
        int int69 = bigInteger18.signum();
        java.math.BigInteger bigInteger71 = bigInteger18.shiftRight(301);
        byte byte72 = bigInteger71.byteValueExact();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-1" + "'", str59, "-1");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1]");
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 1 + "'", byte63 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) 0 + "'", byte72 == (byte) 0);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        char[] charArray15 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zho", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh-CN", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#_ENG", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ko-KR", charArray15);
        java.math.MathContext mathContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(charArray15, (-4), 7, mathContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("        fR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        fR" + "'", str1, "        fR");
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinese");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for chinese");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "\u4e2d\u56fd", 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("CA", "JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CA" + "'", str2, "CA");
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u6587", 'u');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "zh");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("en-US", "", 100);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("!hi!hi!hi!hi!hi!hi!hi!hi", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(300L, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigInteger();
        double double15 = bigInteger14.doubleValue();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger21 = bigInteger14.gcd(bigInteger20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        java.math.BigInteger bigInteger29 = bigInteger20.or(bigInteger28);
        java.math.BigInteger bigInteger30 = bigInteger6.or(bigInteger28);
        java.math.BigInteger bigInteger32 = bigInteger28.pow(5);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal38 = bigDecimal34.subtract(bigDecimal37);
        java.math.BigInteger bigInteger39 = bigDecimal38.toBigInteger();
        double double40 = bigInteger39.doubleValue();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        byte byte44 = org.apache.commons.lang3.math.NumberUtils.min(byteArray43);
        java.math.BigInteger bigInteger45 = new java.math.BigInteger((int) (short) -1, byteArray43);
        java.math.BigInteger bigInteger46 = bigInteger39.gcd(bigInteger45);
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal48 = bigDecimal47.negate();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal52 = bigDecimal48.subtract(bigDecimal51);
        java.math.BigInteger bigInteger53 = bigDecimal52.toBigInteger();
        java.math.BigInteger bigInteger54 = bigInteger45.or(bigInteger53);
        java.math.BigInteger bigInteger55 = bigInteger53.abs();
        java.math.BigInteger bigInteger56 = bigInteger28.and(bigInteger53);
        java.math.BigDecimal bigDecimal57 = new java.math.BigDecimal(bigInteger53);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1]");
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Koreanisch(S\374dkorea)", "South Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("english", "   0   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "en", (java.lang.CharSequence) "\u52a0\u62ff\u5927");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinese");
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale2.getCountry();
        java.lang.String str4 = locale1.getDisplayScript(locale2);
        java.lang.String str5 = locale2.getLanguage();
        java.lang.String str6 = locale2.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DE" + "'", str3, "DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de_DE" + "'", str6, "de_DE");
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger((int) (short) -1, byteArray3);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger8 = new java.math.BigInteger((int) (short) 16, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid signum value");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DE" + "'", str1, "DE");
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        int int3 = bigDecimal2.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal2.toBigInteger();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        double double6 = bigDecimal5.doubleValue();
        java.math.BigDecimal bigDecimal8 = bigDecimal5.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal10 = bigDecimal5.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        double double12 = bigDecimal11.doubleValue();
        int int13 = bigDecimal10.compareTo(bigDecimal11);
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger20 = bigInteger18.pow((int) 'a');
        byte[] byteArray21 = bigInteger18.toByteArray();
        long long22 = bigInteger18.longValueExact();
        java.lang.String str24 = bigInteger18.toString(0);
        int int25 = bigInteger18.intValueExact();
        java.math.BigDecimal bigDecimal26 = new java.math.BigDecimal(bigInteger18);
        java.math.BigDecimal bigDecimal27 = bigDecimal10.max(bigDecimal26);
        java.lang.String str28 = bigDecimal27.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray29 = bigDecimal2.divideAndRemainder(bigDecimal27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division undefined");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = null;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getCountry();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale locale8 = builder4.build();
        java.lang.String str9 = locale0.getDisplayName(locale8);
        java.lang.String str10 = locale8.getDisplayScript();
        java.lang.String str11 = locale8.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CN" + "'", str3, "CN");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese (China)" + "'", str9, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eng" + "'", str11, "eng");
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\ud504\ub791", "\u5fb7\u56fd", "French");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        byte[] byteArray24 = bigInteger20.toByteArray();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.getDisplayScript();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale1.getDisplayName(locale5);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale8);
        java.lang.String str10 = locale8.getCountry();
        java.lang.String str11 = locale8.getVariant();
        java.util.Locale locale12 = locale8.stripExtensions();
        java.lang.String str13 = locale12.getISO3Country();
        java.lang.String str14 = locale12.getVariant();
        java.lang.String str15 = locale5.getDisplayVariant(locale12);
        java.lang.String str16 = locale5.getCountry();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("it_IT!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", locale5);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str6, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str9, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FR" + "'", str10, "FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "KR" + "'", str16, "KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IT_IT!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str17, "IT_IT!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        boolean boolean24 = bigInteger12.testBit((int) (short) 0);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal26.subtract(bigDecimal29);
        java.math.BigInteger bigInteger31 = bigDecimal30.toBigInteger();
        double double32 = bigInteger31.doubleValue();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        byte byte36 = org.apache.commons.lang3.math.NumberUtils.min(byteArray35);
        java.math.BigInteger bigInteger37 = new java.math.BigInteger((int) (short) -1, byteArray35);
        java.math.BigInteger bigInteger38 = bigInteger31.gcd(bigInteger37);
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.negate();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal44 = bigDecimal40.subtract(bigDecimal43);
        java.math.BigInteger bigInteger45 = bigDecimal44.toBigInteger();
        java.math.BigInteger bigInteger46 = bigInteger37.or(bigInteger45);
        double double47 = bigInteger46.doubleValue();
        int int48 = bigInteger46.getLowestSetBit();
        short short49 = bigInteger46.shortValueExact();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger56 = bigInteger54.pow((int) 'a');
        java.math.BigInteger bigInteger58 = bigInteger54.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger60 = bigInteger58.flipBit(1);
        long long61 = bigInteger60.longValue();
        java.math.BigInteger bigInteger63 = bigInteger60.setBit((int) (byte) 1);
        java.math.BigInteger bigInteger64 = bigInteger46.xor(bigInteger63);
        java.math.BigInteger bigInteger65 = bigInteger12.remainder(bigInteger63);
        java.math.MathContext mathContext66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal67 = new java.math.BigDecimal(bigInteger63, mathContext66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 1 + "'", byte36 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) -1 + "'", short49 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-4L) + "'", long61 == (-4L));
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger65);
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("\u65e5\u6587");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal7 = bigDecimal4.min(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = bigDecimal7.movePointRight((int) (short) -2);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = bigDecimal9.toBigIntegerExact();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Rounding necessary");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("Enhinh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Enhinh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str5 = locale1.getVariant();
        java.lang.String str6 = locale1.getVariant();
        java.lang.String str7 = locale1.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayScript();
        java.lang.String str9 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9                                             ", 300);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Radix out of range");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal14 = bigDecimal10.subtract(bigDecimal13);
        java.math.BigInteger bigInteger15 = bigDecimal14.toBigInteger();
        java.math.BigInteger bigInteger16 = bigInteger15.negate();
        java.math.BigInteger bigInteger18 = bigInteger16.flipBit((int) (short) 0);
        byte byte19 = bigInteger18.byteValueExact();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger26 = bigInteger24.pow((int) 'a');
        byte[] byteArray27 = bigInteger24.toByteArray();
        long long28 = bigInteger24.longValueExact();
        java.lang.String str30 = bigInteger24.toString(0);
        byte[] byteArray33 = new byte[] { (byte) 1 };
        byte byte34 = org.apache.commons.lang3.math.NumberUtils.min(byteArray33);
        java.math.BigInteger bigInteger35 = new java.math.BigInteger((int) (short) -1, byteArray33);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger(byteArray33);
        boolean boolean37 = bigInteger24.equals((java.lang.Object) byteArray33);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger(byteArray33);
        java.math.BigInteger bigInteger39 = bigInteger18.andNot(bigInteger38);
        java.lang.String str41 = bigInteger38.toString(299);
        java.math.BigInteger[] bigIntegerArray42 = bigInteger6.divideAndRemainder(bigInteger38);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal48 = bigDecimal44.subtract(bigDecimal47);
        java.math.BigInteger bigInteger49 = bigDecimal48.toBigInteger();
        byte[] byteArray50 = bigInteger49.toByteArray();
        java.math.BigDecimal bigDecimal51 = new java.math.BigDecimal(bigInteger49);
        byte[] byteArray53 = new byte[] { (byte) 1 };
        byte byte54 = org.apache.commons.lang3.math.NumberUtils.min(byteArray53);
        java.math.BigInteger bigInteger55 = new java.math.BigInteger(byteArray53);
        java.math.BigDecimal bigDecimal56 = new java.math.BigDecimal(bigInteger55);
        short short57 = bigInteger55.shortValueExact();
        java.math.BigInteger bigInteger58 = bigInteger49.modInverse(bigInteger55);
        java.math.BigInteger bigInteger59 = bigInteger38.or(bigInteger55);
        long long60 = bigInteger59.longValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1]");
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 1 + "'", byte34 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1" + "'", str41, "1");
        org.junit.Assert.assertNotNull(bigIntegerArray42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 1 + "'", short57 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(101, 299, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 299 + "'", int3 == 299);
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getExtension('a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("-1)", locale1);
        java.lang.String str6 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d" + "'", str2, "\uc911\uad6d");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1)" + "'", str5, "-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        char[] charArray12 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zho", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh-CN", charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(charArray12, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -5, 5, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal((double) 1L);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((double) 117);
        double double25 = bigDecimal24.doubleValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal22.min(bigDecimal24);
        int int27 = bigDecimal19.compareTo(bigDecimal24);
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal((double) 100.0f);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.TEN;
        long long33 = bigDecimal32.longValueExact();
        java.math.BigDecimal bigDecimal34 = bigDecimal32.ulp();
        java.lang.String str35 = bigDecimal32.toString();
        int int36 = bigDecimal30.compareTo(bigDecimal32);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal32.divide(bigDecimal38, (int) (short) 1);
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.TEN;
        long long42 = bigDecimal41.longValueExact();
        java.math.BigDecimal bigDecimal43 = bigDecimal40.max(bigDecimal41);
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.TEN;
        long long45 = bigDecimal44.longValueExact();
        java.math.BigDecimal bigDecimal46 = bigDecimal44.ulp();
        java.math.BigDecimal bigDecimal47 = bigDecimal41.subtract(bigDecimal44);
        double double48 = bigDecimal44.doubleValue();
        java.math.BigDecimal bigDecimal49 = bigDecimal29.divideToIntegralValue(bigDecimal44);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.ZERO;
        double double51 = bigDecimal50.doubleValue();
        java.math.BigInteger bigInteger52 = bigDecimal50.toBigInteger();
        java.lang.String str53 = bigDecimal50.toPlainString();
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal55 = bigDecimal54.negate();
        java.math.BigDecimal bigDecimal56 = bigDecimal54.negate();
        int int57 = bigDecimal56.intValueExact();
        java.math.BigDecimal bigDecimal58 = bigDecimal50.max(bigDecimal56);
        int int59 = bigDecimal58.precision();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal61 = bigDecimal60.negate();
        java.math.BigDecimal bigDecimal62 = bigDecimal60.negate();
        java.lang.String str63 = bigDecimal60.toString();
        java.math.BigDecimal bigDecimal65 = bigDecimal60.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal67 = bigDecimal66.negate();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.TEN;
        long long69 = bigDecimal68.longValueExact();
        java.math.BigDecimal bigDecimal70 = bigDecimal68.ulp();
        java.lang.String str71 = bigDecimal68.toString();
        int int72 = bigDecimal66.compareTo(bigDecimal68);
        java.math.BigDecimal bigDecimal74 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal76 = bigDecimal68.divide(bigDecimal74, (int) (short) 1);
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.TEN;
        long long78 = bigDecimal77.longValueExact();
        java.math.BigDecimal bigDecimal79 = bigDecimal76.max(bigDecimal77);
        java.math.BigDecimal bigDecimal80 = bigDecimal60.add(bigDecimal76);
        int int81 = bigDecimal58.compareTo(bigDecimal76);
        java.math.BigDecimal bigDecimal82 = bigDecimal44.subtract(bigDecimal58);
        java.lang.String str83 = bigDecimal82.toEngineeringString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal85 = bigDecimal19.divide(bigDecimal82, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 117.0d + "'", double25 == 117.0d);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10" + "'", str35, "10");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10L + "'", long69 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "10" + "'", str71, "10");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 10L + "'", long78 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "10" + "'", str83, "10");
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(bigInteger6, (int) (byte) -1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.negate();
        java.lang.String str16 = bigDecimal15.toEngineeringString();
        java.math.BigDecimal bigDecimal17 = bigDecimal12.multiply(bigDecimal15);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal bigDecimal25 = bigDecimal17.divideToIntegralValue(bigDecimal23);
        int int26 = bigDecimal10.compareTo(bigDecimal25);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal29 = bigDecimal25.setScale((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00", "1.00E-98");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00" + "'", str2, "00");
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("10.0E-99", "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AJ", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           AJ" + "'", str2, "           AJ");
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("\u671d\u9c9c\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    ???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(299, 97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 299 + "'", int3 == 299);
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("UND", "\u4e2d\u6587\u4e2d\u570b)", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UND" + "'", str3, "UND");
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 97, (double) 117L, (double) 34.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\u82f1\u6587\u82f1\u56fd", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", "Chinese");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        char[] charArray8 = new char[] { 'x', '#', '4', ' ', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinese", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!", charArray8);
        java.math.MathContext mathContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(charArray8, mathContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "x#4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "x#4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[x, #, 4,  , a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4, (float) 10L, 7.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("GBR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBR" + "'", str1, "GBR");
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf((long) '#');
        short short2 = bigInteger1.shortValue();
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 35 + "'", short2 == (short) 35);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#######", "\uc911\uad6d\uc5b4\uc911\uad6d)", (int) 'x');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("RF-RF", (int) '#', "Hindi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HindiHindiHindiRF-RFHindiHindiHindi" + "'", str3, "HindiHindiHindiRF-RFHindiHindiHindi");
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 0, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ", "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger("anglais", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"anglais\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u65e5\u672c\u8a9e", (-2), "x");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str3, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("it_IT", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) '#', (double) 120.0f, (double) 120);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("CN  ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("VEREINIGTES K\326NIGREICH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "VEREINIGTES K\326NIGREICH" + "'", str1, "VEREINIGTES K\326NIGREICH");
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        int int1 = bigDecimal0.intValueExact();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal4 = bigDecimal0.setScale(6, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("", locale16);
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("", locale20);
        java.util.Locale.setDefault(locale20);
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale26);
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale28.getDisplayLanguage();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.upperCase("", locale31);
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = locale35.getVariant();
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.util.Locale locale42 = java.util.Locale.PRC;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale43.getScript();
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale16, locale20, locale23, locale26, locale28, locale31, locale33, locale34, locale35, locale37, locale40, locale41, locale42, locale43, locale45 };
        java.util.ArrayList<java.util.Locale> localeList47 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList47, localeArray46);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList47, filteringMode49);
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList47);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str27, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str29, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "RF-RF", (java.lang.CharSequence) "-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited St" + "'", str2, "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited St");
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\uc774\ud0c8\ub9ac\uc544\uc5b4", "VEREINIGTES K\326NIGREICH", "ita", (int) (byte) -2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str4, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getVariant();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.lang.String str7 = locale1.getISO3Country();
        java.lang.String str8 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("IT_IT!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (int) (byte) -33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))", (int) (short) -33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))" + "'", str2, "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))");
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120", "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Koreanisch (S\374dkorea)", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((long) (short) 117);
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("engCN", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "engCN" + "'", str2, "engCN");
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("\u5927\u97d3\u6c11\u56fd");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayVariant(locale2);
        java.lang.String str6 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str4, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN", (-10), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2-2-zh-C" + "'", str3, "-2-2-zh-C");
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(13, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("i!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!" + "'", str3, "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("EN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "E" + "'", str1, "E");
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("KR                               ", 117, "\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d" + "'", str3, "\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d");
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.lang.String str6 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        double double8 = bigDecimal7.doubleValue();
        java.math.BigDecimal bigDecimal10 = bigDecimal7.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger11 = bigDecimal7.unscaledValue();
        long long12 = bigDecimal7.longValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal1.subtract(bigDecimal7);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        double double15 = bigDecimal14.doubleValue();
        java.math.BigInteger bigInteger16 = bigDecimal14.toBigInteger();
        java.math.BigDecimal bigDecimal17 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        double double19 = bigDecimal18.doubleValue();
        int int20 = bigDecimal18.intValue();
        int int21 = bigDecimal18.scale();
        byte byte22 = bigDecimal18.byteValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal14.subtract(bigDecimal18);
        java.math.BigDecimal bigDecimal25 = bigDecimal14.movePointLeft(300);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal26 = bigDecimal1.divide(bigDecimal25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division undefined");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal25);
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("JAJAJAJAJAJAJhi!JAJAJAJAJAJAJA", "                              ", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JAJAJAJAJAJAJhi!JAJAJAJAJAJAJA" + "'", str3, "JAJAJAJAJAJAJhi!JAJAJAJAJAJAJA");
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigInteger27.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger32 = bigInteger12.xor(bigInteger31);
        java.math.BigInteger bigInteger33 = bigInteger31.not();
        long long34 = bigInteger31.longValue();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        double double36 = bigDecimal35.doubleValue();
        java.math.BigInteger bigInteger37 = bigDecimal35.toBigInteger();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        byte byte41 = org.apache.commons.lang3.math.NumberUtils.min(byteArray40);
        java.math.BigInteger bigInteger42 = new java.math.BigInteger((int) (short) -1, byteArray40);
        java.math.BigInteger bigInteger44 = bigInteger42.pow((int) 'a');
        byte[] byteArray45 = bigInteger42.toByteArray();
        long long46 = bigInteger42.longValueExact();
        java.math.BigInteger bigInteger47 = bigInteger37.or(bigInteger42);
        byte[] byteArray50 = new byte[] { (byte) 1 };
        byte byte51 = org.apache.commons.lang3.math.NumberUtils.min(byteArray50);
        java.math.BigInteger bigInteger52 = new java.math.BigInteger((int) (short) -1, byteArray50);
        java.math.BigInteger bigInteger54 = bigInteger52.pow((int) 'a');
        java.math.BigInteger bigInteger56 = bigInteger52.shiftLeft((int) (short) 1);
        boolean boolean58 = bigInteger56.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger59 = bigInteger42.divide(bigInteger56);
        java.math.BigInteger bigInteger60 = bigInteger31.or(bigInteger42);
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.ZERO;
        double double62 = bigDecimal61.doubleValue();
        java.math.BigInteger bigInteger63 = bigDecimal61.toBigInteger();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger((int) (short) -1, byteArray66);
        java.math.BigInteger bigInteger70 = bigInteger68.pow((int) 'a');
        byte[] byteArray71 = bigInteger68.toByteArray();
        long long72 = bigInteger68.longValueExact();
        java.math.BigInteger bigInteger73 = bigInteger63.or(bigInteger68);
        byte[] byteArray76 = new byte[] { (byte) 1 };
        byte byte77 = org.apache.commons.lang3.math.NumberUtils.min(byteArray76);
        java.math.BigInteger bigInteger78 = new java.math.BigInteger((int) (short) -1, byteArray76);
        java.math.BigInteger bigInteger80 = bigInteger78.pow((int) 'a');
        byte[] byteArray81 = bigInteger78.toByteArray();
        long long82 = bigInteger78.longValueExact();
        java.lang.String str84 = bigInteger78.toString(0);
        int int85 = bigInteger78.intValueExact();
        java.math.BigInteger bigInteger86 = bigInteger73.subtract(bigInteger78);
        java.math.BigInteger bigInteger88 = bigInteger86.clearBit((int) 'a');
        java.math.BigInteger bigInteger89 = bigInteger88.nextProbablePrime();
        java.math.BigInteger bigInteger91 = bigInteger88.pow(8);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger92 = bigInteger31.mod(bigInteger88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger: modulus not positive");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-2L) + "'", long34 == (-2L));
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 1 + "'", byte41 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1]");
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 1 + "'", byte51 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 1 + "'", byte67 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[-1]");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[1]");
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) 1 + "'", byte77 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[-1]");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-1L) + "'", long82 == (-1L));
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "-1" + "'", str84, "-1");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger91);
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Vereinigtes K\366nigreich");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("chnchnchnc                                         French (France)                                         chnchnchnc", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ", "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chnchnchnc                                         French (France)                                         chnchnchnc" + "'", str3, "chnchnchnc                                         French (France)                                         chnchnchnc");
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", (long) (byte) -2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("en-ca", (int) ' ', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxen-ca" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxen-ca");
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("e", "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)UnitedxStates");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\uc5b4\uad6d\ud55c                                                                                                                                                                                                                                                                                                        ", 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.TEN;
        long long4 = bigDecimal3.longValueExact();
        java.math.BigDecimal bigDecimal5 = bigDecimal3.ulp();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal8 = bigDecimal5.plus();
        java.math.BigDecimal[] bigDecimalArray9 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.lang.String str10 = bigDecimal8.toPlainString();
        short short11 = bigDecimal8.shortValue();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#_HI!", (-4), (int) (short) -2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Korean (South Korea)en-cen-cen", 11, "Fran\347ais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)en-cen-cen" + "'", str3, "Korean (South Korea)en-cen-cen");
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN", "Koreanisch(S\374dkorea)", "Zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-z-CN" + "'", str3, "-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-z-CN");
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 35, (short) 35);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        int int16 = bigDecimal10.compareTo(bigDecimal12);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divide(bigDecimal18, (int) (short) 1);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal4.add(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.multiply(bigDecimal4);
        int int26 = bigDecimal25.precision();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger7 = bigInteger6.negate();
        java.math.BigInteger bigInteger9 = bigInteger7.flipBit((int) (short) 0);
        java.math.BigInteger bigInteger11 = bigInteger9.flipBit((int) (short) 100);
        java.math.MathContext mathContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(bigInteger11, mathContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger11);
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "JAJAJAJAJAJAJhi!JAJAJAJAJAJAJA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal("EN", mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        double[] doubleArray3 = new double[] { 0.0f, 1, 10.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 100);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.movePointLeft(117);
        java.math.MathContext mathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = bigDecimal1.round(mathContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("KOREAN (SOUTH KOREA)EN-CEN-CEN", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ENG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENG" + "'", str1, "ENG");
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        java.math.BigInteger bigInteger21 = bigInteger17.shiftLeft((int) (short) 1);
        boolean boolean23 = bigInteger21.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger24 = bigInteger7.divide(bigInteger21);
        int int25 = bigInteger7.intValue();
        boolean boolean27 = bigInteger7.isProbablePrime((int) 'u');
        java.lang.String str29 = bigInteger7.toString((int) (byte) 10);
        java.math.BigInteger bigInteger31 = bigInteger7.clearBit(300);
        short short32 = bigInteger7.shortValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1" + "'", str29, "-1");
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) -1 + "'", short32 == (short) -1);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale8.getDisplayCountry();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Locale.Builder builder12 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("eng");
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder18 = builder16.setLocale(locale17);
        java.util.Locale.Builder builder20 = builder18.addUnicodeLocaleAttribute("engcn");
        java.util.Locale locale21 = builder18.build();
        java.util.Locale.Builder builder22 = builder5.setLocale(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder22.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fran\347ais" + "'", str11, "fran\347ais");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        boolean boolean10 = bigInteger8.isProbablePrime((int) '4');
        short short11 = bigInteger8.shortValueExact();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal17 = bigDecimal13.subtract(bigDecimal16);
        java.math.BigInteger bigInteger18 = bigDecimal17.toBigInteger();
        double double19 = bigInteger18.doubleValue();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger25 = bigInteger18.gcd(bigInteger24);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        double double33 = bigInteger32.doubleValue();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger39 = bigInteger32.gcd(bigInteger38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal45 = bigDecimal41.subtract(bigDecimal44);
        java.math.BigInteger bigInteger46 = bigDecimal45.toBigInteger();
        java.math.BigInteger bigInteger47 = bigInteger38.or(bigInteger46);
        short short48 = bigInteger38.shortValueExact();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        java.math.BigInteger bigInteger57 = bigInteger53.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger58 = bigInteger38.xor(bigInteger57);
        java.math.BigInteger bigInteger59 = bigInteger57.not();
        java.math.BigInteger bigInteger60 = bigInteger25.and(bigInteger59);
        java.math.BigInteger bigInteger61 = bigInteger8.subtract(bigInteger59);
        java.math.BigInteger bigInteger63 = bigInteger8.clearBit((int) 'u');
        java.math.BigDecimal bigDecimal64 = new java.math.BigDecimal(bigInteger8);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger65 = bigInteger8.nextProbablePrime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: start < 0: -2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -2 + "'", short11 == (short) -2);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) -1 + "'", short48 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger63);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\uc911\uad6d\uc5b4", "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str2, "\uc911\uad6d\uc5b4");
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("FR-FR", "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\u65e5\u672c\u8a9e                                                                                                                                                                                                                                                            ", "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str3, "UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\ud504\ub791\uc2a4\uc5b4-1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud504\ub791\uc2a4\uc5b4-1.0" + "'", str1, "\ud504\ub791\uc2a4\uc5b4-1.0");
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        short short7 = bigDecimal0.shortValueExact();
        long long8 = bigDecimal0.longValue();
        java.math.RoundingMode roundingMode10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = bigDecimal0.setScale((int) (short) -1, roundingMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (short) (byte) -33);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -33 + "'", short2 == (short) -33);
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.math.BigInteger bigInteger9 = bigDecimal4.toBigInteger();
        java.math.BigInteger bigInteger10 = bigInteger9.nextProbablePrime();
        java.math.MathContext mathContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(bigInteger10, mathContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Vereinigtes K\366nigreich", (double) 30L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=30.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger(5, 301, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("France", "KOR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, 2, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        java.math.BigInteger bigInteger12 = bigInteger4.shiftLeft(117);
        java.math.BigInteger bigInteger13 = java.math.BigInteger.ONE;
        java.math.BigInteger bigInteger14 = bigInteger13.not();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger21 = bigInteger19.pow((int) 'a');
        java.math.BigInteger bigInteger23 = bigInteger19.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger25 = bigInteger23.flipBit(1);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        double double33 = bigInteger32.doubleValue();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger39 = bigInteger32.gcd(bigInteger38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal45 = bigDecimal41.subtract(bigDecimal44);
        java.math.BigInteger bigInteger46 = bigDecimal45.toBigInteger();
        double double47 = bigInteger46.doubleValue();
        byte[] byteArray50 = new byte[] { (byte) 1 };
        byte byte51 = org.apache.commons.lang3.math.NumberUtils.min(byteArray50);
        java.math.BigInteger bigInteger52 = new java.math.BigInteger((int) (short) -1, byteArray50);
        java.math.BigInteger bigInteger53 = bigInteger46.gcd(bigInteger52);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal55 = bigDecimal54.negate();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal59 = bigDecimal55.subtract(bigDecimal58);
        java.math.BigInteger bigInteger60 = bigDecimal59.toBigInteger();
        java.math.BigInteger bigInteger61 = bigInteger52.or(bigInteger60);
        short short62 = bigInteger52.shortValueExact();
        byte[] byteArray65 = new byte[] { (byte) 1 };
        byte byte66 = org.apache.commons.lang3.math.NumberUtils.min(byteArray65);
        java.math.BigInteger bigInteger67 = new java.math.BigInteger((int) (short) -1, byteArray65);
        java.math.BigInteger bigInteger69 = bigInteger67.pow((int) 'a');
        java.math.BigInteger bigInteger71 = bigInteger67.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger72 = bigInteger52.xor(bigInteger71);
        java.math.BigInteger bigInteger73 = bigInteger71.not();
        java.math.BigInteger bigInteger74 = bigInteger39.and(bigInteger73);
        java.math.BigInteger bigInteger76 = bigInteger73.shiftRight((int) 'x');
        java.math.BigInteger bigInteger77 = bigInteger23.add(bigInteger73);
        java.math.BigInteger bigInteger78 = bigInteger14.remainder(bigInteger73);
        long long79 = bigInteger73.longValueExact();
        byte byte80 = bigInteger73.byteValueExact();
        java.math.BigInteger bigInteger81 = bigInteger12.divide(bigInteger73);
        java.math.BigDecimal bigDecimal82 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal83 = bigDecimal82.negate();
        java.math.BigDecimal bigDecimal86 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal87 = bigDecimal83.subtract(bigDecimal86);
        java.math.BigInteger bigInteger88 = bigDecimal87.toBigInteger();
        java.math.BigInteger bigInteger89 = bigInteger88.negate();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger90 = bigInteger12.remainder(bigInteger89);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger divide by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1]");
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 1 + "'", byte51 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) -1 + "'", short62 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1]");
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 1 + "'", byte66 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 1 + "'", byte80 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertNotNull(bigDecimal83);
        org.junit.Assert.assertNotNull(bigDecimal86);
        org.junit.Assert.assertNotNull(bigDecimal87);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(bigInteger89);
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.divide(bigDecimal1);
        int int3 = bigDecimal0.precision();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        java.util.Locale locale2 = new java.util.Locale("frz-C ", "0");
        org.junit.Assert.assertEquals(locale2.toString(), "frz-c _0");
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\u30ab\u30ca\u30c0", "\uc77c\ub3c5\uc5b4\uc77c\ub3c5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30ab\u30ca\u30c0" + "'", str2, "\u30ab\u30ca\u30c0");
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111South Korea", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en-US", 'u');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', (int) 'x', 3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("\u6cd5\u56fd", strArray4);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("Japanese", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!", "DE", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!", (int) (short) 117);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!" + "'", str4, "!");
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("frazho");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "frazho" + "'", str1, "frazho");
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getVariant();
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.lang.String str12 = locale9.getDisplayScript(locale11);
        java.lang.String str13 = locale9.getVariant();
        java.lang.String str14 = locale9.getVariant();
        java.lang.String str15 = locale9.toLanguageTag();
        java.lang.String str16 = locale9.getDisplayVariant();
        java.util.Locale.Builder builder17 = builder7.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder7.addUnicodeLocaleAttribute("\u671d\u9c9c\u6587\u97e9\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ###########################??? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "und" + "'", str15, "und");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("korean##############################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=korean##############################################################################################");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\ud504\ub791\uc2a4\uc5b4", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("und", "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", (-4), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\u82f1\u6587\u82f1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(101.0d, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en_US", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (int) '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("-2-2-zh-C", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en_US" + "'", str5, "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en_US" + "'", str6, "en_US");
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2, (float) (-2), (float) 4);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.0f + "'", float3 == 4.0f);
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        char[] charArray16 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zho", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh-CN", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#_ENG", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ko-KR", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "           AJ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\u4e2d\u6587\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\u1103\u1169\u11a8\u110b\u1175\u11af))", "HindiHindiHindiRF-RFHindiHindiHindi", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        double double21 = bigInteger20.doubleValue();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger((int) (short) -1, byteArray24);
        java.math.BigInteger bigInteger27 = bigInteger20.gcd(bigInteger26);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal33 = bigDecimal29.subtract(bigDecimal32);
        java.math.BigInteger bigInteger34 = bigDecimal33.toBigInteger();
        java.math.BigInteger bigInteger35 = bigInteger26.or(bigInteger34);
        short short36 = bigInteger26.shortValueExact();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        byte byte40 = org.apache.commons.lang3.math.NumberUtils.min(byteArray39);
        java.math.BigInteger bigInteger41 = new java.math.BigInteger((int) (short) -1, byteArray39);
        java.math.BigInteger bigInteger43 = bigInteger41.pow((int) 'a');
        java.math.BigInteger bigInteger45 = bigInteger41.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger46 = bigInteger26.xor(bigInteger45);
        java.math.BigInteger bigInteger47 = bigInteger45.not();
        java.math.BigInteger bigInteger48 = bigInteger13.and(bigInteger47);
        java.math.BigInteger bigInteger50 = bigInteger13.shiftLeft((int) (short) -2);
        long long51 = bigInteger13.longValue();
        java.math.BigInteger bigInteger53 = bigInteger13.pow(1073741825);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) -1 + "'", short36 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1]");
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 1 + "'", byte40 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertNotNull(bigInteger53);
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "South Korea");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "South Korea" + "'", str1, "South Korea");
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Koreanisch (S\374dkorea)", "0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("\u5927\u97d3\u6c11\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, (int) 'x', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("France", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-TW", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "it_IT", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Englisch", "fr_fr", 2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("zh");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(bigInteger48);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal51 = bigDecimal50.negate();
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal55 = bigDecimal51.subtract(bigDecimal54);
        java.math.BigInteger bigInteger56 = bigDecimal55.toBigInteger();
        double double57 = bigInteger56.doubleValue();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        byte byte61 = org.apache.commons.lang3.math.NumberUtils.min(byteArray60);
        java.math.BigInteger bigInteger62 = new java.math.BigInteger((int) (short) -1, byteArray60);
        java.math.BigInteger bigInteger63 = bigInteger56.gcd(bigInteger62);
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal65 = bigDecimal64.negate();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal69 = bigDecimal65.subtract(bigDecimal68);
        java.math.BigInteger bigInteger70 = bigDecimal69.toBigInteger();
        java.math.BigInteger bigInteger71 = bigInteger62.or(bigInteger70);
        short short72 = bigInteger62.shortValueExact();
        byte[] byteArray75 = new byte[] { (byte) 1 };
        byte byte76 = org.apache.commons.lang3.math.NumberUtils.min(byteArray75);
        java.math.BigInteger bigInteger77 = new java.math.BigInteger((int) (short) -1, byteArray75);
        java.math.BigInteger bigInteger79 = bigInteger77.pow((int) 'a');
        java.math.BigInteger bigInteger81 = bigInteger77.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger82 = bigInteger62.xor(bigInteger81);
        java.math.BigInteger bigInteger83 = bigInteger81.not();
        java.math.BigInteger bigInteger84 = bigInteger48.or(bigInteger83);
        java.math.BigInteger bigInteger86 = bigInteger48.shiftLeft(2);
        short short87 = bigInteger48.shortValueExact();
        boolean boolean89 = bigInteger48.equals((java.lang.Object) "Japanese");
        java.lang.String str91 = bigInteger48.toString(300);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1]");
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 1 + "'", byte61 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) -1 + "'", short72 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1]");
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 1 + "'", byte76 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertTrue("'" + short87 + "' != '" + (short) 0 + "'", short87 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "0" + "'", str91, "0");
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = new java.math.BigInteger("UNDUNDUNDUNDUNDUNDUNDUNDUNDUND");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"UND\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00", 1073741825);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=kr????????????????????????????????????????????????????????????????????????????????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 16, (short) -33, (short) (byte) -33);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 16 + "'", short3 == (short) 16);
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale7.getDisplayVariant(locale11);
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Set<java.lang.String> strSet16 = locale11.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cor\351e du Sud" + "'", str9, "Cor\351e du Sud");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(2L, (long) (-4), (long) (short) -5);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "fR", (java.lang.CharSequence) "en-c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("KOR", 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKOR" + "'", str2, "KORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKOR");
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("SETATS DETINU", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("UNITED STATES", "IT_IT!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal5.movePointLeft((int) (byte) 0);
        java.lang.String str8 = bigDecimal7.toPlainString();
        byte byte9 = bigDecimal7.byteValueExact();
        int int10 = bigDecimal2.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((double) (-1L));
        java.lang.String str13 = bigDecimal12.toEngineeringString();
        java.math.BigDecimal[] bigDecimalArray14 = bigDecimal7.divideAndRemainder(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal17 = bigDecimal15.movePointLeft((int) (byte) 0);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal21 = bigDecimal19.min(bigDecimal20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigDecimal[] bigDecimalArray28 = bigDecimal20.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal36 = bigDecimal33.min(bigDecimal35);
        java.math.BigDecimal bigDecimal37 = bigDecimal26.divideToIntegralValue(bigDecimal36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.TEN;
        long long41 = bigDecimal40.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.ulp();
        java.lang.String str43 = bigDecimal40.toString();
        int int44 = bigDecimal38.compareTo(bigDecimal40);
        java.math.BigInteger bigInteger45 = bigDecimal38.toBigInteger();
        java.math.BigDecimal bigDecimal46 = bigDecimal38.ulp();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal48 = bigDecimal47.negate();
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal50 = bigDecimal48.min(bigDecimal49);
        int int51 = bigDecimal38.compareTo(bigDecimal50);
        int int52 = bigDecimal37.compareTo(bigDecimal50);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte55 = bigDecimal54.byteValueExact();
        java.math.BigDecimal bigDecimal57 = bigDecimal54.pow(2);
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal59 = bigDecimal58.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.TEN;
        long long61 = bigDecimal60.longValueExact();
        java.math.BigDecimal bigDecimal62 = bigDecimal60.ulp();
        java.lang.String str63 = bigDecimal60.toString();
        int int64 = bigDecimal58.compareTo(bigDecimal60);
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal68 = bigDecimal60.divide(bigDecimal66, (int) (short) 1);
        java.math.BigDecimal bigDecimal69 = bigDecimal57.add(bigDecimal60);
        java.math.BigDecimal bigDecimal70 = bigDecimal50.divideToIntegralValue(bigDecimal60);
        java.math.BigDecimal bigDecimal71 = bigDecimal15.max(bigDecimal70);
        java.math.RoundingMode roundingMode73 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal74 = bigDecimal7.divide(bigDecimal15, (int) (short) 100, roundingMode73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0" + "'", str13, "-1.0");
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 0 + "'", byte55 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "10" + "'", str63, "10");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal71);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                    ", (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    " + "'", str3, "                                                    ");
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale2.getCountry();
        java.lang.String str6 = locale1.getDisplayLanguage(locale2);
        java.lang.String str7 = locale2.getDisplayLanguage();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("zh-cnzh-cn", locale2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CN" + "'", str5, "CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str7, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-cnzh-cn" + "'", str8, "zh-cnzh-cn");
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.lang.String str3 = bigDecimal0.toPlainString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        int int7 = bigDecimal6.intValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal0.max(bigDecimal6);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.setScale((int) (short) -5);
        java.math.BigInteger bigInteger11 = bigDecimal10.toBigIntegerExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Cor\351e du Sud", 11, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...du Sud" + "'", str3, "...du Sud");
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigInteger bigInteger4 = bigDecimal0.toBigIntegerExact();
        int int5 = bigInteger4.intValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "zh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(")", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("korean##############################################################################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        long long18 = bigDecimal17.longValueExact();
        java.math.BigDecimal bigDecimal19 = bigDecimal17.ulp();
        java.lang.String str20 = bigDecimal17.toString();
        int int21 = bigDecimal15.compareTo(bigDecimal17);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal17.divide(bigDecimal23, (int) (short) 1);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal25.max(bigDecimal26);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.TEN;
        long long30 = bigDecimal29.longValueExact();
        java.math.BigDecimal bigDecimal31 = bigDecimal29.ulp();
        java.math.BigDecimal bigDecimal32 = bigDecimal26.subtract(bigDecimal29);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal37 = bigDecimal36.abs();
        java.math.BigDecimal bigDecimal38 = bigDecimal35.min(bigDecimal37);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int41 = bigDecimal37.compareTo(bigDecimal40);
        java.math.BigDecimal bigDecimal42 = bigDecimal32.divide(bigDecimal40);
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal45 = bigDecimal42.max(bigDecimal44);
        java.math.BigDecimal bigDecimal46 = bigDecimal5.subtract(bigDecimal42);
        java.lang.String str47 = bigDecimal42.toEngineeringString();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0.00E+3" + "'", str47, "0.00E+3");
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u671d\u9c9c\u6587\u97e9\u56fd)", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u9c9c\u6587\u97e9\u56fd)" + "'", str2, "\u9c9c\u6587\u97e9\u56fd)");
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", (-4));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale4.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ???????? (??????)");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-CA" + "'", str1, "en-CA");
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ita");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal12 = bigDecimal10.min(bigDecimal11);
        java.lang.String str13 = bigDecimal10.toPlainString();
        boolean boolean14 = bigInteger8.equals((java.lang.Object) bigDecimal10);
        java.math.BigDecimal bigDecimal15 = bigDecimal10.stripTrailingZeros();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal16.setScale((int) (byte) 100, (int) (byte) 0);
        java.math.BigInteger bigInteger20 = bigDecimal16.toBigInteger();
        java.math.RoundingMode roundingMode21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal22 = bigDecimal15.divide(bigDecimal16, roundingMode21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(301.0f, (float) 120L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 301.0f + "'", float3 == 301.0f);
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("KR                               ", (int) 'x', 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        java.util.Locale locale4 = new java.util.Locale("hi", "hi!uuu", "Korean (South Korea)");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale4.getISO3Language();
        java.lang.String str7 = locale4.getDisplayVariant();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("\u82f1\u6587\u82f1\u56fd)", locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi_HI!UUU_Korean (South Korea)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi_HI!UUU_Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hin" + "'", str6, "hin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean (South Korea)" + "'", str7, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str8, "\u82f1\u6587\u82f1\u56fd)");
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "-1.0", (java.lang.CharSequence) "3.01E-50");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        java.math.BigInteger bigInteger52 = bigInteger44.shiftRight(5);
        java.lang.String str53 = bigInteger44.toString();
        short short54 = bigInteger44.shortValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 0 + "'", short54 == (short) 0);
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("engcn", "0.32", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("frz-C ", "EN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "frz-C " + "'", str2, "frz-C ");
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                      !hi!hi!hi!hi!hi!hi!hi!hi                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u65e5\u672c\u8a9e", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str2, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ENENENENENENENENENENENENENENENENDNU", 'x');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ENENENENENENENENENENENENENENENENDNU" + "'", str4, "ENENENENENENENENENENENENENENENENDNU");
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str1, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd" + "'", str2, "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd");
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("\uc77c\uc5b4\ub3c5\uc77c\ub3c5");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0L);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        boolean boolean7 = languageRange2.equals((java.lang.Object) "engCN");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chn" + "'", str5, "chn");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((int) '#', mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\uad6d\ubbfc\ud55c\ub300");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger14 = bigInteger12.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigInteger bigInteger21 = bigDecimal20.toBigInteger();
        double double22 = bigInteger21.doubleValue();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger28 = bigInteger21.gcd(bigInteger27);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        java.math.BigInteger bigInteger36 = bigInteger27.or(bigInteger35);
        short short37 = bigInteger27.shortValueExact();
        byte byte38 = bigInteger27.byteValueExact();
        java.math.BigInteger bigInteger39 = bigInteger12.and(bigInteger27);
        byte[] byteArray42 = new byte[] { (byte) 1 };
        byte byte43 = org.apache.commons.lang3.math.NumberUtils.min(byteArray42);
        java.math.BigInteger bigInteger44 = new java.math.BigInteger((int) (short) -1, byteArray42);
        java.math.BigInteger bigInteger46 = bigInteger44.pow((int) 'a');
        java.math.BigInteger bigInteger48 = bigInteger44.shiftLeft((int) (short) 1);
        int int49 = bigInteger48.intValueExact();
        java.math.BigInteger bigInteger50 = bigInteger48.abs();
        java.math.BigInteger bigInteger51 = bigInteger27.multiply(bigInteger50);
        java.math.BigInteger bigInteger53 = bigInteger50.shiftRight((int) (byte) -2);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2) + "'", int49 == (-2));
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger53);
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder12 = builder9.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0L);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        double double5 = languageRange2.getWeight();
        java.lang.String str6 = languageRange2.getRange();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        byte[] byteArray14 = bigInteger13.toByteArray();
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray14);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray14);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray14);
        boolean boolean18 = languageRange2.equals((java.lang.Object) byteArray14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chn" + "'", str6, "chn");
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0.32", "-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States", (int) (short) -2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) -1, (short) (byte) -33);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -33 + "'", short3 == (short) -33);
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -33, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9) ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "en-ca");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigInteger bigInteger27 = bigDecimal20.toBigInteger();
        java.math.BigDecimal bigDecimal28 = bigDecimal20.ulp();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal32 = bigDecimal30.min(bigDecimal31);
        int int33 = bigDecimal20.compareTo(bigDecimal32);
        int int34 = bigDecimal19.compareTo(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal36.subtract(bigDecimal39);
        java.math.BigInteger bigInteger41 = bigDecimal40.toBigInteger();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal44 = bigDecimal42.scaleByPowerOfTen(301);
        double double45 = bigDecimal42.doubleValue();
        java.math.BigInteger bigInteger46 = bigDecimal42.toBigInteger();
        java.math.BigDecimal bigDecimal48 = bigDecimal42.movePointLeft((int) (short) 1);
        java.math.MathContext mathContext49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal50 = bigDecimal32.subtract(bigDecimal48, mathContext49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0E-98d + "'", double45 == 1.0E-98d);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigDecimal48);
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN", "ENG                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger7 = bigInteger6.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigInteger();
        double double15 = bigInteger14.doubleValue();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger21 = bigInteger14.gcd(bigInteger20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        java.math.BigInteger bigInteger29 = bigInteger20.or(bigInteger28);
        short short30 = bigInteger20.shortValueExact();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        byte byte34 = org.apache.commons.lang3.math.NumberUtils.min(byteArray33);
        java.math.BigInteger bigInteger35 = new java.math.BigInteger((int) (short) -1, byteArray33);
        java.math.BigInteger bigInteger37 = bigInteger35.pow((int) 'a');
        java.math.BigInteger bigInteger39 = bigInteger35.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger40 = bigInteger20.xor(bigInteger39);
        java.math.BigInteger bigInteger42 = bigInteger39.clearBit(4);
        double double43 = bigInteger39.doubleValue();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal45 = bigDecimal44.negate();
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal49 = bigDecimal45.subtract(bigDecimal48);
        java.math.BigInteger bigInteger50 = bigDecimal49.toBigInteger();
        double double51 = bigInteger50.doubleValue();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        byte byte55 = org.apache.commons.lang3.math.NumberUtils.min(byteArray54);
        java.math.BigInteger bigInteger56 = new java.math.BigInteger((int) (short) -1, byteArray54);
        java.math.BigInteger bigInteger57 = bigInteger50.gcd(bigInteger56);
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal59 = bigDecimal58.negate();
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal63 = bigDecimal59.subtract(bigDecimal62);
        java.math.BigInteger bigInteger64 = bigDecimal63.toBigInteger();
        java.math.BigInteger bigInteger65 = bigInteger56.or(bigInteger64);
        byte[] byteArray66 = bigInteger65.toByteArray();
        byte[] byteArray68 = new byte[] { (byte) 1 };
        byte byte69 = org.apache.commons.lang3.math.NumberUtils.min(byteArray68);
        java.math.BigInteger bigInteger70 = new java.math.BigInteger(byteArray68);
        java.math.BigDecimal bigDecimal71 = new java.math.BigDecimal(bigInteger70);
        short short72 = bigInteger70.shortValueExact();
        int int73 = bigInteger70.bitLength();
        java.math.BigInteger[] bigIntegerArray74 = bigInteger65.divideAndRemainder(bigInteger70);
        java.math.BigDecimal bigDecimal75 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal76 = bigDecimal75.negate();
        java.math.BigDecimal bigDecimal79 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal80 = bigDecimal76.subtract(bigDecimal79);
        java.math.BigInteger bigInteger81 = bigDecimal80.toBigInteger();
        double double82 = bigInteger81.doubleValue();
        byte[] byteArray85 = new byte[] { (byte) 1 };
        byte byte86 = org.apache.commons.lang3.math.NumberUtils.min(byteArray85);
        java.math.BigInteger bigInteger87 = new java.math.BigInteger((int) (short) -1, byteArray85);
        java.math.BigInteger bigInteger88 = bigInteger81.gcd(bigInteger87);
        java.math.BigInteger bigInteger89 = bigInteger70.andNot(bigInteger87);
        java.math.BigInteger bigInteger90 = bigInteger39.xor(bigInteger87);
        java.math.BigInteger bigInteger91 = bigInteger7.subtract(bigInteger87);
        int int92 = bigInteger87.getLowestSetBit();
        float float93 = bigInteger87.floatValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -1 + "'", short30 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1]");
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 1 + "'", byte34 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-2.0d) + "'", double43 == (-2.0d));
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1]");
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 1 + "'", byte55 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-1]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[1]");
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) 1 + "'", byte69 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) 1 + "'", short72 == (short) 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray74);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[1]");
        org.junit.Assert.assertTrue("'" + byte86 + "' != '" + (byte) 1 + "'", byte86 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + float93 + "' != '" + (-1.0f) + "'", float93 == (-1.0f));
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger((int) (short) -1, byteArray3);
        java.math.BigInteger bigInteger7 = bigInteger5.pow((int) 'a');
        byte[] byteArray8 = bigInteger5.toByteArray();
        long long9 = bigInteger5.longValueExact();
        java.lang.String str11 = bigInteger5.toString(0);
        byte[] byteArray14 = new byte[] { (byte) 1 };
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray14);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger((int) (short) -1, byteArray14);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger(byteArray14);
        boolean boolean18 = bigInteger5.equals((java.lang.Object) byteArray14);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger(byteArray14);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = new java.math.BigInteger((-2), byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid signum value");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1]");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("en-us");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-us" + "'", str1, "en-us");
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\uc774\ud0c8\ub9ac\uc544\uc5b4", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\uc5b4\uad6d\ud55c                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.lang.String str3 = bigDecimal0.toPlainString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        int int7 = bigDecimal6.intValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal0.max(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = bigDecimal8.abs();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) '4', 3);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.remainder(bigDecimal12);
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger20 = bigInteger18.pow((int) 'a');
        java.math.BigInteger bigInteger22 = bigInteger18.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger24 = bigInteger22.flipBit(1);
        java.math.BigInteger bigInteger25 = bigInteger22.abs();
        java.math.BigInteger bigInteger27 = bigInteger25.setBit((int) (byte) 0);
        boolean boolean28 = bigDecimal12.equals((java.lang.Object) bigInteger25);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal32 = bigDecimal31.plus();
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        int int34 = bigDecimal32.signum();
        java.math.BigDecimal bigDecimal35 = bigDecimal32.plus();
        float float36 = bigDecimal32.floatValue();
        java.math.BigDecimal bigDecimal38 = bigDecimal32.movePointLeft((-2));
        java.math.MathContext mathContext39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal40 = bigDecimal12.add(bigDecimal32, mathContext39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-1.0f) + "'", float36 == (-1.0f));
        org.junit.Assert.assertNotNull(bigDecimal38);
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("\uc5b4\uad6d\ud55c                                                                                                                                                                                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(120, 0, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigInteger bigInteger4 = bigInteger2.setBit(4);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        double double6 = bigDecimal5.doubleValue();
        java.math.BigInteger bigInteger7 = bigDecimal5.toBigInteger();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger14 = bigInteger12.pow((int) 'a');
        byte[] byteArray15 = bigInteger12.toByteArray();
        long long16 = bigInteger12.longValueExact();
        java.math.BigInteger bigInteger17 = bigInteger7.or(bigInteger12);
        java.math.BigInteger bigInteger18 = bigInteger2.multiply(bigInteger17);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal20 = bigDecimal19.negate();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal24 = bigDecimal20.subtract(bigDecimal23);
        java.math.BigInteger bigInteger25 = bigDecimal24.toBigInteger();
        java.math.BigInteger bigInteger26 = bigInteger25.negate();
        java.math.BigInteger bigInteger27 = bigInteger18.xor(bigInteger26);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal33 = bigDecimal29.subtract(bigDecimal32);
        java.math.BigInteger bigInteger34 = bigDecimal33.toBigInteger();
        double double35 = bigInteger34.doubleValue();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        byte byte39 = org.apache.commons.lang3.math.NumberUtils.min(byteArray38);
        java.math.BigInteger bigInteger40 = new java.math.BigInteger((int) (short) -1, byteArray38);
        java.math.BigInteger bigInteger41 = bigInteger34.gcd(bigInteger40);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        java.math.BigInteger bigInteger49 = bigInteger40.or(bigInteger48);
        java.math.BigInteger bigInteger51 = bigInteger48.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal53 = bigDecimal52.negate();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal57 = bigDecimal53.subtract(bigDecimal56);
        java.math.BigInteger bigInteger58 = bigDecimal57.toBigInteger();
        double double59 = bigInteger58.doubleValue();
        byte[] byteArray62 = new byte[] { (byte) 1 };
        byte byte63 = org.apache.commons.lang3.math.NumberUtils.min(byteArray62);
        java.math.BigInteger bigInteger64 = new java.math.BigInteger((int) (short) -1, byteArray62);
        java.math.BigInteger bigInteger65 = bigInteger58.gcd(bigInteger64);
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal67 = bigDecimal66.negate();
        java.math.BigDecimal bigDecimal70 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal71 = bigDecimal67.subtract(bigDecimal70);
        java.math.BigInteger bigInteger72 = bigDecimal71.toBigInteger();
        java.math.BigInteger bigInteger73 = bigInteger64.or(bigInteger72);
        java.math.BigInteger bigInteger75 = bigInteger72.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger76 = bigInteger51.max(bigInteger72);
        java.math.BigInteger bigInteger78 = bigInteger72.shiftLeft((-1));
        java.math.BigInteger bigInteger79 = bigInteger26.min(bigInteger72);
        java.math.BigInteger bigInteger80 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger81 = bigInteger26.min(bigInteger80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1]");
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 1 + "'", byte39 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1]");
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 1 + "'", byte63 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(bigInteger79);
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("RF-rf", "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RF-rf" + "'", str2, "RF-rf");
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\uc911\uad6d\uc5b4\uc911\uad6d)", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        int int11 = bigInteger4.intValueExact();
        java.math.BigInteger bigInteger13 = bigInteger4.shiftRight((-1));
        boolean boolean15 = bigInteger4.testBit((int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "     zh-cn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     zh-cn" + "'", str1, "     zh-cn");
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("en_US", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_US" + "'", str2, "en_US");
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        java.math.BigInteger bigInteger52 = bigInteger44.shiftRight(5);
        java.lang.String str54 = bigInteger52.toString((int) '4');
        java.math.BigInteger bigInteger55 = bigInteger52.abs();
        java.math.BigInteger bigInteger57 = bigInteger52.pow((int) (short) 100);
        java.math.BigInteger bigInteger58 = bigInteger57.nextProbablePrime();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger58);
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("UNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUND", "npj", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("kor", "10.0E-99", (int) (short) 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger((int) 'a', 100, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("00", 117, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                   00" + "'", str3, "                                                                                                                   00");
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = null;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.lang.String str4 = locale0.getDisplayVariant();
        java.lang.String str5 = locale0.toLanguageTag();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.lang.String str7 = locale6.getScript();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = locale11.getDisplayScript();
        java.lang.String str14 = locale9.getDisplayCountry(locale11);
        java.lang.String str15 = locale6.getDisplayCountry(locale9);
        java.lang.String str16 = locale0.getDisplayName(locale6);
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str10, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Vereinigtes K\366nigreich" + "'", str14, "Vereinigtes K\366nigreich");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "South Korea" + "'", str15, "South Korea");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str16, "\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        java.math.BigDecimal bigDecimal7 = bigDecimal4.pow((int) (short) 0);
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigInteger();
        java.math.MathContext mathContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = bigDecimal7.round(mathContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("   JA", "-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-z-CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "uauauauayuiyuaxuawuawuavuivuevuauuauukuuguuytuwtuttustuatuatuntultuktuituatugtuetuatuwsuvsuusutsussuasuqsuasunsumsulsuksuisugsuesudsucsuasuwauuauaunaumauuqutpuspulpuipuapusauaumaujaucauynuvnuanuanunnulnugnuenudnubnuanuymutmusmuamuamunmulmukmuimuamugmuvluulutlualunluiluglublualuykuwkuvkuukuskuakuakunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuaiuniukiuiiugiueiudiuaiuauyauuautauauauiaueauauvguugungulgudguaguyauauaujauiauauauueuteuseuaeuneuleueeuaduvdueduaduycuvcuucuscuacuacuacuecuacusbuabuabunbumbuibuabugbuebuabuauyauvausauaunaumaukauaueaubau");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uauauauayuiyuaxuawuawuavuivuevuauuauukuuguuytuwtuttustuatuatuntultuktuituatugtuetuatuwsuvsuusutsussuasuqsuasunsumsulsuksuisugsuesudsucsuasuwauuauaunaumauuqutpuspulpuipuapusauaumaujaucauynuvnuanuanunnulnugnuenudnubnuanuymutmusmuamuamunmulmukmuimuamugmuvluulutlualunluiluglublualuykuwkuvkuukuskuakuakunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuaiuniukiuiiugiueiudiuaiuauyauuautauauauiaueauauvguugungulgudguaguyauauaujauiauauauueuteuseuaeuneuleueeuaduvdueduaduycuvcuucuscuacuacuacuecuacusbuabuabunbumbuibuabugbuebuabuauyauvausauaunaumaukauaueaubau" + "'", str1, "uauauauayuiyuaxuawuawuavuivuevuauuauukuuguuytuwtuttustuatuatuntultuktuituatugtuetuatuwsuvsuusutsussuasuqsuasunsumsulsuksuisugsuesudsucsuasuwauuauaunaumauuqutpuspulpuipuapusauaumaujaucauynuvnuanuanunnulnugnuenudnubnuanuymutmusmuamuamunmulmukmuimuamugmuvluulutlualunluiluglublualuykuwkuvkuukuskuakuakunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuaiuniukiuiiugiueiudiuaiuauyauuautauauauiaueauauvguugungulgudguaguyauauaujauiauauauueuteuseuaeuneuleueeuaduvdueduaduycuvcuucuscuacuacuacuecuacusbuabuabunbumbuibuabugbuebuabuauyauvausauaunaumaukauaueaubau");
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ita", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        java.lang.String str6 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 'u', (double) 4, (double) 11);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\uc911\uad6d", "fR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        java.math.BigInteger bigInteger21 = bigInteger17.shiftLeft((int) (short) 1);
        boolean boolean23 = bigInteger21.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger24 = bigInteger7.divide(bigInteger21);
        int int25 = bigInteger7.intValue();
        int int26 = bigInteger7.getLowestSetBit();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        byte byte30 = org.apache.commons.lang3.math.NumberUtils.min(byteArray29);
        java.math.BigInteger bigInteger31 = new java.math.BigInteger((int) (short) -1, byteArray29);
        java.math.BigInteger bigInteger33 = bigInteger31.pow((int) 'a');
        java.math.BigInteger bigInteger35 = bigInteger31.shiftLeft((int) (short) 1);
        boolean boolean37 = bigInteger35.isProbablePrime((int) '4');
        short short38 = bigInteger35.shortValueExact();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.negate();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal44 = bigDecimal40.subtract(bigDecimal43);
        java.math.BigInteger bigInteger45 = bigDecimal44.toBigInteger();
        double double46 = bigInteger45.doubleValue();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        byte byte50 = org.apache.commons.lang3.math.NumberUtils.min(byteArray49);
        java.math.BigInteger bigInteger51 = new java.math.BigInteger((int) (short) -1, byteArray49);
        java.math.BigInteger bigInteger52 = bigInteger45.gcd(bigInteger51);
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal54 = bigDecimal53.negate();
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal58 = bigDecimal54.subtract(bigDecimal57);
        java.math.BigInteger bigInteger59 = bigDecimal58.toBigInteger();
        double double60 = bigInteger59.doubleValue();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        byte byte64 = org.apache.commons.lang3.math.NumberUtils.min(byteArray63);
        java.math.BigInteger bigInteger65 = new java.math.BigInteger((int) (short) -1, byteArray63);
        java.math.BigInteger bigInteger66 = bigInteger59.gcd(bigInteger65);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal68 = bigDecimal67.negate();
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal72 = bigDecimal68.subtract(bigDecimal71);
        java.math.BigInteger bigInteger73 = bigDecimal72.toBigInteger();
        java.math.BigInteger bigInteger74 = bigInteger65.or(bigInteger73);
        short short75 = bigInteger65.shortValueExact();
        byte[] byteArray78 = new byte[] { (byte) 1 };
        byte byte79 = org.apache.commons.lang3.math.NumberUtils.min(byteArray78);
        java.math.BigInteger bigInteger80 = new java.math.BigInteger((int) (short) -1, byteArray78);
        java.math.BigInteger bigInteger82 = bigInteger80.pow((int) 'a');
        java.math.BigInteger bigInteger84 = bigInteger80.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger85 = bigInteger65.xor(bigInteger84);
        java.math.BigInteger bigInteger86 = bigInteger84.not();
        java.math.BigInteger bigInteger87 = bigInteger52.and(bigInteger86);
        java.math.BigInteger bigInteger88 = bigInteger35.subtract(bigInteger86);
        java.math.BigInteger bigInteger90 = bigInteger35.clearBit((int) 'u');
        java.math.BigInteger bigInteger92 = bigInteger90.clearBit((int) (byte) 1);
        java.math.BigInteger bigInteger93 = bigInteger7.multiply(bigInteger90);
        java.math.BigInteger bigInteger94 = bigInteger7.abs();
        byte[] byteArray95 = bigInteger7.toByteArray();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 1 + "'", byte30 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -2 + "'", short38 == (short) -2);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1]");
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 1 + "'", byte50 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1]");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 1 + "'", byte64 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) -1 + "'", short75 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[1]");
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) 1 + "'", byte79 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger92);
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertNotNull(bigInteger94);
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray95), "[-1]");
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("           AJ", "enhinh", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 7L, (float) 4L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 7.0f + "'", float3 == 7.0f);
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "chinois");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111South Korea");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.lang.String str15 = locale14.getVariant();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.upperCase("", locale22);
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = locale24.getISO3Language();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale32);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("hi", locale32);
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("", locale40);
        java.util.Locale.setDefault(locale40);
        java.util.Locale locale43 = java.util.Locale.TAIWAN;
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale45.getScript();
        java.util.Locale locale47 = java.util.Locale.PRC;
        java.util.Locale locale48 = null;
        java.lang.String str49 = locale47.getDisplayScript(locale48);
        java.util.Locale locale50 = java.util.Locale.PRC;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.lowerCase("", locale52);
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale10, locale11, locale13, locale14, locale16, locale17, locale18, locale19, locale20, locale22, locale24, locale27, locale28, locale32, locale35, locale37, locale38, locale40, locale43, locale44, locale45, locale47, locale50, locale52 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.Locale locale57 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap58);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strList67);
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList61, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray72 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList73 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList73, languageRangeArray72);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, (java.util.Collection<java.lang.String>) strList79);
        java.lang.String str82 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strList81);
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList59, (java.util.Collection<java.lang.String>) strList81, filteringMode83);
        java.lang.String str86 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList59, 'x');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zho" + "'", str25, "zho");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str33, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi" + "'", str34, "hi");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(languageRangeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode83.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder9 = builder5.setLanguage("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.removeUnicodeLocaleAttribute("en_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en_CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0.00000000000000000000000000000000SETATS DETINU", "1HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger(byteArray13);
        boolean boolean17 = bigInteger4.equals((java.lang.Object) byteArray13);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        double double25 = bigInteger24.doubleValue();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray28);
        java.math.BigInteger bigInteger30 = new java.math.BigInteger((int) (short) -1, byteArray28);
        java.math.BigInteger bigInteger31 = bigInteger24.gcd(bigInteger30);
        java.math.BigInteger bigInteger32 = bigInteger4.and(bigInteger30);
        java.lang.String str33 = bigInteger4.toString();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger40 = bigInteger38.pow((int) 'a');
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal42 = bigDecimal41.negate();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal46 = bigDecimal42.subtract(bigDecimal45);
        java.math.BigInteger bigInteger47 = bigDecimal46.toBigInteger();
        double double48 = bigInteger47.doubleValue();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger54 = bigInteger47.gcd(bigInteger53);
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal56 = bigDecimal55.negate();
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal60 = bigDecimal56.subtract(bigDecimal59);
        java.math.BigInteger bigInteger61 = bigDecimal60.toBigInteger();
        java.math.BigInteger bigInteger62 = bigInteger53.or(bigInteger61);
        java.math.BigInteger bigInteger63 = bigInteger40.min(bigInteger62);
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger((int) (short) -1, byteArray66);
        java.math.BigInteger bigInteger70 = bigInteger68.pow((int) 'a');
        byte[] byteArray71 = bigInteger68.toByteArray();
        long long72 = bigInteger68.longValueExact();
        java.lang.String str74 = bigInteger68.toString(0);
        byte[] byteArray77 = new byte[] { (byte) 1 };
        byte byte78 = org.apache.commons.lang3.math.NumberUtils.min(byteArray77);
        java.math.BigInteger bigInteger79 = new java.math.BigInteger((int) (short) -1, byteArray77);
        java.math.BigInteger bigInteger80 = bigInteger68.and(bigInteger79);
        java.math.BigInteger bigInteger81 = bigInteger79.abs();
        java.math.BigInteger bigInteger82 = bigInteger40.max(bigInteger79);
        java.math.BigInteger bigInteger83 = bigInteger40.abs();
        java.math.BigInteger bigInteger84 = bigInteger4.multiply(bigInteger83);
        java.math.BigInteger bigInteger85 = bigInteger4.negate();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 1 + "'", byte29 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 1 + "'", byte67 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[-1]");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "-1" + "'", str74, "-1");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1]");
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) 1 + "'", byte78 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger85);
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(byteArray2);
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(bigInteger6, 33);
        int int9 = bigDecimal8.intValue();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale8.getDisplayCountry();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Locale.Builder builder12 = builder5.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("Fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Franc?ais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587" + "'", str11, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        int int5 = bigDecimal1.scale();
        byte byte6 = bigDecimal1.byteValueExact();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigDecimal1.pow((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Invalid operation");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        byte byte4 = bigDecimal2.byteValueExact();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        double double6 = bigDecimal5.doubleValue();
        java.math.BigInteger bigInteger7 = bigDecimal5.toBigInteger();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger14 = bigInteger12.pow((int) 'a');
        byte[] byteArray15 = bigInteger12.toByteArray();
        long long16 = bigInteger12.longValueExact();
        java.math.BigInteger bigInteger17 = bigInteger7.or(bigInteger12);
        byte byte18 = bigInteger12.byteValueExact();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(bigInteger12, (int) (byte) 0);
        java.math.BigDecimal bigDecimal21 = bigDecimal2.multiply(bigDecimal20);
        java.math.BigDecimal bigDecimal22 = bigDecimal2.plus();
        java.math.MathContext mathContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = bigDecimal22.negate(mathContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", 32, 'x');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9" + "'", str3, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList4, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList20, filteringMode23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap25);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale28);
        java.lang.String str30 = locale28.getCountry();
        java.lang.String str31 = locale28.getVariant();
        java.util.Set<java.lang.String> strSet32 = locale28.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.lowerCase("", locale37);
        java.util.Locale.setDefault(locale37);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.lowerCase("", locale41);
        java.util.Locale.setDefault(locale41);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale47);
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale49.getDisplayLanguage();
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.upperCase("", locale52);
        java.util.Locale locale54 = java.util.Locale.GERMANY;
        java.util.Locale locale55 = java.util.Locale.GERMANY;
        java.util.Locale locale56 = java.util.Locale.GERMANY;
        java.lang.String str57 = locale56.getVariant();
        java.util.Locale locale58 = java.util.Locale.KOREA;
        java.util.Locale locale59 = locale58.stripExtensions();
        java.util.Locale locale60 = java.util.Locale.KOREA;
        java.util.Locale locale61 = locale60.stripExtensions();
        java.util.Locale locale62 = java.util.Locale.KOREA;
        java.util.Locale locale63 = java.util.Locale.PRC;
        java.util.Locale locale64 = java.util.Locale.KOREA;
        java.lang.String str65 = locale64.getScript();
        java.util.Locale locale66 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray67 = new java.util.Locale[] { locale37, locale41, locale44, locale47, locale49, locale52, locale54, locale55, locale56, locale58, locale61, locale62, locale63, locale64, locale66 };
        java.util.ArrayList<java.util.Locale> localeList68 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList68, localeArray67);
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList68, filteringMode70);
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags(languageRangeList26, (java.util.Collection<java.lang.String>) strSet32, filteringMode70);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet2, filteringMode70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode23.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str29, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str48, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u4e2d\u6587" + "'", str50, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode70.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(strList72);
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = locale4.getDisplayName();
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str5, "\ud55c\uad6d\uc5b4");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str6, "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("1HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("und ", "", (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u30ab\u30ca\u30c0", "de-DE", "en-CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u30ab\u30ca\u30c0" + "'", str3, "\u30ab\u30ca\u30c0");
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("     zh-cn", 2, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     zh-cn" + "'", str3, "     zh-cn");
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi", "Cennese");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "", (int) (short) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.movePointRight(0);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal9 = bigDecimal7.divide(bigDecimal8);
        java.math.MathContext mathContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = bigDecimal6.multiply(bigDecimal7, mathContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("VEREINIGTES KONIGREICH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "VEREINIGTES KONIGREICH" + "'", str1, "VEREINIGTES KONIGREICH");
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(0.0d);
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 2, (long) (byte) 10, (long) (short) -2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "China" + "'", str1, "China");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "KOREAN (SOUTH KOREA)EN-CEN-CEN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        double double14 = bigInteger13.doubleValue();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger20 = bigInteger13.gcd(bigInteger19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        java.math.BigInteger bigInteger28 = bigInteger19.or(bigInteger27);
        java.math.BigInteger bigInteger29 = bigInteger6.min(bigInteger28);
        java.math.BigInteger bigInteger31 = bigInteger29.shiftLeft((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = bigInteger31.intValueExact();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger out of int range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u6cd5\u6587", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587" + "'", str2, "\u6cd5\u6587");
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((long) 30);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) '#', 120);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.lang.String str8 = bigDecimal5.toString();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(objArray13, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean18 = bigDecimal10.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal19 = bigDecimal5.max(bigDecimal10);
        java.math.BigDecimal bigDecimal20 = bigDecimal4.min(bigDecimal5);
        java.math.MathContext mathContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal22 = bigDecimal1.divide(bigDecimal5, mathContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "fr-FRDeutschland");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        char[] charArray11 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ZH-CNZH-CN", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        java.util.Locale locale2 = new java.util.Locale("GB", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "gb_I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("2ETAT2-DETINU", "\u4e2d\u65874444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2ETAT2-DETINU" + "'", str3, "2ETAT2-DETINU");
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        char[] charArray17 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zho", charArray17);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh-CN", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#_ENG", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\uc77c\ub3c5\uc5b4\uc77c\ub3c5", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("frazho", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("Englisch (Vereinigtes K\366nigreich)", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444444en_US4444444444444444444444444444444444444444444444", (int) (short) 35, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        java.math.BigInteger bigInteger21 = bigInteger17.shiftLeft((int) (short) 1);
        boolean boolean23 = bigInteger21.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger24 = bigInteger7.divide(bigInteger21);
        int int25 = bigInteger7.intValue();
        int int26 = bigInteger7.getLowestSetBit();
        java.math.MathContext mathContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(bigInteger7, mathContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ko-KR", "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)                                                                                                              " + "'", str2, "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)                                                                                                              ");
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("English");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList19);
        java.lang.String str22 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("", locale27);
        java.util.Locale.setDefault(locale27);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("", locale31);
        java.util.Locale.setDefault(locale31);
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.util.Locale locale37 = java.util.Locale.FRANCE;
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale37);
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale39.getDisplayLanguage();
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.upperCase("", locale42);
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        java.util.Locale locale46 = java.util.Locale.GERMANY;
        java.lang.String str47 = locale46.getVariant();
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.util.Locale locale49 = locale48.stripExtensions();
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.util.Locale locale51 = locale50.stripExtensions();
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.Locale locale53 = java.util.Locale.PRC;
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.lang.String str55 = locale54.getScript();
        java.util.Locale locale56 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale27, locale31, locale34, locale37, locale39, locale42, locale44, locale45, locale46, locale48, locale51, locale52, locale53, locale54, locale56 };
        java.util.ArrayList<java.util.Locale> localeList58 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList58, localeArray57);
        java.util.Locale.FilteringMode filteringMode60 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList61 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList58, filteringMode60);
        java.util.Locale locale62 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList61);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList70);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList64, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray75 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList76 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76, languageRangeArray75);
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.lang.String>) strList82);
        java.lang.String str85 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList84);
        java.lang.String str86 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList84);
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList84, filteringMode87);
        java.lang.String str90 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "South Korea");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap91 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList92 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap91);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str38, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u6587" + "'", str40, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + filteringMode60 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode60.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList61);
        org.junit.Assert.assertNull(locale62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(languageRangeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode87.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(languageRangeList92);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "h", 4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en_US", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (int) '4');
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach(")", strArray4, strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en_US" + "'", str10, "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ")" + "'", str11, ")");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.setRegion("US");
        java.util.Locale locale8 = builder3.build();
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.util.Locale locale10 = null;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale9.getScript();
        java.lang.String str13 = locale9.getDisplayScript();
        boolean boolean14 = locale9.hasExtensions();
        java.lang.String str15 = locale8.getDisplayLanguage(locale9);
        java.lang.String str16 = locale9.getDisplayCountry();
        boolean boolean18 = locale9.equals((java.lang.Object) "UND");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587" + "'", str15, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str2, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "KOREAN (SOUTH KOREA)EN-CEN-CEN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger("\u65e5\u672c\u8a9e                                                                                                                                                                                                                                                            ", 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("enhinh", "Enhinh", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList15);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList28);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList38);
        java.lang.String str41 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap42);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList51);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList45, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.lowerCase("", locale60);
        java.util.Locale.setDefault(locale60);
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.lowerCase("", locale64);
        java.util.Locale.setDefault(locale64);
        java.util.Locale locale67 = java.util.Locale.KOREA;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.util.Locale locale70 = java.util.Locale.FRANCE;
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale70);
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.lang.String str73 = locale72.getDisplayLanguage();
        java.util.Locale locale75 = java.util.Locale.getDefault();
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.upperCase("", locale75);
        java.util.Locale locale77 = java.util.Locale.GERMANY;
        java.util.Locale locale78 = java.util.Locale.GERMANY;
        java.util.Locale locale79 = java.util.Locale.GERMANY;
        java.lang.String str80 = locale79.getVariant();
        java.util.Locale locale81 = java.util.Locale.KOREA;
        java.util.Locale locale82 = locale81.stripExtensions();
        java.util.Locale locale83 = java.util.Locale.KOREA;
        java.util.Locale locale84 = locale83.stripExtensions();
        java.util.Locale locale85 = java.util.Locale.KOREA;
        java.util.Locale locale86 = java.util.Locale.PRC;
        java.util.Locale locale87 = java.util.Locale.KOREA;
        java.lang.String str88 = locale87.getScript();
        java.util.Locale locale89 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray90 = new java.util.Locale[] { locale60, locale64, locale67, locale70, locale72, locale75, locale77, locale78, locale79, locale81, locale84, locale85, locale86, locale87, locale89 };
        java.util.ArrayList<java.util.Locale> localeList91 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList91, localeArray90);
        java.util.Locale.FilteringMode filteringMode93 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.util.Locale>) localeList91, filteringMode93);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.util.Locale>) localeList91);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList91);
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList91);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str71, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\u4e2d\u6587" + "'", str73, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + filteringMode93 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode93.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertNotNull(localeList97);
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u4e2d\u6587\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\u1103\u1169\u11a8\u110b\u1175\u11af))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(????????(??????))");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("2ETAT2-DETINU", "KORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKOR", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale0.getDisplayScript(locale3);
        java.lang.String str7 = locale0.getLanguage();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'x');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                              ", (java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        float[] floatArray5 = new float[] { '4', 0L, 4, 1L, 1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[52.0, 0.0, 4.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 52.0f + "'", float9 == 52.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 52.0f + "'", float10 == 52.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 52.0f + "'", float12 == 52.0f);
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "chnchnchnc                                         French (France)                                         chnchnchnc", (java.lang.CharSequence) "th Korea)en-cen-cenuKorean (So");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "chnchnchnc                                         French (France)                                         chnchnchnc" + "'", charSequence2, "chnchnchnc                                         French (France)                                         chnchnchnc");
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("ZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("Cor\351e du Sud");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Core?e du Sud [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0);
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal7 = bigDecimal2.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        int int10 = bigDecimal7.compareTo(bigDecimal8);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger17 = bigInteger15.pow((int) 'a');
        byte[] byteArray18 = bigInteger15.toByteArray();
        long long19 = bigInteger15.longValueExact();
        java.lang.String str21 = bigInteger15.toString(0);
        int int22 = bigInteger15.intValueExact();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(bigInteger15);
        java.math.BigDecimal bigDecimal24 = bigDecimal7.max(bigDecimal23);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.TEN;
        long long28 = bigDecimal27.longValueExact();
        java.math.BigDecimal bigDecimal29 = bigDecimal27.ulp();
        java.lang.String str30 = bigDecimal27.toString();
        int int31 = bigDecimal25.compareTo(bigDecimal27);
        int int32 = bigDecimal27.precision();
        java.math.BigDecimal bigDecimal33 = bigDecimal24.divideToIntegralValue(bigDecimal27);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.split("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        int int38 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("English", strArray37);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray37);
        boolean boolean40 = bigDecimal27.equals((java.lang.Object) strArray37);
        int int41 = org.apache.commons.lang3.StringUtils.indexOfAny("frz-C ", strArray37);
        int int42 = org.apache.commons.lang3.StringUtils.indexOfAny("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", strArray37);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1" + "'", str21, "-1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10" + "'", str30, "10");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("FR-FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR-FR" + "'", str1, "FR-FR");
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 'a', (double) (short) -2, (-10.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10.0d) + "'", double3 == (-10.0d));
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger("z-C", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!uuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ko_KR", (int) (short) 117, 563);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!uuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaako_KR" + "'", str4, "hi!uuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaako_KR");
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz", (java.lang.CharSequence) "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ENGLISH", (java.lang.CharSequence) "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.lang.String str3 = bigDecimal0.toPlainString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        int int7 = bigDecimal6.intValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal0.max(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = bigDecimal8.abs();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) '4', 3);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.remainder(bigDecimal12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal21 = bigDecimal18.min(bigDecimal20);
        java.math.BigDecimal bigDecimal23 = bigDecimal21.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal26 = bigDecimal21.setScale(0, 2);
        java.math.MathContext mathContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal28 = bigDecimal9.divide(bigDecimal26, mathContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str1, "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigInteger bigInteger27 = bigDecimal20.toBigInteger();
        java.math.BigDecimal bigDecimal28 = bigDecimal20.ulp();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal32 = bigDecimal30.min(bigDecimal31);
        int int33 = bigDecimal20.compareTo(bigDecimal32);
        int int34 = bigDecimal19.compareTo(bigDecimal32);
        int int35 = bigDecimal19.precision();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal37 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.TEN;
        long long39 = bigDecimal38.longValueExact();
        java.math.BigDecimal bigDecimal40 = bigDecimal38.ulp();
        java.lang.String str41 = bigDecimal38.toString();
        int int42 = bigDecimal36.compareTo(bigDecimal38);
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal46 = bigDecimal38.divide(bigDecimal44, (int) (short) 1);
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.TEN;
        long long48 = bigDecimal47.longValueExact();
        java.math.BigDecimal bigDecimal49 = bigDecimal46.max(bigDecimal47);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.TEN;
        long long51 = bigDecimal50.longValueExact();
        java.math.BigDecimal bigDecimal52 = bigDecimal50.ulp();
        java.math.BigDecimal bigDecimal53 = bigDecimal47.subtract(bigDecimal50);
        int int54 = bigDecimal47.signum();
        java.math.BigDecimal bigDecimal55 = bigDecimal19.min(bigDecimal47);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigDecimal bigDecimal63 = bigDecimal61.negate();
        java.math.BigDecimal bigDecimal65 = bigDecimal63.scaleByPowerOfTen(301);
        double double66 = bigDecimal63.doubleValue();
        java.math.MathContext mathContext67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal68 = bigDecimal47.add(bigDecimal63, mathContext67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "10" + "'", str41, "10");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0E-98d + "'", double66 == 1.0E-98d);
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.lang.String str15 = locale14.getVariant();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.upperCase("", locale22);
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = locale24.getISO3Language();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale32);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("hi", locale32);
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("", locale40);
        java.util.Locale.setDefault(locale40);
        java.util.Locale locale43 = java.util.Locale.TAIWAN;
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale45.getScript();
        java.util.Locale locale47 = java.util.Locale.PRC;
        java.util.Locale locale48 = null;
        java.lang.String str49 = locale47.getDisplayScript(locale48);
        java.util.Locale locale50 = java.util.Locale.PRC;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.lowerCase("", locale52);
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale10, locale11, locale13, locale14, locale16, locale17, locale18, locale19, locale20, locale22, locale24, locale27, locale28, locale32, locale35, locale37, locale38, locale40, locale43, locale44, locale45, locale47, locale50, locale52 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.Locale locale57 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap58);
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList59, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList59, strMap62);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fran\347ais" + "'", str12, "fran\347ais");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zho" + "'", str25, "zho");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str33, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi" + "'", str34, "hi");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(languageRangeList63);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        long[] longArray6 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u82f1\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getVariant();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet6 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 13, 300);
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("eng");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder10 = builder8.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder14 = builder10.setScript("");
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("-1UND0");
        java.util.Locale.Builder builder17 = builder10.setLocale(locale16);
        java.util.Locale.Builder builder18 = builder4.setLocale(locale16);
        java.util.Locale.Builder builder19 = builder18.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder18.removeUnicodeLocaleAttribute("x");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: x [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "German (Germany)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((int) 'a', mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("en-gb", "     zh-cn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) (byte) -2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -2 + "'", short3 == (short) -2);
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        double double14 = bigInteger13.doubleValue();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger20 = bigInteger13.gcd(bigInteger19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        java.math.BigInteger bigInteger28 = bigInteger19.or(bigInteger27);
        java.math.BigInteger bigInteger29 = bigInteger6.min(bigInteger28);
        byte[] byteArray32 = new byte[] { (byte) 1 };
        byte byte33 = org.apache.commons.lang3.math.NumberUtils.min(byteArray32);
        java.math.BigInteger bigInteger34 = new java.math.BigInteger((int) (short) -1, byteArray32);
        java.math.BigInteger bigInteger36 = bigInteger34.pow((int) 'a');
        byte[] byteArray37 = bigInteger34.toByteArray();
        long long38 = bigInteger34.longValueExact();
        java.lang.String str40 = bigInteger34.toString(0);
        byte[] byteArray43 = new byte[] { (byte) 1 };
        byte byte44 = org.apache.commons.lang3.math.NumberUtils.min(byteArray43);
        java.math.BigInteger bigInteger45 = new java.math.BigInteger((int) (short) -1, byteArray43);
        java.math.BigInteger bigInteger46 = bigInteger34.and(bigInteger45);
        java.math.BigInteger bigInteger47 = bigInteger45.abs();
        java.math.BigInteger bigInteger48 = bigInteger6.max(bigInteger45);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal50 = bigDecimal49.negate();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal54 = bigDecimal50.subtract(bigDecimal53);
        java.math.BigInteger bigInteger55 = bigDecimal54.toBigInteger();
        double double56 = bigInteger55.doubleValue();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        byte byte60 = org.apache.commons.lang3.math.NumberUtils.min(byteArray59);
        java.math.BigInteger bigInteger61 = new java.math.BigInteger((int) (short) -1, byteArray59);
        java.math.BigInteger bigInteger62 = bigInteger55.gcd(bigInteger61);
        java.math.BigDecimal bigDecimal63 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal64 = bigDecimal63.negate();
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal68 = bigDecimal64.subtract(bigDecimal67);
        java.math.BigInteger bigInteger69 = bigDecimal68.toBigInteger();
        java.math.BigInteger bigInteger70 = bigInteger61.or(bigInteger69);
        short short71 = bigInteger61.shortValueExact();
        byte[] byteArray74 = new byte[] { (byte) 1 };
        byte byte75 = org.apache.commons.lang3.math.NumberUtils.min(byteArray74);
        java.math.BigInteger bigInteger76 = new java.math.BigInteger((int) (short) -1, byteArray74);
        java.math.BigInteger bigInteger78 = bigInteger76.pow((int) 'a');
        java.math.BigInteger bigInteger80 = bigInteger76.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger81 = bigInteger61.xor(bigInteger80);
        java.math.BigInteger bigInteger83 = bigInteger80.clearBit(4);
        java.math.BigInteger bigInteger84 = bigInteger6.min(bigInteger83);
        int int85 = bigInteger84.signum();
        short short86 = bigInteger84.shortValue();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1" + "'", str40, "-1");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1]");
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1]");
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) 1 + "'", byte60 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) -1 + "'", short71 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[1]");
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 1 + "'", byte75 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + short86 + "' != '" + (short) -18 + "'", short86 == (short) -18);
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("jpnjpnjpnjpnjpnjpnjpnjpnjpnjpn", "RF-RF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u65e5\u6587", (int) (byte) 1, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u6587" + "'", str3, "\u65e5\u6587");
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)" + "'", str1, "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)");
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        boolean boolean10 = bigInteger8.isProbablePrime((int) '4');
        short short11 = bigInteger8.shortValueExact();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal17 = bigDecimal13.subtract(bigDecimal16);
        java.math.BigInteger bigInteger18 = bigDecimal17.toBigInteger();
        double double19 = bigInteger18.doubleValue();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger25 = bigInteger18.gcd(bigInteger24);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        double double33 = bigInteger32.doubleValue();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger39 = bigInteger32.gcd(bigInteger38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal45 = bigDecimal41.subtract(bigDecimal44);
        java.math.BigInteger bigInteger46 = bigDecimal45.toBigInteger();
        java.math.BigInteger bigInteger47 = bigInteger38.or(bigInteger46);
        short short48 = bigInteger38.shortValueExact();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        java.math.BigInteger bigInteger57 = bigInteger53.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger58 = bigInteger38.xor(bigInteger57);
        java.math.BigInteger bigInteger59 = bigInteger57.not();
        java.math.BigInteger bigInteger60 = bigInteger25.and(bigInteger59);
        java.math.BigInteger bigInteger61 = bigInteger8.subtract(bigInteger59);
        byte byte62 = bigInteger8.byteValueExact();
        java.math.BigInteger bigInteger63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger64 = bigInteger8.subtract(bigInteger63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -2 + "'", short11 == (short) -2);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) -1 + "'", short48 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) -2 + "'", byte62 == (byte) -2);
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\uad6d\ubbfc\ud55c\ub300", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        int int21 = bigDecimal19.intValueExact();
        long long22 = bigDecimal19.longValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal18 = bigDecimal17.plus();
        java.math.BigDecimal bigDecimal19 = bigDecimal0.remainder(bigDecimal17);
        int int20 = bigDecimal19.precision();
        double double21 = bigDecimal19.doubleValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.lang.String str3 = bigDecimal0.toPlainString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        int int7 = bigDecimal6.intValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal0.max(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = bigDecimal8.abs();
        long long10 = bigDecimal9.longValueExact();
        java.lang.String str11 = bigDecimal9.toEngineeringString();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("!hi!hi!hi!hi!hi!hi!hi!hi", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi", "eng", 1);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("#_ENG", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterType("zho");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", strArray10, strArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "English", 5, 2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("z-C", strArray5, strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str14, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "z-C" + "'", str19, "z-C");
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN" + "'", str1, "JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN");
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigInteger bigInteger4 = bigInteger2.setBit(4);
        long long5 = bigInteger2.longValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fra ", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf((long) 563);
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("en_CA", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!", "...du Sud");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u4e2d\u56fd", (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "h");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("South Korea", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                   00", "de_DE", (int) (byte) -2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.min(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.unscaledValue();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        double double8 = bigDecimal7.doubleValue();
        java.math.BigInteger bigInteger9 = bigDecimal7.toBigInteger();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray12);
        java.math.BigInteger bigInteger14 = new java.math.BigInteger((int) (short) -1, byteArray12);
        java.math.BigInteger bigInteger16 = bigInteger14.pow((int) 'a');
        byte[] byteArray17 = bigInteger14.toByteArray();
        long long18 = bigInteger14.longValueExact();
        java.math.BigInteger bigInteger19 = bigInteger9.or(bigInteger14);
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger26 = bigInteger24.pow((int) 'a');
        byte[] byteArray27 = bigInteger24.toByteArray();
        long long28 = bigInteger24.longValueExact();
        java.lang.String str30 = bigInteger24.toString(0);
        int int31 = bigInteger24.intValueExact();
        java.math.BigInteger bigInteger32 = bigInteger19.subtract(bigInteger24);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal38 = bigDecimal34.subtract(bigDecimal37);
        java.math.BigInteger bigInteger39 = bigDecimal38.toBigInteger();
        java.math.BigInteger bigInteger40 = bigInteger39.negate();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.ZERO;
        double double42 = bigDecimal41.doubleValue();
        java.math.BigInteger bigInteger43 = bigDecimal41.toBigInteger();
        byte[] byteArray46 = new byte[] { (byte) 1 };
        byte byte47 = org.apache.commons.lang3.math.NumberUtils.min(byteArray46);
        java.math.BigInteger bigInteger48 = new java.math.BigInteger((int) (short) -1, byteArray46);
        java.math.BigInteger bigInteger50 = bigInteger48.pow((int) 'a');
        byte[] byteArray51 = bigInteger48.toByteArray();
        long long52 = bigInteger48.longValueExact();
        java.math.BigInteger bigInteger53 = bigInteger43.or(bigInteger48);
        byte[] byteArray56 = new byte[] { (byte) 1 };
        byte byte57 = org.apache.commons.lang3.math.NumberUtils.min(byteArray56);
        java.math.BigInteger bigInteger58 = new java.math.BigInteger((int) (short) -1, byteArray56);
        java.math.BigInteger bigInteger60 = bigInteger58.pow((int) 'a');
        byte[] byteArray61 = bigInteger58.toByteArray();
        long long62 = bigInteger58.longValueExact();
        java.lang.String str64 = bigInteger58.toString(0);
        int int65 = bigInteger58.intValueExact();
        java.math.BigInteger bigInteger66 = bigInteger53.subtract(bigInteger58);
        java.math.BigInteger bigInteger67 = bigInteger39.min(bigInteger53);
        java.math.BigInteger bigInteger68 = bigInteger32.gcd(bigInteger67);
        java.math.BigInteger bigInteger70 = bigInteger32.setBit(0);
        int int71 = bigInteger32.intValueExact();
        java.math.BigInteger bigInteger72 = bigInteger6.gcd(bigInteger32);
        java.math.BigInteger bigInteger74 = bigInteger6.flipBit(34);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1]");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1]");
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 1 + "'", byte47 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1]");
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 1 + "'", byte57 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "-1" + "'", str64, "-1");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger74);
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("hi");
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder5.addUnicodeLocaleAttribute("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder5.setExtension('a', "French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: French (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais" + "'", str7, "fran\347ais");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal12 = bigDecimal10.min(bigDecimal11);
        java.lang.String str13 = bigDecimal10.toPlainString();
        boolean boolean14 = bigInteger8.equals((java.lang.Object) bigDecimal10);
        java.lang.String str16 = bigInteger8.toString((int) (byte) 10);
        int int17 = bigInteger8.bitCount();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-2" + "'", str16, "-2");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.lang.String str3 = locale2.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ???????? (??????)");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("it", 563, "Eng                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      " + "'", str3, "Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) -18, (-4.0d), (double) 13);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.0d + "'", double3 == 13.0d);
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!", (double) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=13.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", "AJ");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)_AJ");
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger(52, 13, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal("\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587", mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal12 = bigDecimal10.min(bigDecimal11);
        java.lang.String str13 = bigDecimal10.toPlainString();
        boolean boolean14 = bigInteger8.equals((java.lang.Object) bigDecimal10);
        java.lang.String str16 = bigInteger8.toString((int) (byte) 10);
        java.lang.String str18 = bigInteger8.toString((int) '4');
        byte[] byteArray21 = new byte[] { (byte) 1 };
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray21);
        java.math.BigInteger bigInteger23 = new java.math.BigInteger((int) (short) -1, byteArray21);
        java.math.BigInteger bigInteger25 = bigInteger23.pow((int) 'a');
        java.math.BigInteger bigInteger27 = bigInteger23.shiftLeft((int) (short) 1);
        boolean boolean29 = bigInteger27.isProbablePrime((int) '4');
        short short30 = bigInteger27.shortValueExact();
        int int31 = bigInteger8.compareTo(bigInteger27);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.math.BigInteger bigInteger38 = bigDecimal37.toBigInteger();
        double double39 = bigInteger38.doubleValue();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        byte byte43 = org.apache.commons.lang3.math.NumberUtils.min(byteArray42);
        java.math.BigInteger bigInteger44 = new java.math.BigInteger((int) (short) -1, byteArray42);
        java.math.BigInteger bigInteger45 = bigInteger38.gcd(bigInteger44);
        java.math.BigInteger bigInteger46 = bigInteger44.negate();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.ZERO;
        double double48 = bigDecimal47.doubleValue();
        java.math.BigInteger bigInteger49 = bigDecimal47.toBigInteger();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger56 = bigInteger54.pow((int) 'a');
        byte[] byteArray57 = bigInteger54.toByteArray();
        long long58 = bigInteger54.longValueExact();
        java.math.BigInteger bigInteger59 = bigInteger49.or(bigInteger54);
        byte[] byteArray62 = new byte[] { (byte) 1 };
        byte byte63 = org.apache.commons.lang3.math.NumberUtils.min(byteArray62);
        java.math.BigInteger bigInteger64 = new java.math.BigInteger((int) (short) -1, byteArray62);
        java.math.BigInteger bigInteger66 = bigInteger64.pow((int) 'a');
        byte[] byteArray67 = bigInteger64.toByteArray();
        long long68 = bigInteger64.longValueExact();
        java.lang.String str70 = bigInteger64.toString(0);
        int int71 = bigInteger64.intValueExact();
        java.math.BigInteger bigInteger72 = bigInteger59.subtract(bigInteger64);
        java.math.BigInteger bigInteger73 = bigInteger44.subtract(bigInteger72);
        java.lang.String str75 = bigInteger73.toString((int) '4');
        java.math.BigInteger bigInteger76 = bigInteger27.min(bigInteger73);
        java.math.MathContext mathContext77 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal78 = new java.math.BigDecimal(bigInteger73, mathContext77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-2" + "'", str16, "-2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-2" + "'", str18, "-2");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -2 + "'", short30 == (short) -2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1]");
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 1 + "'", byte63 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "-1" + "'", str70, "-1");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "-1" + "'", str75, "-1");
        org.junit.Assert.assertNotNull(bigInteger76);
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigInteger bigInteger27 = bigDecimal20.toBigInteger();
        java.math.BigDecimal bigDecimal28 = bigDecimal20.ulp();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal32 = bigDecimal30.min(bigDecimal31);
        int int33 = bigDecimal20.compareTo(bigDecimal32);
        int int34 = bigDecimal19.compareTo(bigDecimal32);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte37 = bigDecimal36.byteValueExact();
        java.math.BigDecimal bigDecimal39 = bigDecimal36.pow(2);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.TEN;
        long long43 = bigDecimal42.longValueExact();
        java.math.BigDecimal bigDecimal44 = bigDecimal42.ulp();
        java.lang.String str45 = bigDecimal42.toString();
        int int46 = bigDecimal40.compareTo(bigDecimal42);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal50 = bigDecimal42.divide(bigDecimal48, (int) (short) 1);
        java.math.BigDecimal bigDecimal51 = bigDecimal39.add(bigDecimal42);
        java.math.BigDecimal bigDecimal52 = bigDecimal32.divideToIntegralValue(bigDecimal42);
        java.lang.String str53 = bigDecimal32.toString();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.TEN;
        long long58 = bigDecimal57.longValueExact();
        java.math.BigDecimal bigDecimal59 = bigDecimal57.ulp();
        java.math.BigDecimal bigDecimal61 = bigDecimal59.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal62 = bigDecimal59.plus();
        java.math.BigDecimal[] bigDecimalArray63 = bigDecimal56.divideAndRemainder(bigDecimal62);
        java.lang.String str64 = bigDecimal62.toPlainString();
        java.math.MathContext mathContext65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal66 = bigDecimal32.divide(bigDecimal62, mathContext65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 0 + "'", byte37 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "10" + "'", str45, "10");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10L + "'", long58 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimalArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1" + "'", str64, "1");
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.plus();
        java.math.BigDecimal bigDecimal4 = bigDecimal3.negate();
        java.math.MathContext mathContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigDecimal4.round(mathContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        float float4 = bigDecimal1.floatValue();
        java.math.MathContext mathContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigDecimal1.plus(mathContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111South Korea", 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("UitdStts", "CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UitdStts" + "'", str2, "UitdStts");
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(52, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.abs();
        java.lang.String str2 = bigDecimal1.toPlainString();
        short short3 = bigDecimal1.shortValueExact();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.TEN;
        long long7 = bigDecimal6.longValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal6.ulp();
        java.lang.String str9 = bigDecimal6.toString();
        int int10 = bigDecimal4.compareTo(bigDecimal6);
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divide(bigDecimal12, (int) (short) 1);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.TEN;
        long long16 = bigDecimal15.longValueExact();
        java.math.BigDecimal bigDecimal17 = bigDecimal14.max(bigDecimal15);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.TEN;
        long long19 = bigDecimal18.longValueExact();
        java.math.BigDecimal bigDecimal20 = bigDecimal18.ulp();
        java.math.BigDecimal bigDecimal21 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        int int24 = bigDecimal22.intValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal22.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.TEN;
        long long28 = bigDecimal27.longValueExact();
        java.math.BigDecimal bigDecimal29 = bigDecimal27.ulp();
        java.math.BigDecimal bigDecimal30 = bigDecimal26.remainder(bigDecimal29);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        double double32 = bigDecimal31.doubleValue();
        java.math.BigInteger bigInteger33 = bigDecimal31.toBigInteger();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger40 = bigInteger38.pow((int) 'a');
        byte[] byteArray41 = bigInteger38.toByteArray();
        long long42 = bigInteger38.longValueExact();
        java.math.BigInteger bigInteger43 = bigInteger33.or(bigInteger38);
        byte byte44 = bigInteger38.byteValueExact();
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal(bigInteger38, (int) (byte) 0);
        java.math.BigDecimal bigDecimal48 = new java.math.BigDecimal(bigInteger38, (int) '#');
        java.math.BigDecimal bigDecimal49 = bigDecimal30.subtract(bigDecimal48);
        java.math.BigDecimal bigDecimal50 = bigDecimal21.add(bigDecimal30);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal51 = bigDecimal1.divide(bigDecimal21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("\u65e5\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                              ??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_US" + "'", str3, "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en_US" + "'", str4, "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en_US" + "'", str5, "en_US");
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger("\uc911\uad6d\uc5b4\uc911\uad6d)", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger7 = bigInteger6.negate();
        boolean boolean9 = bigInteger6.isProbablePrime(1073741825);
        int int10 = bigInteger6.bitCount();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", "\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "ZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder4 = builder2.setVariant("Korean");
        java.util.Locale.Builder builder6 = builder2.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.removeUnicodeLocaleAttribute("de_DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: de_DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("f");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.movePointRight(0);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.TEN;
        long long10 = bigDecimal9.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.ulp();
        java.lang.String str12 = bigDecimal9.toString();
        int int13 = bigDecimal7.compareTo(bigDecimal9);
        short short14 = bigDecimal7.shortValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal7.movePointRight((int) (short) 0);
        java.math.BigDecimal bigDecimal17 = bigDecimal16.negate();
        java.math.RoundingMode roundingMode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = bigDecimal6.divide(bigDecimal16, roundingMode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("fR", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("jpn", "-1UND0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setRegion("\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ??????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 32, (long) (short) 35, 30L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4", "UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ENENENENENENENENENENENENENENENENDNU", "\u7f8e\u56fd\u7f8e\u56fd\u7f8e\u56fd", "e", (int) (short) -33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ENENENENENENENENENENENENENENENENDNU" + "'", str4, "ENENENENENENENENENENENENENENENENDNU");
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("KR");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger14 = bigInteger12.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigInteger bigInteger21 = bigDecimal20.toBigInteger();
        double double22 = bigInteger21.doubleValue();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger28 = bigInteger21.gcd(bigInteger27);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        java.math.BigInteger bigInteger36 = bigInteger27.or(bigInteger35);
        short short37 = bigInteger27.shortValueExact();
        byte byte38 = bigInteger27.byteValueExact();
        java.math.BigInteger bigInteger39 = bigInteger12.and(bigInteger27);
        byte[] byteArray42 = new byte[] { (byte) 1 };
        byte byte43 = org.apache.commons.lang3.math.NumberUtils.min(byteArray42);
        java.math.BigInteger bigInteger44 = new java.math.BigInteger((int) (short) -1, byteArray42);
        java.math.BigInteger bigInteger46 = bigInteger44.pow((int) 'a');
        java.math.BigInteger bigInteger48 = bigInteger44.shiftLeft((int) (short) 1);
        int int49 = bigInteger48.intValueExact();
        java.math.BigInteger bigInteger50 = bigInteger48.abs();
        java.math.BigInteger bigInteger51 = bigInteger27.multiply(bigInteger50);
        java.math.BigInteger bigInteger53 = bigInteger27.clearBit((int) (byte) 100);
        java.math.BigInteger bigInteger54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger55 = bigInteger53.subtract(bigInteger54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2) + "'", int49 == (-2));
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger53);
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "frz-C ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "CA", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 320 + "'", int2 == 320);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("German (Germany)", "Cor\351e du Sud");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German (Germany)" + "'", str2, "German (Germany)");
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", (int) (short) -33, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Japanese", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japanese" + "'", str2, "Japanese");
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.ulp();
        int int6 = bigDecimal1.intValueExact();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigDecimal1.pow(1073741825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Invalid operation");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ENENENENENENENENENENENENENENENENDNU", "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 6);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal5 = bigDecimal3.min(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.math.BigDecimal[] bigDecimalArray12 = bigDecimal4.divideAndRemainder(bigDecimal10);
        java.math.BigDecimal bigDecimal13 = bigDecimal10.plus();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.ulp();
        java.lang.String str19 = bigDecimal16.toString();
        int int20 = bigDecimal14.compareTo(bigDecimal16);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal24 = bigDecimal16.divide(bigDecimal22, (int) (short) 1);
        java.math.BigDecimal bigDecimal25 = bigDecimal13.multiply(bigDecimal24);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal28 = bigDecimal1.divide(bigDecimal25, 320, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimalArray12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#", "hKorean (South Korea)en-cen-cen", "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = java.math.BigInteger.probablePrime((int) 'a', random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("\uc601\uc5b4\uc601\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????? (??????)\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("it", "                                                                                                                                                                                                                                                                                                          gne");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn", "jpn", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("en-GB");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: en-GB is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("English");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList3, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList19, filteringMode22);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList19);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "gbr");
        java.util.Locale locale30 = new java.util.Locale("hi", "hi!uuu", "Korean (South Korea)");
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList39);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList33, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.lang.String str51 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList49, filteringMode52);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet31, filteringMode52);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "fr");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals(locale30.toString(), "hi_HI!UUU_Korean (South Korea)");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode52.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.TEN;
        long long9 = bigDecimal8.longValueExact();
        java.math.BigDecimal bigDecimal10 = bigDecimal8.ulp();
        java.lang.String str11 = bigDecimal8.toString();
        int int12 = bigDecimal6.compareTo(bigDecimal8);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal8.divide(bigDecimal14, (int) (short) 1);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        long long18 = bigDecimal17.longValueExact();
        java.math.BigDecimal bigDecimal19 = bigDecimal16.max(bigDecimal17);
        java.math.BigDecimal bigDecimal20 = bigDecimal0.add(bigDecimal16);
        java.math.BigDecimal bigDecimal22 = bigDecimal0.movePointLeft((int) (byte) -2);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal22);
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        byte byte11 = bigDecimal10.byteValueExact();
        java.math.BigDecimal bigDecimal12 = bigDecimal10.plus();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        double double14 = bigDecimal13.doubleValue();
        java.math.BigInteger bigInteger15 = bigDecimal13.toBigInteger();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        byte[] byteArray23 = bigInteger20.toByteArray();
        long long24 = bigInteger20.longValueExact();
        java.math.BigInteger bigInteger25 = bigInteger15.or(bigInteger20);
        java.math.BigDecimal bigDecimal26 = new java.math.BigDecimal(bigInteger15);
        java.math.BigDecimal bigDecimal28 = bigDecimal26.scaleByPowerOfTen((int) (byte) -1);
        java.math.MathContext mathContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray30 = bigDecimal10.divideAndRemainder(bigDecimal26, mathContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal28);
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 35, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 35 + "'", short3 == (short) 35);
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("fr", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!" + "'", charSequence2, "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(bigInteger48);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal51 = bigDecimal50.negate();
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal55 = bigDecimal51.subtract(bigDecimal54);
        java.math.BigInteger bigInteger56 = bigDecimal55.toBigInteger();
        double double57 = bigInteger56.doubleValue();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        byte byte61 = org.apache.commons.lang3.math.NumberUtils.min(byteArray60);
        java.math.BigInteger bigInteger62 = new java.math.BigInteger((int) (short) -1, byteArray60);
        java.math.BigInteger bigInteger63 = bigInteger56.gcd(bigInteger62);
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal65 = bigDecimal64.negate();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal69 = bigDecimal65.subtract(bigDecimal68);
        java.math.BigInteger bigInteger70 = bigDecimal69.toBigInteger();
        java.math.BigInteger bigInteger71 = bigInteger62.or(bigInteger70);
        short short72 = bigInteger62.shortValueExact();
        byte[] byteArray75 = new byte[] { (byte) 1 };
        byte byte76 = org.apache.commons.lang3.math.NumberUtils.min(byteArray75);
        java.math.BigInteger bigInteger77 = new java.math.BigInteger((int) (short) -1, byteArray75);
        java.math.BigInteger bigInteger79 = bigInteger77.pow((int) 'a');
        java.math.BigInteger bigInteger81 = bigInteger77.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger82 = bigInteger62.xor(bigInteger81);
        java.math.BigInteger bigInteger83 = bigInteger81.not();
        java.math.BigInteger bigInteger84 = bigInteger48.or(bigInteger83);
        java.math.BigInteger bigInteger86 = bigInteger48.shiftLeft(2);
        java.math.BigDecimal bigDecimal87 = java.math.BigDecimal.ZERO;
        double double88 = bigDecimal87.doubleValue();
        java.math.BigInteger bigInteger89 = bigDecimal87.toBigInteger();
        java.math.BigInteger bigInteger90 = bigInteger86.xor(bigInteger89);
        java.math.BigInteger bigInteger92 = bigInteger89.setBit(4);
        java.math.MathContext mathContext93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal94 = new java.math.BigDecimal(bigInteger89, mathContext93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1]");
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 1 + "'", byte61 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) -1 + "'", short72 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1]");
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 1 + "'", byte76 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigDecimal87);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger92);
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguage("     zh-cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:      zh-cn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                          gne", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("DE", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               DE" + "'", str2, "                                                                                               DE");
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 0.0f);
        int int2 = bigDecimal1.signum();
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("english", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        byte[] byteArray26 = new byte[] { (byte) 1 };
        byte byte27 = org.apache.commons.lang3.math.NumberUtils.min(byteArray26);
        java.math.BigInteger bigInteger28 = new java.math.BigInteger((int) (short) -1, byteArray26);
        java.math.BigInteger bigInteger30 = bigInteger28.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigInteger28.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger34 = bigInteger32.flipBit(1);
        byte[] byteArray37 = new byte[] { (byte) 1 };
        byte byte38 = org.apache.commons.lang3.math.NumberUtils.min(byteArray37);
        java.math.BigInteger bigInteger39 = new java.math.BigInteger((int) (short) -1, byteArray37);
        java.lang.String str41 = bigInteger39.toString((int) (byte) 10);
        java.math.BigInteger bigInteger42 = bigInteger39.negate();
        java.math.BigInteger bigInteger43 = bigInteger32.min(bigInteger42);
        java.math.BigInteger bigInteger44 = bigInteger42.abs();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal46 = bigDecimal45.negate();
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal50 = bigDecimal46.subtract(bigDecimal49);
        java.math.BigInteger bigInteger51 = bigDecimal50.toBigInteger();
        double double52 = bigInteger51.doubleValue();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        byte byte56 = org.apache.commons.lang3.math.NumberUtils.min(byteArray55);
        java.math.BigInteger bigInteger57 = new java.math.BigInteger((int) (short) -1, byteArray55);
        java.math.BigInteger bigInteger58 = bigInteger51.gcd(bigInteger57);
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal60 = bigDecimal59.negate();
        java.math.BigDecimal bigDecimal63 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal64 = bigDecimal60.subtract(bigDecimal63);
        java.math.BigInteger bigInteger65 = bigDecimal64.toBigInteger();
        java.math.BigInteger bigInteger66 = bigInteger57.or(bigInteger65);
        short short67 = bigInteger57.shortValueExact();
        byte[] byteArray70 = new byte[] { (byte) 1 };
        byte byte71 = org.apache.commons.lang3.math.NumberUtils.min(byteArray70);
        java.math.BigInteger bigInteger72 = new java.math.BigInteger((int) (short) -1, byteArray70);
        java.math.BigInteger bigInteger74 = bigInteger72.pow((int) 'a');
        java.math.BigInteger bigInteger76 = bigInteger72.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger77 = bigInteger57.xor(bigInteger76);
        java.math.BigDecimal bigDecimal78 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal79 = bigDecimal78.negate();
        java.math.BigDecimal bigDecimal80 = java.math.BigDecimal.TEN;
        long long81 = bigDecimal80.longValueExact();
        java.math.BigDecimal bigDecimal82 = bigDecimal80.ulp();
        java.lang.String str83 = bigDecimal80.toString();
        int int84 = bigDecimal78.compareTo(bigDecimal80);
        java.math.BigInteger bigInteger85 = bigDecimal78.toBigInteger();
        java.math.BigInteger bigInteger86 = bigInteger77.gcd(bigInteger85);
        java.math.BigInteger bigInteger87 = bigInteger42.or(bigInteger77);
        java.math.BigInteger bigInteger89 = bigInteger42.shiftLeft(11);
        java.math.BigInteger bigInteger90 = bigInteger20.add(bigInteger89);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1]");
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 1 + "'", byte27 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1]");
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-1" + "'", str41, "-1");
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1]");
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 1 + "'", byte56 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) -1 + "'", short67 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[1]");
        org.junit.Assert.assertTrue("'" + byte71 + "' != '" + (byte) 1 + "'", byte71 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 10L + "'", long81 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "10" + "'", str83, "10");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("fr-FR-u-engcn", (int) (short) -18, "zh-c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-FR-u-engcn" + "'", str3, "fr-FR-u-engcn");
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("South Korea");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SOUTH KOREA" + "'", str1, "SOUTH KOREA");
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Locale locale10 = new java.util.Locale("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)", "RF-rf", "Franz\366sisch");
        java.lang.String str11 = locale0.getDisplayVariant(locale10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean" + "'", str3, "Korean");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean (South Korea)" + "'", str6, "Korean (South Korea)");
        org.junit.Assert.assertEquals(locale10.toString(), "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)_RF-RF_Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("RF-RF");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("D", "#_ENG", 0, 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#_ENG" + "'", str4, "#_ENG");
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        double double5 = bigDecimal4.doubleValue();
        java.math.BigInteger bigInteger6 = bigDecimal4.toBigInteger();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray9);
        java.math.BigInteger bigInteger11 = new java.math.BigInteger((int) (short) -1, byteArray9);
        java.math.BigInteger bigInteger13 = bigInteger11.pow((int) 'a');
        byte[] byteArray14 = bigInteger11.toByteArray();
        long long15 = bigInteger11.longValueExact();
        java.math.BigInteger bigInteger16 = bigInteger6.or(bigInteger11);
        byte byte17 = bigInteger11.byteValueExact();
        java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(bigInteger11, (int) (byte) 0);
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(bigInteger11, (int) '#');
        java.math.BigDecimal bigDecimal22 = bigDecimal0.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal0.setScale(3);
        java.math.BigDecimal bigDecimal26 = bigDecimal24.setScale((int) '#');
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal26);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setLanguageTag("SETATS DETINU");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: SETATS DETINU [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str1, "0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Enhinh", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setRegion("englisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: englisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder9 = builder5.setScript("");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("-1UND0");
        java.util.Locale.Builder builder12 = builder5.setLocale(locale11);
        java.util.Locale.Builder builder13 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder5.setExtension('4', "\u65e5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("UNITED STATES", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNITED STATES                                                                                    " + "'", str2, "UNITED STATES                                                                                    ");
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((double) 101, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn", "zh-cn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0.00E+3", "FR", (int) (short) -5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(101L, 299L, 7L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 299L + "'", long3 == 299L);
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States" + "'", str1, "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States");
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        double double7 = bigDecimal6.doubleValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal6.movePointLeft((int) (byte) -1);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.add(bigDecimal9);
        java.math.BigDecimal bigDecimal12 = bigDecimal0.add(bigDecimal11);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        double double14 = bigDecimal13.doubleValue();
        java.math.BigInteger bigInteger15 = bigDecimal13.toBigInteger();
        java.lang.String str16 = bigDecimal13.toPlainString();
        java.math.BigDecimal bigDecimal17 = bigDecimal0.add(bigDecimal13);
        int int18 = bigDecimal13.precision();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(charSequence0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getVariant();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = locale5.getDisplayName();
        java.lang.String str7 = locale5.getISO3Country();
        java.lang.String str8 = locale1.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GBR" + "'", str7, "GBR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "French (France)" + "'", str8, "French (France)");
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!");
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, 'u');
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AD AE AF AG AI AL AM AN AO AQ AR AS AT AU AW AX AZ BA BB BD BE BF BG BH BI BJ BL BM BN BO BQ BR BS BT BV BW BY BZ CA CC CD CF CG CH CI CK CL CM CN CO CR CU CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK FM FO FR GA GB GD GE GF GG GH GI GL GM GN GP GQ GR GS GT GU GW GY HK HM HN HR HT HU ID IE IL IM IN IO IQ IR IS IT JE JM JO JP KE KG KH KI KM KN KP KR KW KY KZ LA LB LC LI LK LR LS LT LU LV LY MA MC MD ME MF MG MH MK ML MM MN MO MP MQ MR MS MT MU MV MW MX MY MZ NA NC NE NF NG NI NL NO NP NR NU NZ OM PA PE PF PG PH PK PL PM PN PR PS PT PW PY QA RE RO RS RU RW SA SB SC SD SE SG SH SI SJ SK SL SM SN SO SR SS ST SV SX SY SZ TC TD TF TG TH TJ TK TL TM TN TO TR TT TV TW TZ UA UG UM US UY UZ VA VC VE VG VI VN VU WF WS YE YT ZA ZM ZW" + "'", str2, "AD AE AF AG AI AL AM AN AO AQ AR AS AT AU AW AX AZ BA BB BD BE BF BG BH BI BJ BL BM BN BO BQ BR BS BT BV BW BY BZ CA CC CD CF CG CH CI CK CL CM CN CO CR CU CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK FM FO FR GA GB GD GE GF GG GH GI GL GM GN GP GQ GR GS GT GU GW GY HK HM HN HR HT HU ID IE IL IM IN IO IQ IR IS IT JE JM JO JP KE KG KH KI KM KN KP KR KW KY KZ LA LB LC LI LK LR LS LT LU LV LY MA MC MD ME MF MG MH MK ML MM MN MO MP MQ MR MS MT MU MV MW MX MY MZ NA NC NE NF NG NI NL NO NP NR NU NZ OM PA PE PF PG PH PK PL PM PN PR PS PT PW PY QA RE RO RS RU RW SA SB SC SD SE SG SH SI SJ SK SL SM SN SO SR SS ST SV SX SY SZ TC TD TF TG TH TJ TK TL TM TN TO TR TT TV TW TZ UA UG UM US UY UZ VA VC VE VG VI VN VU WF WS YE YT ZA ZM ZW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ADuAEuAFuAGuAIuALuAMuANuAOuAQuARuASuATuAUuAWuAXuAZuBAuBBuBDuBEuBFuBGuBHuBIuBJuBLuBMuBNuBOuBQuBRuBSuBTuBVuBWuBYuBZuCAuCCuCDuCFuCGuCHuCIuCKuCLuCMuCNuCOuCRuCUuCVuCWuCXuCYuCZuDEuDJuDKuDMuDOuDZuECuEEuEGuEHuERuESuETuFIuFJuFKuFMuFOuFRuGAuGBuGDuGEuGFuGGuGHuGIuGLuGMuGNuGPuGQuGRuGSuGTuGUuGWuGYuHKuHMuHNuHRuHTuHUuIDuIEuILuIMuINuIOuIQuIRuISuITuJEuJMuJOuJPuKEuKGuKHuKIuKMuKNuKPuKRuKWuKYuKZuLAuLBuLCuLIuLKuLRuLSuLTuLUuLVuLYuMAuMCuMDuMEuMFuMGuMHuMKuMLuMMuMNuMOuMPuMQuMRuMSuMTuMUuMVuMWuMXuMYuMZuNAuNCuNEuNFuNGuNIuNLuNOuNPuNRuNUuNZuOMuPAuPEuPFuPGuPHuPKuPLuPMuPNuPRuPSuPTuPWuPYuQAuREuROuRSuRUuRWuSAuSBuSCuSDuSEuSGuSHuSIuSJuSKuSLuSMuSNuSOuSRuSSuSTuSVuSXuSYuSZuTCuTDuTFuTGuTHuTJuTKuTLuTMuTNuTOuTRuTTuTVuTWuTZuUAuUGuUMuUSuUYuUZuVAuVCuVEuVGuVIuVNuVUuWFuWSuYEuYTuZAuZMuZW" + "'", str4, "ADuAEuAFuAGuAIuALuAMuANuAOuAQuARuASuATuAUuAWuAXuAZuBAuBBuBDuBEuBFuBGuBHuBIuBJuBLuBMuBNuBOuBQuBRuBSuBTuBVuBWuBYuBZuCAuCCuCDuCFuCGuCHuCIuCKuCLuCMuCNuCOuCRuCUuCVuCWuCXuCYuCZuDEuDJuDKuDMuDOuDZuECuEEuEGuEHuERuESuETuFIuFJuFKuFMuFOuFRuGAuGBuGDuGEuGFuGGuGHuGIuGLuGMuGNuGPuGQuGRuGSuGTuGUuGWuGYuHKuHMuHNuHRuHTuHUuIDuIEuILuIMuINuIOuIQuIRuISuITuJEuJMuJOuJPuKEuKGuKHuKIuKMuKNuKPuKRuKWuKYuKZuLAuLBuLCuLIuLKuLRuLSuLTuLUuLVuLYuMAuMCuMDuMEuMFuMGuMHuMKuMLuMMuMNuMOuMPuMQuMRuMSuMTuMUuMVuMWuMXuMYuMZuNAuNCuNEuNFuNGuNIuNLuNOuNPuNRuNUuNZuOMuPAuPEuPFuPGuPHuPKuPLuPMuPNuPRuPSuPTuPWuPYuQAuREuROuRSuRUuRWuSAuSBuSCuSDuSEuSGuSHuSIuSJuSKuSLuSMuSNuSOuSRuSSuSTuSVuSXuSYuSZuTCuTDuTFuTGuTHuTJuTKuTLuTMuTNuTOuTRuTTuTVuTWuTZuUAuUGuUMuUSuUYuUZuVAuVCuVEuVGuVIuVNuVUuWFuWSuYEuYTuZAuZMuZW");
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("_", (int) (short) 10, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9                                             ");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_         " + "'", str3, "_         ");
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) -2, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        int int4 = bigInteger3.signum();
        short short5 = bigInteger3.shortValueExact();
        java.math.BigInteger bigInteger6 = bigInteger3.abs();
        byte byte7 = bigInteger6.byteValueExact();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.lang.String str50 = bigInteger48.toString((int) 'a');
        java.math.BigInteger bigInteger51 = bigInteger48.nextProbablePrime();
        byte byte52 = bigInteger51.byteValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 2 + "'", byte52 == (byte) 2);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120", "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120" + "'", str2, "120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120");
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                     #                                                                                                                                                      ", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", (int) 'x');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (-1.0f));
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigInteger bigInteger4 = bigDecimal2.toBigInteger();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray7);
        java.math.BigInteger bigInteger9 = new java.math.BigInteger((int) (short) -1, byteArray7);
        java.math.BigInteger bigInteger11 = bigInteger9.pow((int) 'a');
        byte[] byteArray12 = bigInteger9.toByteArray();
        long long13 = bigInteger9.longValueExact();
        java.math.BigInteger bigInteger14 = bigInteger4.or(bigInteger9);
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger21 = bigInteger19.pow((int) 'a');
        byte[] byteArray22 = bigInteger19.toByteArray();
        long long23 = bigInteger19.longValueExact();
        java.lang.String str25 = bigInteger19.toString(0);
        int int26 = bigInteger19.intValueExact();
        java.math.BigInteger bigInteger27 = bigInteger14.subtract(bigInteger19);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal33 = bigDecimal29.subtract(bigDecimal32);
        java.math.BigInteger bigInteger34 = bigDecimal33.toBigInteger();
        java.math.BigInteger bigInteger35 = bigInteger34.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        double double37 = bigDecimal36.doubleValue();
        java.math.BigInteger bigInteger38 = bigDecimal36.toBigInteger();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger45 = bigInteger43.pow((int) 'a');
        byte[] byteArray46 = bigInteger43.toByteArray();
        long long47 = bigInteger43.longValueExact();
        java.math.BigInteger bigInteger48 = bigInteger38.or(bigInteger43);
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        byte[] byteArray56 = bigInteger53.toByteArray();
        long long57 = bigInteger53.longValueExact();
        java.lang.String str59 = bigInteger53.toString(0);
        int int60 = bigInteger53.intValueExact();
        java.math.BigInteger bigInteger61 = bigInteger48.subtract(bigInteger53);
        java.math.BigInteger bigInteger62 = bigInteger34.min(bigInteger48);
        java.math.BigInteger bigInteger63 = bigInteger27.gcd(bigInteger62);
        java.math.BigDecimal bigDecimal64 = new java.math.BigDecimal(bigInteger62);
        java.lang.String str65 = bigDecimal64.toPlainString();
        int int66 = bigDecimal1.compareTo(bigDecimal64);
        byte byte67 = bigDecimal1.byteValue();
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1" + "'", str25, "-1");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-1" + "'", str59, "-1");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "-1" + "'", str65, "-1");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) -1 + "'", byte67 == (byte) -1);
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("RF-rf", "\u82f1\u6587", 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("GBR", "Hindi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\uc77c\ub3c5\uc5b4\uc77c\ub3c5", (int) (short) -1, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        char[] charArray12 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "und ", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\u97e9\u56fd", charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("GBR");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"GBR\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger14 = bigInteger12.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigInteger bigInteger21 = bigDecimal20.toBigInteger();
        double double22 = bigInteger21.doubleValue();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger28 = bigInteger21.gcd(bigInteger27);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        java.math.BigInteger bigInteger36 = bigInteger27.or(bigInteger35);
        short short37 = bigInteger27.shortValueExact();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        byte byte41 = org.apache.commons.lang3.math.NumberUtils.min(byteArray40);
        java.math.BigInteger bigInteger42 = new java.math.BigInteger((int) (short) -1, byteArray40);
        java.math.BigInteger bigInteger44 = bigInteger42.pow((int) 'a');
        java.math.BigInteger bigInteger46 = bigInteger42.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger47 = bigInteger27.xor(bigInteger46);
        java.math.BigInteger bigInteger48 = bigInteger46.not();
        java.math.BigInteger bigInteger49 = bigInteger14.min(bigInteger46);
        int int50 = bigInteger14.bitCount();
        boolean boolean52 = bigInteger14.isProbablePrime(10);
        boolean boolean54 = bigInteger14.isProbablePrime(2);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 1 + "'", byte41 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("        fR", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "engcn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) -5, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("it_IT!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it_IT!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "it_IT!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = new java.math.BigInteger("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuanglais");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"uuu\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        java.lang.Iterable<java.util.Locale.LanguageRange> languageRangeIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(languageRangeIterable0, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte byte13 = bigInteger7.byteValueExact();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(bigInteger7, (int) (byte) 0);
        java.math.BigInteger bigInteger17 = bigInteger7.setBit(7);
        java.math.BigInteger bigInteger19 = bigInteger7.clearBit((int) (byte) 1);
        long long20 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger22 = bigInteger7.flipBit(10);
        int int23 = bigInteger22.intValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1025) + "'", int23 == (-1025));
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Vereinigtes K\366nigreich", "");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("\u65e5\u672c\u8a9e", strArray7, strArray10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "FR", (int) (short) 1);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("#", strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("United States", strArray7, strArray16);
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray7);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.split("-1", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("en_US", strArray7, strArray22);
        int int24 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("zh_CN", strArray22);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str11, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "United States" + "'", str18, "United States");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en_US" + "'", str23, "en_US");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("und ", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und " + "'", str2, "und ");
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Englisch (Vereinigtes K\366nigreich)", "English");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str2, "Englisch (Vereinigtes K\366nigreich)");
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#_ENG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!uuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!uuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "hi!uuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\uc5b4\uad6d\ud55c                                                                                                                                                                                                                                                                                                        ", "zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal7 = bigDecimal4.min(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = bigDecimal7.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal12 = bigDecimal7.setScale(0, 2);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal18 = bigDecimal14.subtract(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal20 = bigDecimal17.min(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = bigDecimal7.add(bigDecimal19);
        int int22 = bigDecimal7.scale();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setVariant("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)                                                        ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                                         ???????? (??????)                                                         [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "JPN                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!", "CA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setExtension('#', "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("\u7f8e\u56fd\u7f8e\u56fd\u7f8e\u56fd", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("fra", "hindi (HI!UUU,Korean (South Korea))", 32);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Fran\347ais", "undxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Fran\347ais" + "'", str2, "Fran\347ais");
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger((int) '#', 0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 100, (long) 5, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("A", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuanglais");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "AJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        java.math.BigInteger bigInteger0 = java.math.BigInteger.ONE;
        java.math.BigInteger bigInteger1 = bigInteger0.not();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger((int) (short) -1, byteArray4);
        java.math.BigInteger bigInteger8 = bigInteger6.pow((int) 'a');
        java.math.BigInteger bigInteger10 = bigInteger6.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger12 = bigInteger10.flipBit(1);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal18 = bigDecimal14.subtract(bigDecimal17);
        java.math.BigInteger bigInteger19 = bigDecimal18.toBigInteger();
        double double20 = bigInteger19.doubleValue();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray23);
        java.math.BigInteger bigInteger25 = new java.math.BigInteger((int) (short) -1, byteArray23);
        java.math.BigInteger bigInteger26 = bigInteger19.gcd(bigInteger25);
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal28 = bigDecimal27.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal32 = bigDecimal28.subtract(bigDecimal31);
        java.math.BigInteger bigInteger33 = bigDecimal32.toBigInteger();
        double double34 = bigInteger33.doubleValue();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        byte byte38 = org.apache.commons.lang3.math.NumberUtils.min(byteArray37);
        java.math.BigInteger bigInteger39 = new java.math.BigInteger((int) (short) -1, byteArray37);
        java.math.BigInteger bigInteger40 = bigInteger33.gcd(bigInteger39);
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal42 = bigDecimal41.negate();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal46 = bigDecimal42.subtract(bigDecimal45);
        java.math.BigInteger bigInteger47 = bigDecimal46.toBigInteger();
        java.math.BigInteger bigInteger48 = bigInteger39.or(bigInteger47);
        short short49 = bigInteger39.shortValueExact();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger56 = bigInteger54.pow((int) 'a');
        java.math.BigInteger bigInteger58 = bigInteger54.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger59 = bigInteger39.xor(bigInteger58);
        java.math.BigInteger bigInteger60 = bigInteger58.not();
        java.math.BigInteger bigInteger61 = bigInteger26.and(bigInteger60);
        java.math.BigInteger bigInteger63 = bigInteger60.shiftRight((int) 'x');
        java.math.BigInteger bigInteger64 = bigInteger10.add(bigInteger60);
        java.math.BigInteger bigInteger65 = bigInteger1.remainder(bigInteger60);
        boolean boolean67 = bigInteger1.isProbablePrime((int) (short) -1);
        org.junit.Assert.assertNotNull(bigInteger0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1]");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 1 + "'", byte24 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1]");
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) -1 + "'", short49 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u6cd5\u6587", 300, "TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587TWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTW" + "'", str3, "\u6cd5\u6587TWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTW");
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        java.math.BigInteger bigInteger52 = bigInteger44.shiftRight((int) (short) -2);
        java.util.Random random54 = null;
        java.math.BigInteger bigInteger55 = new java.math.BigInteger((int) (short) 0, random54);
        java.math.BigInteger bigInteger56 = bigInteger52.max(bigInteger55);
        java.math.BigInteger bigInteger58 = bigInteger52.shiftLeft((int) (byte) 0);
        int int59 = bigInteger52.signum();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        java.util.Locale locale3 = new java.util.Locale("#_HI!", "2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN", "Chinese (China)");
        java.lang.String str4 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "#_hi!_2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-ZH-CN_Chinese (China)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "2ETAT2-DETINU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                             ", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=97.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1025), (double) (short) 117, 8.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1025.0d) + "'", double3 == (-1025.0d));
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        java.lang.String[] strArray1 = java.util.Locale.getISOCountries();
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEach("ko_KR", strArray1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 250 vs 200");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Frenc");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Frenc\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Fran\347ais");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Fran\347ais" + "'", str1, "Fran\347ais");
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -2, (short) 16, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -2 + "'", short3 == (short) -2);
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("\u65e5\u672c\u8a9e", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }
}
