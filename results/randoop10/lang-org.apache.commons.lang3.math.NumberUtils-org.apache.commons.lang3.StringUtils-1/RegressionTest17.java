import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.math.BigInteger bigInteger18 = bigInteger4.divide(bigInteger15);
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(bigInteger4, 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger18);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder6 = builder4.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", locale11);
        java.lang.String str13 = locale11.getCountry();
        java.lang.String str15 = locale11.getExtension('x');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str12, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FR" + "'", str13, "FR");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#######", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger7 = bigInteger6.negate();
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(bigInteger6, (int) 'x');
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.util.Locale.setDefault(locale9);
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleKeys();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale14);
        java.lang.String str16 = locale14.getCountry();
        java.lang.String str17 = locale14.getVariant();
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.lang.String str20 = locale18.getDisplayVariant();
        java.lang.String str21 = locale9.getDisplayName(locale18);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder22.setLanguageTag("eng");
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder27 = builder25.setLocale(locale26);
        java.util.Locale.Builder builder29 = builder27.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder31 = builder29.setVariant("");
        java.util.Locale locale32 = builder31.build();
        java.lang.String str33 = locale18.getDisplayScript(locale32);
        java.lang.String str34 = locale6.getDisplayScript(locale18);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "United States" + "'", str7, "United States");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str15, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FR" + "'", str16, "FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u6cd5\u6587" + "'", str19, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str21, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale2);
        java.lang.String str4 = locale2.getCountry();
        java.lang.String str5 = locale2.getVariant();
        java.lang.String str6 = locale2.getDisplayScript();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("en-GB", locale2);
        java.lang.String str8 = locale2.getScript();
        java.util.Set<java.lang.String> strSet9 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FR" + "'", str4, "FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-gb" + "'", str7, "en-gb");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "             UUU!IH             ", "2-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigInteger bigInteger11 = bigDecimal10.toBigInteger();
        double double12 = bigInteger11.doubleValue();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger18 = bigInteger11.gcd(bigInteger17);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal20 = bigDecimal19.negate();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal24 = bigDecimal20.subtract(bigDecimal23);
        java.math.BigInteger bigInteger25 = bigDecimal24.toBigInteger();
        java.math.BigInteger bigInteger26 = bigInteger17.or(bigInteger25);
        short short27 = bigInteger17.shortValueExact();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        byte byte31 = org.apache.commons.lang3.math.NumberUtils.min(byteArray30);
        java.math.BigInteger bigInteger32 = new java.math.BigInteger((int) (short) -1, byteArray30);
        java.math.BigInteger bigInteger34 = bigInteger32.pow((int) 'a');
        java.math.BigInteger bigInteger36 = bigInteger32.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger37 = bigInteger17.xor(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.TEN;
        long long41 = bigDecimal40.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.ulp();
        java.lang.String str43 = bigDecimal40.toString();
        int int44 = bigDecimal38.compareTo(bigDecimal40);
        java.math.BigInteger bigInteger45 = bigDecimal38.toBigInteger();
        java.math.BigInteger bigInteger46 = bigInteger37.gcd(bigInteger45);
        java.math.BigInteger bigInteger47 = bigInteger4.gcd(bigInteger46);
        double double48 = bigInteger4.doubleValue();
        double double49 = bigInteger4.doubleValue();
        boolean boolean51 = bigInteger4.testBit((int) (short) 0);
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
        short short74 = bigInteger64.shortValueExact();
        int int75 = bigInteger64.getLowestSetBit();
        long long76 = bigInteger64.longValue();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal78 = bigDecimal77.negate();
        java.math.BigDecimal bigDecimal81 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal82 = bigDecimal78.subtract(bigDecimal81);
        java.math.BigInteger bigInteger83 = bigDecimal82.toBigInteger();
        java.math.BigInteger bigInteger84 = bigInteger83.negate();
        java.math.BigInteger bigInteger85 = bigInteger64.gcd(bigInteger83);
        java.math.BigInteger bigInteger87 = bigInteger85.shiftRight((int) 'u');
        java.math.BigInteger bigInteger88 = bigInteger4.mod(bigInteger85);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
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
        org.junit.Assert.assertTrue("'" + short74 + "' != '" + (short) -1 + "'", short74 == (short) -1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger88);
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Enhinh");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(9.0d, 0.0d, (-2.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "th Korea)en-cen-cenuKorean (So");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("FRZJA-JAcJA ", "anglais (Royaume-Uni)", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("RBG", 299, 120);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = new java.math.BigInteger("2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigInteger bigInteger17 = bigInteger13.shiftLeft((int) (short) 1);
        int int18 = bigInteger17.intValueExact();
        int int19 = bigInteger6.compareTo(bigInteger17);
        float float20 = bigInteger17.floatValue();
        java.lang.String str22 = bigInteger17.toString(120);
        java.math.MathContext mathContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger17, mathContext23);
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
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-2.0f) + "'", float20 == (-2.0f));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-2" + "'", str22, "-2");
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)Uni...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = bigInteger4.not();
        java.math.BigInteger bigInteger6 = bigInteger5.not();
        java.math.BigInteger bigInteger8 = bigInteger5.setBit(299);
        java.math.MathContext mathContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(bigInteger8, mathContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.abs();
        java.lang.String str2 = bigDecimal0.toEngineeringString();
        short short3 = bigDecimal0.shortValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
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
        java.math.BigInteger bigInteger67 = bigInteger12.setBit(101);
        boolean boolean69 = bigInteger12.isProbablePrime((int) (short) 100);
        byte[] byteArray72 = new byte[] { (byte) 1 };
        byte byte73 = org.apache.commons.lang3.math.NumberUtils.min(byteArray72);
        java.math.BigInteger bigInteger74 = new java.math.BigInteger((int) (short) -1, byteArray72);
        java.math.BigInteger bigInteger76 = bigInteger74.pow((int) 'a');
        byte[] byteArray77 = bigInteger74.toByteArray();
        long long78 = bigInteger74.longValueExact();
        java.lang.String str80 = bigInteger74.toString(0);
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger86 = new java.math.BigInteger(byteArray83);
        boolean boolean87 = bigInteger74.equals((java.lang.Object) byteArray83);
        java.math.BigInteger bigInteger88 = new java.math.BigInteger(byteArray83);
        java.math.BigInteger bigInteger89 = new java.math.BigInteger(byteArray83);
        java.math.BigInteger bigInteger90 = bigInteger12.and(bigInteger89);
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
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1]");
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 1 + "'", byte73 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[-1]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L) + "'", long78 == (-1L));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "-1" + "'", str80, "-1");
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[1]");
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 1 + "'", byte84 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(bigInteger90);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "zh-TW                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                 NWT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 NWT" + "'", str1, "                                                                                                 NWT");
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "ZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZOHZ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        java.util.Locale locale1 = new java.util.Locale("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        java.lang.String str2 = locale1.getDisplayName();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str2, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr-FR", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                         French (France)                                         ", (int) (byte) -1, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         French (France)                                         " + "'", str3, "                                         French (France)                                         ");
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("fR", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fR" + "'", str2, "fR");
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setVariant("ita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ita [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
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
        int int50 = bigInteger14.bitLength();
        boolean boolean52 = bigInteger14.isProbablePrime(4);
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
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Canada");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CANADA" + "'", str1, "CANADA");
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        long long24 = bigDecimal23.longValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.ulp();
        short short26 = bigDecimal23.shortValueExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal23.ulp();
        int int28 = bigDecimal23.signum();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal33 = bigDecimal23.divide(bigDecimal30, (int) (short) 35, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(bigDecimal30);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1.00E-95", (int) (short) -2, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444zh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\u5fb7\u6587\u5fb7\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -16960, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(101.0d, (double) 35, (double) (short) -2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("English", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("1", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.pow(0);
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.MathContext mathContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = bigDecimal6.pow(99, mathContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("SETATS DETINU", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rman(Germany)", "fr_fr");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
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
        java.lang.String str57 = bigInteger28.toString();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal59 = bigDecimal58.negate();
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal63 = bigDecimal59.subtract(bigDecimal62);
        java.math.BigInteger bigInteger64 = bigDecimal63.toBigInteger();
        double double65 = bigInteger64.doubleValue();
        byte[] byteArray68 = new byte[] { (byte) 1 };
        byte byte69 = org.apache.commons.lang3.math.NumberUtils.min(byteArray68);
        java.math.BigInteger bigInteger70 = new java.math.BigInteger((int) (short) -1, byteArray68);
        java.math.BigInteger bigInteger71 = bigInteger64.gcd(bigInteger70);
        java.math.BigDecimal bigDecimal72 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal73 = bigDecimal72.negate();
        java.math.BigDecimal bigDecimal76 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal77 = bigDecimal73.subtract(bigDecimal76);
        java.math.BigInteger bigInteger78 = bigDecimal77.toBigInteger();
        java.math.BigInteger bigInteger79 = bigInteger70.or(bigInteger78);
        short short80 = bigInteger70.shortValueExact();
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger87 = bigInteger85.pow((int) 'a');
        java.math.BigInteger bigInteger89 = bigInteger85.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger90 = bigInteger70.xor(bigInteger89);
        int int91 = bigInteger70.getLowestSetBit();
        int int92 = bigInteger70.signum();
        java.math.BigInteger bigInteger93 = bigInteger28.divide(bigInteger70);
        short short94 = bigInteger28.shortValueExact();
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0" + "'", str57, "0");
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[1]");
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) 1 + "'", byte69 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertTrue("'" + short80 + "' != '" + (short) -1 + "'", short80 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[1]");
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 1 + "'", byte84 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertTrue("'" + short94 + "' != '" + (short) 0 + "'", short94 == (short) 0);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        char[] charArray8 = new char[] { 'x', '#', '4', ' ', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinese", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(charArray8, (int) (byte) -1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "x#4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "x#4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[x, #, 4,  , a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", locale1);
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.lang.String str10 = locale1.getDisplayScript(locale4);
        java.lang.String str11 = locale1.getDisplayScript();
        java.lang.String str12 = locale1.getDisplayVariant();
        java.lang.String str13 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "jpn" + "'", str8, "jpn");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("ENENENENENENENENENENENENENENENENDNU", (int) (short) -18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NENENENENENENENDNU" + "'", str2, "NENENENENENENENDNU");
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuanglais", "npj");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "RF-rf", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Japanese", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Jpnese" + "'", str2, "Jpnese");
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en-US", 'u');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', (int) 'x', 3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("10.0E-99", strArray4);
        java.lang.String[] strArray11 = null;
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                     ", strArray4, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                     " + "'", str12, "                                                                                                                     ");
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
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
        java.math.BigInteger bigInteger54 = bigInteger27.negate();
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
        org.junit.Assert.assertNotNull(bigInteger54);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("1");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Korean (South Korea)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("united states", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Koreanunited states united states(united statesSouthunited states united statesKoreaunited states)" + "'", str4, "Koreanunited states united states(united statesSouthunited states united statesKoreaunited states)");
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
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
        byte[] byteArray61 = new byte[] { (byte) 1 };
        byte byte62 = org.apache.commons.lang3.math.NumberUtils.min(byteArray61);
        java.math.BigInteger bigInteger63 = new java.math.BigInteger(byteArray61);
        byte byte64 = org.apache.commons.lang3.math.NumberUtils.max(byteArray61);
        byte byte65 = org.apache.commons.lang3.math.NumberUtils.max(byteArray61);
        java.math.BigInteger bigInteger66 = new java.math.BigInteger(byteArray61);
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(bigInteger66, (int) (byte) 1);
        java.math.BigInteger bigInteger69 = bigInteger38.divide(bigInteger66);
        byte[] byteArray72 = new byte[] { (byte) 1 };
        byte byte73 = org.apache.commons.lang3.math.NumberUtils.min(byteArray72);
        java.math.BigInteger bigInteger74 = new java.math.BigInteger((int) (short) -1, byteArray72);
        java.math.BigInteger bigInteger76 = bigInteger74.pow((int) 'a');
        java.math.BigInteger bigInteger78 = bigInteger74.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger80 = bigInteger78.flipBit(1);
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.lang.String str87 = bigInteger85.toString((int) (byte) 10);
        java.math.BigInteger bigInteger88 = bigInteger85.negate();
        java.math.BigInteger bigInteger89 = bigInteger78.min(bigInteger88);
        java.math.BigInteger bigInteger90 = bigInteger88.abs();
        java.math.BigInteger bigInteger91 = bigInteger38.and(bigInteger88);
        long long92 = bigInteger91.longValue();
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
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1]");
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 1 + "'", byte62 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 1 + "'", byte64 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 1 + "'", byte65 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1]");
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 1 + "'", byte73 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[1]");
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 1 + "'", byte84 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "-1" + "'", str87, "-1");
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal1.negate();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal6 = bigDecimal2.subtract(bigDecimal5);
        java.math.BigInteger bigInteger7 = bigDecimal6.toBigInteger();
        double double8 = bigInteger7.doubleValue();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger14 = bigInteger7.gcd(bigInteger13);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigInteger bigInteger21 = bigDecimal20.toBigInteger();
        java.math.BigInteger bigInteger22 = bigInteger13.or(bigInteger21);
        byte[] byteArray23 = bigInteger22.toByteArray();
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray23);
        java.math.BigInteger bigInteger25 = new java.math.BigInteger(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger26 = new java.math.BigInteger((int) ' ', byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid signum value");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("   chinois");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:    chinois is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("fr", "", (int) 'u');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "UitdStts", (java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuufra");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "UitdStts" + "'", charSequence2, "UitdStts");
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale.setDefault(locale0);
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "");
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "DE", (java.lang.CharSequence) "En-US");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft(34);
        java.lang.String str3 = bigDecimal2.toPlainString();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.valueOf((long) (byte) 10);
        java.math.BigDecimal bigDecimal6 = bigDecimal5.abs();
        int int7 = bigDecimal6.precision();
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
        java.math.BigDecimal bigDecimal70 = new java.math.BigDecimal(bigInteger68);
        java.lang.String str71 = bigDecimal70.toPlainString();
        java.math.BigDecimal bigDecimal72 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal73 = bigDecimal72.abs();
        java.lang.String str74 = bigDecimal73.toPlainString();
        java.math.BigDecimal bigDecimal75 = bigDecimal73.stripTrailingZeros();
        java.math.BigDecimal bigDecimal76 = bigDecimal70.subtract(bigDecimal73);
        java.math.BigInteger bigInteger77 = bigDecimal70.toBigInteger();
        java.math.BigDecimal bigDecimal78 = bigDecimal6.add(bigDecimal70);
        java.math.RoundingMode roundingMode80 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal81 = bigDecimal2.divide(bigDecimal70, (int) (byte) -1, roundingMode80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0000000000000000000000000000000001" + "'", str3, "0.0000000000000000000000000000000001");
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "-1" + "'", str71, "-1");
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "1" + "'", str74, "1");
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigDecimal78);
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0000");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ENGLISCH", "jpnjpnjpnjpnjpnjpnjpnjpnjpnjpn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGLISCH" + "'", str2, "ENGLISCH");
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) -33, (short) -16960);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -16960 + "'", short3 == (short) -16960);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
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
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal22 = bigDecimal19.min(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal22.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.min(bigDecimal22);
        java.math.BigDecimal bigDecimal27 = bigDecimal25.setScale((-33));
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal32 = bigDecimal30.negate();
        java.lang.String str33 = bigDecimal32.toEngineeringString();
        java.math.BigDecimal bigDecimal34 = bigDecimal29.multiply(bigDecimal32);
        java.math.BigInteger bigInteger35 = bigDecimal32.unscaledValue();
        java.math.BigDecimal bigDecimal36 = bigDecimal27.subtract(bigDecimal32);
        boolean boolean38 = bigDecimal27.equals((java.lang.Object) "aauabuaeuafuakuamuanuaruasuavuayuazubaubeubgubhubiubmubnuboubrubsucauceuchucoucrucsucuucvucyudaudeudvudzueeueluenueouesuetueuufauffufiufjufoufrufyugaugduglugnuguugvuhauheuhiuhouhruhtuhuuhyuhzuiauiduieuiguiiuikuinuiouisuituiuuiwujaujiujvukaukgukiukjukkuklukmuknukoukruksukuukvukwukyulaulbulguliulnuloultuluulvumgumhumiumkumlumnumoumrumsumtumyunaunbunduneungunlunnunounrunvunyuocuojuomuoruosupaupiuplupsuptuquurmurnurouruurwusauscusduseusgusiuskuslusmusnusousqusrussustusuusvuswutauteutguthutiutkutlutnutoutrutsuttutwutyuuguukuuruuzuveuviuvouwauwouxhuyiuyouzauzhuzu");
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
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", "Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str2, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("USA", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "2-", "united states");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "\u65e5\u672c\u8a9e", "z-C");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        int int2 = bigDecimal0.intValue();
        int int3 = bigDecimal0.scale();
        java.lang.String str4 = bigDecimal0.toEngineeringString();
        int int5 = bigDecimal0.intValue();
        int int6 = bigDecimal0.scale();
        java.math.BigInteger bigInteger7 = bigDecimal0.toBigIntegerExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(bigInteger7);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("United Kingdom");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.movePointRight((int) (short) 34);
        byte byte5 = bigDecimal1.byteValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  ", "KR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("uzuhzuazuoyuiyuhxuowuawuovuivuevuzuuruukuuguuytuwtuttusturtuotuntultuktuituhtugtuetuatuwsuvsuusutsussursuqsuosunsumsulsuksuisugsuesudsucsuasuwruuruorunrumruuqutpuspulpuipuapusouroumoujoucouynuvnurnuonunnulnugnuenudnubnuanuymutmusmurmuomunmulmukmuimuhmugmuvluulutluolunluiluglublualuykuwkuvkuukuskurkuokunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuoiuniukiuiiugiueiudiuaiuzhuyhuuhuthurhuohuihuehuahuvguugungulgudguaguyfurfuofujfuifuffuafuueuteuseuoeuneuleueeuzduvdueduaduycuvcuucuscurcuocuhcuecuacusburbuobunbumbuibuhbugbuebuabuzauyauvausauraunaumaukaufaueaubauaa", 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("South Korea");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "south korea" + "'", str1, "south korea");
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u4e2d\u6587\u4e2d\u570b)", "ko", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        short[] shortArray2 = new short[] { (byte) 0, (short) -1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger7 = bigInteger6.negate();
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
        java.math.BigInteger bigInteger34 = bigInteger6.min(bigInteger20);
        boolean boolean36 = bigInteger34.testBit(6);
        byte[] byteArray37 = bigInteger34.toByteArray();
        java.math.BigInteger bigInteger39 = bigInteger34.shiftRight(34);
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger(byteArray41);
        byte byte44 = org.apache.commons.lang3.math.NumberUtils.max(byteArray41);
        byte byte45 = org.apache.commons.lang3.math.NumberUtils.max(byteArray41);
        java.math.BigInteger bigInteger46 = new java.math.BigInteger(byteArray41);
        java.math.BigInteger bigInteger48 = bigInteger46.pow(3);
        java.math.BigInteger bigInteger49 = bigInteger34.add(bigInteger48);
        float float50 = bigInteger48.floatValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
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
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1]");
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 1 + "'", byte45 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 1.0f + "'", float50 == 1.0f);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   0.00E+3", ' ', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxx0.00E+3" + "'", str3, "xxx0.00E+3");
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                     fr-FRDeutschland", "south Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-FRDeutschland" + "'", str2, "fr-FRDeutschland");
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Cor\351e du Sud", "UNITED STATES", (int) (short) 117);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cor\351e du Sud" + "'", str3, "Cor\351e du Sud");
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str2 = locale0.getDisplayCountry();
        boolean boolean3 = locale0.hasExtensions();
        java.lang.String str4 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United Kingdom" + "'", str2, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "   chinois");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   chinois" + "'", str1, "   chinois");
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.math.BigInteger bigInteger10 = bigInteger4.pow(35);
        double double11 = bigInteger10.doubleValue();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Englisch44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaUS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaUS" + "'", str1, "aaaUS");
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        char[] charArray10 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "South Korea", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Enhinh", charArray10);
        java.math.MathContext mathContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(charArray10, 0, 35, mathContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("z-C", (-10), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
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
        java.lang.String str20 = bigDecimal18.toEngineeringString();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte23 = bigDecimal22.byteValueExact();
        java.math.BigDecimal bigDecimal25 = bigDecimal22.pow(2);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.TEN;
        long long29 = bigDecimal28.longValueExact();
        java.math.BigDecimal bigDecimal30 = bigDecimal28.ulp();
        java.lang.String str31 = bigDecimal28.toString();
        int int32 = bigDecimal26.compareTo(bigDecimal28);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal28.divide(bigDecimal34, (int) (short) 1);
        java.math.BigDecimal bigDecimal37 = bigDecimal25.add(bigDecimal28);
        java.math.BigDecimal bigDecimal38 = bigDecimal18.multiply(bigDecimal37);
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.negate();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal42 = bigDecimal40.min(bigDecimal41);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal48 = bigDecimal44.subtract(bigDecimal47);
        java.math.BigDecimal[] bigDecimalArray49 = bigDecimal41.divideAndRemainder(bigDecimal47);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal51 = bigDecimal50.negate();
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal55 = bigDecimal51.subtract(bigDecimal54);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal57 = bigDecimal54.min(bigDecimal56);
        java.math.BigDecimal bigDecimal58 = bigDecimal47.divideToIntegralValue(bigDecimal57);
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal60 = bigDecimal59.negate();
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.TEN;
        long long62 = bigDecimal61.longValueExact();
        java.math.BigDecimal bigDecimal63 = bigDecimal61.ulp();
        java.lang.String str64 = bigDecimal61.toString();
        int int65 = bigDecimal59.compareTo(bigDecimal61);
        java.math.BigInteger bigInteger66 = bigDecimal59.toBigInteger();
        java.math.BigDecimal bigDecimal67 = bigDecimal59.ulp();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal69 = bigDecimal68.negate();
        java.math.BigDecimal bigDecimal70 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal71 = bigDecimal69.min(bigDecimal70);
        int int72 = bigDecimal59.compareTo(bigDecimal71);
        int int73 = bigDecimal58.compareTo(bigDecimal71);
        java.math.BigDecimal bigDecimal75 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte76 = bigDecimal75.byteValueExact();
        java.math.BigDecimal bigDecimal78 = bigDecimal75.pow(2);
        java.math.BigDecimal bigDecimal79 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal80 = bigDecimal79.negate();
        java.math.BigDecimal bigDecimal81 = java.math.BigDecimal.TEN;
        long long82 = bigDecimal81.longValueExact();
        java.math.BigDecimal bigDecimal83 = bigDecimal81.ulp();
        java.lang.String str84 = bigDecimal81.toString();
        int int85 = bigDecimal79.compareTo(bigDecimal81);
        java.math.BigDecimal bigDecimal87 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal89 = bigDecimal81.divide(bigDecimal87, (int) (short) 1);
        java.math.BigDecimal bigDecimal90 = bigDecimal78.add(bigDecimal81);
        java.math.BigDecimal bigDecimal91 = bigDecimal71.divideToIntegralValue(bigDecimal81);
        int int92 = bigDecimal37.compareTo(bigDecimal81);
        java.math.RoundingMode roundingMode94 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal95 = bigDecimal81.setScale(11, roundingMode94);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10.0E-99" + "'", str20, "10.0E-99");
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10" + "'", str31, "10");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimalArray49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "10" + "'", str64, "10");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 0 + "'", byte76 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 10L + "'", long82 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "10" + "'", str84, "10");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal87);
        org.junit.Assert.assertNotNull(bigDecimal89);
        org.junit.Assert.assertNotNull(bigDecimal90);
        org.junit.Assert.assertNotNull(bigDecimal91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("enhinh", 35, "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enhinhxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "enhinhxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bigInteger20.compareTo(bigInteger22);
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
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
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
        long long66 = bigInteger63.longValue();
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
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-2L) + "'", long66 == (-2L));
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4503599627370497");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ja", "", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Allemagne");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Allemagne" + "'", str1, "Allemagne");
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.math.BigDecimal bigDecimal3 = bigDecimal0.abs();
        float float4 = bigDecimal3.floatValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal3.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal5.stripTrailingZeros();
        long long7 = bigDecimal6.longValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))" + "'", str1, "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))");
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("-2-2-zh-C", "dnu0E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+1", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
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
        double double16 = bigDecimal15.doubleValue();
        java.math.BigInteger bigInteger17 = bigDecimal15.toBigInteger();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray20);
        java.math.BigInteger bigInteger22 = new java.math.BigInteger((int) (short) -1, byteArray20);
        java.math.BigInteger bigInteger24 = bigInteger22.pow((int) 'a');
        byte[] byteArray25 = bigInteger22.toByteArray();
        long long26 = bigInteger22.longValueExact();
        java.math.BigInteger bigInteger27 = bigInteger17.or(bigInteger22);
        byte[] byteArray30 = new byte[] { (byte) 1 };
        byte byte31 = org.apache.commons.lang3.math.NumberUtils.min(byteArray30);
        java.math.BigInteger bigInteger32 = new java.math.BigInteger((int) (short) -1, byteArray30);
        java.math.BigInteger bigInteger34 = bigInteger32.pow((int) 'a');
        byte[] byteArray35 = bigInteger32.toByteArray();
        long long36 = bigInteger32.longValueExact();
        java.lang.String str38 = bigInteger32.toString(0);
        int int39 = bigInteger32.intValueExact();
        java.math.BigInteger bigInteger40 = bigInteger27.subtract(bigInteger32);
        java.math.BigInteger bigInteger41 = bigInteger12.subtract(bigInteger40);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        double double43 = bigDecimal42.doubleValue();
        java.math.BigInteger bigInteger44 = bigDecimal42.toBigInteger();
        java.math.BigInteger bigInteger46 = bigInteger44.setBit(4);
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
        java.math.BigInteger bigInteger60 = bigInteger44.multiply(bigInteger59);
        java.math.BigInteger bigInteger61 = bigInteger12.andNot(bigInteger59);
        java.math.BigInteger bigInteger63 = bigInteger61.shiftLeft(117);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1" + "'", str38, "-1");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger44);
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
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger63);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("de");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Allemagne", "UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal8 = bigDecimal7.abs();
        java.math.BigDecimal bigDecimal10 = bigDecimal7.pow((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = bigDecimal4.divide(bigDecimal7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division undefined");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("it");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("GBR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gbr" + "'", str1, "gbr");
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\u82f1\u6587");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("CN  ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                         " + "'", str1, "                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "RBG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale2);
        java.lang.String str4 = locale2.getCountry();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", locale2);
        java.util.Locale locale8 = new java.util.Locale("10", "");
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = locale9.getVariant();
        java.lang.String str11 = locale9.getDisplayScript();
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale9.getDisplayName(locale13);
        java.lang.String str15 = locale8.getDisplayVariant(locale13);
        java.lang.String str16 = locale8.getDisplayCountry();
        java.lang.String str17 = locale2.getDisplayLanguage(locale8);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FR" + "'", str4, "FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9" + "'", str5, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertEquals(locale8.toString(), "10");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str14, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\u82f1\u6587", "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd", 563);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("China", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        char[] charArray12 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ", charArray12);
        java.math.MathContext mathContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(charArray12, (int) (short) -1, 94, mathContext21);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                               D");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Jpnese", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Jpnese" + "'", str2, "Jpnese");
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigInteger bigInteger8 = new java.math.BigInteger(byteArray7);
        int int9 = bigInteger8.getLowestSetBit();
        int int10 = bigInteger8.signum();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("xxxxxxxxxxxxxxxxxxxxxxxxxxxen-ca", "z-C");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setScript("de_DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: de_DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
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
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigInteger bigInteger37 = bigDecimal36.toBigInteger();
        double double38 = bigInteger37.doubleValue();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger44 = bigInteger37.gcd(bigInteger43);
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal46 = bigDecimal45.negate();
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal50 = bigDecimal46.subtract(bigDecimal49);
        java.math.BigInteger bigInteger51 = bigDecimal50.toBigInteger();
        java.math.BigInteger bigInteger52 = bigInteger43.or(bigInteger51);
        byte[] byteArray53 = bigInteger52.toByteArray();
        java.math.BigInteger bigInteger54 = bigInteger28.add(bigInteger52);
        byte[] byteArray57 = new byte[] { (byte) 1 };
        byte byte58 = org.apache.commons.lang3.math.NumberUtils.min(byteArray57);
        java.math.BigInteger bigInteger59 = new java.math.BigInteger((int) (short) -1, byteArray57);
        java.math.BigInteger bigInteger61 = bigInteger59.pow((int) 'a');
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal63 = bigDecimal62.negate();
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal67 = bigDecimal63.subtract(bigDecimal66);
        java.math.BigInteger bigInteger68 = bigDecimal67.toBigInteger();
        double double69 = bigInteger68.doubleValue();
        byte[] byteArray72 = new byte[] { (byte) 1 };
        byte byte73 = org.apache.commons.lang3.math.NumberUtils.min(byteArray72);
        java.math.BigInteger bigInteger74 = new java.math.BigInteger((int) (short) -1, byteArray72);
        java.math.BigInteger bigInteger75 = bigInteger68.gcd(bigInteger74);
        java.math.BigDecimal bigDecimal76 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal77 = bigDecimal76.negate();
        java.math.BigDecimal bigDecimal80 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal81 = bigDecimal77.subtract(bigDecimal80);
        java.math.BigInteger bigInteger82 = bigDecimal81.toBigInteger();
        java.math.BigInteger bigInteger83 = bigInteger74.or(bigInteger82);
        java.math.BigInteger bigInteger84 = bigInteger61.min(bigInteger83);
        java.math.BigDecimal bigDecimal85 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal86 = bigDecimal85.negate();
        java.math.BigDecimal bigDecimal89 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal90 = bigDecimal86.subtract(bigDecimal89);
        java.math.BigInteger bigInteger91 = bigDecimal90.toBigInteger();
        java.math.BigInteger bigInteger92 = bigInteger91.negate();
        java.math.BigInteger bigInteger93 = bigInteger84.multiply(bigInteger91);
        java.math.BigInteger bigInteger94 = bigInteger54.and(bigInteger84);
        java.math.BigInteger bigInteger95 = bigInteger94.not();
        boolean boolean97 = bigInteger95.testBit((int) '4');
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
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1]");
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1]");
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 1 + "'", byte58 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1]");
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 1 + "'", byte73 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigDecimal85);
        org.junit.Assert.assertNotNull(bigDecimal86);
        org.junit.Assert.assertNotNull(bigDecimal89);
        org.junit.Assert.assertNotNull(bigDecimal90);
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertNotNull(bigInteger92);
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertNotNull(bigInteger94);
        org.junit.Assert.assertNotNull(bigInteger95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
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
        double double16 = bigDecimal15.doubleValue();
        java.math.BigInteger bigInteger17 = bigDecimal15.toBigInteger();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray20);
        java.math.BigInteger bigInteger22 = new java.math.BigInteger((int) (short) -1, byteArray20);
        java.math.BigInteger bigInteger24 = bigInteger22.pow((int) 'a');
        byte[] byteArray25 = bigInteger22.toByteArray();
        long long26 = bigInteger22.longValueExact();
        java.math.BigInteger bigInteger27 = bigInteger17.or(bigInteger22);
        byte[] byteArray30 = new byte[] { (byte) 1 };
        byte byte31 = org.apache.commons.lang3.math.NumberUtils.min(byteArray30);
        java.math.BigInteger bigInteger32 = new java.math.BigInteger((int) (short) -1, byteArray30);
        java.math.BigInteger bigInteger34 = bigInteger32.pow((int) 'a');
        byte[] byteArray35 = bigInteger32.toByteArray();
        long long36 = bigInteger32.longValueExact();
        java.lang.String str38 = bigInteger32.toString(0);
        int int39 = bigInteger32.intValueExact();
        java.math.BigInteger bigInteger40 = bigInteger27.subtract(bigInteger32);
        java.math.BigInteger bigInteger41 = bigInteger12.subtract(bigInteger40);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigInteger bigInteger56 = bigInteger54.negate();
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal58 = bigDecimal57.negate();
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal62 = bigDecimal58.subtract(bigDecimal61);
        java.math.BigInteger bigInteger63 = bigDecimal62.toBigInteger();
        double double64 = bigInteger63.doubleValue();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        byte byte68 = org.apache.commons.lang3.math.NumberUtils.min(byteArray67);
        java.math.BigInteger bigInteger69 = new java.math.BigInteger((int) (short) -1, byteArray67);
        java.math.BigInteger bigInteger70 = bigInteger63.gcd(bigInteger69);
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal72 = bigDecimal71.negate();
        java.math.BigDecimal bigDecimal75 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal76 = bigDecimal72.subtract(bigDecimal75);
        java.math.BigInteger bigInteger77 = bigDecimal76.toBigInteger();
        java.math.BigInteger bigInteger78 = bigInteger69.or(bigInteger77);
        short short79 = bigInteger69.shortValueExact();
        byte byte80 = bigInteger69.byteValueExact();
        java.math.BigInteger bigInteger81 = bigInteger54.and(bigInteger69);
        java.math.BigInteger bigInteger82 = bigInteger54.negate();
        java.math.BigInteger bigInteger83 = bigInteger41.multiply(bigInteger82);
        byte byte84 = bigInteger83.byteValueExact();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1" + "'", str38, "-1");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[1]");
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) 1 + "'", byte68 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) -1 + "'", short79 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) -1 + "'", byte80 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) -1 + "'", byte84 == (byte) -1);
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger(320, 9, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("0", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", (long) (short) -4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\u65e5\u672c\u8a9e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str1, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
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
        byte[] byteArray20 = bigInteger17.toByteArray();
        long long21 = bigInteger17.longValueExact();
        java.lang.String str23 = bigInteger17.toString(0);
        int int24 = bigInteger17.intValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.subtract(bigInteger17);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        java.math.BigInteger bigInteger33 = bigInteger32.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        double double35 = bigDecimal34.doubleValue();
        java.math.BigInteger bigInteger36 = bigDecimal34.toBigInteger();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        byte byte40 = org.apache.commons.lang3.math.NumberUtils.min(byteArray39);
        java.math.BigInteger bigInteger41 = new java.math.BigInteger((int) (short) -1, byteArray39);
        java.math.BigInteger bigInteger43 = bigInteger41.pow((int) 'a');
        byte[] byteArray44 = bigInteger41.toByteArray();
        long long45 = bigInteger41.longValueExact();
        java.math.BigInteger bigInteger46 = bigInteger36.or(bigInteger41);
        byte[] byteArray49 = new byte[] { (byte) 1 };
        byte byte50 = org.apache.commons.lang3.math.NumberUtils.min(byteArray49);
        java.math.BigInteger bigInteger51 = new java.math.BigInteger((int) (short) -1, byteArray49);
        java.math.BigInteger bigInteger53 = bigInteger51.pow((int) 'a');
        byte[] byteArray54 = bigInteger51.toByteArray();
        long long55 = bigInteger51.longValueExact();
        java.lang.String str57 = bigInteger51.toString(0);
        int int58 = bigInteger51.intValueExact();
        java.math.BigInteger bigInteger59 = bigInteger46.subtract(bigInteger51);
        java.math.BigInteger bigInteger60 = bigInteger32.min(bigInteger46);
        java.math.BigInteger bigInteger61 = bigInteger25.gcd(bigInteger60);
        byte[] byteArray64 = new byte[] { (byte) 1 };
        byte byte65 = org.apache.commons.lang3.math.NumberUtils.min(byteArray64);
        java.math.BigInteger bigInteger66 = new java.math.BigInteger((int) (short) -1, byteArray64);
        java.math.BigInteger bigInteger68 = bigInteger66.pow((int) 'a');
        java.math.BigDecimal bigDecimal69 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal70 = bigDecimal69.negate();
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal74 = bigDecimal70.subtract(bigDecimal73);
        java.math.BigInteger bigInteger75 = bigDecimal74.toBigInteger();
        double double76 = bigInteger75.doubleValue();
        byte[] byteArray79 = new byte[] { (byte) 1 };
        byte byte80 = org.apache.commons.lang3.math.NumberUtils.min(byteArray79);
        java.math.BigInteger bigInteger81 = new java.math.BigInteger((int) (short) -1, byteArray79);
        java.math.BigInteger bigInteger82 = bigInteger75.gcd(bigInteger81);
        java.math.BigDecimal bigDecimal83 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal84 = bigDecimal83.negate();
        java.math.BigDecimal bigDecimal87 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal88 = bigDecimal84.subtract(bigDecimal87);
        java.math.BigInteger bigInteger89 = bigDecimal88.toBigInteger();
        java.math.BigInteger bigInteger90 = bigInteger81.or(bigInteger89);
        java.math.BigInteger bigInteger91 = bigInteger68.min(bigInteger90);
        java.math.BigInteger bigInteger92 = bigInteger60.add(bigInteger91);
        java.math.BigDecimal bigDecimal94 = new java.math.BigDecimal(bigInteger92, 0);
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
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1]");
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 1 + "'", byte40 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1]");
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 1 + "'", byte50 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "-1" + "'", str57, "-1");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1]");
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 1 + "'", byte65 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[1]");
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 1 + "'", byte80 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigDecimal83);
        org.junit.Assert.assertNotNull(bigDecimal84);
        org.junit.Assert.assertNotNull(bigDecimal87);
        org.junit.Assert.assertNotNull(bigDecimal88);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertNotNull(bigInteger92);
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("kr", "zho");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 301, (long) (byte) -2, (long) (short) 34);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3 == (-2L));
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 116, (double) (byte) 1, (double) 301L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-0.0d), (double) (-33.0f), (double) 94);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 94.0d + "'", double3 == 94.0d);
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf((long) (byte) 0);
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        long[] longArray6 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 120.0f, (double) 300L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale0.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jpn" + "'", str4, "jpn");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(6.0d);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.movePointRight(1);
        java.math.MathContext mathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = bigDecimal1.plus(mathContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0.0000000000000000000000000000000001", 33, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "001" + "'", str3, "001");
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\uc77c\ub3c5\uc5b4\uc77c\ub3c5", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "e", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Cennese", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u65e5\u6587", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(charArray6, (int) (short) 34, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
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
        byte[] byteArray22 = bigInteger21.toByteArray();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger(byteArray24);
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger26);
        short short28 = bigInteger26.shortValueExact();
        int int29 = bigInteger26.bitLength();
        java.math.BigInteger[] bigIntegerArray30 = bigInteger21.divideAndRemainder(bigInteger26);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigInteger bigInteger37 = bigDecimal36.toBigInteger();
        double double38 = bigInteger37.doubleValue();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger44 = bigInteger37.gcd(bigInteger43);
        java.math.BigInteger bigInteger45 = bigInteger26.andNot(bigInteger43);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        double double47 = bigDecimal46.doubleValue();
        java.math.BigInteger bigInteger48 = bigDecimal46.toBigInteger();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        byte[] byteArray56 = bigInteger53.toByteArray();
        long long57 = bigInteger53.longValueExact();
        java.math.BigInteger bigInteger58 = bigInteger48.or(bigInteger53);
        byte[] byteArray61 = new byte[] { (byte) 1 };
        byte byte62 = org.apache.commons.lang3.math.NumberUtils.min(byteArray61);
        java.math.BigInteger bigInteger63 = new java.math.BigInteger((int) (short) -1, byteArray61);
        java.math.BigInteger bigInteger65 = bigInteger63.pow((int) 'a');
        byte[] byteArray66 = bigInteger63.toByteArray();
        long long67 = bigInteger63.longValueExact();
        java.lang.String str69 = bigInteger63.toString(0);
        int int70 = bigInteger63.intValueExact();
        java.math.BigInteger bigInteger71 = bigInteger58.subtract(bigInteger63);
        java.math.BigInteger bigInteger72 = bigInteger26.add(bigInteger58);
        double double73 = bigInteger58.doubleValue();
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 1 + "'", short28 == (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1]");
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 1 + "'", byte62 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "-1" + "'", str69, "-1");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -18, (short) (byte) -33, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -33 + "'", short3 == (short) -33);
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "   JA", (java.lang.CharSequence) "rman(Germany)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder9 = builder5.setLanguage("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (?????) [at index 0]");
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
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        char[] charArray9 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!hi!hi!hi!hi!hiHI4!4HI4!4HI4!4HI4", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("chinese", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        java.lang.CharSequence charSequence0 = null;
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
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray16);
        java.math.MathContext mathContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(charArray16, mathContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr_FR", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr_FR" + "'", str3, "fr_FR");
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        int int5 = bigDecimal1.scale();
        byte byte6 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal11.toEngineeringString();
        java.math.BigDecimal bigDecimal13 = bigDecimal8.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.movePointRight(100);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, (int) (byte) 0);
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale25.getISO3Language();
        boolean boolean27 = bigDecimal24.equals((java.lang.Object) str26);
        java.math.BigDecimal bigDecimal30 = bigDecimal11.divide(bigDecimal24, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal1.max(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.lang.String str38 = bigDecimal33.toPlainString();
        java.lang.String str39 = bigDecimal33.toPlainString();
        long[] longArray46 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        long long47 = org.apache.commons.lang3.math.NumberUtils.min(longArray46);
        boolean boolean48 = bigDecimal33.equals((java.lang.Object) long47);
        java.math.BigDecimal bigDecimal49 = bigDecimal30.add(bigDecimal33);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.valueOf((double) (-1));
        java.math.MathContext mathContext52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal53 = bigDecimal33.remainder(bigDecimal51, mathContext52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zho" + "'", str26, "zho");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0" + "'", str39, "0");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal51);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigInteger bigInteger4 = bigDecimal0.toBigIntegerExact();
        java.lang.String str5 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal8 = bigDecimal7.abs();
        int int9 = bigDecimal7.intValueExact();
        java.math.BigInteger bigInteger10 = bigDecimal7.toBigInteger();
        java.math.BigDecimal bigDecimal11 = bigDecimal7.plus();
        long long12 = bigDecimal11.longValue();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal16 = bigDecimal15.plus();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.negate();
        java.math.BigDecimal bigDecimal18 = bigDecimal11.remainder(bigDecimal16);
        int int19 = bigDecimal0.compareTo(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("E");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: E is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("eng                                                                                                                                                                                                                                                                                                          ", "                                                    ", (int) (short) -33);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "engaaaaa                                      " + "'", str5, "engaaaaa                                      ");
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("engcn", (double) 20.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=20.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        java.util.Locale locale1 = new java.util.Locale("hi");
        java.lang.String str2 = locale1.getScript();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "hi");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "hi");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "hi");
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) (-2L));
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
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
        byte[] byteArray22 = bigInteger21.toByteArray();
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger(byteArray22);
        java.math.BigInteger bigInteger25 = new java.math.BigInteger(byteArray22);
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
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
        int int33 = bigInteger31.intValueExact();
        boolean boolean35 = bigInteger31.testBit(6);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("301.0", "\u4e2d\u56fd\u8a9eaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "301.0" + "'", str2, "301.0");
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal6.toEngineeringString();
        java.math.BigDecimal bigDecimal8 = bigDecimal3.multiply(bigDecimal6);
        java.math.BigDecimal bigDecimal10 = bigDecimal3.movePointLeft(0);
        java.math.BigDecimal bigDecimal11 = bigDecimal1.subtract(bigDecimal3);
        java.math.MathContext mathContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = bigDecimal1.pow((int) 'u', mathContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        java.util.Locale locale2 = new java.util.Locale("\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd", "\u82f1\u6587");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u82f1\u6587");
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("kr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
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
        java.math.BigInteger bigInteger16 = bigInteger4.and(bigInteger15);
        java.math.BigInteger bigInteger17 = bigInteger4.not();
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
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.math.BigInteger bigInteger38 = bigDecimal37.toBigInteger();
        java.math.BigInteger bigInteger39 = bigInteger30.or(bigInteger38);
        short short40 = bigInteger30.shortValueExact();
        int int41 = bigInteger30.getLowestSetBit();
        long long42 = bigInteger30.longValue();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal48 = bigDecimal44.subtract(bigDecimal47);
        java.math.BigInteger bigInteger49 = bigDecimal48.toBigInteger();
        java.math.BigInteger bigInteger50 = bigInteger49.negate();
        java.math.BigInteger bigInteger51 = bigInteger30.gcd(bigInteger49);
        java.math.BigInteger bigInteger53 = java.math.BigInteger.valueOf((long) 7);
        java.math.BigInteger[] bigIntegerArray54 = bigInteger49.divideAndRemainder(bigInteger53);
        java.math.BigInteger bigInteger55 = bigInteger17.and(bigInteger49);
        java.math.BigInteger bigInteger57 = bigInteger55.shiftRight((-33));
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
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger17);
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
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) -1 + "'", short40 == (short) -1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigIntegerArray54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("fr_FR_#u-engcn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_FR_#u-engcn" + "'", str1, "fr_FR_#u-engcn");
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("anglais (Royaume-Uni)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "de_DExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglaisde_DExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx(Royaume-Uni)" + "'", str3, "anglaisde_DExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx(Royaume-Uni)");
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("2-", "\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0.32", "France");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("fr-FR-u-engcn", "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-FR-u-engcn" + "'", str2, "fr-FR-u-engcn");
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("VEREINIGTES K\326NIGREICH", "Allemagne", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0L);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.String str4 = languageRange2.getRange();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("eng");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder10 = builder8.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder8.setRegion("US");
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("", locale14);
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        java.util.Locale.Builder builder17 = builder8.setLocale(locale14);
        java.util.Locale.Builder builder19 = builder8.setVariant("");
        boolean boolean20 = languageRange2.equals((java.lang.Object) builder8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chn" + "'", str3, "chn");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chn" + "'", str4, "chn");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("eng");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale locale11 = builder9.build();
        java.lang.String str12 = locale11.getDisplayCountry();
        java.util.Locale.Builder builder13 = builder6.setLocale(locale11);
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        java.util.Locale.setDefault(category14, locale17);
        java.util.Locale locale20 = new java.util.Locale("");
        java.lang.String str21 = locale20.getVariant();
        java.util.Locale.setDefault(category14, locale20);
        java.util.Locale locale25 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.util.Locale.setDefault(locale25);
        java.lang.String str27 = locale20.getDisplayLanguage(locale25);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clearExtensions();
        java.util.Locale locale31 = builder30.build();
        java.util.Locale.setDefault(category28, locale31);
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale33.getDisplayVariant(locale35);
        java.lang.String str37 = locale35.getDisplayCountry();
        java.util.Locale.setDefault(category28, locale35);
        java.util.Set<java.lang.String> strSet39 = locale35.getUnicodeLocaleKeys();
        java.lang.String str40 = locale20.getDisplayScript(locale35);
        java.util.Locale.Builder builder41 = builder13.setLocale(locale35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder43 = builder41.setRegion("0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000120");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000120 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + category28 + "' != '" + java.util.Locale.Category.FORMAT + "'", category28.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "South Korea" + "'", str37, "South Korea");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal5 = bigDecimal2.stripTrailingZeros();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal((int) (short) 100);
        java.math.BigDecimal bigDecimal8 = bigDecimal5.max(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = null;
        java.math.MathContext mathContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray11 = bigDecimal7.divideAndRemainder(bigDecimal9, mathContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u4e2d\u6587\u4e2d\u56fd)", "zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn", 101);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal((long) (short) 35, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("Deutsch");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Deutsch\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 101, 5);
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
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
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.math.BigInteger bigInteger38 = bigDecimal37.toBigInteger();
        java.math.BigInteger bigInteger39 = bigInteger30.or(bigInteger38);
        java.math.BigInteger bigInteger41 = bigInteger38.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger54.or(bigInteger62);
        java.math.BigInteger bigInteger65 = bigInteger62.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger66 = bigInteger41.max(bigInteger62);
        java.util.Random random68 = null;
        java.math.BigInteger bigInteger69 = new java.math.BigInteger((int) (short) 0, random68);
        java.math.BigInteger bigInteger70 = bigInteger62.gcd(bigInteger69);
        java.math.BigInteger bigInteger71 = bigInteger4.max(bigInteger62);
        double double72 = bigInteger71.doubleValue();
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
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Koreanunited states united states(united statesSouthunited states united statesKoreaunited states)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Englisch44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Englisch44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "Englisch44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("italien");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"italien\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587" + "'", str2, "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587");
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("   JA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(bigInteger6);
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger(byteArray10);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(bigInteger12);
        short short14 = bigInteger12.shortValueExact();
        java.math.BigInteger bigInteger15 = bigInteger6.modInverse(bigInteger12);
        int int16 = bigInteger15.intValueExact();
        java.math.MathContext mathContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(bigInteger15, mathContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(4L, (long) (-2), (long) 94);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3 == (-2L));
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte2 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow(2);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.TEN;
        long long8 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.ulp();
        java.lang.String str10 = bigDecimal7.toString();
        int int11 = bigDecimal5.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal15 = bigDecimal7.divide(bigDecimal13, (int) (short) 1);
        java.math.BigDecimal bigDecimal16 = bigDecimal4.add(bigDecimal7);
        java.math.BigDecimal bigDecimal17 = bigDecimal7.negate();
        float float18 = bigDecimal17.floatValue();
        int int19 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.TEN;
        long long21 = bigDecimal20.longValueExact();
        java.math.BigDecimal bigDecimal22 = bigDecimal20.ulp();
        java.lang.String str23 = bigDecimal20.toString();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.TEN;
        long long25 = bigDecimal24.longValueExact();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        double double27 = bigDecimal26.doubleValue();
        java.math.BigDecimal bigDecimal29 = bigDecimal26.movePointLeft((int) (byte) -1);
        int int30 = bigDecimal29.intValue();
        java.math.BigDecimal bigDecimal31 = bigDecimal24.add(bigDecimal29);
        java.math.BigDecimal bigDecimal32 = bigDecimal20.add(bigDecimal31);
        java.math.BigDecimal bigDecimal34 = bigDecimal32.pow((int) '#');
        java.math.BigInteger bigInteger35 = bigDecimal32.toBigIntegerExact();
        java.math.MathContext mathContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal37 = bigDecimal17.divideToIntegralValue(bigDecimal32, mathContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-10.0f) + "'", float18 == (-10.0f));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-10) + "'", int19 == (-10));
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!", 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "rbgrbgrbgrbgrbgHindirbgrbgrbgrbgrbg", (int) (short) -2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\uc601\uc5b4\uc601\uad6d)", "npj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4\uc601\uad6d)" + "'", str2, "\uc601\uc5b4\uc601\uad6d)");
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getVariant();
        java.lang.String str5 = locale1.getDisplayScript();
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("hi", locale2);
        java.lang.String str5 = locale2.getISO3Language();
        java.lang.String str6 = locale2.getISO3Country();
        java.util.Locale locale7 = locale2.stripExtensions();
        java.lang.String str8 = locale7.getScript();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra" + "'", str5, "fra");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.ulp();
        java.math.BigInteger bigInteger4 = bigDecimal0.toBigInteger();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger8 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger9 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger10 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger11 = new java.math.BigInteger(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "        fR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf((long) 34);
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
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger((int) (short) -1, byteArray66);
        java.math.BigInteger bigInteger70 = bigInteger68.pow((int) 'a');
        int int71 = bigInteger70.bitLength();
        java.math.BigInteger bigInteger72 = bigInteger62.max(bigInteger70);
        int int73 = bigInteger70.intValue();
        java.math.BigInteger bigInteger74 = bigInteger1.min(bigInteger70);
        int int75 = bigInteger70.intValue();
        org.junit.Assert.assertNotNull(bigInteger1);
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
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 1 + "'", byte67 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u6587\u82f1\u56fd", "IT");
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getExtension('a');
        java.lang.String str7 = locale2.getDisplayScript(locale3);
        org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u6587\u82f1\u56fd_IT");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
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
        java.math.BigInteger bigInteger33 = bigInteger32.abs();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal39 = bigDecimal35.subtract(bigDecimal38);
        java.math.BigInteger bigInteger40 = bigDecimal39.toBigInteger();
        double double41 = bigInteger40.doubleValue();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        byte byte45 = org.apache.commons.lang3.math.NumberUtils.min(byteArray44);
        java.math.BigInteger bigInteger46 = new java.math.BigInteger((int) (short) -1, byteArray44);
        java.math.BigInteger bigInteger47 = bigInteger40.gcd(bigInteger46);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal49 = bigDecimal48.negate();
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal53 = bigDecimal49.subtract(bigDecimal52);
        java.math.BigInteger bigInteger54 = bigDecimal53.toBigInteger();
        double double55 = bigInteger54.doubleValue();
        byte[] byteArray58 = new byte[] { (byte) 1 };
        byte byte59 = org.apache.commons.lang3.math.NumberUtils.min(byteArray58);
        java.math.BigInteger bigInteger60 = new java.math.BigInteger((int) (short) -1, byteArray58);
        java.math.BigInteger bigInteger61 = bigInteger54.gcd(bigInteger60);
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal63 = bigDecimal62.negate();
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal67 = bigDecimal63.subtract(bigDecimal66);
        java.math.BigInteger bigInteger68 = bigDecimal67.toBigInteger();
        java.math.BigInteger bigInteger69 = bigInteger60.or(bigInteger68);
        short short70 = bigInteger60.shortValueExact();
        byte[] byteArray73 = new byte[] { (byte) 1 };
        byte byte74 = org.apache.commons.lang3.math.NumberUtils.min(byteArray73);
        java.math.BigInteger bigInteger75 = new java.math.BigInteger((int) (short) -1, byteArray73);
        java.math.BigInteger bigInteger77 = bigInteger75.pow((int) 'a');
        java.math.BigInteger bigInteger79 = bigInteger75.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger80 = bigInteger60.xor(bigInteger79);
        java.math.BigInteger bigInteger81 = bigInteger79.not();
        java.math.BigInteger bigInteger82 = bigInteger47.and(bigInteger81);
        java.math.BigInteger bigInteger84 = bigInteger81.shiftRight((int) 'x');
        byte byte85 = bigInteger81.byteValueExact();
        java.math.BigInteger bigInteger86 = bigInteger32.max(bigInteger81);
        long long87 = bigInteger32.longValue();
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
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 1 + "'", byte45 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1]");
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 1 + "'", byte59 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) -1 + "'", short70 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[1]");
        org.junit.Assert.assertTrue("'" + byte74 + "' != '" + (byte) 1 + "'", byte74 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertTrue("'" + byte85 + "' != '" + (byte) 1 + "'", byte85 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.lang.String str6 = bigDecimal1.toPlainString();
        int int7 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.TEN;
        java.math.BigInteger bigInteger9 = bigDecimal8.toBigInteger();
        java.math.BigDecimal bigDecimal11 = bigDecimal8.pow(11);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = bigDecimal1.divide(bigDecimal11, 296);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigDecimal11);
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) ' ');
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        int int4 = bigDecimal3.signum();
        long long5 = bigDecimal3.longValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal7 = bigDecimal6.stripTrailingZeros();
        int int8 = bigDecimal1.compareTo(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.ulp();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(bigDecimal9);
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("f", "-2-2-zh-C");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("RF-rf", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u65e5\u6587\u65e5\u672c)", "engCN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u6587\u65e5\u672c)" + "'", str2, "\u65e5\u6587\u65e5\u672c)");
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
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
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.TEN;
        long long24 = bigDecimal23.longValueExact();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.ulp();
        java.lang.String str26 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.TEN;
        long long28 = bigDecimal27.longValueExact();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        double double30 = bigDecimal29.doubleValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal29.movePointLeft((int) (byte) -1);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal27.add(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = bigDecimal23.add(bigDecimal34);
        java.math.BigDecimal bigDecimal37 = bigDecimal35.pow((int) '#');
        java.math.BigDecimal bigDecimal38 = bigDecimal0.min(bigDecimal37);
        int int39 = bigDecimal37.signum();
        long long40 = bigDecimal37.longValue();
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
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9" + "'", str2, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u7f8e\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 10);
        int int2 = bigDecimal1.scale();
        java.lang.String str3 = bigDecimal1.toPlainString();
        java.math.MathContext mathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = bigDecimal1.abs(mathContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal9 = bigDecimal7.min(bigDecimal8);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal[] bigDecimalArray16 = bigDecimal8.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal17 = bigDecimal5.min(bigDecimal14);
        java.math.BigDecimal bigDecimal18 = bigDecimal17.ulp();
        java.math.BigDecimal bigDecimal19 = bigDecimal17.stripTrailingZeros();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimalArray16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)", "RF-r", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        java.util.Locale locale2 = new java.util.Locale("10.0E-99", "0");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "10.0e-99_0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "xxx0.00E+3", (java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("\u52a0\u62ff\u5927 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"  ??? \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("GBR", "jpn", (int) (short) 1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("en-US", strArray10, strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "engCN");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(")", strArray6, strArray10);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "JPNJPNJPNJPNJPNJPNJPNJPNJPNJPN");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("z-CN");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", strArray10, strArray21);
        int int23 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("VEREINIGTES KONIGREICH", strArray21);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en_US" + "'", str11, "en_US");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en_US" + "'", str16, "en_US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ")" + "'", str17, ")");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str22, "\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        int int12 = bigDecimal8.compareTo(bigDecimal9);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal15 = bigDecimal8.add(bigDecimal14);
        java.math.BigDecimal bigDecimal16 = bigDecimal14.plus();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        long long18 = bigDecimal17.longValueExact();
        java.math.BigDecimal bigDecimal19 = bigDecimal17.ulp();
        java.lang.String str20 = bigDecimal17.toString();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.ZERO;
        double double24 = bigDecimal23.doubleValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal23.movePointLeft((int) (byte) -1);
        int int27 = bigDecimal26.intValue();
        java.math.BigDecimal bigDecimal28 = bigDecimal21.add(bigDecimal26);
        java.math.BigDecimal bigDecimal29 = bigDecimal17.add(bigDecimal28);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal34 = bigDecimal32.negate();
        java.lang.String str35 = bigDecimal34.toEngineeringString();
        java.math.BigDecimal bigDecimal36 = bigDecimal31.multiply(bigDecimal34);
        java.math.BigDecimal bigDecimal38 = bigDecimal34.movePointRight(100);
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.negate();
        java.math.BigDecimal bigDecimal41 = bigDecimal39.negate();
        int int42 = bigDecimal38.compareTo(bigDecimal39);
        java.math.BigDecimal bigDecimal43 = bigDecimal17.min(bigDecimal38);
        java.math.BigDecimal bigDecimal44 = bigDecimal14.remainder(bigDecimal17);
        java.math.BigInteger bigInteger45 = bigDecimal44.unscaledValue();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        double double47 = bigDecimal46.doubleValue();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal50 = bigDecimal44.divide(bigDecimal46, (int) 'u', 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (byte) -33);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -33 + "'", byte2 == (byte) -33);
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "uuuuyuiyuxuwuwuvuivuevuuuuukuuguuytuwtuttustututuntultuktuitutugtuetutuwsuvsuusutsussusuqsusunsumsulsuksuisugsuesudsucsusuwuuuunumuuqutpuspulpuipupusuumujucuynuvnunununnulnugnuenudnubnunuymutmusmumumunmulmukmuimumugmuvluulutlulunluiluglubluluykuwkuvkuukuskukukunkumkulkukkujkuikugkukuvjuijujuwiuuiutiusiuiuniukiuiiugiueiudiuiuuyuuutuuuiueuuvguugungulgudguguyuuujuiuuuueuteuseueuneuleueeuduvdueduduycuvcuucuscucucucuecucusbububunbumbuibubugbuebubuuyuvusuunumukuueubu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.scaleByPowerOfTen(301);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        double double11 = bigDecimal10.doubleValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.movePointLeft((int) (byte) -1);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.stripTrailingZeros();
        int int16 = bigDecimal7.compareTo(bigDecimal13);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal((double) 7);
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal7.divideAndRemainder(bigDecimal18);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = bigDecimal7.setScale((int) (short) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Rounding necessary");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("RF-r", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 117, (short) (byte) 1, (short) 16);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 117 + "'", short3 == (short) 117);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
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
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList28);
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
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        char[] charArray9 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "South Korea", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("uauauauayuiyuaxuawuawuavuivuevuauuauukuuguuytuwtuttustuatuatuntultuktuituatugtuetuatuwsuvsuusutsussuasuqsuasunsumsulsuksuisugsuesudsucsuasuwauuauaunaumauuqutpuspulpuipuapusauaumaujaucauynuvnuanuanunnulnugnuenudnubnuanuymutmusmuamuamunmulmukmuimuamugmuvluulutlualunluiluglublualuykuwkuvkuukuskuakuakunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuaiuniukiuiiugiueiudiuaiuauyauuautauauauiaueauauvguugungulgudguaguyauauaujauiauauauueuteuseuaeuneuleueeuaduvdueduaduycuvcuucuscuacuacuacuecuacusbuabuabunbumbuibuabugbuebuabuauyauvausauaunaumaukauaueaubau");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UAUAUAUAYUIYUAXUAWUAWUAVUIVUEVUAUUAUUKUUGUUYTUWTUTTUSTUATUATUNTULTUKTUITUATUGTUETUATUWSUVSUUSUTSUSSUASUQSUASUNSUMSULSUKSUISUGSUESUDSUCSUASUWAUUAUAUNAUMAUUQUTPUSPULPUIPUAPUSAUAUMAUJAUCAUYNUVNUANUANUNNULNUGNUENUDNUBNUANUYMUTMUSMUAMUAMUNMULMUKMUIMUAMUGMUVLUULUTLUALUNLUILUGLUBLUALUYKUWKUVKUUKUSKUAKUAKUNKUMKULKUKKUJKUIKUGKUAKUVJUIJUAJUWIUUIUTIUSIUAIUNIUKIUIIUGIUEIUDIUAIUAUYAUUAUTAUAUAUIAUEAUAUVGUUGUNGULGUDGUAGUYAUAUAUJAUIAUAUAUUEUTEUSEUAEUNEULEUEEUADUVDUEDUADUYCUVCUUCUSCUACUACUACUECUACUSBUABUABUNBUMBUIBUABUGBUEBUABUAUYAUVAUSAUAUNAUMAUKAUAUEAUBAU" + "'", str1, "UAUAUAUAYUIYUAXUAWUAWUAVUIVUEVUAUUAUUKUUGUUYTUWTUTTUSTUATUATUNTULTUKTUITUATUGTUETUATUWSUVSUUSUTSUSSUASUQSUASUNSUMSULSUKSUISUGSUESUDSUCSUASUWAUUAUAUNAUMAUUQUTPUSPULPUIPUAPUSAUAUMAUJAUCAUYNUVNUANUANUNNULNUGNUENUDNUBNUANUYMUTMUSMUAMUAMUNMULMUKMUIMUAMUGMUVLUULUTLUALUNLUILUGLUBLUALUYKUWKUVKUUKUSKUAKUAKUNKUMKULKUKKUJKUIKUGKUAKUVJUIJUAJUWIUUIUTIUSIUAIUNIUKIUIIUGIUEIUDIUAIUAUYAUUAUTAUAUAUIAUEAUAUVGUUGUNGULGUDGUAGUYAUAUAUJAUIAUAUAUUEUTEUSEUAEUNEULEUEEUADUVDUEDUADUYCUVCUUCUSCUACUACUACUECUACUSBUABUABUNBUMBUIBUABUGBUEBUABUAUYAUVAUSAUAUNAUMAUKAUAUEAUBAU");
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuEnhinh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1025L), 10.0f, 7.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getISO3Language();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "h");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", strArray3, strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en_US" + "'", str9, "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
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
        int int51 = bigInteger50.intValueExact();
        long long52 = bigInteger50.longValueExact();
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.lang.String str6 = bigInteger4.toString((int) (byte) 10);
        java.math.BigInteger bigInteger7 = bigInteger4.negate();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger8 = bigInteger4.nextProbablePrime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: start < 0: -1");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertNotNull(bigInteger7);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u7f8e\u56fd" + "'", str1, "\u7f8e\u56fd");
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 1L);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        int int4 = bigDecimal3.signum();
        long long5 = bigDecimal3.longValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal3.abs();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray9);
        java.math.BigInteger bigInteger11 = new java.math.BigInteger((int) (short) -1, byteArray9);
        java.math.BigInteger bigInteger13 = bigInteger11.pow((int) 'a');
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(bigInteger13, (int) (byte) 0);
        int int16 = bigDecimal15.signum();
        java.math.BigDecimal bigDecimal17 = bigDecimal6.divideToIntegralValue(bigDecimal15);
        int int18 = bigDecimal6.signum();
        java.math.BigDecimal bigDecimal19 = bigDecimal1.subtract(bigDecimal6);
        int int20 = bigDecimal6.intValueExact();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd\u671d\u9c9c\u6587\u97e9\u56fd)", "English (Canada)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        int int2 = bigDecimal0.intValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal12 = bigDecimal9.min(bigDecimal11);
        java.lang.String str13 = bigDecimal12.toPlainString();
        java.math.BigDecimal bigDecimal14 = bigDecimal0.subtract(bigDecimal12);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal[] bigDecimalArray18 = bigDecimal14.divideAndRemainder(bigDecimal17);
        java.math.BigDecimal bigDecimal20 = bigDecimal14.movePointLeft((int) (short) 1024);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str13, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimalArray18);
        org.junit.Assert.assertNotNull(bigDecimal20);
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("uzuhzuazuoyuiyuhxuowuawuovuivuevuzuuruukuuguuytuwtuttusturtuotuntultuktuituhtugtuetuatuwsuvsuusutsussursuqsuosunsumsulsuksuisugsuesudsucsuasuwruuruorunrumruuqutpuspulpuipuapusouroumoujoucouynuvnurnuonunnulnugnuenudnubnuanuymutmusmurmuomunmulmukmuimuhmugmuvluulutluolunluiluglublualuykuwkuvkuukuskurkuokunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuoiuniukiuiiugiueiudiuaiuzhuyhuuhuthurhuohuihuehuahuvguugungulgudguaguyfurfuofujfuifuffuafuueuteuseuoeuneuleueeuzduvdueduaduycuvcuucuscurcuocuhcuecuacusburbuobunbumbuibuhbugbuebuabuzauyauvausauraunaumaukaufaueaubauaa");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("KORKORKORKORKORKORKORKORKORKORKORK", "2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KORKORKORKORKORKORKORKORKORKORKORK" + "'", str2, "KORKORKORKORKORKORKORKORKORKORKORK");
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.lang.String str2 = bigDecimal0.toString();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", (int) (short) 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("kor");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setRegion("en-ca");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en-ca [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("de_DExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
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
        byte[] byteArray20 = bigInteger17.toByteArray();
        long long21 = bigInteger17.longValueExact();
        java.lang.String str23 = bigInteger17.toString(0);
        int int24 = bigInteger17.intValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.subtract(bigInteger17);
        java.math.BigInteger bigInteger27 = bigInteger12.shiftRight((int) 'x');
        java.lang.String str29 = bigInteger12.toString((int) (byte) -2);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal35 = bigDecimal31.subtract(bigDecimal34);
        java.math.BigInteger bigInteger36 = bigDecimal35.toBigInteger();
        double double37 = bigInteger36.doubleValue();
        byte byte38 = bigInteger36.byteValueExact();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger45 = bigInteger43.pow((int) 'a');
        java.math.BigInteger bigInteger47 = bigInteger43.shiftLeft((int) (short) 1);
        int int48 = bigInteger47.intValueExact();
        int int49 = bigInteger36.compareTo(bigInteger47);
        long long50 = bigInteger47.longValueExact();
        java.math.BigInteger bigInteger51 = bigInteger12.and(bigInteger47);
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
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1" + "'", str29, "-1");
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 0 + "'", byte38 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-2) + "'", int48 == (-2));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-2L) + "'", long50 == (-2L));
        org.junit.Assert.assertNotNull(bigInteger51);
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("zh-c", "China");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
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
        long long61 = bigInteger42.longValueExact();
        int int62 = bigInteger42.bitLength();
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
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-z-CN", (int) (short) -16960, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\u65e5\u672c", "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) ", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u672c" + "'", str3, "\u65e5\u672c");
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)", "\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("\u65e5\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u52a0\u62ff\u5927  ", "\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4", "rbgrbgrbgrbgrbgHindirbgrbgrbgrbgrbg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("UitdStts", "uzuhzuazuoyuiyuhxuowuawuovuivuevuzuuruukuuguuytuwtuttusturtuotuntultuktuituhtugtuetuatuwsuvsuusutsussursuqsuosunsumsulsuksuisugsuesudsucsuasuwruuruorunrumruuqutpuspulpuipuapusouroumoujoucouynuvnurnuonunnulnugnuenudnubnuanuymutmusmurmuomunmulmukmuimuhmugmuvluulutluolunluiluglublualuykuwkuvkuukuskurkuokunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuoiuniukiuiiugiueiudiuaiuzhuyhuuhuthurhuohuihuehuahuvguugungulgudguaguyfurfuofujfuifuffuafuueuteuseuoeuneuleueeuzduvdueduaduycuvcuucuscurcuocuhcuecuacusburbuobunbumbuibuhbugbuebuabuzauyauvausauraunaumaukaufaueaubauaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uzuhzuazuoyuiyuhxuowuawuovuivuevuzuuruukuuguuytuwtuttusturtuotuntultuktuituhtugtuetuatuwsuvsuusutsussursuqsuosunsumsulsuksuisugsuesudsucsuasuwruuruorunrumruuqutpuspulpuipuapusouroumoujoucouynuvnurnuonunnulnugnuenudnubnuanuymutmusmurmuomunmulmukmuimuhmugmuvluulutluolunluiluglublualuykuwkuvkuukuskurkuokunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuoiuniukiuiiugiueiudiuaiuzhuyhuuhuthurhuohuihuehuahuvguugungulgudguaguyfurfuofujfuifuffuafuueuteuseuoeuneuleueeuzduvdueduaduycuvcuucuscurcuocuhcuecuacusburbuobunbumbuibuhbugbuebuabuzauyauvausauraunaumaukaufaueaubauaa" + "'", str2, "uzuhzuazuoyuiyuhxuowuawuovuivuevuzuuruukuuguuytuwtuttusturtuotuntultuktuituhtugtuetuatuwsuvsuusutsussursuqsuosunsumsulsuksuisugsuesudsucsuasuwruuruorunrumruuqutpuspulpuipuapusouroumoujoucouynuvnurnuonunnulnugnuenudnubnuanuymutmusmurmuomunmulmukmuimuhmugmuvluulutluolunluiluglublualuykuwkuvkuukuskurkuokunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuoiuniukiuiiugiueiudiuaiuzhuyhuuhuthurhuohuihuehuahuvguugungulgudguaguyfurfuofujfuifuffuafuueuteuseuoeuneuleueeuzduvdueduaduycuvcuucuscurcuocuhcuecuacusburbuobunbumbuibuhbugbuebuabuzauyauvausauraunaumaukaufaueaubauaa");
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("French (France)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French (France)" + "'", str1, "French (France)");
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", "                                      !HI!HI!HI!HI!HI!HI!HI!HI                                      ", 30);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((long) (-1));
        java.math.MathContext mathContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = bigDecimal1.plus(mathContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("uzuhzuazuoyuiyuhxuowuawuovuivuevuzuuruukuuguuytuwtuttusturtuotuntultuktuituhtugtuetuatuwsuvsuusutsussursuqsuosunsumsulsuksuisugsuesudsucsuasuwruuruorunrumruuqutpuspulpuipuapusouroumoujoucouynuvnurnuonunnulnugnuenudnubnuanuymutmusmurmuomunmulmukmuimuhmugmuvluulutluolunluiluglublualuykuwkuvkuukuskurkuokunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuoiuniukiuiiugiueiudiuaiuzhuyhuuhuthurhuohuihuehuahuvguugungulgudguaguyfurfuofujfuifuffuafuueuteuseuoeuneuleueeuzduvdueduaduycuvcuucuscurcuocuhcuecuacusburbuobunbumbuibuhbugbuebuabuzauyauvausauraunaumaukaufaueaubauaa", "", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
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
        java.lang.String str20 = bigDecimal18.toEngineeringString();
        long long21 = bigDecimal18.longValue();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger((int) (short) -1, byteArray24);
        java.math.BigInteger bigInteger28 = bigInteger26.pow((int) 'a');
        java.math.BigInteger bigInteger30 = bigInteger26.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(bigInteger26, 34);
        java.math.BigDecimal bigDecimal35 = bigDecimal18.divide(bigDecimal32, 100, 7);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal37 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal41 = bigDecimal37.subtract(bigDecimal40);
        java.lang.String str42 = bigDecimal37.toPlainString();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        double double44 = bigDecimal43.doubleValue();
        java.math.BigDecimal bigDecimal46 = bigDecimal43.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger47 = bigDecimal43.unscaledValue();
        long long48 = bigDecimal43.longValue();
        java.math.BigDecimal bigDecimal49 = bigDecimal37.subtract(bigDecimal43);
        java.math.BigDecimal bigDecimal50 = bigDecimal18.add(bigDecimal49);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        double double52 = bigDecimal51.doubleValue();
        java.math.BigInteger bigInteger53 = bigDecimal51.toBigInteger();
        java.lang.String str54 = bigDecimal51.toPlainString();
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal56 = bigDecimal55.negate();
        java.math.BigDecimal bigDecimal57 = bigDecimal55.negate();
        int int58 = bigDecimal57.intValueExact();
        java.math.BigDecimal bigDecimal59 = bigDecimal51.max(bigDecimal57);
        java.math.BigDecimal bigDecimal60 = bigDecimal59.abs();
        int int61 = bigDecimal59.intValueExact();
        java.math.BigDecimal bigDecimal63 = bigDecimal59.setScale((int) (byte) 100);
        java.math.BigDecimal bigDecimal64 = bigDecimal50.add(bigDecimal63);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal67 = bigDecimal50.setScale((int) 'x', 32);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10.0E-99" + "'", str20, "10.0E-99");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal64);
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.ZERO;
        double double2 = bigDecimal1.doubleValue();
        java.math.BigInteger bigInteger3 = bigDecimal1.toBigInteger();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.math.BigInteger bigInteger8 = new java.math.BigInteger((int) (short) -1, byteArray6);
        java.math.BigInteger bigInteger10 = bigInteger8.pow((int) 'a');
        byte[] byteArray11 = bigInteger8.toByteArray();
        long long12 = bigInteger8.longValueExact();
        java.math.BigInteger bigInteger13 = bigInteger3.or(bigInteger8);
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger20 = bigInteger18.pow((int) 'a');
        byte[] byteArray21 = bigInteger18.toByteArray();
        long long22 = bigInteger18.longValueExact();
        java.lang.String str24 = bigInteger18.toString(0);
        int int25 = bigInteger18.intValueExact();
        java.math.BigInteger bigInteger26 = bigInteger13.subtract(bigInteger18);
        boolean boolean27 = locale0.equals((java.lang.Object) bigInteger18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en_US", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "Englisch", (int) (short) -2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("en-c", strArray5, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-c" + "'", str10, "en-c");
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.math.BigInteger bigInteger9 = bigDecimal4.toBigInteger();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.setScale(0);
        int int12 = bigDecimal4.scale();
        java.math.MathContext mathContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = bigDecimal4.pow((int) (short) 16, mathContext14);
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
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.math.MathContext mathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = bigDecimal2.pow(296, mathContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                           ", "\u610f\u5927\u5229\u6587", 101);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0L);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        double double5 = languageRange2.getWeight();
        java.lang.String str6 = languageRange2.getRange();
        double double7 = languageRange2.getWeight();
        double double8 = languageRange2.getWeight();
        double double9 = languageRange2.getWeight();
        double double10 = languageRange2.getWeight();
        double double11 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chn" + "'", str6, "chn");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
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
        java.math.BigInteger bigInteger51 = bigInteger44.not();
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
        double double74 = bigInteger73.doubleValue();
        int int75 = bigInteger73.getLowestSetBit();
        short short76 = bigInteger73.shortValueExact();
        byte[] byteArray79 = new byte[] { (byte) 1 };
        byte byte80 = org.apache.commons.lang3.math.NumberUtils.min(byteArray79);
        java.math.BigInteger bigInteger81 = new java.math.BigInteger((int) (short) -1, byteArray79);
        java.math.BigInteger bigInteger83 = bigInteger81.pow((int) 'a');
        java.math.BigInteger bigInteger85 = bigInteger81.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger87 = bigInteger85.flipBit(1);
        long long88 = bigInteger87.longValue();
        java.math.BigInteger bigInteger90 = bigInteger87.setBit((int) (byte) 1);
        java.math.BigInteger bigInteger91 = bigInteger73.xor(bigInteger90);
        java.math.BigInteger bigInteger92 = bigInteger51.mod(bigInteger91);
        long long93 = bigInteger92.longValue();
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
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + short76 + "' != '" + (short) -1 + "'", short76 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[1]");
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 1 + "'", byte80 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-4L) + "'", long88 == (-4L));
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertNotNull(bigInteger92);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("en_US");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "             hi!uuu             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList20);
        java.lang.String str23 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap24);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("English");
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList35);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList45);
        java.lang.String str48 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList45);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.lowerCase("", locale53);
        java.util.Locale.setDefault(locale53);
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.lowerCase("", locale57);
        java.util.Locale.setDefault(locale57);
        java.util.Locale locale60 = java.util.Locale.KOREA;
        java.util.Locale locale61 = locale60.stripExtensions();
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale63);
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale65.getDisplayLanguage();
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.upperCase("", locale68);
        java.util.Locale locale70 = java.util.Locale.GERMANY;
        java.util.Locale locale71 = java.util.Locale.GERMANY;
        java.util.Locale locale72 = java.util.Locale.GERMANY;
        java.lang.String str73 = locale72.getVariant();
        java.util.Locale locale74 = java.util.Locale.KOREA;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.util.Locale locale76 = java.util.Locale.KOREA;
        java.util.Locale locale77 = locale76.stripExtensions();
        java.util.Locale locale78 = java.util.Locale.KOREA;
        java.util.Locale locale79 = java.util.Locale.PRC;
        java.util.Locale locale80 = java.util.Locale.KOREA;
        java.lang.String str81 = locale80.getScript();
        java.util.Locale locale82 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray83 = new java.util.Locale[] { locale53, locale57, locale60, locale63, locale65, locale68, locale70, locale71, locale72, locale74, locale77, locale78, locale79, locale80, locale82 };
        java.util.ArrayList<java.util.Locale> localeList84 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList84, localeArray83);
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList84, filteringMode86);
        java.util.Locale locale88 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList27, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList87);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str64, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\u4e2d\u6587" + "'", str66, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode86.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNull(locale89);
        org.junit.Assert.assertNotNull(localeList90);
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf(0L);
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1L), (double) 7L, (double) 301L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 301.0d + "'", double3 == 301.0d);
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\uad6d\ubbfc\ud55c\ub300UNDUNDUNDUNDUNDUNDUNDUNDUNDUND", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DUNDUNDUNDUNDUNDUNDUNDUNDUND" + "'", str2, "DUNDUNDUNDUNDUNDUNDUNDUNDUND");
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("En-US", (byte) 34);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 34 + "'", byte2 == (byte) 34);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        char[] charArray12 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zho", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh-CN", charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(charArray12, 299, (int) (short) -4);
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
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setUnicodeLocaleKeyword("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "Cor\351e du Sud");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u52a0\u62ff\u592700", "     zh-cn", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u52a0\u62ff\u592700" + "'", str3, "\u52a0\u62ff\u592700");
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
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
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "English");
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
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList36);
        java.lang.String str39 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList36);
        java.lang.String str40 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList36);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "\u4e2d\u65874444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
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
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        double double52 = bigDecimal51.doubleValue();
        java.math.BigInteger bigInteger53 = bigDecimal51.toBigInteger();
        byte[] byteArray56 = new byte[] { (byte) 1 };
        byte byte57 = org.apache.commons.lang3.math.NumberUtils.min(byteArray56);
        java.math.BigInteger bigInteger58 = new java.math.BigInteger((int) (short) -1, byteArray56);
        java.math.BigInteger bigInteger60 = bigInteger58.pow((int) 'a');
        byte[] byteArray61 = bigInteger58.toByteArray();
        long long62 = bigInteger58.longValueExact();
        java.math.BigInteger bigInteger63 = bigInteger53.or(bigInteger58);
        byte byte64 = bigInteger58.byteValueExact();
        boolean boolean66 = bigInteger58.testBit(100);
        java.lang.Object obj67 = null;
        boolean boolean68 = bigInteger58.equals(obj67);
        java.lang.String str70 = bigInteger58.toString(0);
        java.math.BigInteger bigInteger71 = bigInteger48.remainder(bigInteger58);
        java.math.BigInteger bigInteger72 = bigInteger58.negate();
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
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1]");
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 1 + "'", byte57 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) -1 + "'", byte64 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "-1" + "'", str70, "-1");
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(bigInteger72);
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
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
        java.lang.String str57 = bigInteger28.toString();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal59 = bigDecimal58.negate();
        int int60 = bigDecimal59.signum();
        long long61 = bigDecimal59.longValue();
        java.math.BigDecimal bigDecimal62 = bigDecimal59.abs();
        java.math.BigDecimal bigDecimal63 = bigDecimal62.stripTrailingZeros();
        java.math.BigDecimal bigDecimal65 = bigDecimal62.pow((int) (short) 0);
        java.math.BigInteger bigInteger66 = bigDecimal65.toBigInteger();
        java.math.BigInteger bigInteger68 = bigInteger66.setBit(30);
        java.math.BigDecimal bigDecimal69 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal70 = bigDecimal69.negate();
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal74 = bigDecimal70.subtract(bigDecimal73);
        java.math.BigInteger bigInteger75 = bigDecimal74.toBigInteger();
        double double76 = bigInteger75.doubleValue();
        byte byte77 = bigInteger75.byteValueExact();
        byte[] byteArray80 = new byte[] { (byte) 1 };
        byte byte81 = org.apache.commons.lang3.math.NumberUtils.min(byteArray80);
        java.math.BigInteger bigInteger82 = new java.math.BigInteger((int) (short) -1, byteArray80);
        java.math.BigInteger bigInteger84 = bigInteger82.pow((int) 'a');
        java.math.BigInteger bigInteger86 = bigInteger82.shiftLeft((int) (short) 1);
        int int87 = bigInteger86.intValueExact();
        int int88 = bigInteger75.compareTo(bigInteger86);
        java.math.BigInteger bigInteger89 = bigInteger66.min(bigInteger86);
        java.math.BigInteger bigInteger90 = bigInteger28.max(bigInteger66);
        java.math.BigInteger bigInteger91 = bigInteger28.not();
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0" + "'", str57, "0");
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) 0 + "'", byte77 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[1]");
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 1 + "'", byte81 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-2) + "'", int87 == (-2));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger91);
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "KR", (java.lang.CharSequence) "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "KR" + "'", charSequence2, "KR");
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\uc601\uc5b4\ubbf8\uad6d)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc601\uc5b4\ubbf8\uad6d)" + "'", str1, "\uc601\uc5b4\ubbf8\uad6d)");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "UNITED STATES                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        long[] longArray6 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("rbgrbgrbgrbgrbgHindirbgrbgrbgrbgrbg", "\u82f1\u6587\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rbgrbgrbgrbgrbgHindirbgrbgrbgrbgrbg" + "'", str2, "rbgrbgrbgrbgrbgHindirbgrbgrbgrbgrbg");
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!hs!hs!hs!hs!hs!hs!hs!hs");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hs!hs!hs!hs!hs!hs!hs!hs" + "'", str1, "!hs!hs!hs!hs!hs!hs!hs!hs");
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "Korean (South Korea)");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "fran\347ais");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (byte) 1, (int) (short) -16960);
        java.lang.String str3 = bigDecimal2.toEngineeringString();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10E+16959" + "'", str3, "10E+16959");
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("FR", "en_US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        long[] longArray6 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        java.util.Locale locale2 = new java.util.Locale("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("\u6cd5\u6587", locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587" + "'", str3, "\u6cd5\u6587");
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
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
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", charArray17);
        java.math.MathContext mathContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(charArray17, mathContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (byte) 100, 97);
        java.math.BigInteger bigInteger3 = bigDecimal2.toBigInteger();
        java.lang.String str4 = bigDecimal2.toString();
        int int5 = bigDecimal2.intValue();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1.00E-95" + "'", str4, "1.00E-95");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("ENENENENENENENENENENENENENENENENDNU", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
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
        byte[] byteArray22 = bigInteger21.toByteArray();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        boolean boolean28 = bigInteger21.equals((java.lang.Object) byteArray25);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        double double30 = bigDecimal29.doubleValue();
        java.math.BigInteger bigInteger31 = bigDecimal29.toBigInteger();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger38 = bigInteger36.pow((int) 'a');
        byte[] byteArray39 = bigInteger36.toByteArray();
        long long40 = bigInteger36.longValueExact();
        java.math.BigInteger bigInteger41 = bigInteger31.or(bigInteger36);
        byte byte42 = bigInteger36.byteValueExact();
        boolean boolean44 = bigInteger36.testBit(100);
        byte[] byteArray47 = new byte[] { (byte) 1 };
        byte byte48 = org.apache.commons.lang3.math.NumberUtils.min(byteArray47);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger((int) (short) -1, byteArray47);
        java.math.BigInteger bigInteger51 = bigInteger49.pow((int) 'a');
        java.math.BigInteger bigInteger53 = bigInteger49.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal55 = bigDecimal54.negate();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal57 = bigDecimal55.min(bigDecimal56);
        java.lang.String str58 = bigDecimal55.toPlainString();
        boolean boolean59 = bigInteger53.equals((java.lang.Object) bigDecimal55);
        java.math.BigInteger bigInteger60 = bigInteger36.divide(bigInteger53);
        java.math.BigInteger bigInteger61 = bigInteger21.andNot(bigInteger36);
        java.lang.String str62 = bigInteger61.toString();
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1]");
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 1 + "'", byte48 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0" + "'", str62, "0");
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("z-CN", "\u610f\u5927\u5229");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z-CN" + "'", str2, "z-CN");
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        char[] charArray13 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("it", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("DNU0e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+10e+1", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Koreanunited states united states(united statesSouthunited states united statesKoreaunited states)", "en-GB", 320);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Koreanunited states united states(united statesSouthunited states united statesKoreaunited states)" + "'", str3, "Koreanunited states united states(united statesSouthunited states united statesKoreaunited states)");
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALY;
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale3.getDisplayLanguage(locale5);
        boolean boolean7 = locale3.hasExtensions();
        java.lang.String str8 = locale3.toLanguageTag();
        java.lang.String str9 = locale2.getDisplayLanguage(locale3);
        java.lang.String str10 = locale0.getDisplayCountry(locale3);
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean" + "'", str6, "Korean");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ko-KR" + "'", str8, "ko-KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str9, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str10, "\ub300\ud55c\ubbfc\uad6d");
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000120", "JPN", 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
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
        byte[] byteArray20 = bigInteger17.toByteArray();
        long long21 = bigInteger17.longValueExact();
        java.lang.String str23 = bigInteger17.toString(0);
        int int24 = bigInteger17.intValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.subtract(bigInteger17);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        java.math.BigInteger bigInteger33 = bigInteger32.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        double double35 = bigDecimal34.doubleValue();
        java.math.BigInteger bigInteger36 = bigDecimal34.toBigInteger();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        byte byte40 = org.apache.commons.lang3.math.NumberUtils.min(byteArray39);
        java.math.BigInteger bigInteger41 = new java.math.BigInteger((int) (short) -1, byteArray39);
        java.math.BigInteger bigInteger43 = bigInteger41.pow((int) 'a');
        byte[] byteArray44 = bigInteger41.toByteArray();
        long long45 = bigInteger41.longValueExact();
        java.math.BigInteger bigInteger46 = bigInteger36.or(bigInteger41);
        byte[] byteArray49 = new byte[] { (byte) 1 };
        byte byte50 = org.apache.commons.lang3.math.NumberUtils.min(byteArray49);
        java.math.BigInteger bigInteger51 = new java.math.BigInteger((int) (short) -1, byteArray49);
        java.math.BigInteger bigInteger53 = bigInteger51.pow((int) 'a');
        byte[] byteArray54 = bigInteger51.toByteArray();
        long long55 = bigInteger51.longValueExact();
        java.lang.String str57 = bigInteger51.toString(0);
        int int58 = bigInteger51.intValueExact();
        java.math.BigInteger bigInteger59 = bigInteger46.subtract(bigInteger51);
        java.math.BigInteger bigInteger60 = bigInteger32.min(bigInteger46);
        java.math.BigInteger bigInteger61 = bigInteger25.gcd(bigInteger60);
        java.math.BigInteger bigInteger63 = bigInteger25.setBit(0);
        int int64 = bigInteger25.intValueExact();
        double double65 = bigInteger25.doubleValue();
        byte[] byteArray68 = new byte[] { (byte) 1 };
        byte byte69 = org.apache.commons.lang3.math.NumberUtils.min(byteArray68);
        java.math.BigInteger bigInteger70 = new java.math.BigInteger((int) (short) -1, byteArray68);
        java.math.BigInteger bigInteger72 = bigInteger70.pow((int) 'a');
        java.math.BigInteger bigInteger74 = bigInteger70.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger76 = bigInteger74.flipBit(1);
        long long77 = bigInteger76.longValue();
        java.math.BigInteger bigInteger79 = bigInteger76.setBit((int) (byte) 1);
        java.math.BigInteger bigInteger80 = bigInteger25.and(bigInteger76);
        boolean boolean82 = bigInteger25.isProbablePrime((int) (short) -1);
        java.math.BigInteger bigInteger83 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int84 = bigInteger25.compareTo(bigInteger83);
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
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1]");
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 1 + "'", byte40 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1]");
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 1 + "'", byte50 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "-1" + "'", str57, "-1");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[1]");
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) 1 + "'", byte69 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-4L) + "'", long77 == (-4L));
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "gbr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
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
        int int23 = bigInteger12.getLowestSetBit();
        long long24 = bigInteger12.longValue();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal26.subtract(bigDecimal29);
        java.math.BigInteger bigInteger31 = bigDecimal30.toBigInteger();
        java.math.BigInteger bigInteger32 = bigInteger31.negate();
        java.math.BigInteger bigInteger33 = bigInteger12.gcd(bigInteger31);
        byte[] byteArray36 = new byte[] { (byte) 1 };
        byte byte37 = org.apache.commons.lang3.math.NumberUtils.min(byteArray36);
        java.math.BigInteger bigInteger38 = new java.math.BigInteger((int) (short) -1, byteArray36);
        java.math.BigInteger bigInteger40 = bigInteger38.pow((int) 'a');
        byte[] byteArray41 = bigInteger38.toByteArray();
        long long42 = bigInteger38.longValueExact();
        java.lang.String str44 = bigInteger38.toString(0);
        byte[] byteArray47 = new byte[] { (byte) 1 };
        byte byte48 = org.apache.commons.lang3.math.NumberUtils.min(byteArray47);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger((int) (short) -1, byteArray47);
        java.math.BigInteger bigInteger50 = new java.math.BigInteger(byteArray47);
        boolean boolean51 = bigInteger38.equals((java.lang.Object) byteArray47);
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
        java.math.BigInteger bigInteger66 = bigInteger38.and(bigInteger64);
        java.math.BigInteger bigInteger67 = bigInteger33.max(bigInteger64);
        int int68 = bigInteger64.bitLength();
        java.math.BigInteger bigInteger69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger70 = bigInteger64.add(bigInteger69);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-1" + "'", str44, "-1");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1]");
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 1 + "'", byte48 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
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
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("france", "#_HI!", 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "france#_HI!france#_HI!france#_HI!france#_HI!france#_HI!france#_HI!france#_HI!france" + "'", str3, "france#_HI!france#_HI!france#_HI!france#_HI!france#_HI!france#_HI!france#_HI!france");
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)unitedxstates", "!hs!hs!hs!hs!hs!hs!hs!hs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)unitedxstate" + "'", str2, "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)unitedxstate");
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!", (int) (byte) 0, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd", "IT...KoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoKoK");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\u65e5\u672c", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow((int) (byte) 1);
        java.math.BigInteger bigInteger5 = bigDecimal4.unscaledValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal4.movePointRight(2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.TEN;
        long long9 = bigDecimal8.longValueExact();
        java.math.BigDecimal bigDecimal10 = bigDecimal8.ulp();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.TEN;
        long long14 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.ulp();
        java.lang.String str16 = bigDecimal13.toString();
        int int17 = bigDecimal11.compareTo(bigDecimal13);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal21 = bigDecimal13.divide(bigDecimal19, (int) (short) 1);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal21.max(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.TEN;
        long long26 = bigDecimal25.longValueExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal25.ulp();
        java.math.BigDecimal bigDecimal28 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.abs();
        java.math.BigDecimal bigDecimal34 = bigDecimal31.min(bigDecimal33);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int37 = bigDecimal33.compareTo(bigDecimal36);
        java.math.BigDecimal bigDecimal38 = bigDecimal28.divide(bigDecimal36);
        java.math.BigDecimal bigDecimal39 = bigDecimal8.subtract(bigDecimal38);
        java.math.MathContext mathContext40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal41 = bigDecimal7.subtract(bigDecimal8, mathContext40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("gne", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IT...", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        char[] charArray16 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zho", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh-CN", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#_ENG", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\uc77c\ub3c5\uc5b4\uc77c\ub3c5", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-c", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI", charArray16);
        java.math.MathContext mathContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(charArray16, (int) (byte) 34, (int) (byte) -33, mathContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.setRegion("US");
        java.util.Locale.Builder builder9 = builder3.removeUnicodeLocaleAttribute("frazho");
        java.util.Locale locale10 = builder9.build();
        java.lang.Object obj11 = locale10.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_US");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "fr_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "fr_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "fr_US");
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "2-", (java.lang.CharSequence) "Allemagne");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "south Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "de");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9)                                                                                                              ", "\uc911\uad6d\uc5b4\uc911\uad6d)", "#######");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
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
        java.lang.String str20 = bigDecimal18.toEngineeringString();
        long long21 = bigDecimal18.longValue();
        double double22 = bigDecimal18.doubleValue();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = bigDecimal18.toBigIntegerExact();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Rounding necessary");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10.0E-99" + "'", str20, "10.0E-99");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-98d + "'", double22 == 1.0E-98d);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal2.toEngineeringString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal7 = bigDecimal5.min(bigDecimal6);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray14 = bigDecimal6.divideAndRemainder(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal22 = bigDecimal19.min(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = bigDecimal12.divideToIntegralValue(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigInteger bigInteger25 = bigDecimal23.toBigIntegerExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal2.divide(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                 ", (byte) 34);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 34 + "'", byte2 == (byte) 34);
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("dnu", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ja-x-lvariant-CHN", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dnu" + "'", str6, "dnu");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Ko", "rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany)rman (Germany", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hin", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hin" + "'", str2, "hin");
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
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
        byte byte21 = bigInteger15.byteValueExact();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.math.BigInteger bigInteger25 = bigInteger15.setBit(7);
        java.math.BigInteger bigInteger27 = bigInteger15.clearBit((int) (byte) 1);
        java.math.BigInteger bigInteger28 = bigInteger6.remainder(bigInteger15);
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(bigInteger6, 52);
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal((-33L));
        java.math.RoundingMode roundingMode33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal34 = bigDecimal30.divide(bigDecimal32, roundingMode33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
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
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 31, 3L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", (int) (byte) 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  " + "'", str2, "                                  ");
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (short) 2);
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(120L);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.ulp();
        java.lang.String str7 = bigDecimal4.toString();
        int int8 = bigDecimal2.compareTo(bigDecimal4);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal4.divide(bigDecimal10, (int) (short) 1);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.TEN;
        long long14 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal12.max(bigDecimal13);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.ulp();
        java.math.BigDecimal bigDecimal19 = bigDecimal13.subtract(bigDecimal16);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.TEN;
        long long21 = bigDecimal20.longValueExact();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        double double23 = bigDecimal22.doubleValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal22.movePointLeft((int) (byte) -1);
        int int26 = bigDecimal25.intValue();
        java.math.BigDecimal bigDecimal27 = bigDecimal20.add(bigDecimal25);
        int int28 = bigDecimal19.compareTo(bigDecimal25);
        java.math.BigDecimal bigDecimal29 = bigDecimal1.min(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(bigDecimal29);
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        char[] charArray10 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2\u8a9e", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(charArray10, (int) (short) -4, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.plus();
        long long6 = bigDecimal5.longValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigInteger bigInteger10 = bigDecimal8.toBigInteger();
        java.lang.String str11 = bigDecimal8.toPlainString();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.negate();
        int int15 = bigDecimal14.intValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal8.max(bigDecimal14);
        int int17 = bigDecimal16.precision();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal20 = bigDecimal18.negate();
        java.lang.String str21 = bigDecimal18.toString();
        java.math.BigDecimal bigDecimal23 = bigDecimal18.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.ulp();
        java.lang.String str29 = bigDecimal26.toString();
        int int30 = bigDecimal24.compareTo(bigDecimal26);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal26.divide(bigDecimal32, (int) (short) 1);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.TEN;
        long long36 = bigDecimal35.longValueExact();
        java.math.BigDecimal bigDecimal37 = bigDecimal34.max(bigDecimal35);
        java.math.BigDecimal bigDecimal38 = bigDecimal18.add(bigDecimal34);
        int int39 = bigDecimal16.compareTo(bigDecimal34);
        java.math.MathContext mathContext40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal41 = bigDecimal5.remainder(bigDecimal34, mathContext40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("IT...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IT...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = java.math.BigInteger.probablePrime(6, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 100, (short) 1024);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Jpnese", "-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-z-CN", (int) (short) -18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u671d\u9c9c\u6587", 120);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u671d\u9c9c\u6587" + "'", str2, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.pow(0);
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.TEN;
        long long8 = bigDecimal7.longValueExact();
        int int9 = bigDecimal7.intValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal7.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal17 = bigDecimal13.subtract(bigDecimal16);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal19 = bigDecimal16.min(bigDecimal18);
        java.lang.String str20 = bigDecimal19.toPlainString();
        java.math.BigDecimal bigDecimal21 = bigDecimal7.subtract(bigDecimal19);
        int int22 = bigDecimal19.scale();
        java.math.BigDecimal bigDecimal23 = bigDecimal19.abs();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.ulp();
        java.lang.String str29 = bigDecimal26.toString();
        int int30 = bigDecimal24.compareTo(bigDecimal26);
        short short31 = bigDecimal24.shortValueExact();
        java.math.BigDecimal bigDecimal33 = bigDecimal24.scaleByPowerOfTen((-1));
        int int34 = bigDecimal19.compareTo(bigDecimal33);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray35 = bigDecimal5.divideAndRemainder(bigDecimal33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str20, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 0 + "'", short31 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
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
        byte[] byteArray22 = bigInteger21.toByteArray();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger(byteArray24);
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger26);
        short short28 = bigInteger26.shortValueExact();
        int int29 = bigInteger26.bitLength();
        java.math.BigInteger[] bigIntegerArray30 = bigInteger21.divideAndRemainder(bigInteger26);
        byte[] byteArray33 = new byte[] { (byte) 1 };
        byte byte34 = org.apache.commons.lang3.math.NumberUtils.min(byteArray33);
        java.math.BigInteger bigInteger35 = new java.math.BigInteger((int) (short) -1, byteArray33);
        java.math.BigInteger bigInteger37 = bigInteger35.pow((int) 'a');
        java.math.BigInteger bigInteger39 = bigInteger35.shiftLeft((int) (short) 1);
        int int40 = bigInteger39.intValueExact();
        java.math.BigInteger bigInteger41 = bigInteger39.abs();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        byte[] byteArray49 = bigInteger48.toByteArray();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(bigInteger48);
        byte[] byteArray53 = new byte[] { (byte) 1 };
        byte byte54 = org.apache.commons.lang3.math.NumberUtils.min(byteArray53);
        java.math.BigInteger bigInteger55 = new java.math.BigInteger((int) (short) -1, byteArray53);
        java.math.BigInteger bigInteger57 = bigInteger55.pow((int) 'a');
        java.math.BigInteger bigInteger59 = bigInteger55.shiftLeft((int) (short) 1);
        int int60 = bigInteger59.intValueExact();
        java.math.BigInteger bigInteger61 = bigInteger59.abs();
        java.math.BigInteger bigInteger62 = bigInteger48.min(bigInteger59);
        java.math.BigInteger bigInteger63 = bigInteger39.xor(bigInteger59);
        java.math.BigInteger bigInteger64 = bigInteger21.gcd(bigInteger63);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 1 + "'", short28 == (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1]");
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 1 + "'", byte34 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-2) + "'", int60 == (-2));
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigInteger64);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("KORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKORKOR", 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -2, (short) -33, (short) -16960);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -2 + "'", short3 == (short) -2);
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Deutsch");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf((long) 34);
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
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger((int) (short) -1, byteArray66);
        java.math.BigInteger bigInteger70 = bigInteger68.pow((int) 'a');
        int int71 = bigInteger70.bitLength();
        java.math.BigInteger bigInteger72 = bigInteger62.max(bigInteger70);
        int int73 = bigInteger70.intValue();
        java.math.BigInteger bigInteger74 = bigInteger1.min(bigInteger70);
        java.math.BigDecimal bigDecimal75 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal76 = bigDecimal75.negate();
        java.math.BigDecimal bigDecimal79 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal80 = bigDecimal76.subtract(bigDecimal79);
        java.math.BigInteger bigInteger81 = bigDecimal80.toBigInteger();
        java.math.BigInteger bigInteger82 = bigInteger74.and(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger1);
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
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 1 + "'", byte67 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        int int2 = bigDecimal0.intValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal12 = bigDecimal9.min(bigDecimal11);
        java.lang.String str13 = bigDecimal12.toPlainString();
        java.math.BigDecimal bigDecimal14 = bigDecimal0.subtract(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = bigDecimal0.plus();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf(35L, (int) (short) 117);
        java.math.BigDecimal bigDecimal20 = bigDecimal18.movePointLeft((int) (short) -2);
        java.math.BigDecimal bigDecimal21 = bigDecimal0.remainder(bigDecimal18);
        java.math.MathContext mathContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal23 = bigDecimal18.round(mathContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str13, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
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
        byte byte50 = bigInteger46.byteValueExact();
        byte[] byteArray53 = new byte[] { (byte) 1 };
        byte byte54 = org.apache.commons.lang3.math.NumberUtils.min(byteArray53);
        java.math.BigInteger bigInteger55 = new java.math.BigInteger((int) (short) -1, byteArray53);
        java.math.BigInteger bigInteger57 = bigInteger55.pow((int) 'a');
        byte[] byteArray58 = bigInteger55.toByteArray();
        long long59 = bigInteger55.longValueExact();
        java.lang.String str61 = bigInteger55.toString(0);
        java.math.BigInteger bigInteger63 = bigInteger55.shiftLeft(117);
        java.math.BigInteger bigInteger64 = bigInteger46.min(bigInteger55);
        double double65 = bigInteger46.doubleValue();
        float float66 = bigInteger46.floatValue();
        java.math.BigInteger bigInteger67 = bigInteger46.negate();
        float float68 = bigInteger67.floatValue();
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
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) -2 + "'", byte50 == (byte) -2);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-1]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-1" + "'", str61, "-1");
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-2.0d) + "'", double65 == (-2.0d));
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + (-2.0f) + "'", float66 == (-2.0f));
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 2.0f + "'", float68 == 2.0f);
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
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
        short short14 = bigInteger13.shortValueExact();
        java.math.BigInteger bigInteger15 = bigInteger13.negate();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal28 = bigDecimal24.subtract(bigDecimal27);
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigInteger();
        double double30 = bigInteger29.doubleValue();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        byte byte34 = org.apache.commons.lang3.math.NumberUtils.min(byteArray33);
        java.math.BigInteger bigInteger35 = new java.math.BigInteger((int) (short) -1, byteArray33);
        java.math.BigInteger bigInteger36 = bigInteger29.gcd(bigInteger35);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal38 = bigDecimal37.negate();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal42 = bigDecimal38.subtract(bigDecimal41);
        java.math.BigInteger bigInteger43 = bigDecimal42.toBigInteger();
        java.math.BigInteger bigInteger44 = bigInteger35.or(bigInteger43);
        java.math.BigInteger bigInteger45 = bigInteger22.min(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger22.pow(4);
        java.math.BigInteger bigInteger48 = bigInteger15.andNot(bigInteger47);
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
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1]");
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 1 + "'", byte34 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
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
        java.math.BigInteger bigInteger50 = bigInteger47.shiftRight((int) 'x');
        java.math.BigInteger bigInteger52 = bigInteger50.pow(34);
        java.math.BigInteger bigInteger53 = bigInteger50.nextProbablePrime();
        java.math.MathContext mathContext54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal(bigInteger53, mathContext54);
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
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigInteger53);
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "           AJ           AJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                                                                                                                                     #                                                                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=#");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aj", "ZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger8 = new java.math.BigInteger(byteArray2);
        short short9 = bigInteger8.shortValueExact();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("0.0000", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 100, (byte) 10, (short) 0, (short) 0 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 100, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        char[] charArray13 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("", charArray13);
        java.math.MathContext mathContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(charArray13, 1073741825, (int) (short) 2, mathContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.scaleByPowerOfTen(34);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.math.BigInteger bigInteger12 = bigDecimal11.toBigInteger();
        double double13 = bigInteger12.doubleValue();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger19 = bigInteger12.gcd(bigInteger18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigInteger bigInteger26 = bigDecimal25.toBigInteger();
        java.math.BigInteger bigInteger27 = bigInteger18.or(bigInteger26);
        short short28 = bigInteger18.shortValueExact();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger35 = bigInteger33.pow((int) 'a');
        java.math.BigInteger bigInteger37 = bigInteger33.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger38 = bigInteger18.xor(bigInteger37);
        java.math.BigInteger bigInteger40 = bigInteger37.clearBit(4);
        double double41 = bigInteger37.doubleValue();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger54.or(bigInteger62);
        byte[] byteArray64 = bigInteger63.toByteArray();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger(byteArray66);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(bigInteger68);
        short short70 = bigInteger68.shortValueExact();
        int int71 = bigInteger68.bitLength();
        java.math.BigInteger[] bigIntegerArray72 = bigInteger63.divideAndRemainder(bigInteger68);
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal74 = bigDecimal73.negate();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal78 = bigDecimal74.subtract(bigDecimal77);
        java.math.BigInteger bigInteger79 = bigDecimal78.toBigInteger();
        double double80 = bigInteger79.doubleValue();
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger86 = bigInteger79.gcd(bigInteger85);
        java.math.BigInteger bigInteger87 = bigInteger68.andNot(bigInteger85);
        java.math.BigInteger bigInteger88 = bigInteger37.xor(bigInteger85);
        boolean boolean89 = bigDecimal5.equals((java.lang.Object) bigInteger37);
        java.math.BigDecimal bigDecimal90 = null;
        java.math.MathContext mathContext91 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal92 = bigDecimal5.divideToIntegralValue(bigDecimal90, mathContext91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) -1 + "'", short28 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1]");
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 1 + "'", byte32 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-2.0d) + "'", double41 == (-2.0d));
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 1 + "'", byte67 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 1 + "'", short70 == (short) 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray72);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[1]");
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 1 + "'", byte84 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        byte byte4 = bigDecimal2.byteValueExact();
        float float5 = bigDecimal2.floatValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
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
        java.math.BigInteger bigInteger19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger20 = bigInteger18.xor(bigInteger19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                     fr-FRDeutschland");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("x", "aauabuaeuafuakuamuanuaruasuavuayuazubaubeubgubhubiubmubnuboubrubsucauceuchucoucrucsucuucvucyudaudeudvudzueeueluenueouesuetueuufauffufiufjufoufrufyugaugduglugnuguugvuhauheuhiuhouhruhtuhuuhyuhzuiauiduieuiguiiuikuinuiouisuituiuuiwujaujiujvukaukgukiukjukkuklukmuknukoukruksukuukvukwukyulaulbulguliulnuloultuluulvumgumhumiumkumlumnumoumrumsumtumyunaunbunduneungunlunnunounrunvunyuocuojuomuoruosupaupiuplupsuptuquurmurnurouruurwusauscusduseusgusiuskuslusmusnusousqusrussustusuusvuswutauteutguthutiutkutlutnutoutrutsuttutwutyuuguukuuruuzuveuviuvouwauwouxhuyiuyouzauzhuzu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("GB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Chinese (China)", "                                         French (France)                                         ", (int) (byte) 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1.0E+2", 94, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx1.0E+2xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx1.0E+2xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.abs();
        java.lang.String str2 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.stripTrailingZeros();
        long long4 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(120);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal10 = bigDecimal9.plus();
        java.math.BigDecimal bigDecimal11 = bigDecimal6.multiply(bigDecimal10);
        java.math.BigDecimal bigDecimal12 = bigDecimal1.max(bigDecimal10);
        java.math.BigInteger bigInteger13 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal15 = bigDecimal1.movePointLeft(34);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal15);
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\uad6d\ubbfc\ud55c\ub300", "CHN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                      !hi!hi!hi!hi!hi!hi!hi!hi                                      ", (float) 99);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.0f + "'", float2 == 99.0f);
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\u671d\u9c9c\u6587\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u671d\u9c9c\u6587(");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u671d\u9c9c\u6587\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u671d\u9c9c\u6587(" + "'", str1, "\u671d\u9c9c\u6587\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u671d\u9c9c\u6587(");
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(117.0d, 320.0d, (double) 13);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 320.0d + "'", double3 == 320.0d);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = null;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale.setDefault(locale0);
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.lang.String str8 = bigDecimal5.toString();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(objArray13, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean18 = bigDecimal10.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal19 = bigDecimal5.max(bigDecimal10);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal23 = bigDecimal22.plus();
        java.math.BigDecimal bigDecimal24 = bigDecimal5.remainder(bigDecimal22);
        java.math.BigInteger bigInteger25 = bigDecimal5.toBigIntegerExact();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.valueOf(301L);
        java.math.BigDecimal bigDecimal29 = bigDecimal27.movePointLeft((int) (byte) -1);
        java.lang.String str30 = bigDecimal29.toEngineeringString();
        java.math.BigDecimal bigDecimal31 = bigDecimal5.add(bigDecimal29);
        boolean boolean32 = locale0.equals((java.lang.Object) bigDecimal31);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
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
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "3010" + "'", str30, "3010");
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (-4), "de-DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "UNDUNDUNDUNDUNDUNDUNDUNDUNDUND");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
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
        byte[] byteArray22 = bigInteger21.toByteArray();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger(byteArray24);
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger26);
        short short28 = bigInteger26.shortValueExact();
        int int29 = bigInteger26.bitLength();
        java.math.BigInteger[] bigIntegerArray30 = bigInteger21.divideAndRemainder(bigInteger26);
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(bigInteger26, (int) (short) 16);
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
        short short55 = bigInteger45.shortValueExact();
        boolean boolean57 = bigInteger45.testBit((int) (short) 0);
        int int58 = bigInteger45.bitCount();
        java.lang.String str60 = bigInteger45.toString((int) (short) 10);
        java.math.BigInteger bigInteger61 = bigInteger26.add(bigInteger45);
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal63 = bigDecimal62.negate();
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal67 = bigDecimal63.subtract(bigDecimal66);
        java.math.BigInteger bigInteger68 = bigDecimal67.toBigInteger();
        double double69 = bigInteger68.doubleValue();
        byte[] byteArray72 = new byte[] { (byte) 1 };
        byte byte73 = org.apache.commons.lang3.math.NumberUtils.min(byteArray72);
        java.math.BigInteger bigInteger74 = new java.math.BigInteger((int) (short) -1, byteArray72);
        java.math.BigInteger bigInteger75 = bigInteger68.gcd(bigInteger74);
        java.math.BigDecimal bigDecimal76 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal77 = bigDecimal76.negate();
        java.math.BigDecimal bigDecimal80 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal81 = bigDecimal77.subtract(bigDecimal80);
        java.math.BigInteger bigInteger82 = bigDecimal81.toBigInteger();
        java.math.BigInteger bigInteger83 = bigInteger74.or(bigInteger82);
        java.math.BigInteger bigInteger85 = bigInteger82.shiftRight((int) (short) -1);
        long long86 = bigInteger85.longValue();
        java.math.BigInteger bigInteger87 = bigInteger61.or(bigInteger85);
        java.lang.String str88 = bigInteger85.toString();
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 1 + "'", short28 == (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray30);
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
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) -1 + "'", short55 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-1" + "'", str60, "-1");
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1]");
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 1 + "'", byte73 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "0" + "'", str88, "0");
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
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
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal74 = bigDecimal73.abs();
        java.lang.String str75 = bigDecimal74.toPlainString();
        java.math.BigDecimal bigDecimal76 = bigDecimal74.stripTrailingZeros();
        java.math.BigDecimal bigDecimal78 = new java.math.BigDecimal((long) (short) 1);
        java.math.BigDecimal bigDecimal79 = bigDecimal76.remainder(bigDecimal78);
        java.math.BigInteger bigInteger80 = bigDecimal78.toBigInteger();
        boolean boolean81 = bigInteger72.equals((java.lang.Object) bigDecimal78);
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
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1" + "'", str75, "1");
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("UNITEDxSTATES", "chinois");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNITEDxSTATES" + "'", str3, "UNITEDxSTATES");
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("i!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!i!hi!hi!hi", (int) (byte) 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ", "EN-CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      " + "'", str2, "Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("z-CN");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("CAN", strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                      !hi!hi!hi!hi!hi!hi!hi!hi                                      ", (int) (short) -16960, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -16960");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "z-CN" + "'", str6, "z-CN");
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        int int4 = bigInteger3.signum();
        short short5 = bigInteger3.shortValueExact();
        java.math.BigInteger bigInteger7 = bigInteger3.flipBit((int) '4');
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigInteger bigInteger10 = bigDecimal8.toBigInteger();
        java.math.BigInteger bigInteger12 = bigInteger10.setBit(4);
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
        java.math.BigInteger bigInteger26 = bigInteger10.multiply(bigInteger25);
        java.math.BigInteger bigInteger27 = bigInteger3.remainder(bigInteger25);
        int int28 = bigInteger25.signum();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
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
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("dnu0E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+1", (int) (byte) 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u4e2d\u6587", 31, '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587###############" + "'", str3, "\u4e2d\u6587###############");
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.scaleByPowerOfTen(301);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        double double11 = bigDecimal10.doubleValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.movePointLeft((int) (byte) -1);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.stripTrailingZeros();
        int int16 = bigDecimal7.compareTo(bigDecimal13);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal18.subtract(bigDecimal21);
        java.math.BigInteger bigInteger23 = bigDecimal22.toBigInteger();
        byte[] byteArray24 = bigInteger23.toByteArray();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger23);
        java.math.BigDecimal bigDecimal26 = bigDecimal13.max(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = bigDecimal25.movePointLeft(3);
        java.math.BigDecimal bigDecimal30 = bigDecimal28.movePointRight((int) (byte) 34);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal30);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("", locale1);
        java.util.Locale.setDefault(locale1);
        java.lang.String str4 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str4, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("UNDUNDUNDUNDUNDUNDUNDUNDUNDUND");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"UND\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\ud55c\uad6d\uc5b4", "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: KR                               ???????????????????????????????????????????????????????????????????????????????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale locale6 = builder3.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "eng");
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = new java.math.BigInteger("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9) uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"u\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 5, (-2L), (long) (short) -2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5L + "'", long3 == 5L);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "JA", (java.lang.CharSequence) "Fran\347ais");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "JA" + "'", charSequence2, "JA");
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Vereinigtes K\366nigreich", "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("\u65e5\u672c\u8a9e", strArray5, strArray8);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "FR", (int) (short) 1);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("#", strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("United States", strArray5, strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)", strArray17);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str9, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United States" + "'", str16, "United States");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("FR-FR", "\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)", "-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-z-CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR-FR" + "'", str3, "FR-FR");
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2ETAT2-D)aeroK htuoS( naeroK", 'u');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("\u11af\u1175\u110b\u11a8\u1169\u1103\u1165\u110b\u11af\u1175\u110b\u11a8\u1169\u1103\u6587\u4e2d", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u11af\u1175\u110b\u11a8\u1169\u1103\u1165\u110b\u11af\u1175\u110b\u11a8\u1169\u1103\u6587\u4e2doS( naeroK" + "'", str4, "\u11af\u1175\u110b\u11a8\u1169\u1103\u1165\u110b\u11af\u1175\u110b\u11a8\u1169\u1103\u6587\u4e2doS( naeroK");
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("hi");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("chinois");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
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
        java.math.BigInteger bigInteger54 = bigInteger52.shiftRight((int) 'a');
        int int55 = bigInteger54.bitLength();
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
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal("\u82f1\u6587\u82f1", mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
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
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal35 = bigDecimal31.subtract(bigDecimal34);
        java.math.BigInteger bigInteger36 = bigDecimal35.toBigInteger();
        java.math.BigInteger bigInteger37 = bigInteger36.negate();
        java.math.BigInteger bigInteger38 = bigInteger29.multiply(bigInteger36);
        int int39 = bigInteger36.getLowestSetBit();
        long long40 = bigInteger36.longValue();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        byte byte44 = org.apache.commons.lang3.math.NumberUtils.min(byteArray43);
        java.math.BigInteger bigInteger45 = new java.math.BigInteger((int) (short) -1, byteArray43);
        java.math.BigInteger bigInteger47 = bigInteger45.pow((int) 'a');
        byte[] byteArray48 = bigInteger45.toByteArray();
        byte[] byteArray50 = new byte[] { (byte) 1 };
        byte byte51 = org.apache.commons.lang3.math.NumberUtils.min(byteArray50);
        java.math.BigInteger bigInteger52 = new java.math.BigInteger(byteArray50);
        int int53 = bigInteger52.signum();
        short short54 = bigInteger52.shortValueExact();
        java.math.BigInteger bigInteger56 = bigInteger52.flipBit((int) '4');
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal58 = bigDecimal57.negate();
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal62 = bigDecimal58.subtract(bigDecimal61);
        java.math.BigInteger bigInteger63 = bigDecimal62.toBigInteger();
        double double64 = bigInteger63.doubleValue();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        byte byte68 = org.apache.commons.lang3.math.NumberUtils.min(byteArray67);
        java.math.BigInteger bigInteger69 = new java.math.BigInteger((int) (short) -1, byteArray67);
        java.math.BigInteger bigInteger70 = bigInteger63.gcd(bigInteger69);
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal72 = bigDecimal71.negate();
        java.math.BigDecimal bigDecimal75 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal76 = bigDecimal72.subtract(bigDecimal75);
        java.math.BigInteger bigInteger77 = bigDecimal76.toBigInteger();
        java.math.BigInteger bigInteger78 = bigInteger69.or(bigInteger77);
        short short79 = bigInteger69.shortValueExact();
        int int80 = bigInteger69.getLowestSetBit();
        long long81 = bigInteger69.longValue();
        java.math.BigDecimal bigDecimal82 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal83 = bigDecimal82.negate();
        java.math.BigDecimal bigDecimal86 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal87 = bigDecimal83.subtract(bigDecimal86);
        java.math.BigInteger bigInteger88 = bigDecimal87.toBigInteger();
        java.math.BigInteger bigInteger89 = bigInteger88.negate();
        java.math.BigInteger bigInteger90 = bigInteger69.gcd(bigInteger88);
        java.math.BigInteger bigInteger91 = bigInteger56.xor(bigInteger90);
        long long92 = bigInteger90.longValue();
        java.math.BigInteger bigInteger93 = bigInteger45.add(bigInteger90);
        java.math.BigInteger bigInteger94 = bigInteger36.remainder(bigInteger45);
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
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1]");
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1]");
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 1 + "'", byte51 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 1 + "'", short54 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[1]");
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) 1 + "'", byte68 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) -1 + "'", short79 == (short) -1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertNotNull(bigDecimal83);
        org.junit.Assert.assertNotNull(bigDecimal86);
        org.junit.Assert.assertNotNull(bigDecimal87);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertNotNull(bigInteger94);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Eng                                                                                                                                                                                                                                                                                                          ", (int) (short) 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                     " + "'", str2, "                                                                                                                     ");
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Hindi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HINDI" + "'", str1, "HINDI");
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", (int) (short) 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("English");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "en_CA", 563, 99);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\u65e5\u672c\u8a9e                                                                                                                                                                                                                                                            ", "zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Taiwan", "                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Taiwan" + "'", str2, "Taiwan");
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        java.util.Locale locale2 = new java.util.Locale("aaaDeutschaaa", "0000");
        org.junit.Assert.assertEquals(locale2.toString(), "aaadeutschaaa_0000");
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
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
        java.math.BigInteger bigInteger48 = bigInteger45.shiftRight((int) (short) -1);
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
        java.math.BigInteger bigInteger72 = bigInteger69.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger73 = bigInteger48.max(bigInteger69);
        java.util.Random random75 = null;
        java.math.BigInteger bigInteger76 = new java.math.BigInteger((int) (short) 0, random75);
        java.math.BigInteger bigInteger77 = bigInteger69.gcd(bigInteger76);
        java.math.BigInteger bigInteger78 = bigInteger24.subtract(bigInteger69);
        byte[] byteArray81 = new byte[] { (byte) 1 };
        byte byte82 = org.apache.commons.lang3.math.NumberUtils.min(byteArray81);
        java.math.BigInteger bigInteger83 = new java.math.BigInteger((int) (short) -1, byteArray81);
        java.math.BigInteger bigInteger85 = bigInteger83.pow((int) 'a');
        java.math.BigInteger bigInteger87 = bigInteger83.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger89 = bigInteger87.flipBit(1);
        long long90 = bigInteger89.longValue();
        java.math.BigInteger bigInteger92 = bigInteger89.setBit((int) (byte) 1);
        java.math.BigInteger bigInteger93 = bigInteger24.gcd(bigInteger89);
        short short94 = bigInteger89.shortValueExact();
        short short95 = bigInteger89.shortValueExact();
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
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[1]");
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 1 + "'", byte82 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-4L) + "'", long90 == (-4L));
        org.junit.Assert.assertNotNull(bigInteger92);
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertTrue("'" + short94 + "' != '" + (short) -4 + "'", short94 == (short) -4);
        org.junit.Assert.assertTrue("'" + short95 + "' != '" + (short) -4 + "'", short95 == (short) -4);
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
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
        byte byte50 = bigInteger46.byteValueExact();
        byte[] byteArray53 = new byte[] { (byte) 1 };
        byte byte54 = org.apache.commons.lang3.math.NumberUtils.min(byteArray53);
        java.math.BigInteger bigInteger55 = new java.math.BigInteger((int) (short) -1, byteArray53);
        java.math.BigInteger bigInteger57 = bigInteger55.pow((int) 'a');
        java.math.BigInteger bigInteger59 = bigInteger55.shiftLeft((int) (short) 1);
        int int60 = bigInteger59.intValueExact();
        java.math.BigInteger bigInteger61 = bigInteger59.abs();
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal63 = bigDecimal62.negate();
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal67 = bigDecimal63.subtract(bigDecimal66);
        java.math.BigInteger bigInteger68 = bigDecimal67.toBigInteger();
        byte[] byteArray69 = bigInteger68.toByteArray();
        java.math.BigDecimal bigDecimal70 = new java.math.BigDecimal(bigInteger68);
        byte[] byteArray73 = new byte[] { (byte) 1 };
        byte byte74 = org.apache.commons.lang3.math.NumberUtils.min(byteArray73);
        java.math.BigInteger bigInteger75 = new java.math.BigInteger((int) (short) -1, byteArray73);
        java.math.BigInteger bigInteger77 = bigInteger75.pow((int) 'a');
        java.math.BigInteger bigInteger79 = bigInteger75.shiftLeft((int) (short) 1);
        int int80 = bigInteger79.intValueExact();
        java.math.BigInteger bigInteger81 = bigInteger79.abs();
        java.math.BigInteger bigInteger82 = bigInteger68.min(bigInteger79);
        java.math.BigInteger bigInteger83 = bigInteger59.xor(bigInteger79);
        java.math.BigInteger bigInteger84 = bigInteger46.andNot(bigInteger79);
        float float85 = bigInteger46.floatValue();
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
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) -2 + "'", byte50 == (byte) -2);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-2) + "'", int60 == (-2));
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[1]");
        org.junit.Assert.assertTrue("'" + byte74 + "' != '" + (byte) 1 + "'", byte74 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-2) + "'", int80 == (-2));
        org.junit.Assert.assertNotNull(bigInteger81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + (-2.0f) + "'", float85 == (-2.0f));
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger8 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger9 = bigInteger8.not();
        java.math.BigInteger bigInteger10 = bigInteger9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigInteger bigInteger17 = bigDecimal16.toBigInteger();
        double double18 = bigInteger17.doubleValue();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray21);
        java.math.BigInteger bigInteger23 = new java.math.BigInteger((int) (short) -1, byteArray21);
        java.math.BigInteger bigInteger24 = bigInteger17.gcd(bigInteger23);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal26.subtract(bigDecimal29);
        java.math.BigInteger bigInteger31 = bigDecimal30.toBigInteger();
        java.math.BigInteger bigInteger32 = bigInteger23.or(bigInteger31);
        short short33 = bigInteger23.shortValueExact();
        boolean boolean35 = bigInteger23.testBit((int) (short) 0);
        int int36 = bigInteger23.bitCount();
        java.lang.String str38 = bigInteger23.toString((int) (short) 10);
        short short39 = bigInteger23.shortValueExact();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal45 = bigDecimal41.subtract(bigDecimal44);
        java.math.BigInteger bigInteger46 = bigDecimal45.toBigInteger();
        java.math.BigInteger bigInteger47 = bigInteger46.negate();
        java.math.BigInteger bigInteger49 = bigInteger47.flipBit((int) (short) 0);
        byte byte50 = bigInteger49.byteValueExact();
        java.math.BigInteger[] bigIntegerArray51 = bigInteger23.divideAndRemainder(bigInteger49);
        long long52 = bigInteger23.longValue();
        java.math.BigInteger bigInteger54 = bigInteger23.setBit(32);
        java.math.BigInteger bigInteger55 = bigInteger23.not();
        java.math.BigInteger bigInteger56 = bigInteger9.andNot(bigInteger55);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) -1 + "'", short33 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1" + "'", str38, "-1");
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) -1 + "'", short39 == (short) -1);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 1 + "'", byte50 == (byte) 1);
        org.junit.Assert.assertNotNull(bigIntegerArray51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-cnzh-cn", (double) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=31.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
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
        byte[] byteArray22 = bigInteger21.toByteArray();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger(byteArray24);
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger26);
        short short28 = bigInteger26.shortValueExact();
        int int29 = bigInteger26.bitLength();
        java.math.BigInteger[] bigIntegerArray30 = bigInteger21.divideAndRemainder(bigInteger26);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigInteger bigInteger37 = bigDecimal36.toBigInteger();
        double double38 = bigInteger37.doubleValue();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger44 = bigInteger37.gcd(bigInteger43);
        java.math.BigInteger bigInteger45 = bigInteger26.andNot(bigInteger43);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        double double47 = bigDecimal46.doubleValue();
        java.math.BigInteger bigInteger48 = bigDecimal46.toBigInteger();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        byte[] byteArray56 = bigInteger53.toByteArray();
        long long57 = bigInteger53.longValueExact();
        java.math.BigInteger bigInteger58 = bigInteger48.or(bigInteger53);
        byte[] byteArray61 = new byte[] { (byte) 1 };
        byte byte62 = org.apache.commons.lang3.math.NumberUtils.min(byteArray61);
        java.math.BigInteger bigInteger63 = new java.math.BigInteger((int) (short) -1, byteArray61);
        java.math.BigInteger bigInteger65 = bigInteger63.pow((int) 'a');
        byte[] byteArray66 = bigInteger63.toByteArray();
        long long67 = bigInteger63.longValueExact();
        java.lang.String str69 = bigInteger63.toString(0);
        int int70 = bigInteger63.intValueExact();
        java.math.BigInteger bigInteger71 = bigInteger58.subtract(bigInteger63);
        java.math.BigInteger bigInteger72 = bigInteger26.add(bigInteger58);
        java.math.BigInteger bigInteger73 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger74 = bigInteger26.remainder(bigInteger73);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 1 + "'", short28 == (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1]");
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 1 + "'", byte62 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "-1" + "'", str69, "-1");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(bigInteger72);
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("UND", "\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UND" + "'", str2, "UND");
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
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
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.TEN;
        long long21 = bigDecimal20.longValueExact();
        java.math.BigDecimal bigDecimal22 = bigDecimal20.ulp();
        java.lang.String str23 = bigDecimal20.toString();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.TEN;
        long long25 = bigDecimal24.longValueExact();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        double double27 = bigDecimal26.doubleValue();
        java.math.BigDecimal bigDecimal29 = bigDecimal26.movePointLeft((int) (byte) -1);
        int int30 = bigDecimal29.intValue();
        java.math.BigDecimal bigDecimal31 = bigDecimal24.add(bigDecimal29);
        java.math.BigDecimal bigDecimal32 = bigDecimal20.add(bigDecimal31);
        java.math.BigDecimal bigDecimal33 = bigDecimal18.min(bigDecimal32);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal36 = bigDecimal34.negate();
        java.lang.String str37 = bigDecimal34.toString();
        java.math.BigDecimal bigDecimal39 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join(objArray42, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean47 = bigDecimal39.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal48 = bigDecimal34.max(bigDecimal39);
        java.math.BigDecimal bigDecimal49 = bigDecimal48.negate();
        int int50 = bigDecimal48.intValueExact();
        java.math.BigDecimal bigDecimal51 = bigDecimal48.abs();
        java.math.BigDecimal bigDecimal52 = bigDecimal51.negate();
        int int53 = bigDecimal18.compareTo(bigDecimal51);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0.00E+3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)" + "'", str1, "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        java.util.Locale locale4 = new java.util.Locale("englisch", "French (France)", "HI!HI!HI!HI");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("hin", locale4);
        java.util.Set<java.lang.Character> charSet6 = locale4.getExtensionKeys();
        org.junit.Assert.assertEquals(locale4.toString(), "englisch_FRENCH (FRANCE)_HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hin" + "'", str5, "hin");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
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
        java.math.BigDecimal bigDecimal36 = bigDecimal19.setScale(117);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal38 = bigDecimal37.negate();
        java.math.BigDecimal bigDecimal39 = bigDecimal38.abs();
        int int40 = bigDecimal38.intValueExact();
        java.math.BigInteger bigInteger41 = bigDecimal38.toBigInteger();
        java.math.BigDecimal bigDecimal42 = bigDecimal38.plus();
        long long43 = bigDecimal42.longValue();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal47 = bigDecimal46.plus();
        java.math.BigDecimal bigDecimal48 = bigDecimal47.negate();
        java.math.BigDecimal bigDecimal49 = bigDecimal42.remainder(bigDecimal47);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.valueOf((double) 300L);
        java.math.BigDecimal bigDecimal52 = bigDecimal49.add(bigDecimal51);
        java.math.RoundingMode roundingMode54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal55 = bigDecimal36.divide(bigDecimal51, (int) ' ', roundingMode54);
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
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
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
        int int23 = bigInteger12.getLowestSetBit();
        long long24 = bigInteger12.longValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.not();
        int int26 = bigInteger25.bitLength();
        java.math.BigInteger bigInteger27 = bigInteger25.not();
        byte byte28 = bigInteger25.byteValue();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 0 + "'", byte28 == (byte) 0);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder4 = builder2.setVariant("Korean");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("                    Deutschland");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                     Deutschland [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("uSA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("eng");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale locale11 = builder9.build();
        java.lang.String str12 = locale11.getDisplayCountry();
        java.util.Locale.Builder builder13 = builder6.setLocale(locale11);
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        java.util.Locale.setDefault(category14, locale17);
        java.util.Locale locale20 = new java.util.Locale("");
        java.lang.String str21 = locale20.getVariant();
        java.util.Locale.setDefault(category14, locale20);
        java.util.Locale locale25 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.util.Locale.setDefault(locale25);
        java.lang.String str27 = locale20.getDisplayLanguage(locale25);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clearExtensions();
        java.util.Locale locale31 = builder30.build();
        java.util.Locale.setDefault(category28, locale31);
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale33.getDisplayVariant(locale35);
        java.lang.String str37 = locale35.getDisplayCountry();
        java.util.Locale.setDefault(category28, locale35);
        java.util.Set<java.lang.String> strSet39 = locale35.getUnicodeLocaleKeys();
        java.lang.String str40 = locale20.getDisplayScript(locale35);
        java.util.Locale.Builder builder41 = builder13.setLocale(locale35);
        java.util.Locale.Builder builder43 = builder13.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder46 = builder13.setUnicodeLocaleKeyword("", "\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + category28 + "' != '" + java.util.Locale.Category.FORMAT + "'", category28.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "South Korea" + "'", str37, "South Korea");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf(117L, (int) 'a');
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger10 = bigInteger8.flipBit(1);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.lang.String str17 = bigInteger15.toString((int) (byte) 10);
        java.math.BigInteger bigInteger18 = bigInteger15.negate();
        java.math.BigInteger bigInteger19 = bigInteger8.min(bigInteger18);
        java.math.BigInteger bigInteger20 = bigInteger18.abs();
        java.lang.String str22 = bigInteger20.toString(0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u7f8e\u56fd\u7f8e\u56fd\u7f8e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (short) -2);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal7 = bigDecimal2.movePointRight((int) (short) 1);
        java.math.MathContext mathContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray9 = bigDecimal1.divideAndRemainder(bigDecimal7, mathContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal7);
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
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
        int int33 = bigInteger12.getLowestSetBit();
        boolean boolean35 = bigInteger12.isProbablePrime(1);
        int int36 = bigInteger12.bitCount();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal38 = bigDecimal37.negate();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal42 = bigDecimal38.subtract(bigDecimal41);
        java.math.BigInteger bigInteger43 = bigDecimal42.toBigInteger();
        double double44 = bigInteger43.doubleValue();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        byte byte48 = org.apache.commons.lang3.math.NumberUtils.min(byteArray47);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger((int) (short) -1, byteArray47);
        java.math.BigInteger bigInteger50 = bigInteger43.gcd(bigInteger49);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal52 = bigDecimal51.negate();
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal56 = bigDecimal52.subtract(bigDecimal55);
        java.math.BigInteger bigInteger57 = bigDecimal56.toBigInteger();
        java.math.BigInteger bigInteger58 = bigInteger49.or(bigInteger57);
        byte[] byteArray59 = bigInteger58.toByteArray();
        byte[] byteArray62 = new byte[] { (byte) 1 };
        byte byte63 = org.apache.commons.lang3.math.NumberUtils.min(byteArray62);
        java.math.BigInteger bigInteger64 = new java.math.BigInteger((int) (short) -1, byteArray62);
        boolean boolean65 = bigInteger58.equals((java.lang.Object) byteArray62);
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.ZERO;
        double double67 = bigDecimal66.doubleValue();
        java.math.BigInteger bigInteger68 = bigDecimal66.toBigInteger();
        byte[] byteArray71 = new byte[] { (byte) 1 };
        byte byte72 = org.apache.commons.lang3.math.NumberUtils.min(byteArray71);
        java.math.BigInteger bigInteger73 = new java.math.BigInteger((int) (short) -1, byteArray71);
        java.math.BigInteger bigInteger75 = bigInteger73.pow((int) 'a');
        byte[] byteArray76 = bigInteger73.toByteArray();
        long long77 = bigInteger73.longValueExact();
        java.math.BigInteger bigInteger78 = bigInteger68.or(bigInteger73);
        byte byte79 = bigInteger73.byteValueExact();
        boolean boolean81 = bigInteger73.testBit(100);
        byte[] byteArray84 = new byte[] { (byte) 1 };
        byte byte85 = org.apache.commons.lang3.math.NumberUtils.min(byteArray84);
        java.math.BigInteger bigInteger86 = new java.math.BigInteger((int) (short) -1, byteArray84);
        java.math.BigInteger bigInteger88 = bigInteger86.pow((int) 'a');
        java.math.BigInteger bigInteger90 = bigInteger86.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal91 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal92 = bigDecimal91.negate();
        java.math.BigDecimal bigDecimal93 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal94 = bigDecimal92.min(bigDecimal93);
        java.lang.String str95 = bigDecimal92.toPlainString();
        boolean boolean96 = bigInteger90.equals((java.lang.Object) bigDecimal92);
        java.math.BigInteger bigInteger97 = bigInteger73.divide(bigInteger90);
        java.math.BigInteger bigInteger98 = bigInteger58.andNot(bigInteger73);
        int int99 = bigInteger12.compareTo(bigInteger73);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1]");
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 1 + "'", byte48 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1]");
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 1 + "'", byte63 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1]");
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) 1 + "'", byte72 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) -1 + "'", byte79 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[1]");
        org.junit.Assert.assertTrue("'" + byte85 + "' != '" + (byte) 1 + "'", byte85 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigDecimal91);
        org.junit.Assert.assertNotNull(bigDecimal92);
        org.junit.Assert.assertNotNull(bigDecimal93);
        org.junit.Assert.assertNotNull(bigDecimal94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "0" + "'", str95, "0");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(bigInteger97);
        org.junit.Assert.assertNotNull(bigInteger98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
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
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList59, "zh-TW                                                                                            ");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
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
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
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
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
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
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf((long) 16);
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Canada", 16, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####Canada#####" + "'", str3, "#####Canada#####");
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        java.util.Locale locale1 = new java.util.Locale("SETATS DETINU");
        java.lang.String str2 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "setats detinu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder5 = builder1.removeUnicodeLocaleAttribute("CAN");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.setDefault(category7, locale10);
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getVariant();
        java.util.Locale.setDefault(category7, locale13);
        java.util.Locale locale16 = java.util.Locale.getDefault(category7);
        java.util.Locale locale17 = java.util.Locale.getDefault(category7);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder18.setLanguageTag("eng");
        java.util.Locale.Builder builder21 = builder20.clearExtensions();
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder23 = builder21.setLocale(locale22);
        java.util.Locale.Builder builder25 = builder23.addUnicodeLocaleAttribute("engcn");
        java.util.Locale locale26 = builder23.build();
        java.util.Locale locale27 = builder23.build();
        java.util.Locale.setDefault(category7, locale27);
        java.lang.String str29 = locale6.getDisplayName(locale27);
        java.util.Locale locale30 = java.util.Locale.PRC;
        java.util.Locale locale31 = null;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.lang.String str33 = locale30.getScript();
        java.lang.String str34 = locale30.getDisplayScript();
        boolean boolean35 = locale30.hasExtensions();
        java.lang.String str36 = locale27.getDisplayLanguage(locale30);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u6cd5\u6587" + "'", str36, "\u6cd5\u6587");
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -4, 101.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.0d) + "'", double3 == (-4.0d));
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', (double) 99L, (double) 2L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.0d + "'", double3 == 99.0d);
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("i!hi!hi!hi!hi!hi!hi!hi!h", (int) (short) -4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1 };
        java.math.BigInteger bigInteger4 = new java.math.BigInteger(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = new java.math.BigInteger(300, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid signum value");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        char[] charArray9 = new char[] { 'x', '#', '4', ' ', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinese", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u65e5\u672c\u8a9e", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) ", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "x#4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "x#4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[x, #, 4,  , a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", "############################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (-2));
        java.math.BigDecimal bigDecimal3 = bigDecimal1.movePointRight(0);
        java.math.BigInteger bigInteger4 = bigDecimal1.unscaledValue();
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        java.util.Locale locale3 = new java.util.Locale("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi", ")", "en-c");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ???????? (??????)hi");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi_)_en-c");
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hi", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hi" + "'", str2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hi");
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(101L, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = null;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getCountry();
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CN" + "'", str3, "CN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("RF-r", (short) 35);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 35 + "'", short2 == (short) 35);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\u7f8e\u56fd\u7f8e\u56fd\u7f8e\u56fd");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\uc77c\ub3c5\uc5b4\uc77c\ub3c5", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "e", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Cennese", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u65e5\u6587", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "France", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!h", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("ko_KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ko_KR [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger(99, 0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("fran\347ais");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fran\347ais" + "'", str1, "fran\347ais");
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "DNU");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "", (int) (short) -4, 301);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u56fd" + "'", str1, "\u4e2d\u56fd");
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale2.getDisplayVariant(locale4);
        java.lang.String str6 = locale2.getDisplayScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fra ", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("zh-CN", strMap4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("", locale10);
        java.util.Locale.setDefault(locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("", locale14);
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.upperCase("", locale25);
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale29.getVariant();
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = java.util.Locale.PRC;
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.lang.String str38 = locale37.getScript();
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale10, locale14, locale17, locale20, locale22, locale25, locale27, locale28, locale29, locale31, locale34, locale35, locale36, locale37, locale39 };
        java.util.ArrayList<java.util.Locale> localeList41 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList41, localeArray40);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList41, filteringMode43);
        java.util.Locale.FilteringMode filteringMode45 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList41, filteringMode45);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList41);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str21, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode43.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertTrue("'" + filteringMode45 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode45.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(localeList47);
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)UnitedxStates", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)UnitedxStates" + "'", str2, "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)UnitedxStates");
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                           ", "ja", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "FR", (int) (short) 1);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("#", strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("\u82f1\u6587\u82f1\u56fd", (java.lang.Object[]) strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("GBR", strArray7, strArray12);
        java.lang.String[] strArray15 = null;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("zh-cn", strArray12, strArray15);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("kor", "e", 301);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaHI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaa", strArray12, strArray20);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str13, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GBR" + "'", str14, "GBR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-cn" + "'", str16, "zh-cn");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "aaaaaaaaaaaaaaaaaaaaHI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaa" + "'", str21, "aaaaaaaaaaaaaaaaaaaaHI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("eNGLISCH (vEREINIGTES k\326NIGREICH)", "English (Canada)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("xxxxxxxxxxxxxxxxxxxxxxxxxxxen-ca", "", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("GB", "\ud504\ub791\uc2a4\uc5b4-1.0", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\ud504\ub791\uc2a4\uc5b4-1.0", "UNDUNDUNDUNDUNDUNDUNDUNDUNDUND");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(byteArray1);
        java.math.BigInteger bigInteger8 = bigInteger6.pow(3);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal14 = bigDecimal10.subtract(bigDecimal13);
        java.math.BigInteger bigInteger15 = bigDecimal14.toBigInteger();
        double double16 = bigInteger15.doubleValue();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray19);
        java.math.BigInteger bigInteger21 = new java.math.BigInteger((int) (short) -1, byteArray19);
        java.math.BigInteger bigInteger22 = bigInteger15.gcd(bigInteger21);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal28 = bigDecimal24.subtract(bigDecimal27);
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigInteger();
        java.math.BigInteger bigInteger30 = bigInteger21.or(bigInteger29);
        short short31 = bigInteger21.shortValueExact();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger38 = bigInteger36.pow((int) 'a');
        java.math.BigInteger bigInteger40 = bigInteger36.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger41 = bigInteger21.xor(bigInteger40);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.TEN;
        long long45 = bigDecimal44.longValueExact();
        java.math.BigDecimal bigDecimal46 = bigDecimal44.ulp();
        java.lang.String str47 = bigDecimal44.toString();
        int int48 = bigDecimal42.compareTo(bigDecimal44);
        java.math.BigInteger bigInteger49 = bigDecimal42.toBigInteger();
        java.math.BigInteger bigInteger50 = bigInteger41.gcd(bigInteger49);
        java.math.BigInteger bigInteger51 = bigInteger8.add(bigInteger49);
        java.math.BigInteger bigInteger53 = bigInteger8.flipBit((int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "10" + "'", str47, "10");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger53);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
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
        int int33 = bigInteger31.intValue();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal39 = bigDecimal35.subtract(bigDecimal38);
        java.math.BigInteger bigInteger40 = bigDecimal39.toBigInteger();
        double double41 = bigInteger40.doubleValue();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        byte byte45 = org.apache.commons.lang3.math.NumberUtils.min(byteArray44);
        java.math.BigInteger bigInteger46 = new java.math.BigInteger((int) (short) -1, byteArray44);
        java.math.BigInteger bigInteger47 = bigInteger40.gcd(bigInteger46);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal49 = bigDecimal48.negate();
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal53 = bigDecimal49.subtract(bigDecimal52);
        java.math.BigInteger bigInteger54 = bigDecimal53.toBigInteger();
        java.math.BigInteger bigInteger55 = bigInteger46.or(bigInteger54);
        short short56 = bigInteger46.shortValueExact();
        boolean boolean58 = bigInteger46.testBit((int) (short) 0);
        int int59 = bigInteger46.bitCount();
        java.math.BigInteger[] bigIntegerArray60 = bigInteger31.divideAndRemainder(bigInteger46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) bigIntegerArray60, ' ', 0, (int) (short) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 1 + "'", byte45 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) -1 + "'", short56 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(bigIntegerArray60);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.movePointLeft((int) (byte) -1);
        int int6 = bigDecimal5.intValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal0.add(bigDecimal5);
        java.math.BigDecimal bigDecimal8 = bigDecimal5.abs();
        java.math.BigInteger bigInteger9 = bigDecimal8.unscaledValue();
        java.math.BigInteger bigInteger10 = bigInteger9.not();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "ENG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("engcnengcnengcnengcnengcnengcnengcnengcnengcn-1UND0engcnengcnengcnengcnengcnengcnengcnengcnengcne", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("i!hi!hi!hi!hi!hiHI4!4HI4!4HI4!4HI4");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal21 = bigDecimal14.subtract(bigDecimal20);
        int int22 = bigDecimal20.intValue();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        byte[] byteArray30 = bigInteger27.toByteArray();
        long long31 = bigInteger27.longValueExact();
        java.lang.String str33 = bigInteger27.toString(0);
        int int34 = bigInteger27.intValueExact();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(bigInteger27);
        boolean boolean36 = bigDecimal20.equals((java.lang.Object) bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1.00E-98", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en_US", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (int) '4');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("eng", strArray3, strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eng" + "'", str9, "eng");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!", "HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = bigDecimal0.scaleByPowerOfTen(0);
        double double6 = bigDecimal5.doubleValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(120);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal5 = bigDecimal4.plus();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal5);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.TEN;
        long long8 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.ulp();
        java.lang.String str10 = bigDecimal7.toString();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        double double14 = bigDecimal13.doubleValue();
        java.math.BigDecimal bigDecimal16 = bigDecimal13.movePointLeft((int) (byte) -1);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal11.add(bigDecimal16);
        java.math.BigDecimal bigDecimal19 = bigDecimal7.add(bigDecimal18);
        java.math.BigDecimal bigDecimal21 = bigDecimal19.pow((int) '#');
        int int22 = bigDecimal1.compareTo(bigDecimal19);
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal((int) (short) -2);
        java.math.BigDecimal bigDecimal25 = bigDecimal24.plus();
        java.math.BigDecimal bigDecimal26 = bigDecimal19.min(bigDecimal24);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigIntegerExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.abs();
        java.math.MathContext mathContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal30 = bigDecimal26.negate(mathContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!", (int) (short) -4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        java.lang.String str12 = locale11.getISO3Language();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = locale8.getLanguage();
        java.util.Locale.Builder builder15 = builder7.setLocale(locale8);
        java.util.Locale locale16 = builder7.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jpn" + "'", str12, "jpn");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de" + "'", str14, "de");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
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
        java.math.BigDecimal bigDecimal15 = bigDecimal10.plus();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) 4);
        java.lang.String str18 = bigDecimal17.toEngineeringString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = bigDecimal10.divide(bigDecimal17, (int) (short) 16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4" + "'", str18, "4");
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
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
        java.math.BigInteger bigInteger49 = bigInteger6.abs();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger(byteArray51);
        java.math.BigDecimal bigDecimal54 = new java.math.BigDecimal(bigInteger53);
        short short55 = bigInteger53.shortValueExact();
        int int56 = bigInteger53.bitLength();
        java.math.BigInteger bigInteger57 = bigInteger6.mod(bigInteger53);
        java.math.BigInteger bigInteger59 = bigInteger53.clearBit((int) (byte) 10);
        float float60 = bigInteger53.floatValue();
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
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 1 + "'", short55 == (short) 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 1.0f + "'", float60 == 1.0f);
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587", locale1);
        java.lang.String str4 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United Kingdom)" + "'", str2, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587" + "'", str3, "\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en_GB" + "'", str4, "en_GB");
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\uc5b4\uad6d\ud55c", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\uc77c\ub3c5\uc5b4\uc77c\ub3c5", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "e", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Cennese", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -5, 299, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5) + "'", int3 == (-5));
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        char[] charArray14 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zho", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh-CN", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", charArray14);
        java.math.MathContext mathContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(charArray14, mathContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder10 = builder6.setLanguage("FR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder6.setVariant("kr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: kr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
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
        java.util.Set<java.lang.Character> charSet16 = locale13.getExtensionKeys();
        java.lang.String str17 = locale13.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "South Korea" + "'", str9, "South Korea");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str17, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H" + "'", str1, "HI!H");
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-ZH-CN", "hi!hi!hi!hi!hi!hchnhi!hi!hi!hi!hi!h", "0E-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-ZH-CN" + "'", str3, "2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-ZH-CN");
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.movePointLeft((int) (byte) -1);
        int int6 = bigDecimal5.intValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal0.add(bigDecimal5);
        int int8 = bigDecimal5.precision();
        java.math.BigDecimal bigDecimal10 = bigDecimal5.movePointRight(0);
        java.math.BigInteger bigInteger11 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal17 = bigDecimal13.subtract(bigDecimal16);
        java.math.BigInteger bigInteger18 = bigDecimal17.toBigInteger();
        java.math.BigDecimal bigDecimal19 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.scaleByPowerOfTen(301);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        double double23 = bigDecimal22.doubleValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal22.movePointLeft((int) (byte) -1);
        int int26 = bigDecimal25.intValue();
        java.math.BigDecimal bigDecimal27 = bigDecimal25.stripTrailingZeros();
        int int28 = bigDecimal19.compareTo(bigDecimal25);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        byte[] byteArray36 = bigInteger35.toByteArray();
        java.math.BigDecimal bigDecimal37 = new java.math.BigDecimal(bigInteger35);
        java.math.BigDecimal bigDecimal38 = bigDecimal25.max(bigDecimal37);
        byte byte39 = bigDecimal38.byteValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal38.setScale(2, 2);
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf(10L);
        long long45 = bigDecimal44.longValueExact();
        int int46 = bigDecimal44.precision();
        java.math.BigDecimal bigDecimal47 = bigDecimal42.divideToIntegralValue(bigDecimal44);
        java.math.RoundingMode roundingMode48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal49 = bigDecimal5.divide(bigDecimal42, roundingMode48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(bigDecimal47);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\uc601\uc5b4\uc601\uad6d)", "       ", 116);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu", "zh-TW");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("           AJ           AJ", (short) -33);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -33 + "'", short2 == (short) -33);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hi");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=120.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
