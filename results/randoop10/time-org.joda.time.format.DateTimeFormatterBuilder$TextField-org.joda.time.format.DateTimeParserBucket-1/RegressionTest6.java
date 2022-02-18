import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.util.Locale locale2 = new java.util.Locale("24", "Cina");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.getID();
        long long9 = dateTimeZone4.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone4.getOffset(readableInstant10);
        java.util.Locale locale15 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str16 = dateTimeZone4.getName((long) 'a', locale15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(100L, chronology19, locale22);
        java.lang.String str26 = locale22.getScript();
        java.util.Set<java.lang.String> strSet27 = locale22.getUnicodeLocaleKeys();
        java.lang.String str28 = locale22.getDisplayCountry();
        java.lang.String str29 = dateTimeZone4.getName(11L, locale22);
        java.util.Locale.setDefault(locale22);
        java.lang.String str31 = locale2.getDisplayVariant(locale22);
        java.lang.String str32 = locale22.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "24_CINA");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals(locale15.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strSet27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.util.Locale locale1 = new java.util.Locale("DateTimeField[yearOfEra]");
        org.junit.Assert.assertEquals(locale1.toString(), "datetimefield[yearofera]");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.setRegion("ko");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.setExtension('x', "French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setRegion("Thu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Thu [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket7.saveField(dateTimeField12, 5207);
        int int15 = dateTimeParserBucket7.getOffset();
        java.lang.Integer int16 = dateTimeParserBucket7.getOffsetInteger();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setLanguage("ITA");
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "FRA");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale11.getISO3Country();
        java.util.Locale.Builder builder14 = builder8.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder8.addUnicodeLocaleAttribute("360000000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 360000000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale locale13 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder9.setUnicodeLocaleKeyword("7199", "java.io.IOException: ita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 7199 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italian");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 97L);
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) 10);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 'u');
        long long10 = dateTimeZone1.convertUTCToLocal(6652800128L);
        long long13 = dateTimeZone1.adjustOffset(2922779L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 6652800128L + "'", long10 == 6652800128L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2922779L + "'", long13 == 2922779L);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("59");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=59");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("+01:00", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+01:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.io.IOException iOException1 = new java.io.IOException("Italian");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.util.Locale locale2 = new java.util.Locale("50", "");
        org.junit.Assert.assertEquals(locale2.toString(), "50");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone5.getOffset(readableInstant8);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology12, locale13, (java.lang.Integer) 100);
        java.lang.String str16 = dateTimeZone5.getShortName(10L, locale13);
        java.util.Locale.Builder builder17 = builder0.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setLanguageTag("3");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 3 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 0);
        int int11 = dateTimeZone1.getStandardOffset((long) 8);
        long long14 = dateTimeZone1.convertLocalToUTC(259200000L, true);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str19 = dateTimeZone18.getID();
        long long23 = dateTimeZone18.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone18.getOffset(readableInstant24);
        java.util.Locale locale29 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str30 = dateTimeZone18.getName((long) 'a', locale29);
        java.lang.String str31 = locale29.getDisplayCountry();
        java.lang.String str32 = dateTimeZone1.getName((-262800000L), locale29);
        boolean boolean34 = dateTimeZone1.isStandardOffset((long) 999);
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone1.getOffset(readableInstant35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 259200000L + "'", long14 == 259200000L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 53L + "'", long23 == 53L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals(locale29.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "X-LVARIANT-0" + "'", str31, "X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException2);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("jpn");
        java.io.IOException iOException13 = new java.io.IOException("UTC");
        java.io.IOException iOException15 = new java.io.IOException("zho");
        iOException13.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException("2", (java.lang.Throwable) iOException13);
        iOException10.addSuppressed((java.lang.Throwable) iOException17);
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.String str20 = iOException10.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.io.IOException: jpn" + "'", str20, "java.io.IOException: jpn");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.setRegion("ko");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setScript("DateTimeField[millisOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: DateTimeField[millisOfDay] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "germany" + "'", str3, "germany");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "germany" + "'", str7, "germany");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "weekOfWeekyear" + "'", str1, "weekOfWeekyear");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str2 = locale0.getUnicodeLocaleType("35");
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.util.Set<java.lang.Character> charSet5 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(8831);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.centuryOfEra();
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("FR");
        int int17 = dateTimeField14.getMaximumShortTextLength(locale16);
        java.lang.String str18 = locale16.getISO3Language();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fra" + "'", str18, "fra");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.io.IOException iOException3 = new java.io.IOException("UTC");
        java.io.IOException iOException5 = new java.io.IOException("zho");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException("Thu", (java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("java.io.IOException: +01:00", (java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        long long14 = dateTimeZone1.convertLocalToUTC(60220800000L, true);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone1.getOffset(readableInstant17);
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        java.lang.String str20 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60220800000L + "'", long14 == 60220800000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("French");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.Object obj8 = dateTimeParserBucket7.saveState();
        long long11 = dateTimeParserBucket7.computeMillis(true, "\u82f1\u6587\u7f8e\u56fd)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.util.Locale locale2 = new java.util.Locale("java.io.IOException: ita", "java.io.IOException: java.io.IOException: DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertEquals(locale2.toString(), "java.io.ioexception: ita_JAVA.IO.IOEXCEPTION: JAVA.IO.IOEXCEPTION: DATETIMEFIELD[WEEKOFWEEKYEAR]");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.io.IOException iOException1 = new java.io.IOException("clockhourOfDay");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.lang.String str3 = dateTimeZone1.getNameKey(7200008L);
        boolean boolean5 = dateTimeZone1.isStandardOffset(259200067L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getStandardOffset((long) (byte) -1);
        java.lang.String str20 = dateTimeZone17.toString();
        java.lang.String str22 = dateTimeZone17.getShortName((long) '#');
        long long24 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone9.isLocalDateTimeGap(localDateTime25);
        int int28 = dateTimeZone9.getStandardOffset((long) 86399);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone9.getOffset(readableInstant29);
        boolean boolean32 = dateTimeZone9.isStandardOffset((-527534207999947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("11");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable throwable9 = null;
        java.io.IOException iOException10 = new java.io.IOException("UTC", throwable9);
        java.io.IOException iOException11 = new java.io.IOException(throwable9);
        java.io.IOException iOException12 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException12.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("cinese", (java.lang.Throwable) iOException12);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException12);
        iOException4.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException("\uc11c\uae30", (java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        java.io.IOException iOException21 = new java.io.IOException("java.io.ioexception: zho");
        java.io.IOException iOException22 = new java.io.IOException("CHN", (java.lang.Throwable) iOException21);
        iOException18.addSuppressed((java.lang.Throwable) iOException21);
        java.io.IOException iOException25 = new java.io.IOException("java.io.ioexception: zho");
        iOException21.addSuppressed((java.lang.Throwable) iOException25);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'weekOfWeekyear' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("zho");
        java.util.Locale locale9 = builder3.build();
        java.util.Locale.Builder builder11 = builder3.setLanguageTag("utc");
        java.util.Locale.Builder builder12 = builder3.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "utc");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zho");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setExtension('4', "fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap8);
        java.util.Locale locale12 = new java.util.Locale("hi!", "ISOChronology[UTC]");
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(100L, chronology14, locale17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        java.lang.String str30 = locale23.getDisplayScript(locale27);
        java.lang.String str31 = locale23.getISO3Language();
        dateTimeParserBucket20.saveField(dateTimeFieldType21, "DateTimeField[dayOfYear]", locale23);
        java.lang.String str33 = locale12.getDisplayName(locale23);
        java.util.Set<java.lang.String> strSet34 = locale23.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strSet34);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!_ISOCHRONOLOGY[UTC]");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zho" + "'", str31, "zho");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! (ISOCHRONOLOGY[UTC])" + "'", str33, "hi! (ISOCHRONOLOGY[UTC])");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str1, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229" + "'", str2, "\u610f\u5927\u5229");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("5");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale2.getDisplayScript();
        java.lang.String str5 = locale2.getISO3Country();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("5131");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=5131");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u6587 (1439)", (double) (-1860000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1860000.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable throwable9 = null;
        java.io.IOException iOException10 = new java.io.IOException("UTC", throwable9);
        java.io.IOException iOException11 = new java.io.IOException(throwable9);
        java.io.IOException iOException12 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException12.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("cinese", (java.lang.Throwable) iOException12);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException12);
        iOException4.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException("+100:05", (java.lang.Throwable) iOException4);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 100);
        java.lang.String str12 = locale5.getDisplayScript(locale9);
        java.lang.String str13 = locale5.getVariant();
        java.util.Locale.Builder builder14 = builder3.setLocale(locale5);
        java.util.Locale.Builder builder15 = builder14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setVariant("34");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 34 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        long long11 = dateTimeField9.roundCeiling((-1860061L));
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeField9.set((-2850284851200010L), "centuryOfEra");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuryOfEra\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1860000L) + "'", long11 == (-1860000L));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) ' ');
        int int4 = dateTimeZone2.getStandardOffset(27460800000L);
        long long6 = dateTimeZone2.previousTransition(840052L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 361920000 + "'", int4 == 361920000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 840052L + "'", long6 == 840052L);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("USA", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        long long8 = dateTimeZone1.nextTransition(32054400100L);
        long long10 = dateTimeZone1.convertUTCToLocal((-604799903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32054400100L + "'", long8 == 32054400100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-604799903L) + "'", long10 == (-604799903L));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setLanguageTag("datetimefield[secondofday]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: datetimefield[secondofday] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(100L, chronology3, locale6);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeParserBucket9);
        java.lang.Object obj11 = dateTimeParserBucket9.saveState();
        java.util.Locale locale12 = dateTimeParserBucket9.getLocale();
        java.lang.Integer int13 = dateTimeParserBucket9.getPivotYear();
        java.lang.Integer int14 = dateTimeParserBucket9.getOffsetInteger();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(200, 13);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.removeUnicodeLocaleAttribute("54");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 54 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.io.IOException iOException1 = new java.io.IOException("79200_JAVA.IO.IOEXCEPTION: ZHO");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable throwable6 = null;
        java.io.IOException iOException7 = new java.io.IOException("UTC", throwable6);
        java.io.IOException iOException8 = new java.io.IOException(throwable6);
        java.io.IOException iOException9 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("cinese", (java.lang.Throwable) iOException9);
        iOException2.addSuppressed((java.lang.Throwable) iOException9);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.util.Locale locale1 = new java.util.Locale("Etats-Unis");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "etats-unis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "etats-unis" + "'", str2, "etats-unis");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("DateTimeField[yearOfCentury]", (java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException();
        java.io.IOException iOException10 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        iOException7.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("germany");
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException14);
        iOException10.addSuppressed((java.lang.Throwable) iOException16);
        java.lang.String str18 = iOException16.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.io.IOException: java.io.IOException: germany" + "'", str18, "java.io.IOException: java.io.IOException: germany");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("fr-CA");
        java.util.Locale locale5 = builder2.build();
        java.lang.String str6 = locale5.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale5.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr-CA" + "'", str6, "fr-CA");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str8 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 14);
        java.lang.String str3 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:14" + "'", str3, "-01:14");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("107", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=107");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("UTC", throwable2);
        java.io.IOException iOException4 = new java.io.IOException(throwable2);
        java.io.IOException iOException5 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.util.Locale locale1 = new java.util.Locale("yearOfCentury");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getDisplayName(locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "yearofcentury");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("era");
        java.util.Locale.Builder builder9 = builder5.setLanguageTag("CN");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (byte) -1);
        java.lang.String str11 = dateTimeZone7.getName(32054400100L);
        dateTimeParserBucket4.setZone(dateTimeZone7);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        int int15 = dateTimeParserBucket4.getOffset();
        long long16 = dateTimeParserBucket4.computeMillis();
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("3600000");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setScript("ITALIA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ITALIA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JPN");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.Object obj5 = null;
        boolean boolean6 = languageRange1.equals(obj5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jpn" + "'", str4, "jpn");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.util.Locale locale3 = new java.util.Locale("-101", "eng", "4492738");
        org.junit.Assert.assertEquals(locale3.toString(), "-101_ENG_4492738");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.util.Locale locale2 = new java.util.Locale("5100", "\u5927\u97d3\u6c11\u56fd");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale2.getDisplayScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u5927\u97d3\u6c11\u56fd");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(11);
        java.lang.String str2 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.011" + "'", str2, "+00:00:00.011");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str5 = dateTimeZone1.getName(32054400100L);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) 13);
        java.lang.String str9 = dateTimeZone1.getNameKey((long) 366);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(70, (-6011));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -6011");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 1);
        long long4 = dateTimeZone2.nextTransition(470198649686399L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 470198649686399L + "'", long4 == 470198649686399L);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.util.Locale locale1 = new java.util.Locale("5131");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "5131");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder7.setLanguageTag("ita");
        java.util.Locale.Builder builder13 = builder7.setRegion("");
        java.util.Locale locale14 = builder7.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ita");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("datetimefield[yearofcentury]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'datetimefield[yearofcentury]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("69");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=69");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.util.Locale locale3 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean4 = locale3.hasExtensions();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 100);
        java.lang.String str10 = locale3.getDisplayCountry(locale7);
        java.util.Locale locale11 = locale7.stripExtensions();
        java.lang.String str12 = locale11.getVariant();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getName(259200107L);
        long long16 = dateTimeZone10.convertLocalToUTC(70000L, false, 259200100L);
        boolean boolean18 = dateTimeZone10.isStandardOffset(11L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone10.getOffset(readableInstant19);
        int int22 = dateTimeZone10.getOffsetFromLocal(5207L);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone10.isLocalDateTimeGap(localDateTime23);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 70000L + "'", long16 == 70000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.util.Locale locale1 = new java.util.Locale("ko-kr");
        org.junit.Assert.assertEquals(locale1.toString(), "ko-kr");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.util.Locale locale3 = new java.util.Locale("java.io.IOException: 35", "29", "\u30a4\u30bf\u30ea\u30a2");
        java.lang.String str4 = locale3.toLanguageTag();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u30a4\u30bf\u30ea\u30a2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap6);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        java.lang.String str11 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet10);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u30a4\u30bf\u30ea\u30a2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '????' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(5207);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setLanguage("ITA");
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "FRA");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale11.getISO3Country();
        java.util.Locale.Builder builder14 = builder8.setLocale(locale11);
        java.util.Locale.Builder builder15 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder8.setVariant("java.io.IOException: 1497");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: java.io.IOException: 1497 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.util.Locale locale2 = new java.util.Locale("4969628", "\u5341\u4e8c\u6708");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u5341\u4e8c\u6708");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.util.Locale locale3 = new java.util.Locale("\u52a0\u62ff\u5927", "18000000", "");
        org.junit.Assert.assertEquals(locale3.toString(), "\u52a0\u62ff\u5927_18000000");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("+00:01:26.399");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+00:01:26.399");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getStandardOffset(107L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.io.IOException iOException2 = new java.io.IOException("\u5fb7\u56fd");
        java.io.IOException iOException3 = new java.io.IOException("und", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("jpn");
        java.io.IOException iOException9 = new java.io.IOException("UTC");
        java.io.IOException iOException11 = new java.io.IOException("zho");
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("2", (java.lang.Throwable) iOException9);
        iOException6.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException18 = new java.io.IOException("UTC");
        java.io.IOException iOException20 = new java.io.IOException("zho");
        iOException18.addSuppressed((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.io.IOException iOException23 = new java.io.IOException("Thu", (java.lang.Throwable) iOException22);
        iOException15.addSuppressed((java.lang.Throwable) iOException23);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) iOException15);
        iOException3.addSuppressed((java.lang.Throwable) iOException25);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.Locale locale12 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str13 = dateTimeZone1.getName((long) 'a', locale12);
        long long16 = dateTimeZone1.convertLocalToUTC(2937600087L, false);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        java.lang.String str20 = dateTimeZone1.getName(63604353610000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2937600087L + "'", long16 == 2937600087L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str15 = locale8.getExtension('u');
        java.util.Set<java.lang.Character> charSet16 = locale8.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germania" + "'", str2, "Germania");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(charSet16);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.String str17 = locale10.getDisplayScript(locale14);
        java.lang.String str18 = locale10.getISO3Language();
        dateTimeParserBucket7.saveField(dateTimeFieldType8, "DateTimeField[dayOfYear]", locale10);
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 2);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket7.getZone();
        java.lang.String str24 = dateTimeZone22.getName(28425599999L);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (-345600052L));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-345600052L) + "'", long27 == (-345600052L));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 100);
        long long7 = dateTimeZone1.convertLocalToUTC(179566L, true);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology10, locale12, (java.lang.Integer) 1, 0);
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.lang.String str17 = locale12.getDisplayName(locale16);
        java.util.Locale locale21 = new java.util.Locale("ko-KR", "32", "");
        java.lang.String str22 = locale16.getDisplayLanguage(locale21);
        java.lang.String str23 = locale16.getDisplayName();
        java.lang.String str24 = dateTimeZone1.getName(124416000000000L, locale16);
        int int26 = dateTimeZone1.getStandardOffset(3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 179556L + "'", long7 == 179556L);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale21.toString(), "ko-kr_32");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "English" + "'", str22, "English");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "inglese" + "'", str23, "inglese");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.010" + "'", str24, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.Object obj8 = dateTimeParserBucket7.saveState();
        dateTimeParserBucket7.setOffset((int) (short) 100);
        long long11 = dateTimeParserBucket7.computeMillis();
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 5);
        long long16 = dateTimeParserBucket7.computeMillis(true, "Chinesisch");
        java.util.Locale locale17 = dateTimeParserBucket7.getLocale();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket7.getZone();
        java.lang.String str20 = dateTimeZone18.getShortName(338765L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("-9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: -9 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("-525593976", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-525593976");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (-33000000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -33000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        java.lang.Integer int6 = dateTimeParserBucket4.getOffsetInteger();
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ita");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.util.Locale locale3 = new java.util.Locale("\u4e00\u6708", "italian", "+00:00:00.032");
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e00\u6708_ITALIAN_+00:00:00.032");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.util.Locale locale1 = new java.util.Locale("\u610f\u5927\u5229\u6587");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str2, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.Locale locale12 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str13 = dateTimeZone1.getName((long) 'a', locale12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(100L, chronology16, locale19);
        java.lang.String str23 = locale19.getScript();
        java.util.Set<java.lang.String> strSet24 = locale19.getUnicodeLocaleKeys();
        java.lang.String str25 = locale19.getDisplayCountry();
        java.lang.String str26 = dateTimeZone1.getName(11L, locale19);
        java.util.Locale locale27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = locale19.getDisplayName(locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.io.IOException iOException2 = new java.io.IOException("germany");
        java.io.IOException iOException4 = new java.io.IOException("DateTimeField[weekOfWeekyear]");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("francese", (java.lang.Throwable) iOException2);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.util.Locale locale2 = new java.util.Locale("", "\u65e5\u6587");
        java.lang.String str3 = locale2.getScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2073600695);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.util.Locale locale3 = new java.util.Locale("ko-KR", "32", "");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.getID();
        long long11 = dateTimeZone6.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone6.getOffset(readableInstant12);
        java.util.Locale locale17 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str18 = dateTimeZone6.getName((long) 'a', locale17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology23, locale24, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(100L, chronology21, locale24);
        java.lang.String str28 = locale24.getScript();
        java.util.Set<java.lang.String> strSet29 = locale24.getUnicodeLocaleKeys();
        java.lang.String str30 = locale24.getDisplayCountry();
        java.lang.String str31 = dateTimeZone6.getName(11L, locale24);
        java.lang.String str32 = locale3.getDisplayLanguage(locale24);
        java.lang.String str33 = locale24.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "ko-kr_32");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32" + "'", str4, "32");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 53L + "'", long11 == 53L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals(locale17.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strSet29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ko-kr" + "'", str32, "ko-kr");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("168 (DATETIMEFIELD[MILLISOFDAY],dayOfYear)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '168 (DATETIMEFIELD[MILLISOFDAY],dayOfYear)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DateTimeField[weekOfWeekyear]");
        java.util.Locale.setDefault(locale1);
        boolean boolean3 = locale1.hasExtensions();
        java.lang.String str4 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=centuryofera");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.io.IOException iOException1 = new java.io.IOException("ita");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: java.io.IOException: ita" + "'", str4, "java.io.IOException: java.io.IOException: ita");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("20");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.util.Locale locale2 = new java.util.Locale("Thu", "Italia");
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "thu_ITALIA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder4.build();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale9 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology7, locale9, (java.lang.Integer) 1, 0);
        java.lang.String str13 = locale5.getDisplayVariant(locale9);
        java.lang.String str14 = locale2.getDisplayLanguage(locale9);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 12);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder19.clearExtensions();
        java.util.Locale.Builder builder23 = builder20.setExtension('a', "");
        java.util.Locale.Builder builder25 = builder20.setLanguageTag("eng");
        java.util.Locale.Builder builder26 = builder20.clearExtensions();
        java.util.Locale.Builder builder27 = builder20.clear();
        java.util.Locale locale28 = builder20.build();
        java.lang.String str29 = dateTimeZone17.getName(98L, locale28);
        java.lang.String str30 = locale9.getDisplayName(locale28);
        java.lang.String str31 = locale28.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+05:12" + "'", str29, "+05:12");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("99");
        java.util.Locale locale4 = locale3.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 365, chronology1, locale4, (java.lang.Integer) (-1562400000));
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology11, locale12, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(100L, chronology9, locale12);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket15.getZone();
        long long19 = dateTimeParserBucket15.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        int int20 = dateTimeParserBucket15.getOffset();
        java.util.Locale locale21 = dateTimeParserBucket15.getLocale();
        org.joda.time.Chronology chronology22 = dateTimeParserBucket15.getChronology();
        boolean boolean23 = dateTimeFieldType7.isSupported(chronology22);
        dateTimeParserBucket6.saveField(dateTimeFieldType7, (int) 'u');
        dateTimeParserBucket6.setOffset(360000000);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        int int31 = dateTimeParserBucket30.getOffset();
        java.lang.Object obj32 = dateTimeParserBucket30.saveState();
        java.util.Locale locale33 = dateTimeParserBucket30.getLocale();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        java.util.Locale.Builder builder35 = builder22.setLocale(locale34);
        java.util.Locale.Builder builder36 = builder22.clearExtensions();
        java.util.Locale.Builder builder37 = builder36.clearExtensions();
        java.util.Locale locale38 = builder37.build();
        java.util.Locale.Builder builder41 = builder37.setExtension('x', "2008");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder43 = builder37.setScript("java.io.IOException: en-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: java.io.IOException: en-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.io.IOException iOException1 = new java.io.IOException("dayofyear");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException("UTC", throwable7);
        java.io.IOException iOException9 = new java.io.IOException(throwable7);
        java.io.IOException iOException10 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("-292275054", (java.lang.Throwable) iOException10);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException10);
        iOException3.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException20 = new java.io.IOException("");
        java.io.IOException iOException21 = new java.io.IOException("USA", (java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException("-1", (java.lang.Throwable) iOException20);
        java.lang.Throwable[] throwableArray23 = iOException20.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException20);
        iOException3.addSuppressed((java.lang.Throwable) iOException20);
        java.lang.String str26 = iOException3.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.io.IOException: java.io.IOException: dayofyear" + "'", str26, "java.io.IOException: java.io.IOException: dayofyear");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology3, locale5, (java.lang.Integer) 1, 0);
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale5.getDisplayName(locale9);
        java.util.Set<java.lang.String> strSet11 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale0.getDisplayCountry(locale5);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder17 = builder14.setExtension('a', "");
        java.util.Locale.Builder builder19 = builder14.setLanguage("ita");
        java.util.Locale locale20 = builder19.build();
        boolean boolean21 = locale20.hasExtensions();
        java.lang.String str22 = locale0.getDisplayLanguage(locale20);
        java.lang.String str23 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ita");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "it" + "'", str23, "it");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale2, (java.lang.Integer) (-1), 0);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getScript();
        boolean boolean9 = dateTimeParserBucket5.restoreState((java.lang.Object) locale6);
        java.lang.String str10 = locale6.getVariant();
        java.util.Set<java.lang.Character> charSet11 = locale6.getExtensionKeys();
        java.lang.String str12 = locale6.getDisplayScript();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder12 = builder7.setExtension('x', "99");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setLanguageTag("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: minuteOfHour [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 100);
        java.lang.String str12 = locale5.getDisplayScript(locale9);
        java.lang.String str13 = locale5.getVariant();
        java.util.Locale.Builder builder14 = builder3.setLocale(locale5);
        java.util.Locale.Builder builder15 = builder14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setRegion("4492738");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 4492738 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "year" + "'", str1, "year");
        org.junit.Assert.assertNull(durationFieldType2);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        dateTimeParserBucket4.setZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getShortName(18748800052L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone8.getOffset(readableInstant12);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone8.isLocalDateTimeGap(localDateTime14);
        int int17 = dateTimeZone8.getOffsetFromLocal((-356399998L));
        long long20 = dateTimeZone8.convertLocalToUTC(265L, false);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ita");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 360000000 + "'", int17 == 360000000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-359999735L) + "'", long20 == (-359999735L));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("cinese (Cina)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str13 = dateTimeZone1.getNameKey(18748800052L);
        boolean boolean15 = dateTimeZone1.isStandardOffset((long) (short) 100);
        long long18 = dateTimeZone1.convertLocalToUTC(90L, false);
        long long20 = dateTimeZone1.nextTransition(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 90L + "'", long18 == 90L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("japonais", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale6.getDisplayLanguage();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology12, locale13, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(100L, chronology10, locale13);
        java.lang.String str17 = locale13.getScript();
        java.util.Set<java.lang.String> strSet18 = locale13.getUnicodeLocaleKeys();
        java.lang.String str19 = locale13.getDisplayCountry();
        java.lang.String str20 = locale6.getDisplayScript(locale13);
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale23 = new java.util.Locale("Italia");
        java.util.Locale.setDefault(category0, locale23);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str7, "\u4e2d\u6587\u4e2d\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale23.toString(), "italia");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.setDefault(locale4);
        java.lang.String str6 = locale4.getLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.io.IOException iOException1 = new java.io.IOException("1971");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        long long7 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 28166400000L);
        boolean boolean8 = dateTimeZone4.isFixed();
        java.lang.String str10 = dateTimeZone4.getName(102816006301L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone4.getOffset(readableInstant11);
        java.lang.String str13 = dateTimeZone4.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28166400000L + "'", long7 == 28166400000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getNameKey((long) (-434));
        long long7 = dateTimeZone1.adjustOffset((long) 3600000, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(86399);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((-345600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01:26.399" + "'", str2, "+00:01:26.399");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("3", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("italy", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.util.Locale locale3 = new java.util.Locale("X-LVARIANT-0", "UTC", "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        java.lang.String str4 = locale3.getDisplayCountry();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.io.IOException iOException1 = new java.io.IOException("\u7f8e\u56fd");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getISO3Language();
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale4.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = locale2.getDisplayVariant(locale7);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        java.lang.String str18 = locale11.getDisplayScript(locale15);
        java.lang.String str19 = locale15.getDisplayScript();
        java.lang.String str20 = locale15.getISO3Country();
        java.lang.String str21 = locale15.getScript();
        java.lang.String str22 = locale2.getDisplayScript(locale15);
        java.util.Set<java.lang.Character> charSet23 = locale2.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charSet23);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.util.Locale locale2 = new java.util.Locale("5100", "\u5927\u97d3\u6c11\u56fd");
        java.util.Locale.setDefault(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u5927\u97d3\u6c11\u56fd");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("year");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getISO3Country();
        java.lang.String str7 = locale3.getExtension('x');
        java.lang.String str8 = locale3.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "year");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "year" + "'", str4, "year");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.util.Locale locale2 = new java.util.Locale("1497", "FR");
        org.junit.Assert.assertEquals(locale2.toString(), "1497_FR");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        int int31 = dateTimeParserBucket30.getOffset();
        java.lang.Object obj32 = dateTimeParserBucket30.saveState();
        java.util.Locale locale33 = dateTimeParserBucket30.getLocale();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        java.util.Locale.Builder builder35 = null; // flaky: builder22.setLocale(locale34);
        java.util.Locale.Builder builder37 = null; // flaky: builder35.removeUnicodeLocaleAttribute("4969628");
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder38.clearExtensions();
        java.util.Locale.Builder builder42 = builder39.setExtension('a', "");
        java.util.Locale.Builder builder44 = builder39.setLanguage("ita");
        java.util.Locale.Builder builder45 = builder39.clearExtensions();
        java.util.Locale.Builder builder46 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder46.clear();
        java.util.Locale locale48 = builder47.build();
        java.util.Locale locale49 = locale48.stripExtensions();
        java.util.Locale locale50 = java.util.Locale.FRANCE;
        java.lang.String str51 = locale48.getDisplayLanguage(locale50);
        java.util.Locale.Builder builder52 = builder45.setLocale(locale50);
        java.util.Locale.Builder builder53 = null; // flaky: builder35.setLocale(locale50);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder55 = null; // flaky: builder35.setVariant("US");
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "");
// flaky:         org.junit.Assert.assertNotNull(builder35);
// flaky:         org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(builder52);
// flaky:         org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket(259200031L, chronology1, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        long long9 = dateTimeZone6.adjustOffset(24L, false);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str11 = dateTimeZone10.getID();
        int int13 = dateTimeZone10.getOffsetFromLocal(60480000010L);
        long long17 = dateTimeZone10.convertLocalToUTC(18748800052L, false, 259200087L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str20 = dateTimeZone19.getID();
        long long22 = dateTimeZone19.previousTransition((long) 'a');
        boolean boolean23 = dateTimeZone19.isFixed();
        long long27 = dateTimeZone19.convertLocalToUTC(0L, false, (long) (short) 100);
        long long29 = dateTimeZone10.getMillisKeepLocal(dateTimeZone19, (long) 5207);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str32 = dateTimeZone31.getID();
        long long34 = dateTimeZone31.nextTransition((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        java.lang.String str36 = dateTimeZone31.getID();
        long long38 = dateTimeZone10.getMillisKeepLocal(dateTimeZone31, 93623040172800008L);
        long long40 = dateTimeZone6.getMillisKeepLocal(dateTimeZone31, 3124396800014L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        dateTimeParserBucket4.setZone(dateTimeZone6);
        dateTimeParserBucket4.setOffset(366);
        long long45 = dateTimeParserBucket4.computeMillis();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 18748800052L + "'", long17 == 18748800052L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5207L + "'", long29 == 5207L);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 93623040172800008L + "'", long38 == 93623040172800008L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3124393200014L + "'", long40 == 3124393200014L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 259199665L + "'", long45 == 259199665L);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.io.IOException iOException1 = new java.io.IOException("jpn");
        java.io.IOException iOException4 = new java.io.IOException("UTC");
        java.io.IOException iOException6 = new java.io.IOException("zho");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("2", (java.lang.Throwable) iOException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException1.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("ITA", (java.lang.Throwable) iOException13);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.lang.Throwable[] throwableArray18 = iOException16.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException("jpn");
        java.io.IOException iOException23 = new java.io.IOException("UTC");
        java.io.IOException iOException25 = new java.io.IOException("zho");
        iOException23.addSuppressed((java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException("2", (java.lang.Throwable) iOException23);
        iOException20.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException31 = new java.io.IOException("jpn");
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        java.io.IOException iOException33 = new java.io.IOException("35", (java.lang.Throwable) iOException32);
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) iOException33);
        iOException27.addSuppressed((java.lang.Throwable) iOException33);
        iOException16.addSuppressed((java.lang.Throwable) iOException33);
        iOException1.addSuppressed((java.lang.Throwable) iOException33);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("datetimefield[yearofcentury] (SECONDOFMINUTE,italiano)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'datetimefield[yearofcentury] (SECONDOFMINUTE,italiano)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale.Builder builder9 = builder1.clear();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setScript("+00:00:00.008");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: +00:00:00.008 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.util.Locale locale2 = new java.util.Locale("weekyearOfCentury", "DEUTSCH");
        org.junit.Assert.assertEquals(locale2.toString(), "weekyearofcentury_DEUTSCH");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.util.Locale locale2 = new java.util.Locale("Januar", "39600");
        org.junit.Assert.assertEquals(locale2.toString(), "januar_39600");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u82f1\u6587\u7f8e\u56fd)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField12 = chronology8.months();
        org.joda.time.DurationField durationField13 = chronology8.years();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "secondOfMinute" + "'", str1, "secondOfMinute");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.util.Locale locale10 = locale9.stripExtensions();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale14 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology12, locale14, (java.lang.Integer) 1, 0);
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale14.getDisplayName(locale18);
        java.util.Set<java.lang.String> strSet20 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str21 = locale9.getDisplayCountry(locale14);
        java.lang.String str22 = locale8.getDisplayVariant(locale14);
        java.lang.String str23 = locale8.getDisplayName();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder24.clear();
        java.util.Locale.Builder builder26 = builder25.clearExtensions();
        java.util.Locale.Builder builder28 = builder26.setLanguageTag("fr-CA");
        java.util.Locale locale29 = builder26.build();
        java.lang.String str30 = locale29.toLanguageTag();
        java.lang.String str31 = locale8.getDisplayVariant(locale29);
        java.util.Set<java.lang.Character> charSet32 = locale29.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u82f1\u6587" + "'", str23, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fr-CA" + "'", str30, "fr-CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charSet32);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.util.Locale locale3 = new java.util.Locale("italian", "", "italien (Italie)");
        org.junit.Assert.assertEquals(locale3.toString(), "italian__italien (Italie)");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(363338398);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.Locale locale12 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str13 = dateTimeZone1.getName((long) 'a', locale12);
        java.lang.String str14 = locale12.getDisplayVariant();
        java.lang.String str15 = locale12.getDisplayCountry();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "X-LVARIANT-0" + "'", str15, "X-LVARIANT-0");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket7.getZone();
        long long14 = dateTimeZone11.convertLocalToUTC(3149193600100L, true);
        long long16 = dateTimeZone11.nextTransition(0L);
        long long18 = dateTimeZone11.convertUTCToLocal(17999999L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3149193600100L + "'", long14 == 3149193600100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 17999999L + "'", long18 == 17999999L);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition(0L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException5 = new java.io.IOException(throwable3);
        java.io.IOException iOException6 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException10 = new java.io.IOException("-292275054", (java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException14 = new java.io.IOException("jpn");
        java.io.IOException iOException17 = new java.io.IOException("UTC");
        java.io.IOException iOException19 = new java.io.IOException("zho");
        iOException17.addSuppressed((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException("2", (java.lang.Throwable) iOException17);
        iOException14.addSuppressed((java.lang.Throwable) iOException21);
        java.lang.Throwable[] throwableArray23 = iOException21.getSuppressed();
        java.io.IOException iOException26 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray27 = iOException26.getSuppressed();
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException29 = new java.io.IOException("ITA", (java.lang.Throwable) iOException26);
        java.io.IOException iOException30 = new java.io.IOException((java.lang.Throwable) iOException29);
        iOException21.addSuppressed((java.lang.Throwable) iOException29);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException21);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException21);
        java.io.IOException iOException34 = new java.io.IOException("Chinese", (java.lang.Throwable) iOException21);
        java.lang.Throwable[] throwableArray35 = iOException34.getSuppressed();
        iOException6.addSuppressed((java.lang.Throwable) iOException34);
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) iOException6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("java.io.IOException: it-IT", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:it-it");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        double double9 = languageRange1.getWeight();
        java.lang.String str10 = languageRange1.getRange();
        double double11 = languageRange1.getWeight();
        double double12 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "germany" + "'", str8, "germany");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "germany" + "'", str10, "germany");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.addUnicodeLocaleAttribute("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setScript("java.io.IOException: Oct");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: java.io.IOException: Oct [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long4 = dateTimeZone1.adjustOffset(60480000010L, true);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60480000010L + "'", long4 == 60480000010L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7200000 + "'", int6 == 7200000);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("12");
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(100L, chronology14, locale17);
        java.lang.String str21 = locale17.getScript();
        java.lang.String str23 = locale17.getExtension('u');
        java.util.Locale locale24 = null;
        java.lang.String str25 = locale17.getDisplayScript(locale24);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale27 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(100L, chronology29, locale32);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeParserBucket35.getZone();
        long long39 = dateTimeParserBucket35.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        int int40 = dateTimeParserBucket35.getOffset();
        java.util.Locale locale41 = dateTimeParserBucket35.getLocale();
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale41);
        java.util.Locale locale45 = new java.util.Locale("363338398");
        java.util.Locale.setDefault(category0, locale45);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone36);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u6587" + "'", str42, "\u4e2d\u6587");
        org.junit.Assert.assertEquals(locale45.toString(), "363338398");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket7.getZone();
        dateTimeParserBucket7.setOffset(12);
        java.lang.Integer int14 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.Chronology chronology15 = dateTimeParserBucket7.getChronology();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("DATETIMEFIELD[CLOCKHOUROFHALFDAY]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=datetimefield[clockhourofhalfday]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.util.Locale locale2 = new java.util.Locale("\u516b\u6708", "AD");
        org.junit.Assert.assertEquals(locale2.toString(), "\u516b\u6708_AD");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder6 = builder4.setVariant("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setVariant("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1971);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.util.Locale locale3 = new java.util.Locale("fr", "2922789", "39");
        org.junit.Assert.assertEquals(locale3.toString(), "fr_2922789_39");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (byte) -1);
        java.lang.String str11 = dateTimeZone7.getName(32054400100L);
        dateTimeParserBucket4.setZone(dateTimeZone7);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        dateTimeParserBucket4.setOffset((java.lang.Integer) 8);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) (-721));
        java.lang.Object obj19 = dateTimeParserBucket4.saveState();
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.io.IOException iOException2 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("ITA", (java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException5.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException("jpn");
        java.io.IOException iOException12 = new java.io.IOException("UTC");
        java.io.IOException iOException14 = new java.io.IOException("zho");
        iOException12.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException("2", (java.lang.Throwable) iOException12);
        iOException9.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException20 = new java.io.IOException("jpn");
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException("35", (java.lang.Throwable) iOException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) iOException22);
        iOException16.addSuppressed((java.lang.Throwable) iOException22);
        iOException5.addSuppressed((java.lang.Throwable) iOException22);
        java.lang.Throwable[] throwableArray26 = iOException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekOfWeekyear();
        boolean boolean11 = dateTimeField10.isSupported();
        int int13 = dateTimeField10.get(292278983L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("259200032");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=259200032");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("yearOfCentury");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = builder12.build();
        java.lang.String str14 = locale13.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u661f\u671f\u65e5", (double) 259199970L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.5919997E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str14 = locale8.getLanguage();
        java.lang.String str15 = locale8.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30c9\u30a4\u30c4" + "'", str2, "\u30c9\u30a4\u30c4");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ja" + "'", str14, "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str15, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setVariant("18000000");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setRegion("\u82f1\u6587 (1439)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? (1439) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale2.getVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale2, (java.lang.Integer) (-1), 0);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getScript();
        boolean boolean9 = dateTimeParserBucket5.restoreState((java.lang.Object) locale6);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        int int13 = dateTimeZone11.getStandardOffset((long) (byte) -1);
        java.lang.String str15 = dateTimeZone11.getNameKey((-259200000L));
        dateTimeParserBucket5.setZone(dateTimeZone11);
        long long19 = dateTimeZone11.adjustOffset(165600107L, false);
        long long22 = dateTimeZone11.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 165600107L + "'", long19 == 165600107L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        double double9 = languageRange1.getWeight();
        double double10 = languageRange1.getWeight();
        java.lang.String str11 = languageRange1.getRange();
        java.lang.String str12 = languageRange1.getRange();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("DateTimeField[yearOfCentury]");
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        boolean boolean16 = languageRange1.equals((java.lang.Object) locale14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "germany" + "'", str8, "germany");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "germany" + "'", str11, "germany");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "germany" + "'", str12, "germany");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long6 = dateTimeZone4.convertUTCToLocal((long) (short) -1);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale13 = java.util.Locale.getDefault(category9);
        java.util.Locale locale14 = java.util.Locale.getDefault(category9);
        java.lang.String str15 = locale8.getDisplayName(locale14);
        java.lang.String str16 = dateTimeZone4.getShortName((long) 22, locale14);
        boolean boolean18 = dateTimeZone4.isStandardOffset(28112398503L);
        java.lang.String str20 = dateTimeZone4.getNameKey((-86400000L));
        long long22 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 3105648000000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u30c9\u30a4\u30c4" + "'", str11, "\u30c9\u30a4\u30c4");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str15, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.010" + "'", str16, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3105651119990L + "'", long22 == 3105651119990L);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = null; // flaky: locale3.getISO3Country();
        java.lang.String str5 = null; // flaky: locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = null; // flaky: locale14.getISO3Country();
        java.lang.String str16 = null; // flaky: locale14.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = null; // flaky: locale19.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale3, locale8, locale11, locale14, locale19, locale21 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale locale25 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList23);
        java.lang.String[] strArray29 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = null; // flaky: locale36.getISO3Country();
        java.lang.String str38 = null; // flaky: locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = null; // flaky: locale47.getISO3Country();
        java.lang.String str49 = null; // flaky: locale47.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale47.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = null; // flaky: locale52.getISO3Country();
        java.util.Locale locale54 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale36, locale41, locale44, locale47, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale locale63 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap69);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList70, strMap71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList72, strMap73);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jpn" + "'", str5, "jpn");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "jpn" + "'", str16, "jpn");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "jpn" + "'", str38, "jpn");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "ja");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "ja");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "jpn" + "'", str49, "jpn");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertNotNull(languageRangeList74);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-96683));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfWeek" + "'", str1, "dayOfWeek");
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getStandardOffset(107L);
        long long15 = dateTimeZone1.convertLocalToUTC((long) 10, true, (-3L));
        java.lang.String str17 = dateTimeZone1.getNameKey(0L);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        java.lang.String str21 = dateTimeZone1.getShortName(1000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.io.IOException iOException1 = new java.io.IOException("weekyear");
        java.io.IOException iOException3 = new java.io.IOException("CHN");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.Throwable throwable10 = null;
        java.io.IOException iOException11 = new java.io.IOException("UTC", throwable10);
        java.io.IOException iOException12 = new java.io.IOException(throwable10);
        java.io.IOException iOException13 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException("cinese", (java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("ISOChronology[+00:00:00.010]", (java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException("DateTimeField[year]", (java.lang.Throwable) iOException15);
        iOException3.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException20 = new java.io.IOException("Deutschland");
        iOException3.addSuppressed((java.lang.Throwable) iOException20);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset(64713600009L);
        java.lang.String str13 = dateTimeZone8.getNameKey((long) 3600000);
        long long16 = dateTimeZone8.adjustOffset(3600000054L, true);
        java.lang.String str18 = dateTimeZone8.getNameKey((-388175644367999754L));
        java.util.TimeZone timeZone19 = dateTimeZone8.toTimeZone();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3600000 + "'", int11 == 3600000);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000054L + "'", long16 == 3600000054L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+01:00");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = null; // flaky: locale11.getISO3Country();
        java.lang.String str13 = null; // flaky: locale11.getISO3Language();
        java.util.Locale.setDefault(locale11);
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str17 = locale15.getDisplayCountry(locale16);
        java.lang.String str18 = locale11.getDisplayCountry(locale15);
        java.util.Locale.setDefault(locale15);
        java.lang.String str20 = dateTimeZone8.getName((-259200000L), locale15);
        java.lang.String str21 = dateTimeZone8.toString();
        java.lang.String str22 = dateTimeZone8.toString();
        java.lang.String str23 = dateTimeZone8.toString();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        java.util.Locale.Builder builder28 = builder25.setExtension('a', "");
        java.util.Locale.Builder builder30 = builder25.setLanguage("ita");
        java.util.Locale.Builder builder31 = builder25.clearExtensions();
        java.util.Locale.Builder builder33 = builder31.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder34 = builder31.clear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology38, locale39, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(100L, chronology36, locale39);
        java.lang.Object obj43 = dateTimeParserBucket42.saveState();
        dateTimeParserBucket42.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale48 = java.util.Locale.US;
        dateTimeParserBucket42.saveField(dateTimeFieldType46, "centuryOfEra", locale48);
        java.lang.String str50 = locale48.getDisplayScript();
        java.lang.String str51 = locale48.getDisplayCountry();
        java.util.Locale.Builder builder52 = builder31.setLocale(locale48);
        boolean boolean53 = dateTimeZone8.equals((java.lang.Object) builder52);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder55 = builder52.setScript("ko");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ko [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "jpn" + "'", str13, "jpn");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd" + "'", str17, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:00" + "'", str21, "+01:00");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:00" + "'", str22, "+01:00");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:00" + "'", str23, "+01:00");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u7f8e\u56fd" + "'", str51, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        int int10 = dateTimeZone8.getOffsetFromLocal((long) (byte) 1);
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = new java.util.Locale("US");
        java.lang.String str15 = locale14.getVariant();
        java.util.Locale.setDefault(category12, locale14);
        java.lang.String str17 = dateTimeZone8.getShortName(0L, locale14);
        long long21 = dateTimeZone8.convertLocalToUTC(87L, false, 28425599999L);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.lang.String str25 = locale24.getDisplayCountry();
        java.util.Locale.setDefault(category23, locale24);
        java.util.Locale locale27 = java.util.Locale.getDefault(category23);
        java.util.Locale locale28 = java.util.Locale.getDefault(category23);
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("12");
        java.util.Locale.setDefault(category23, locale30);
        java.util.Locale locale32 = java.util.Locale.getDefault(category23);
        java.util.Locale locale33 = java.util.Locale.getDefault(category23);
        java.util.Locale locale34 = java.util.Locale.getDefault(category23);
        java.util.Locale locale35 = java.util.Locale.getDefault(category23);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology39, locale40, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(100L, chronology37, locale40);
        java.lang.String str44 = locale40.getScript();
        java.lang.String str46 = locale40.getExtension('u');
        java.util.Locale locale47 = null;
        java.lang.String str48 = locale40.getDisplayScript(locale47);
        java.util.Locale.setDefault(category23, locale40);
        java.lang.String str50 = dateTimeZone8.getName(345937855L, locale40);
        long long52 = dateTimeZone8.previousTransition(338855117L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600000 + "'", int10 == 3600000);
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale14.toString(), "us");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:00" + "'", str17, "+01:00");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3599913L) + "'", long21 == (-3599913L));
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.FORMAT + "'", category23.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u5fb7\u56fd" + "'", str25, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+01:00" + "'", str50, "+01:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 338855117L + "'", long52 == 338855117L);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("java.io.IOException: java.io.IOException: 2", (double) (-7199991L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-7199991.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket(60480000010L, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        int int5 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("BC", (double) 1380L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1380.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition((long) (-434));
        java.lang.String str5 = dateTimeZone1.getShortName(28126798503L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-434L) + "'", long3 == (-434L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 97L);
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) 10);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology11, locale12, (java.lang.Integer) (-1), 0);
        java.util.Locale locale16 = locale12.stripExtensions();
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str21 = locale19.getDisplayLanguage(locale20);
        java.lang.String str22 = locale20.getDisplayCountry();
        java.lang.String str23 = locale12.getDisplayLanguage(locale20);
        java.lang.String str24 = locale12.getDisplayLanguage();
        java.lang.String str25 = dateTimeZone1.getName((long) 2922789, locale12);
        int int27 = dateTimeZone1.getOffsetFromLocal(18486000000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600097L + "'", long4 == 3600097L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u56fd" + "'", str22, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587" + "'", str23, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u6cd5\u6587" + "'", str24, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.util.Locale locale2 = new java.util.Locale("\u6cd5\u6587", "java.io.IOException: 7");
        org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u6587_JAVA.IO.IOEXCEPTION: 7");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) (short) 1);
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset(3599999L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7200000L) + "'", long5 == (-7200000L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7200000 + "'", int8 == 7200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7200000 + "'", int10 == 7200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+02:00" + "'", str11, "+02:00");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setExtension('a', "-525593976");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder13 = builder3.setExtension('x', "Thu");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder3.setExtension('a', "-1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long4 = dateTimeZone1.adjustOffset(60480000010L, true);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName((long) '4');
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long13 = dateTimeZone1.convertUTCToLocal(0L);
        int int15 = dateTimeZone1.getOffset((-25486L));
        java.lang.String str17 = dateTimeZone1.getShortName((-3599893L));
        long long20 = dateTimeZone1.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60480000010L + "'", long4 == 60480000010L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7200000 + "'", int6 == 7200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+02:00" + "'", str8, "+02:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7200000 + "'", int10 == 7200000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 7200000L + "'", long13 == 7200000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7200000 + "'", int15 == 7200000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+02:00" + "'", str17, "+02:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("dayofyear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'dayofyear' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(366);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-TW");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-tw" + "'", str2, "zh-tw");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-tw" + "'", str4, "zh-tw");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-tw" + "'", str5, "zh-tw");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(52073340);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+14:27:53.340" + "'", str2, "+14:27:53.340");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = null; // flaky: locale11.getISO3Country();
        java.lang.String str13 = null; // flaky: locale11.getISO3Language();
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale11.getDisplayVariant(locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getISO3Country();
        java.lang.String str24 = locale22.getISO3Language();
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale22.getDisplayVariant(locale25);
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale27.getISO3Country();
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale11, locale16, locale19, locale22, locale27, locale29 };
        java.util.ArrayList<java.util.Locale> localeList31 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList31, localeArray30);
        java.util.Locale locale33 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList31);
        java.lang.String[] strArray37 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.lang.String str40 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList38);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = locale44.getISO3Country();
        java.lang.String str46 = locale44.getISO3Language();
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale44.getDisplayVariant(locale47);
        java.util.Locale locale49 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology51, locale52, (java.lang.Integer) 100);
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale55.getISO3Country();
        java.lang.String str57 = locale55.getISO3Language();
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale55.getDisplayVariant(locale58);
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale60.getISO3Country();
        java.util.Locale locale62 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray63 = new java.util.Locale[] { locale44, locale49, locale52, locale55, locale60, locale62 };
        java.util.ArrayList<java.util.Locale> localeList64 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList64, localeArray63);
        java.util.Locale locale66 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList64);
        java.util.List<java.util.Locale> localeList67 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList64);
        java.util.Locale.LanguageRange[] languageRangeArray68 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList69 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList69, languageRangeArray68);
        java.util.Locale locale71 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet72 = locale71.getUnicodeLocaleKeys();
        java.lang.String str73 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, (java.util.Collection<java.lang.String>) strSet72);
        java.lang.String str74 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet72);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap75 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList76 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap75);
        java.util.Collection<java.util.Locale> localeCollection77 = null;
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter(languageRangeList76, localeCollection77, filteringMode78);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList79);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zho" + "'", str13, "zho");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zho" + "'", str24, "zho");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "zho" + "'", str46, "zho");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
// flaky:         org.junit.Assert.assertEquals(locale49.toString(), "zh");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "zh");
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "zho" + "'", str57, "zho");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(locale66);
        org.junit.Assert.assertNotNull(localeList67);
        org.junit.Assert.assertNotNull(languageRangeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(languageRangeList76);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode78.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(localeList80);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("Allemagne");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Allemagne [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder25 = builder20.clearExtensions();
        java.util.Locale.Builder builder27 = builder20.setLanguage("jpn");
        java.util.Locale.Builder builder28 = builder27.clear();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale.Builder builder32 = builder29.setLanguageTag("year");
        java.util.Locale.Builder builder34 = builder32.setLanguageTag("UTC");
        java.util.Locale locale35 = builder32.build();
        java.util.Locale.Builder builder36 = builder27.setLocale(locale35);
        java.util.Locale.Builder builder38 = builder36.removeUnicodeLocaleAttribute("era");
        java.util.Locale locale39 = builder38.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder41 = builder38.setScript("208");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 208 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "utc");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "utc");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.lang.String str13 = locale10.getDisplayLanguage(locale12);
        java.util.Locale.Builder builder14 = builder7.setLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder7.setScript("-434");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: -434 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '???????' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        java.util.Locale locale12 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setRegion("datetimefield[yearofcentury]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: datetimefield[yearofcentury] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ita");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        dateTimeParserBucket4.setZone(dateTimeZone8);
        boolean boolean10 = dateTimeZone8.isFixed();
        java.lang.String str11 = dateTimeZone8.getID();
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Deutsch", (double) 0);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.util.Locale locale2 = new java.util.Locale("java.io.IOException: UTC", "dayOfYear");
        org.junit.Assert.assertEquals(locale2.toString(), "java.io.ioexception: utc_DAYOFYEAR");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition(6652800128L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone1.getStandardOffset(378000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6652800128L + "'", long3 == 6652800128L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder12 = builder8.setExtension('u', "PM");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("356580000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 356580000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str5 = languageRange4.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] { languageRange10 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = null; // flaky: locale17.getISO3Country();
        java.lang.String str19 = null; // flaky: locale17.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale17.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale28.getISO3Country();
        java.lang.String str30 = locale28.getISO3Language();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale28.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale33.getISO3Country();
        java.util.Locale locale35 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale17, locale22, locale25, locale28, locale33, locale35 };
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.Locale locale39 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList37, filteringMode40);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList41);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.parse("ja");
        java.util.Locale.LanguageRange languageRange46 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] { languageRange46 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale53.getISO3Country();
        java.lang.String str55 = locale53.getISO3Language();
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale53.getDisplayVariant(locale56);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology60, locale61, (java.lang.Integer) 100);
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = locale64.getISO3Country();
        java.lang.String str66 = locale64.getISO3Language();
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.lang.String str68 = locale64.getDisplayVariant(locale67);
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.getISO3Country();
        java.util.Locale locale71 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale53, locale58, locale61, locale64, locale69, locale71 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale locale75 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.util.Locale>) localeList73, filteringMode76);
        java.util.Locale locale78 = java.util.Locale.lookup(languageRangeList44, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList77);
        java.lang.Class<?> wildcardClass80 = languageRangeList7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "zho" + "'", str55, "zho");
        org.junit.Assert.assertNotNull(locale56);
// flaky:         org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "zh");
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "zh");
        org.junit.Assert.assertNotNull(locale64);
// flaky:         org.junit.Assert.assertEquals(locale64.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "zho" + "'", str66, "zho");
        org.junit.Assert.assertNotNull(locale67);
// flaky:         org.junit.Assert.assertEquals(locale67.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(locale75);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode76.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertNull(locale78);
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(24);
        java.lang.String str3 = dateTimeZone1.getShortName((-61449544343L));
        long long5 = dateTimeZone1.previousTransition(64450800020L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.024" + "'", str3, "+00:00:00.024");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 64450800020L + "'", long5 == 64450800020L);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket6.getZone();
        boolean boolean12 = dateTimeZone11.isFixed();
        long long16 = dateTimeZone11.convertLocalToUTC((-2505600000L), true, (-262800000L));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-2505600000L) + "'", long16 == (-2505600000L));
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.util.Locale locale1 = new java.util.Locale("+100:05");
        org.junit.Assert.assertEquals(locale1.toString(), "+100:05");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.util.Locale locale1 = new java.util.Locale("8831");
        org.junit.Assert.assertEquals(locale1.toString(), "8831");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53, 53);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone2.getOffset(readableInstant4);
        int int7 = dateTimeZone2.getStandardOffset(3034278056L);
        long long9 = dateTimeZone2.nextTransition((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 193980000 + "'", int5 == 193980000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 193980000 + "'", int7 == 193980000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        int int10 = dateTimeZone8.getOffsetFromLocal((long) (byte) 1);
        boolean boolean11 = dateTimeZone8.isFixed();
        java.lang.String str13 = dateTimeZone8.getShortName(97L);
        long long16 = dateTimeZone8.adjustOffset(0L, true);
        java.lang.String str18 = dateTimeZone8.getShortName(98L);
        long long21 = dateTimeZone8.adjustOffset(432000000L, true);
        long long23 = dateTimeZone8.nextTransition((long) 100);
        java.util.Locale locale27 = new java.util.Locale("361920000", "28", "italiano (Italia)");
        boolean boolean28 = dateTimeZone8.equals((java.lang.Object) "28");
        long long30 = dateTimeZone8.nextTransition(21L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 432000000L + "'", long21 == 432000000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertEquals(locale27.toString(), "361920000_28_italiano (Italia)");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 21L + "'", long30 == 21L);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("DEUTSCH");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.removeUnicodeLocaleAttribute("13");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 13 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("12");
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder16 = builder13.setExtension('a', "");
        java.util.Locale.Builder builder18 = builder13.setLanguageTag("eng");
        java.util.Locale.Builder builder19 = builder13.clearExtensions();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.util.Locale locale22 = locale21.stripExtensions();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale26 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology24, locale26, (java.lang.Integer) 1, 0);
        java.util.Locale locale30 = java.util.Locale.ENGLISH;
        java.lang.String str31 = locale26.getDisplayName(locale30);
        java.util.Set<java.lang.String> strSet32 = locale26.getUnicodeLocaleAttributes();
        java.lang.String str33 = locale21.getDisplayCountry(locale26);
        java.lang.String str34 = locale20.getDisplayVariant(locale26);
        java.util.Set<java.lang.String> strSet35 = locale26.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet36 = locale26.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale26);
        java.util.Locale locale38 = java.util.Locale.getDefault(category0);
        java.lang.String str39 = locale38.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "eng");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        java.util.Locale locale1 = new java.util.Locale("ITALIA");
        org.junit.Assert.assertEquals(locale1.toString(), "italia");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        int int31 = dateTimeParserBucket30.getOffset();
        java.lang.Object obj32 = dateTimeParserBucket30.saveState();
        java.util.Locale locale33 = dateTimeParserBucket30.getLocale();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        java.util.Locale.Builder builder35 = null; // flaky: builder22.setLocale(locale34);
        java.util.Locale.Builder builder36 = null; // flaky: builder35.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder38 = null; // flaky: builder35.setVariant("10 (JPN,us)");
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 10 (JPN,us) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh");
// flaky:         org.junit.Assert.assertNotNull(builder35);
// flaky:         org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("33");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=33");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.util.Locale locale2 = new java.util.Locale("italia", "+02:00");
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "italia_+02:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=minuteofday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder7.setLanguageTag("ita");
        java.util.Locale.Builder builder12 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder7.setExtension(' ', "-434");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.util.Locale locale3 = new java.util.Locale("zh-TW", "+01:00", "DateTimeField[monthOfYear]");
        org.junit.Assert.assertEquals(locale3.toString(), "zh-tw_+01:00_DateTimeField[monthOfYear]");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.util.Locale locale3 = new java.util.Locale("", "84", "99");
        org.junit.Assert.assertEquals(locale3.toString(), "_84_99");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        long long9 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, 0L);
        long long13 = dateTimeZone1.convertLocalToUTC((-1349913629116800000L), true, 153L);
        long long16 = dateTimeZone1.convertLocalToUTC((-360659998L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1349913629116800000L) + "'", long13 == (-1349913629116800000L));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-360659998L) + "'", long16 == (-360659998L));
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) (short) 1);
        int int7 = dateTimeZone1.getStandardOffset(338765L);
        int int9 = dateTimeZone1.getStandardOffset((-130867L));
        java.lang.String str10 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7200000L) + "'", long5 == (-7200000L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7200000 + "'", int7 == 7200000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7200000 + "'", int9 == 7200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+02:00" + "'", str10, "+02:00");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Set<java.lang.String> strSet18 = locale10.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getName(259200107L);
        long long16 = dateTimeZone10.convertLocalToUTC(70000L, false, 259200100L);
        boolean boolean18 = dateTimeZone10.isStandardOffset(6652800031L);
        long long22 = dateTimeZone10.convertLocalToUTC((long) (-9), true, (long) '4');
        boolean boolean23 = dateTimeZone10.isFixed();
        long long25 = dateTimeZone10.nextTransition((long) 7);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 70000L + "'", long16 == 70000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-9L) + "'", long22 == (-9L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 7L + "'", long25 == 7L);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.util.Locale locale3 = new java.util.Locale("UTC", "10", "10");
        java.util.Locale locale6 = new java.util.Locale("hi!", "ISOChronology[UTC]");
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale3.getDisplayCountry(locale6);
        java.lang.String str9 = locale6.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "utc_10_10");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!_ISOCHRONOLOGY[UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOCHRONOLOGY[UTC]" + "'", str9, "ISOCHRONOLOGY[UTC]");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str10 = dateTimeZone9.getID();
        long long14 = dateTimeZone9.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone9.getOffset(readableInstant15);
        java.util.Locale locale20 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str21 = dateTimeZone9.getName((long) 'a', locale20);
        java.lang.String str22 = locale20.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale20);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germany" + "'", str2, "Germany");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Germany" + "'", str5, "Germany");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 53L + "'", long14 == 53L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals(locale20.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "X-LVARIANT-0" + "'", str22, "X-LVARIANT-0");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        int int10 = dateTimeZone8.getOffsetFromLocal((long) (byte) 1);
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = new java.util.Locale("US");
        java.lang.String str15 = locale14.getVariant();
        java.util.Locale.setDefault(category12, locale14);
        java.lang.String str17 = dateTimeZone8.getShortName(0L, locale14);
        long long21 = dateTimeZone8.convertLocalToUTC(87L, false, 28425599999L);
        long long25 = dateTimeZone8.convertLocalToUTC(429378278401200L, true, 470198649686399L);
        long long29 = dateTimeZone8.convertLocalToUTC(16L, true, 180000000L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!_ISOCHRONOLOGY[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale14.toString(), "us");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 86L + "'", long21 == 86L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 429378278401199L + "'", long25 == 429378278401199L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 15L + "'", long29 == 15L);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.util.Locale locale3 = new java.util.Locale("zh-cn", "-9", "fr_FR");
        java.lang.String str4 = locale3.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for -9");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cn_-9_fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr,FR" + "'", str4, "fr,FR");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getStandardOffset((long) (byte) -1);
        java.lang.String str20 = dateTimeZone17.toString();
        java.lang.String str22 = dateTimeZone17.getShortName((long) '#');
        long long24 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone17.isLocalDateTimeGap(localDateTime25);
        int int28 = dateTimeZone17.getStandardOffset(2058541000L);
        long long30 = dateTimeZone17.convertUTCToLocal(1000L);
        java.lang.String str32 = dateTimeZone17.getNameKey(86400309L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 34L + "'", long24 == 34L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1001L + "'", long30 == 1001L);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.util.Locale locale3 = new java.util.Locale("dayOfWeek", "74176865", "Chinesisch");
        org.junit.Assert.assertEquals(locale3.toString(), "dayofweek_74176865_Chinesisch");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.util.Locale locale3 = new java.util.Locale("\u661f\u671f\u4e00", "", "und-u-germany-ita-ko-kr");
        org.junit.Assert.assertEquals(locale3.toString(), "\u661f\u671f\u4e00__und-u-germany-ita-ko-kr");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology12.getDateTimeMillis(11675, 1971, 99, 33199);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1971 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        boolean boolean8 = locale7.hasExtensions();
        java.lang.String str9 = locale7.getDisplayScript();
        java.util.Locale locale13 = new java.util.Locale("361920000", "28", "italiano (Italia)");
        java.lang.String str14 = locale7.getDisplayLanguage(locale13);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale13.toString(), "361920000_28_italiano (Italia)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder15 = builder13.removeUnicodeLocaleAttribute("italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setRegion("France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: France [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("UTC", throwable1);
        java.io.IOException iOException3 = new java.io.IOException(throwable1);
        java.io.IOException iOException5 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException5);
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray9 = iOException5.getSuppressed();
        java.lang.String str10 = iOException5.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u82f1\u6587 (1439)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '?? (1439)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        long long11 = dateTimeParserBucket7.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        int int12 = dateTimeParserBucket7.getOffset();
        dateTimeParserBucket7.setOffset((java.lang.Integer) 3);
        int int15 = dateTimeParserBucket7.getOffset();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.lang.String str3 = dateTimeZone1.getNameKey((-99038851200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("DateTimeField[yearOfCentury]");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale1.getDisplayCountry(locale4);
        java.lang.Class<?> wildcardClass7 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) -1);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = locale7.getDisplayCountry();
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale10 = java.util.Locale.getDefault(category6);
        java.util.Locale locale11 = java.util.Locale.getDefault(category6);
        java.lang.String str12 = locale5.getDisplayName(locale11);
        java.lang.String str13 = dateTimeZone1.getShortName((long) 22, locale11);
        long long16 = dateTimeZone1.adjustOffset((long) 18720052, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u5fb7\u56fd" + "'", str8, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str12, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.010" + "'", str13, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 18720052L + "'", long16 == 18720052L);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        java.util.Locale locale1 = new java.util.Locale("2937600");
        org.junit.Assert.assertEquals(locale1.toString(), "2937600");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale.Builder builder20 = builder17.setLanguage("germany");
        java.util.Locale.Builder builder23 = builder20.setExtension('a', "en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder20.setLanguageTag("\u5341\u4e00\u6708");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale5 = new java.util.Locale("zh_CN", "java.io.IOException: ita");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh_cn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_cn_JAVA.IO.IOEXCEPTION: ITA");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.io.IOException iOException1 = new java.io.IOException("5100");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: 5100" + "'", str2, "java.io.IOException: 5100");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setRegion("de");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setLanguageTag("java.io.IOException: it-IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: java.io.IOException: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.util.Locale locale2 = new java.util.Locale("ITA", "");
        org.junit.Assert.assertEquals(locale2.toString(), "ita");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder23 = builder17.setExtension('a', "22");
        java.util.Locale.Builder builder25 = builder23.removeUnicodeLocaleAttribute("ITALIA");
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale.Builder builder28 = builder25.removeUnicodeLocaleAttribute("39600008");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder25.setScript("DateTimeField[hourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: DateTimeField[hourOfDay] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.util.Locale locale3 = new java.util.Locale("3600000", "292278993", "DATETIMEFIELD[DAYOFYEAR]");
        java.lang.String str4 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "3600000_292278993_DATETIMEFIELD[DAYOFYEAR]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(11, 0);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long3 = dateTimeZone1.previousTransition(18144000010L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long8 = dateTimeZone1.adjustOffset(368455910411731L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 18144000010L + "'", long3 == 18144000010L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 368455910411731L + "'", long8 == 368455910411731L);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-292122054L));
        java.lang.String str12 = dateTimeZone1.getName(0L);
        java.lang.String str13 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale9.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguage("+100:05");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +100:05 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String str8 = languageRange1.getRange();
        java.lang.String str9 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "germany" + "'", str7, "germany");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "germany" + "'", str8, "germany");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "germany" + "'", str9, "germany");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.util.Locale locale2 = new java.util.Locale("datetimefield[weekofweekyear] (ko-KR)", "35");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "datetimefield[weekofweekyear] (ko-kr)_35");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35" + "'", str3, "35");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(13, 1982);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1982");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.io.IOException iOException4 = new java.io.IOException("");
        java.io.IOException iOException5 = new java.io.IOException("USA", (java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("-1", (java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("X-LVARIANT-0", (java.lang.Throwable) iOException6);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException6.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.io.IOException iOException3 = new java.io.IOException("und");
        java.io.IOException iOException4 = new java.io.IOException("dayOfYear", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("deu", (java.lang.Throwable) iOException3);
        java.io.IOException iOException9 = new java.io.IOException("UTC");
        java.io.IOException iOException11 = new java.io.IOException("zho");
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("2", (java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException("\u4e2d\u56fd", (java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray15 = iOException9.getSuppressed();
        iOException5.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException5);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        java.io.IOException iOException3 = new java.io.IOException("weekyear");
        java.io.IOException iOException5 = new java.io.IOException("CHN");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("Chinese (Taiwan)", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray8 = iOException3.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException("S\374dkorea");
        iOException3.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException13 = new java.io.IOException("107", (java.lang.Throwable) iOException12);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.util.Locale locale3 = new java.util.Locale("7343661", "\u4e2d\u56fd\u8a9e (FRANZ\366SISCH (FRANKREICH))", "\u661f\u671f\u4e94");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd\u8a9e (FRANZ\366\u661f\u671f\u4e94");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket(604800053L, chronology1, locale2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.nextTransition((-1L));
        boolean boolean10 = dateTimeZone5.isStandardOffset((long) (-1));
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone5.getOffset(readableInstant11);
        long long15 = dateTimeZone5.adjustOffset((-292275054L), false);
        long long17 = dateTimeZone5.convertUTCToLocal((long) 52);
        dateTimeParserBucket3.setZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-292275054L) + "'", long15 == (-292275054L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        boolean boolean7 = dateTimeZone1.isFixed();
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        java.util.Locale.setDefault(category9, locale13);
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.lang.String str19 = locale18.getDisplayCountry();
        java.util.Locale.setDefault(category17, locale18);
        java.util.Locale locale21 = java.util.Locale.getDefault(category17);
        java.util.Locale locale22 = java.util.Locale.getDefault(category17);
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str24 = locale23.getDisplayName();
        java.lang.String str25 = locale23.getDisplayLanguage();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(100L, chronology27, locale30);
        java.lang.String str34 = locale30.getScript();
        java.util.Set<java.lang.String> strSet35 = locale30.getUnicodeLocaleKeys();
        java.lang.String str36 = locale30.getDisplayCountry();
        java.lang.String str37 = locale23.getDisplayScript(locale30);
        java.util.Locale.setDefault(category17, locale30);
        java.util.Locale.setDefault(category9, locale30);
        java.util.Locale locale42 = new java.util.Locale("Thu", "Italia");
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str45 = dateTimeZone44.getID();
        long long49 = dateTimeZone44.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = dateTimeZone44.getOffset(readableInstant50);
        java.util.Locale locale55 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str56 = dateTimeZone44.getName((long) 'a', locale55);
        java.lang.String str57 = locale55.getDisplayVariant();
        java.lang.String str58 = locale42.getDisplayLanguage(locale55);
        java.util.Locale.setDefault(category9, locale55);
        java.lang.String str60 = dateTimeZone1.getShortName(6048863930090L, locale55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = locale55.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for +01:00");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u5fb7\u56fd" + "'", str11, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.FORMAT + "'", category17.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u5fb7\u56fd" + "'", str19, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str24, "\u4e2d\u6587\u4e2d\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u6587" + "'", str25, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strSet35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u56fd" + "'", str36, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale42.toString(), "thu_ITALIA");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 53L + "'", long49 == 53L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals(locale55.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "thu" + "'", str58, "thu");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00" + "'", str60, "+00:00");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long4 = dateTimeZone1.nextTransition(64713600009L);
        int int6 = dateTimeZone1.getStandardOffset(6652801000L);
        long long8 = dateTimeZone1.convertUTCToLocal(86399999L);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.setExtension('a', "");
        java.util.Locale.Builder builder16 = builder11.setLanguageTag("eng");
        java.util.Locale.Builder builder17 = builder11.clearExtensions();
        java.util.Locale locale18 = builder17.build();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Locale locale20 = locale19.stripExtensions();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale24 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology22, locale24, (java.lang.Integer) 1, 0);
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = locale24.getDisplayName(locale28);
        java.util.Set<java.lang.String> strSet30 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str31 = locale19.getDisplayCountry(locale24);
        java.lang.String str32 = locale18.getDisplayVariant(locale24);
        java.util.Set<java.lang.String> strSet33 = locale24.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet34 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str35 = dateTimeZone1.getShortName(2419201210L, locale24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 64713600009L + "'", long4 == 64713600009L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86399999L + "'", long8 == 86399999L);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "eng");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("23", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=23");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.util.Locale locale2 = new java.util.Locale("24", "Cina");
        java.util.Locale locale3 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "24_CINA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "24_CINA");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("x-lvariant-0_ITALIANO (ITALIA)_ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: +00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("x-lvariant-0_italiano (italia)_ita");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=x-lvariant-0_italiano(italia)_ita");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket(259200031L, chronology1, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(true);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "eng");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 259200031L + "'", long6 == 259200031L);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.util.Locale locale2 = new java.util.Locale("+59:00", "193980000");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "+59:00_193980000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+59:00_193980000" + "'", str3, "+59:00_193980000");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.io.IOException iOException3 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("DateTimeField[millisOfDay]", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("fra", (java.lang.Throwable) iOException3);
        java.io.IOException iOException9 = new java.io.IOException("weekyearOfCentury");
        java.io.IOException iOException12 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray13 = iOException12.getSuppressed();
        java.lang.Throwable throwable15 = null;
        java.io.IOException iOException16 = new java.io.IOException("UTC", throwable15);
        java.io.IOException iOException17 = new java.io.IOException(throwable15);
        iOException12.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException("UTC", (java.lang.Throwable) iOException17);
        java.io.IOException iOException21 = new java.io.IOException();
        java.io.IOException iOException22 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException21);
        iOException17.addSuppressed((java.lang.Throwable) iOException21);
        java.io.IOException iOException25 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray26 = iOException25.getSuppressed();
        java.lang.Throwable throwable28 = null;
        java.io.IOException iOException29 = new java.io.IOException("UTC", throwable28);
        java.io.IOException iOException30 = new java.io.IOException(throwable28);
        iOException25.addSuppressed((java.lang.Throwable) iOException30);
        iOException17.addSuppressed((java.lang.Throwable) iOException30);
        iOException9.addSuppressed((java.lang.Throwable) iOException17);
        iOException7.addSuppressed((java.lang.Throwable) iOException17);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(7, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguageTag("-5");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder8 = builder5.setExtension('u', "us");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("italia");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.removeUnicodeLocaleAttribute("Allemagne");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Allemagne [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.util.Locale locale2 = new java.util.Locale("-434:00", "Deutsch");
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "-434:00_DEUTSCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-434:00_DEUTSCH" + "'", str4, "-434:00_DEUTSCH");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), (-5217));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -5217");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi! (ISOCHRONOLOGY[UTC])");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayScript();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = dateTimeZone0.getShortName(0L, locale2);
        java.util.Locale locale11 = new java.util.Locale("Italian (Italy)", "2", "35");
        java.lang.String str12 = locale2.getDisplayCountry(locale11);
        java.lang.String str13 = locale2.getDisplayVariant();
        java.lang.String str14 = locale2.getISO3Language();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko-KR" + "'", str3, "ko-KR");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u5927\u97d3\u6c11\u56fd" + "'", str4, "\u5927\u97d3\u6c11\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals(locale11.toString(), "italian (italy)_2_35");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "South Korea" + "'", str12, "South Korea");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "kor" + "'", str14, "kor");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.util.Locale locale2 = new java.util.Locale("chinois", "79206");
        org.junit.Assert.assertEquals(locale2.toString(), "chinois_79206");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(59);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap8);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str12 = languageRange11.getRange();
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str15 = languageRange14.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] { languageRange11, languageRange14 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] { languageRange20 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = null; // flaky: locale27.getISO3Country();
        java.lang.String str29 = locale27.getISO3Language();
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale27.getDisplayVariant(locale30);
        java.util.Locale locale32 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 100);
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = null; // flaky: locale38.getISO3Country();
        java.lang.String str40 = locale38.getISO3Language();
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale38.getDisplayVariant(locale41);
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = null; // flaky: locale43.getISO3Country();
        java.util.Locale locale45 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale27, locale32, locale35, locale38, locale43, locale45 };
        java.util.ArrayList<java.util.Locale> localeList47 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList47, localeArray46);
        java.util.Locale locale49 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList47);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList47, filteringMode50);
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList51);
        java.util.Locale.LanguageRange languageRange54 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] { languageRange54 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = null; // flaky: locale61.getISO3Country();
        java.lang.String str63 = locale61.getISO3Language();
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = locale61.getDisplayVariant(locale64);
        java.util.Locale locale66 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology68 = null;
        java.util.Locale locale69 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology68, locale69, (java.lang.Integer) 100);
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.lang.String str73 = null; // flaky: locale72.getISO3Country();
        java.lang.String str74 = locale72.getISO3Language();
        java.util.Locale locale75 = java.util.Locale.getDefault();
        java.lang.String str76 = locale72.getDisplayVariant(locale75);
        java.util.Locale locale77 = java.util.Locale.getDefault();
        java.lang.String str78 = null; // flaky: locale77.getISO3Country();
        java.util.Locale locale79 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale61, locale66, locale69, locale72, locale77, locale79 };
        java.util.ArrayList<java.util.Locale> localeList81 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList81, localeArray80);
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList81, filteringMode84);
        java.util.Locale locale86 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Locale.LanguageRange[] languageRangeArray87 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList88 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList88, languageRangeArray87);
        java.util.Locale locale90 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet91 = locale90.getUnicodeLocaleKeys();
        java.lang.String str92 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList88, (java.util.Collection<java.lang.String>) strSet91);
        java.util.Locale locale93 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet94 = locale93.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList88, (java.util.Collection<java.lang.String>) strSet94);
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet94);
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strSet94);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap98 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList99 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap98);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "germany" + "'", str12, "germany");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "germany" + "'", str15, "germany");
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "jpn" + "'", str29, "jpn");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "ja");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "ja");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "jpn" + "'", str40, "jpn");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(locale49);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode50.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "jpn" + "'", str63, "jpn");
        org.junit.Assert.assertNotNull(locale64);
// flaky:         org.junit.Assert.assertEquals(locale64.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "ja");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "ja");
        org.junit.Assert.assertNotNull(locale72);
// flaky:         org.junit.Assert.assertEquals(locale72.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "jpn" + "'", str74, "jpn");
        org.junit.Assert.assertNotNull(locale75);
// flaky:         org.junit.Assert.assertEquals(locale75.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale77);
// flaky:         org.junit.Assert.assertEquals(locale77.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(locale83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNull(locale86);
        org.junit.Assert.assertNotNull(languageRangeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet94);
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertNotNull(languageRangeList99);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayScript();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = dateTimeZone0.getShortName(0L, locale2);
        java.util.Locale locale11 = new java.util.Locale("Italian (Italy)", "2", "35");
        java.lang.String str12 = locale2.getDisplayCountry(locale11);
        java.lang.String str13 = locale2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko-KR" + "'", str3, "ko-KR");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u5927\u97d3\u6c11\u56fd" + "'", str4, "\u5927\u97d3\u6c11\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals(locale11.toString(), "italian (italy)_2_35");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "South Korea" + "'", str12, "South Korea");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko_KR" + "'", str13, "ko_KR");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setRegion("");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("DateTimeField[yearOfCentury]");
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = locale15.getDisplayCountry(locale18);
        java.util.Locale.Builder builder21 = null; // flaky: builder10.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = null; // flaky: builder21.setUnicodeLocaleKeyword("ISOChronology[UTC]", "+53:53");
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ISOChronology[UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "China" + "'", str20, "China");
// flaky:         org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException5 = new java.io.IOException(throwable3);
        java.io.IOException iOException6 = new java.io.IOException("7", (java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException("zh_CN", (java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-TW");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-tw" + "'", str2, "zh-tw");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        long long5 = dateTimeZone2.adjustOffset(1L, false);
        int int7 = dateTimeZone2.getStandardOffset((long) (-1));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone2.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 360000000 + "'", int9 == 360000000);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-46));
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        java.lang.String str3 = locale1.getExtension('x');
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.io.IOException iOException2 = new java.io.IOException("dayofyear");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("und");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("Wednesday", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2937600");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2937600' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.util.Locale locale3 = new java.util.Locale("DateTimeField[weekyear]", "zh_CN", "java.io.IOException: utc");
        org.junit.Assert.assertEquals(locale3.toString(), "datetimefield[weekyear]_ZH_CN_java.io.IOException: utc");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("-33000000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-33000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.util.Locale[] localeArray8 = new java.util.Locale[] { locale5 };
        java.util.ArrayList<java.util.Locale> localeList9 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList9, localeArray8);
        java.util.Locale locale11 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap12);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("ja");
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] { languageRange17 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = null; // flaky: locale24.getISO3Country();
        java.lang.String str26 = locale24.getISO3Language();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale24.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 100);
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = null; // flaky: locale35.getISO3Country();
        java.lang.String str37 = locale35.getISO3Language();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale35.getDisplayVariant(locale38);
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = null; // flaky: locale40.getISO3Country();
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale24, locale29, locale32, locale35, locale40, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.util.Locale>) localeList44, filteringMode47);
        java.util.Locale locale49 = java.util.Locale.lookup(languageRangeList15, (java.util.Collection<java.util.Locale>) localeList48);
        java.util.Locale.FilteringMode filteringMode50 = null;
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter(languageRangeList13, (java.util.Collection<java.util.Locale>) localeList48, filteringMode50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList13, strMap52);
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = null; // flaky: locale54.getISO3Country();
        java.lang.String str56 = locale54.getISO3Language();
        java.util.Locale.setDefault(locale54);
        java.util.Locale locale58 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale59 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str60 = locale58.getDisplayCountry(locale59);
        java.lang.String str61 = locale54.getDisplayCountry(locale58);
        java.lang.String str63 = locale54.getExtension('u');
        java.util.Set<java.lang.String> strSet64 = locale54.getUnicodeLocaleKeys();
        java.lang.String str65 = java.util.Locale.lookupTag(languageRangeList13, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList13, strMap66);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zho" + "'", str26, "zho");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "zho" + "'", str37, "zho");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNull(locale49);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zho" + "'", str56, "zho");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u4e2d\u56fd" + "'", str60, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(languageRangeList67);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket7.getZone();
        java.lang.Integer int11 = dateTimeParserBucket7.getPivotYear();
        int int12 = dateTimeParserBucket7.getOffset();
        int int13 = dateTimeParserBucket7.getOffset();
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("97");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '97' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder8 = builder3.setLanguage("Januar");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("\u516c\u5143");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.util.Locale.setDefault(locale4);
        java.lang.String str7 = locale4.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais (France)" + "'", str7, "fran\347ais (France)");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder15 = builder13.removeUnicodeLocaleAttribute("italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder13.setUnicodeLocaleKeyword("Stati Uniti", "\u65e5\u672c\u8a9e)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Stati Uniti [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(50);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException2);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable throwable12 = null;
        java.io.IOException iOException13 = new java.io.IOException("UTC", throwable12);
        java.io.IOException iOException14 = new java.io.IOException(throwable12);
        java.io.IOException iOException15 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException14);
        java.lang.Throwable[] throwableArray16 = iOException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = iOException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = iOException15.getSuppressed();
        iOException9.addSuppressed((java.lang.Throwable) iOException15);
        java.lang.String str20 = iOException15.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.io.IOException: weekyear" + "'", str20, "java.io.IOException: weekyear");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("23");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+05:12");
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18720000 + "'", int3 == 18720000);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5306, 86399);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 86399");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("\u4e2d\u56fd", "DateTimeField[monthOfYear]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.io.ioexception: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("year");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "year");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "year" + "'", str4, "year");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        java.util.Locale locale2 = new java.util.Locale("deutsch", "");
        org.junit.Assert.assertEquals(locale2.toString(), "deutsch");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.io.IOException iOException1 = new java.io.IOException("DE");
        java.io.IOException iOException3 = new java.io.IOException("ISOChronology[UTC]");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.util.Locale locale2 = java.util.Locale.ITALY;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale1.getDisplayName(locale2);
        java.lang.String str6 = locale1.getISO3Country();
        java.lang.String str7 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("PM");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("259200032");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '259200032' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder17.setRegion("usa_ZHO");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: usa_ZHO [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        java.util.Locale locale2 = new java.util.Locale("cinese (Cina)", "8");
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayScript();
        java.lang.String str6 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "cinese (cina)_8");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8" + "'", str4, "8");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.util.Locale locale1 = new java.util.Locale("zh_CN");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.Object obj4 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "zh_cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "zh_cn");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "zh_cn");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "zh_cn");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHN" + "'", str1, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.util.Locale locale2 = new java.util.Locale("Germany", "+100:00");
        org.junit.Assert.assertEquals(locale2.toString(), "germany_+100:00");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder9.clearExtensions();
        java.util.Locale locale15 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder9.setLanguageTag("7223");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 7223 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "italian");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.io.IOException iOException2 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("UTC", throwable5);
        java.io.IOException iOException7 = new java.io.IOException(throwable5);
        iOException2.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("UTC", (java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray10 = iOException7.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException13 = new java.io.IOException("DECEMBER");
        iOException11.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException18 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray19 = iOException18.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException21 = new java.io.IOException("ITA", (java.lang.Throwable) iOException18);
        iOException15.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException26 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray27 = iOException26.getSuppressed();
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException29 = new java.io.IOException("ITA", (java.lang.Throwable) iOException26);
        java.io.IOException iOException30 = new java.io.IOException((java.lang.Throwable) iOException29);
        java.io.IOException iOException31 = new java.io.IOException("1497", (java.lang.Throwable) iOException30);
        iOException15.addSuppressed((java.lang.Throwable) iOException30);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("DECEMBER");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "december" + "'", str2, "december");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.util.Locale locale2 = new java.util.Locale("", "-6011");
        org.junit.Assert.assertEquals(locale2.toString(), "_-6011");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.util.Locale locale2 = new java.util.Locale("Thursday", "ita");
        org.junit.Assert.assertEquals(locale2.toString(), "thursday_ITA");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("FR");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getISO3Country();
        java.lang.String str22 = locale20.getISO3Language();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale20.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 100);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale31.getISO3Country();
        java.lang.String str33 = locale31.getISO3Language();
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale31.getDisplayVariant(locale34);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale36.getISO3Country();
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale20, locale25, locale28, locale31, locale36, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale locale42 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList40);
        java.lang.String[] strArray46 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList47);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale53.getISO3Country();
        java.lang.String str55 = locale53.getISO3Language();
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale53.getDisplayVariant(locale56);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology60, locale61, (java.lang.Integer) 100);
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = locale64.getISO3Country();
        java.lang.String str66 = locale64.getISO3Language();
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.lang.String str68 = locale64.getDisplayVariant(locale67);
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.getISO3Country();
        java.util.Locale locale71 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale53, locale58, locale61, locale64, locale69, locale71 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale locale75 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale.LanguageRange[] languageRangeArray78 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList79 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList79, languageRangeArray78);
        java.util.Locale locale81 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet82 = locale81.getUnicodeLocaleKeys();
        java.lang.String str83 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList79, (java.util.Collection<java.lang.String>) strSet82);
        java.util.Locale locale84 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet85 = locale84.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList79, (java.util.Collection<java.lang.String>) strSet85, filteringMode86);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList73, filteringMode86);
        java.util.Locale locale91 = new java.util.Locale("Italienisch", "zho");
        java.util.Set<java.lang.String> strSet92 = locale91.getUnicodeLocaleAttributes();
        java.lang.String str93 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet92);
        java.util.Locale.FilteringMode filteringMode94 = null;
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet92, filteringMode94);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zho" + "'", str22, "zho");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zho" + "'", str33, "zho");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "zho" + "'", str55, "zho");
        org.junit.Assert.assertNotNull(locale56);
// flaky:         org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "zh");
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "zh");
        org.junit.Assert.assertNotNull(locale64);
// flaky:         org.junit.Assert.assertEquals(locale64.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "zho" + "'", str66, "zho");
        org.junit.Assert.assertNotNull(locale67);
// flaky:         org.junit.Assert.assertEquals(locale67.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(locale75);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertNotNull(languageRangeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode86.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertEquals(locale91.toString(), "italienisch_ZHO");
        org.junit.Assert.assertNotNull(strSet92);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNotNull(strList95);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.util.Locale locale3 = new java.util.Locale("5100", "DateTimeField[weekyearOfCentury]", "French (France)");
        org.junit.Assert.assertEquals(locale3.toString(), "5100_DATETIMEFIELD[WEEKYEAROFCENTURY]_French (France)");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.util.Locale locale1 = new java.util.Locale("\u6708\u66dc\u65e5");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "\u6708\u66dc\u65e5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6708\u66dc\u65e5" + "'", str2, "\u6708\u66dc\u65e5");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.util.Locale locale3 = new java.util.Locale("dayOfYear", "35", "");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale3.getDisplayName(locale7);
        boolean boolean9 = locale7.hasExtensions();
        java.lang.String str10 = locale7.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "dayofyear_35");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayofyear (35)" + "'", str8, "dayofyear (35)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.util.Locale locale3 = new java.util.Locale("java.io.IOException: java.io.IOException: dayOfYear", "italiano (Italia)", "DateTimeField[dayOfYear]");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "java.io.ioexception: java.io.ioexception: dayofyear_ITALIANO (ITALIA)_DateTimeField[dayOfYear]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITALIANO (ITALIA)" + "'", str4, "ITALIANO (ITALIA)");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone5.getOffset(readableInstant8);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology12, locale13, (java.lang.Integer) 100);
        java.lang.String str16 = dateTimeZone5.getShortName(10L, locale13);
        java.util.Locale.Builder builder17 = builder0.setLocale(locale13);
        java.util.Locale.Builder builder18 = builder17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setLanguageTag("\u65e5\u672c\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setRegion("");
        java.lang.Class<?> wildcardClass4 = builder0.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguageTag("S\374dkorea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Su?dkorea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("SECONDOFMINUTE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=secondofminute");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.util.Locale locale2 = new java.util.Locale("32", "+01:00");
        org.junit.Assert.assertEquals(locale2.toString(), "32_+01:00");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("168", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=168");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.util.Locale locale2 = new java.util.Locale("1", "WEEKOFWEEKYEAR");
        org.junit.Assert.assertEquals(locale2.toString(), "1_WEEKOFWEEKYEAR");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.util.Locale locale3 = new java.util.Locale("Italienisch", "x-lvariant-0_ITALIANO (ITALIA)_ITA", "DateTimeField[minuteOfDay]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("+168:09");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: +168:09");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "italienisch_X-LVARIANT-0_ITALIANO (ITALIA)_ITA_DateTimeField[minuteOfDay]");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfWeek();
        long long15 = chronology8.add(3084498754800000L, 3600000054L, 32);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3084613954801728L + "'", long15 == 3084613954801728L);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        java.lang.String str1 = dateTimeFieldType0.getName();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfWeek" + "'", str1, "dayOfWeek");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dayOfWeek" + "'", str2, "dayOfWeek");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone5.getOffset(readableInstant8);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology12, locale13, (java.lang.Integer) 100);
        java.lang.String str16 = dateTimeZone5.getShortName(10L, locale13);
        java.util.Locale.Builder builder17 = builder0.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder17.setExtension('u', "hourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: hourOfHalfday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket7.getZone();
        long long14 = dateTimeZone11.adjustOffset((-62104024800001L), false);
        java.lang.String str16 = dateTimeZone11.getShortName(17999999L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 11);
        boolean boolean20 = dateTimeZone19.isFixed();
        int int22 = dateTimeZone19.getStandardOffset((-1567641599999988130L));
        long long24 = dateTimeZone11.getMillisKeepLocal(dateTimeZone19, 21427200000L);
        int int26 = dateTimeZone19.getStandardOffset(3149193600100L);
        int int28 = dateTimeZone19.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-62104024800001L) + "'", long14 == (-62104024800001L));
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+02:00" + "'", str16, "+02:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 360660000 + "'", int22 == 360660000);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 21073740000L + "'", long24 == 21073740000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 360660000 + "'", int26 == 360660000);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 360660000 + "'", int28 == 360660000);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getDurationType();
        java.lang.String str3 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "year" + "'", str3, "year");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.util.Locale locale2 = new java.util.Locale("DATETIMEFIELD[DAYOFYEAR]", "18000000");
        org.junit.Assert.assertEquals(locale2.toString(), "datetimefield[dayofyear]_18000000");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (byte) -1);
        java.lang.String str11 = dateTimeZone7.getName(32054400100L);
        dateTimeParserBucket4.setZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket4.getZone();
        long long17 = dateTimeZone13.convertLocalToUTC(93623039136000000L, false, (long) 26041);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7200000 + "'", int9 == 7200000);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+02:00" + "'", str11, "+02:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 93623039128800000L + "'", long17 == 93623039128800000L);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder6.clearExtensions();
        java.util.Locale.Builder builder20 = builder6.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder6.setLanguage("999");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 999 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DateTimeField[weekOfWeekyear]");
        java.util.Locale.setDefault(locale1);
        boolean boolean3 = locale1.hasExtensions();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.addUnicodeLocaleAttribute("7");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 7 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(86399);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.convertLocalToUTC((long) 363338398, false, (long) 16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 363251999L + "'", long8 == 363251999L);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u5341\u4e8c\u6708", (double) 289356L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=289356.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.util.Locale locale2 = new java.util.Locale("-9", "11");
        org.junit.Assert.assertEquals(locale2.toString(), "-9_11");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket7.getZone();
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 9);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket7.saveField(dateTimeField14, (-30));
        dateTimeParserBucket7.setOffset((java.lang.Integer) 523909);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale5 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean6 = locale5.hasExtensions();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 100);
        java.lang.String str12 = locale5.getDisplayCountry(locale9);
        java.util.Locale locale13 = locale9.stripExtensions();
        java.lang.String str14 = locale13.getVariant();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale.setDefault(locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((-1350441163324800000L), chronology1, locale15);
        org.junit.Assert.assertEquals(locale5.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        boolean boolean7 = locale6.hasExtensions();
        java.lang.String str8 = locale6.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("-3600000", (java.lang.Throwable) iOException3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.util.Locale locale1 = new java.util.Locale("JAVA.IO.IOEXCEPTION: ZHO");
        org.junit.Assert.assertEquals(locale1.toString(), "java.io.ioexception: zho");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("+59:00_193980000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: +59:00_193980000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) (short) 1);
        java.lang.String str7 = dateTimeZone1.getName(61084800010L);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getOffset(28162800000L);
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) 523909);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7200000L) + "'", long5 == (-7200000L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+02:00" + "'", str7, "+02:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7200000 + "'", int11 == 7200000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.Locale locale11 = new java.util.Locale("eng");
        java.lang.String str12 = dateTimeZone8.getName((long) 2922789, locale11);
        java.lang.String str13 = locale11.getCountry();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.String str7 = locale0.getDisplayScript(locale4);
        java.lang.String str8 = locale0.getDisplayName();
        java.lang.String str10 = locale0.getUnicodeLocaleType("de");
        boolean boolean11 = locale0.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale0.getUnicodeLocaleType("ko-kr");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ko-kr");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese" + "'", str8, "Chinese");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CN" + "'", str3, "CN");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str7 = locale5.getUnicodeLocaleType("35");
        java.lang.String str8 = dateTimeZone1.getName(64713600009L, locale5);
        int int10 = dateTimeZone1.getStandardOffset(5308329601000L);
        long long12 = dateTimeZone1.nextTransition(2419201000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2419201000L + "'", long12 == 2419201000L);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int4 = dateTimeZone1.getOffset(3600097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 28800000 + "'", int4 == 28800000);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.util.Locale locale1 = new java.util.Locale("1497");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "1497");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "1497");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(11, 0);
        long long5 = dateTimeZone2.convertLocalToUTC((-3530000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-43130000L) + "'", long5 == (-43130000L));
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(23);
        long long5 = dateTimeZone1.convertLocalToUTC(54874799L, false, 1638872035257599830L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-27925201L) + "'", long5 == (-27925201L));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("-33000000", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-33000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("+00:00:00.024");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+00:00:00.024");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.util.Locale locale1 = new java.util.Locale("US");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "us");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.io.IOException iOException3 = new java.io.IOException("UTC");
        java.io.IOException iOException6 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.lang.Throwable throwable9 = null;
        java.io.IOException iOException10 = new java.io.IOException("UTC", throwable9);
        java.io.IOException iOException11 = new java.io.IOException(throwable9);
        iOException6.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("UTC", (java.lang.Throwable) iOException11);
        iOException3.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray15 = iOException3.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("24", (java.lang.Throwable) iOException3);
        java.io.IOException iOException17 = new java.io.IOException("Cina", (java.lang.Throwable) iOException16);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(8);
        long long3 = dateTimeZone1.convertUTCToLocal(153L);
        java.lang.String str5 = dateTimeZone1.getName(18489599990L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28800153L + "'", long3 == 28800153L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+08:00" + "'", str5, "+08:00");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale.Builder builder10 = builder1.removeUnicodeLocaleAttribute("71340010");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.util.Locale locale1 = new java.util.Locale("germania");
        java.lang.String str2 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "germania");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology3, locale5, (java.lang.Integer) 1, 0);
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale5.getDisplayName(locale9);
        java.util.Set<java.lang.String> strSet11 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale0.getDisplayCountry(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale0.getUnicodeLocaleType("java.io.IOException: ita");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: java.io.IOException: ita");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de_DE" + "'", str1, "de_DE");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.util.Locale locale2 = new java.util.Locale("\u97e9\u56fd", "java.io.IOException: CHN");
        org.junit.Assert.assertEquals(locale2.toString(), "\u97e9\u56fd_JAVA.IO.IOEXCEPTION: CHN");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+05:12");
        long long5 = dateTimeZone1.convertLocalToUTC(19353600000L, false, 59875200117L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        java.lang.String str8 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 19334880000L + "'", long5 == 19334880000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 18720000 + "'", int7 == 18720000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+05:12" + "'", str8, "+05:12");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.lang.String str3 = dateTimeZone1.getName(0L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+35:00" + "'", str3, "+35:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale0.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getVariant();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "");
        java.util.Locale.Builder builder14 = builder9.setLanguage("ita");
        java.util.Locale locale15 = builder14.build();
        boolean boolean16 = locale15.hasExtensions();
        java.lang.String str17 = locale15.getDisplayScript();
        boolean boolean18 = locale15.hasExtensions();
        java.util.Set<java.lang.String> strSet19 = locale15.getUnicodeLocaleKeys();
        java.lang.String str20 = locale6.getDisplayCountry(locale15);
        java.lang.String str21 = locale6.getCountry();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str7, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ita");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition((long) (-434));
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getNameKey(64713600000L);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 86399);
        long long10 = dateTimeZone1.convertUTCToLocal(86400001L);
        long long13 = dateTimeZone1.adjustOffset((-345599976L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-434L) + "'", long3 == (-434L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400002L + "'", long10 == 86400002L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-345599976L) + "'", long13 == (-345599976L));
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone13.getOffset(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone13.getOffset(readableInstant16);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.String str24 = dateTimeZone13.getShortName(10L, locale21);
        long long26 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, 11L);
        long long29 = dateTimeZone13.adjustOffset(24L, false);
        long long33 = dateTimeZone13.convertLocalToUTC((-318725020800000L), false, 15059566L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11L + "'", long26 == 11L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 24L + "'", long29 == 24L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-318725020800000L) + "'", long33 == (-318725020800000L));
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.io.IOException iOException2 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("UTC", throwable5);
        java.io.IOException iOException7 = new java.io.IOException(throwable5);
        iOException2.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("UTC", (java.lang.Throwable) iOException7);
        java.io.IOException iOException11 = new java.io.IOException();
        java.io.IOException iOException12 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException11);
        iOException7.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable throwable17 = null;
        java.io.IOException iOException18 = new java.io.IOException("UTC", throwable17);
        java.io.IOException iOException19 = new java.io.IOException(throwable17);
        java.io.IOException iOException20 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException19);
        java.lang.Throwable[] throwableArray21 = iOException20.getSuppressed();
        java.io.IOException iOException22 = new java.io.IOException("cinese", (java.lang.Throwable) iOException20);
        iOException11.addSuppressed((java.lang.Throwable) iOException20);
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException20);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.String str4 = locale0.getDisplayVariant();
        java.lang.String str5 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko-KR" + "'", str1, "ko-KR");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Corea del Sud" + "'", str2, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ko_KR" + "'", str5, "ko_KR");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long4 = dateTimeZone1.adjustOffset(60480000010L, true);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName((long) '4');
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        int int12 = dateTimeZone1.getOffsetFromLocal((-134993474380800000L));
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder17 = builder14.setExtension('a', "");
        java.util.Locale.Builder builder19 = builder14.setLanguage("ita");
        java.util.Locale.Builder builder20 = builder14.clearExtensions();
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale locale22 = builder20.build();
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        java.util.Locale.Builder builder28 = builder25.setExtension('a', "100");
        java.util.Locale.Builder builder29 = builder28.clearExtensions();
        java.util.Locale locale30 = builder29.build();
        boolean boolean31 = locale30.hasExtensions();
        java.lang.String str32 = locale22.getDisplayName(locale30);
        boolean boolean33 = dateTimeZone1.equals((java.lang.Object) locale30);
        java.util.Set<java.lang.Character> charSet34 = locale30.getExtensionKeys();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60480000010L + "'", long4 == 60480000010L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7200000 + "'", int6 == 7200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+02:00" + "'", str8, "+02:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7200000 + "'", int10 == 7200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7200000 + "'", int12 == 7200000);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charSet34);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("20");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder1.build();
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale locale12 = new java.util.Locale("utc", "dayOfWeek");
        java.lang.String str13 = locale8.getDisplayName(locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone15.getOffset(readableInstant16);
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str21 = locale19.getUnicodeLocaleType("35");
        java.lang.String str22 = dateTimeZone15.getName(64713600009L, locale19);
        java.lang.String str23 = locale8.getDisplayName(locale19);
        java.lang.String str24 = locale8.getCountry();
        java.lang.String str25 = locale8.getLanguage();
        java.lang.String str26 = locale8.getISO3Country();
        java.lang.String str27 = locale8.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ita" + "'", str9, "ita");
        org.junit.Assert.assertEquals(locale12.toString(), "utc_DAYOFWEEK");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str23, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ita" + "'", str25, "ita");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CHN");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.Object obj3 = null;
        boolean boolean4 = locale1.equals(obj3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chn" + "'", str2, "chn");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str7 = locale5.getDisplayLanguage(locale6);
        java.lang.String str8 = locale0.getDisplayCountry(locale5);
        java.util.Set<java.lang.String> strSet9 = locale5.getUnicodeLocaleKeys();
        java.lang.String str10 = locale5.getDisplayVariant();
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 100);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale25.getISO3Country();
        java.lang.String str27 = locale25.getISO3Language();
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale25.getDisplayVariant(locale28);
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale30.getISO3Country();
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale14, locale19, locale22, locale25, locale30, locale32 };
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.Locale locale36 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList34);
        java.lang.String[] strArray40 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList41);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale47.getISO3Country();
        java.lang.String str49 = locale47.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale47.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology54, locale55, (java.lang.Integer) 100);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale58.getISO3Country();
        java.lang.String str60 = locale58.getISO3Language();
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = locale58.getDisplayVariant(locale61);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale63.getISO3Country();
        java.util.Locale locale65 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale47, locale52, locale55, locale58, locale63, locale65 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.Locale locale69 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale.LanguageRange[] languageRangeArray71 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList72 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList72, languageRangeArray71);
        java.util.Locale locale74 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet75 = locale74.getUnicodeLocaleKeys();
        java.lang.String str76 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, (java.util.Collection<java.lang.String>) strSet75);
        java.lang.String str77 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strSet75);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap78 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList79 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap78);
        java.util.Collection<java.util.Locale> localeCollection80 = null;
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter(languageRangeList79, localeCollection80, filteringMode81);
        java.util.Locale locale83 = java.util.Locale.GERMAN;
        java.util.Locale locale84 = java.util.Locale.getDefault();
        java.lang.String str85 = locale83.getDisplayVariant(locale84);
        java.util.Set<java.lang.String> strSet86 = locale84.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList79, (java.util.Collection<java.lang.String>) strSet86, filteringMode87);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap89 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList90 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList79, strMap89);
        java.util.Locale.LanguageRange[] languageRangeArray91 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList92 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList92, languageRangeArray91);
        java.util.Locale locale94 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet95 = locale94.getUnicodeLocaleKeys();
        java.lang.String str96 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList92, (java.util.Collection<java.lang.String>) strSet95);
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags(languageRangeList90, (java.util.Collection<java.lang.String>) strSet95);
        java.lang.Class<?> wildcardClass98 = languageRangeList90.getClass();
        boolean boolean99 = locale5.equals((java.lang.Object) languageRangeList90);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ita" + "'", str16, "ita");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ITA" + "'", str26, "ITA");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ita" + "'", str27, "ita");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ITA" + "'", str31, "ITA");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ITA" + "'", str48, "ITA");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ita" + "'", str49, "ita");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ITA" + "'", str59, "ITA");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ita" + "'", str60, "ita");
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ITA" + "'", str64, "ITA");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(languageRangeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(languageRangeList79);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode81.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "de");
        org.junit.Assert.assertNotNull(locale84);
// flaky:         org.junit.Assert.assertEquals(locale84.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode87.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(languageRangeList90);
        org.junit.Assert.assertNotNull(languageRangeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("X-LVARIANT-0");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.io.IOException iOException1 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException("Deutschland");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("java.io.IOException: 1497");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception: 1497");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.getID();
        long long15 = dateTimeZone10.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        java.util.Locale locale21 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str22 = dateTimeZone10.getName((long) 'a', locale21);
        java.lang.String str24 = dateTimeZone10.getShortName((-323999998L));
        long long26 = dateTimeZone10.previousTransition((-323999998L));
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-1543680000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 53L + "'", long15 == 53L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals(locale21.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-323999998L) + "'", long26 == (-323999998L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1543680000L) + "'", long28 == (-1543680000L));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale.Builder builder20 = builder17.setLanguage("germany");
        java.util.Locale.Builder builder23 = builder20.setExtension('a', "en");
        java.util.Locale.Builder builder25 = builder23.setRegion("200");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder25.setLanguage("java.io.IOException: java.io.IOException: 35");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: java.io.IOException: java.io.IOException: 35 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Japanese", strMap1);
        java.util.Locale locale5 = new java.util.Locale("java.io.IOException: weekyear", "\u65e5\u672c\u8a9e");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder8.build();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology11, locale13, (java.lang.Integer) 1, 0);
        java.lang.String str17 = locale9.getDisplayVariant(locale13);
        java.util.Set<java.lang.Character> charSet18 = locale13.getExtensionKeys();
        java.util.Locale locale19 = locale13.stripExtensions();
        java.lang.String str20 = locale5.getDisplayName(locale19);
        java.util.Set<java.lang.String> strSet21 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet21);
        org.junit.Assert.assertNotNull(languageRangeList2);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u65e5\u672c\u8a9e)" + "'", str20, "\u65e5\u672c\u8a9e)");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException5 = new java.io.IOException(throwable3);
        java.io.IOException iOException6 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("-292275054", (java.lang.Throwable) iOException6);
        java.lang.String str9 = iOException6.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: weekyear" + "'", str9, "java.io.IOException: weekyear");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.setRegion("ko");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.setUnicodeLocaleKeyword("\u6708\u66dc\u65e5", "168");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.util.Locale locale1 = new java.util.Locale("DateTimeField[monthOfYear]");
        java.lang.String str2 = locale1.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "datetimefield[monthofyear]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("und-u-germany-ita-ko-kr", throwable1);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-4));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+05:12");
        long long5 = dateTimeZone1.convertLocalToUTC(19353600000L, false, 59875200117L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long9 = dateTimeZone1.nextTransition((long) 8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 19334880000L + "'", long5 == 19334880000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 18720000 + "'", int7 == 18720000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8L + "'", long9 == 8L);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.io.IOException iOException1 = new java.io.IOException("minuteOfHour");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setUnicodeLocaleKeyword("zh", "\u97e9\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: java.io.IOException: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3);
        long long3 = dateTimeZone1.nextTransition(21254400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 21254400000L + "'", long3 == 21254400000L);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.io.IOException iOException1 = new java.io.IOException("dayofyear");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        long long14 = dateTimeZone1.convertLocalToUTC(60220800000L, true);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) (short) -1);
        java.lang.String str18 = dateTimeZone1.getNameKey(1L);
        long long20 = dateTimeZone1.previousTransition(48L);
        java.lang.String str21 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60220800000L + "'", long14 == 60220800000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 48L + "'", long20 == 48L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        long long11 = dateTimeParserBucket7.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        int int12 = dateTimeParserBucket7.getOffset();
        java.util.Locale locale13 = dateTimeParserBucket7.getLocale();
        long long14 = dateTimeParserBucket7.computeMillis();
        java.lang.Integer int15 = dateTimeParserBucket7.getOffsetInteger();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException5 = new java.io.IOException(throwable3);
        java.io.IOException iOException6 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("-292275054", (java.lang.Throwable) iOException6);
        java.lang.Class<?> wildcardClass9 = iOException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.centuryOfEra();
        long long16 = dateTimeField14.roundHalfFloor(2419201210L);
        int int18 = dateTimeField14.get((long) (-8015));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 946684800000L + "'", long16 == 946684800000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("UTC");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.lang.String str5 = locale4.toLanguageTag();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.setRegion("ko");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.setRegion("1971");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 1971 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getISO3Language();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale9.getDisplayVariant(locale12);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getISO3Country();
        java.lang.String str22 = locale20.getISO3Language();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale20.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale25.getISO3Country();
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale9, locale14, locale17, locale20, locale25, locale27 };
        java.util.ArrayList<java.util.Locale> localeList29 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList29, localeArray28);
        java.util.Locale locale31 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList29);
        java.lang.String[] strArray35 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList36, filteringMode39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology45, locale46, (java.lang.Integer) 100);
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale46 };
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.Locale locale52 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.List<java.util.Locale> localeList53 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap54);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.parse("italia");
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale63 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology62, locale63, (java.lang.Integer) 100);
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale63 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.Locale locale69 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        org.joda.time.Chronology chronology74 = null;
        java.util.Locale locale75 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology74, locale75, (java.lang.Integer) 100);
        java.util.Locale[] localeArray78 = new java.util.Locale[] { locale75 };
        java.util.ArrayList<java.util.Locale> localeList79 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList79, localeArray78);
        java.util.Locale locale81 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.Locale locale82 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.util.Locale>) localeList79);
        org.joda.time.Chronology chronology84 = null;
        java.util.Locale locale86 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket89 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology84, locale86, (java.lang.Integer) 1, 0);
        java.util.Locale locale90 = java.util.Locale.ENGLISH;
        java.lang.String str91 = locale86.getDisplayName(locale90);
        java.util.Set<java.lang.String> strSet92 = locale86.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strSet92);
        java.lang.String str94 = java.util.Locale.lookupTag(languageRangeList57, (java.util.Collection<java.lang.String>) strSet92);
        java.lang.String str95 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet92);
        java.util.Collection<java.lang.String> strCollection96 = null;
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection96);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap98 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList99 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap98);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ita" + "'", str11, "ita");
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "ita");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "ita");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ita" + "'", str22, "ita");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(locale46);
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "ita");
        org.junit.Assert.assertNotNull(localeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(locale52);
        org.junit.Assert.assertNotNull(localeList53);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "ita");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(locale75);
// flaky:         org.junit.Assert.assertEquals(locale75.toString(), "ita");
        org.junit.Assert.assertNotNull(localeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(locale81);
        org.junit.Assert.assertNull(locale82);
        org.junit.Assert.assertEquals(locale86.toString(), "");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(strSet92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertNotNull(languageRangeList99);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.clear();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("v. Chr.");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: v. Chr. [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean4 = dateTimeZone1.isStandardOffset(5207L);
        long long6 = dateTimeZone1.convertUTCToLocal(21168000000L);
        java.lang.String str8 = dateTimeZone1.getShortName(1638872035257599830L);
        int int10 = dateTimeZone1.getOffset(1001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 21168000010L + "'", long6 == 21168000010L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.010" + "'", str8, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.Class<?> wildcardClass11 = timeZone9.getClass();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ita");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u6708");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=12?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.util.Locale locale1 = new java.util.Locale("DateTimeField[monthOfYear]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for datetimefield[monthofyear]");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "datetimefield[monthofyear]");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("-434:00_DEUTSCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: -434:00_DEUTSCH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.util.Locale locale2 = new java.util.Locale("zh-TW", "\u661f\u671f\u65e5");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u661f\u671f\u65e5");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.util.Locale locale1 = new java.util.Locale("\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals(locale1.toString(), "\u30a4\u30bf\u30ea\u30a2\u8a9e");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        java.util.Locale.Builder builder16 = builder13.setExtension('u', "year");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder13.setRegion("\u4e00\u6708_DateTimeField[dayOfMonth]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: java.io.ioexception: java.io.ioexception: 35_??_DateTimeField[dayOfMonth] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("58");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=58");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("69", (double) 933135772884200L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=9.331357728842E14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale locale6 = builder3.build();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale6.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet9 = locale6.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "utc");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        int int31 = dateTimeParserBucket30.getOffset();
        java.lang.Object obj32 = dateTimeParserBucket30.saveState();
        java.util.Locale locale33 = dateTimeParserBucket30.getLocale();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        java.util.Locale.Builder builder35 = builder22.setLocale(locale34);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder38 = builder35.setUnicodeLocaleKeyword("Thursday", "China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Thursday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.io.IOException iOException3 = new java.io.IOException("UTC");
        java.io.IOException iOException5 = new java.io.IOException("zho");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("2", (java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: zho", (java.lang.Throwable) iOException3);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray10 = iOException3.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("UTC");
        java.io.IOException iOException15 = new java.io.IOException("zho");
        iOException13.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException("Thu", (java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException21 = new java.io.IOException("UTC");
        java.io.IOException iOException23 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray24 = iOException23.getSuppressed();
        java.io.IOException iOException26 = new java.io.IOException("dayofyear");
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException26);
        iOException23.addSuppressed((java.lang.Throwable) iOException26);
        iOException21.addSuppressed((java.lang.Throwable) iOException26);
        iOException19.addSuppressed((java.lang.Throwable) iOException21);
        iOException3.addSuppressed((java.lang.Throwable) iOException19);
        java.io.IOException iOException35 = new java.io.IOException("UTC");
        java.io.IOException iOException38 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray39 = iOException38.getSuppressed();
        java.lang.Throwable throwable41 = null;
        java.io.IOException iOException42 = new java.io.IOException("UTC", throwable41);
        java.io.IOException iOException43 = new java.io.IOException(throwable41);
        iOException38.addSuppressed((java.lang.Throwable) iOException43);
        java.io.IOException iOException45 = new java.io.IOException("UTC", (java.lang.Throwable) iOException43);
        iOException35.addSuppressed((java.lang.Throwable) iOException43);
        java.lang.Throwable[] throwableArray47 = iOException35.getSuppressed();
        java.io.IOException iOException48 = new java.io.IOException("24", (java.lang.Throwable) iOException35);
        java.io.IOException iOException50 = new java.io.IOException("ita");
        java.io.IOException iOException51 = new java.io.IOException((java.lang.Throwable) iOException50);
        iOException35.addSuppressed((java.lang.Throwable) iOException50);
        java.io.IOException iOException53 = new java.io.IOException("\u661f\u671f\u56db", (java.lang.Throwable) iOException50);
        iOException19.addSuppressed((java.lang.Throwable) iOException53);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray47);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        long long17 = dateTimeZone9.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone9.isLocalDateTimeGap(localDateTime18);
        long long22 = dateTimeZone9.adjustOffset(2332864799L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2332864799L + "'", long22 == 2332864799L);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        boolean boolean3 = dateTimeZone0.isStandardOffset((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        long long10 = dateTimeZone5.convertLocalToUTC((long) 1, true);
        java.lang.String str11 = dateTimeZone5.toString();
        long long14 = dateTimeZone5.convertLocalToUTC(2L, false);
        long long16 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 'u');
        boolean boolean17 = dateTimeZone5.isFixed();
        java.lang.String str19 = dateTimeZone5.getName(128L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 117L + "'", long16 == 117L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException5 = new java.io.IOException(throwable3);
        java.io.IOException iOException6 = new java.io.IOException(throwable3);
        java.io.IOException iOException7 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException8 = new java.io.IOException("JPN", throwable3);
        java.lang.String str9 = iOException8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: JPN" + "'", str9, "java.io.IOException: JPN");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-8));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str5 = dateTimeZone1.getNameKey((-259200000L));
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str8 = dateTimeZone1.getShortName(50400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-28800000) + "'", int3 == (-28800000));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-08:00" + "'", str8, "-08:00");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-8807));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getStandardOffset((long) (byte) -1);
        java.lang.String str20 = dateTimeZone17.toString();
        java.lang.String str22 = dateTimeZone17.getShortName((long) '#');
        long long24 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone9.isLocalDateTimeGap(localDateTime25);
        java.lang.String str28 = dateTimeZone9.getShortName((-3599893L));
        long long31 = dateTimeZone9.adjustOffset(1638872037055564460L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-28800000) + "'", int19 == (-28800000));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-08:00" + "'", str20, "-08:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-08:00" + "'", str22, "-08:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 28800035L + "'", long24 == 28800035L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1638872037055564460L + "'", long31 == 1638872037055564460L);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        dateTimeParserBucket4.setZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getShortName((-292260000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setExtension('#', "\u97e9\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '???' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder17.setLanguage("ita");
        java.util.Locale.Builder builder24 = builder17.removeUnicodeLocaleAttribute("18720052");
        java.util.Locale.Builder builder26 = builder17.setVariant("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.setRegion("ko");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.setExtension('x', "French");
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("77");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 77 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.util.Locale locale3 = new java.util.Locale("74176865", "259200032", "hourOfDay");
        org.junit.Assert.assertEquals(locale3.toString(), "74176865_259200032_hourOfDay");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#');
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale7.getDisplayScript();
        java.util.Set<java.lang.Character> charSet11 = locale7.getExtensionKeys();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale locale5 = new java.util.Locale("weekOfWeekyear");
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale3.getDisplayVariant(locale5);
        java.lang.String str8 = locale3.getDisplayName();
        java.util.Set<java.lang.Character> charSet9 = locale3.getExtensionKeys();
        java.lang.String str10 = locale3.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "weekofweekyear");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.util.Locale locale1 = new java.util.Locale("Etats-Unis");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "etats-unis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        long long5 = dateTimeZone1.convertLocalToUTC(35L, true, 32054400052L);
        boolean boolean6 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        long long12 = dateTimeZone1.convertLocalToUTC((-7200000L), false, 3974400000L);
        int int14 = dateTimeZone1.getOffsetFromLocal(79199977L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-7200000L) + "'", long12 == (-7200000L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        long long8 = dateTimeZone5.adjustOffset(1L, false);
        int int10 = dateTimeZone5.getStandardOffset((long) (-1));
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone5.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone5.adjustOffset((-3599903L), false);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-356399998L));
        long long19 = dateTimeZone5.previousTransition((-360000362L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 360000000 + "'", int10 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599903L) + "'", long15 == (-3599903L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-712799998L) + "'", long17 == (-712799998L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360000362L) + "'", long19 == (-360000362L));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.util.Locale locale3 = new java.util.Locale("Cina", "71", "CHINESE");
        org.junit.Assert.assertEquals(locale3.toString(), "cina_71_CHINESE");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("java.io.IOException: java.io.IOException: java.io.IOException: utc", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception: java.io.ioexception: java.io.ioexception: utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("zho");
        java.util.Locale locale9 = builder3.build();
        java.util.Locale.Builder builder11 = builder3.setVariant("79200");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder3.removeUnicodeLocaleAttribute("italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: italien (Italie) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "utc");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zho");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str15 = locale8.getExtension('u');
        java.util.Locale locale19 = new java.util.Locale("2", "Chinese", "clockhourOfHalfday");
        java.lang.String str20 = locale8.getDisplayCountry(locale19);
        java.lang.String str21 = locale8.getDisplayLanguage();
        java.lang.String str23 = locale8.getExtension('a');
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals(locale19.toString(), "2_CHINESE_clockhourOfHalfday");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u6587" + "'", str21, "\u4e2d\u6587");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.io.IOException iOException3 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.Throwable throwable6 = null;
        java.io.IOException iOException7 = new java.io.IOException("UTC", throwable6);
        java.io.IOException iOException8 = new java.io.IOException(throwable6);
        iOException3.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.io.IOException iOException13 = new java.io.IOException("UTC");
        java.io.IOException iOException15 = new java.io.IOException("zho");
        iOException13.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException("Thu", (java.lang.Throwable) iOException17);
        iOException3.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException("10", (java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray21 = iOException18.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getOffset((-1800096L));
        long long7 = dateTimeZone1.previousTransition(17999999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360000000 + "'", int3 == 360000000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 360000000 + "'", int5 == 360000000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17999999L + "'", long7 == 17999999L);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket7.getZone();
        java.lang.Integer int11 = dateTimeParserBucket7.getPivotYear();
        int int12 = dateTimeParserBucket7.getOffset();
        int int13 = dateTimeParserBucket7.getOffset();
        java.lang.Integer int14 = dateTimeParserBucket7.getPivotYear();
        dateTimeParserBucket7.setOffset((java.lang.Integer) 5100);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.io.IOException iOException1 = new java.io.IOException("utc");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("jpn");
        java.io.IOException iOException7 = new java.io.IOException("UTC");
        java.io.IOException iOException9 = new java.io.IOException("zho");
        iOException7.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("2", (java.lang.Throwable) iOException7);
        iOException4.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException4.getSuppressed();
        iOException1.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.String str15 = iOException4.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: jpn" + "'", str15, "java.io.IOException: jpn");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587" + "'", str3, "\u4e2d\u6587");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("50");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 50 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("millisOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=millisofday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException2);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable throwable12 = null;
        java.io.IOException iOException13 = new java.io.IOException("UTC", throwable12);
        java.io.IOException iOException14 = new java.io.IOException(throwable12);
        java.io.IOException iOException15 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException14);
        java.lang.Throwable[] throwableArray16 = iOException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = iOException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = iOException15.getSuppressed();
        iOException9.addSuppressed((java.lang.Throwable) iOException15);
        java.lang.Throwable[] throwableArray20 = iOException15.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffset(18748800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("millisOfSecond");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=millisofsecond");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.util.Locale locale1 = new java.util.Locale("French");
        org.junit.Assert.assertEquals(locale1.toString(), "french");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(7, (-100751458));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -100751458");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("+02:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: +02:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.String str17 = locale10.getDisplayScript(locale14);
        java.lang.String str18 = locale10.getISO3Language();
        dateTimeParserBucket7.saveField(dateTimeFieldType8, "DateTimeField[dayOfYear]", locale10);
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType8.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType8.getRangeDurationType();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale0.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getVariant();
        java.util.Locale locale6 = locale3.stripExtensions();
        boolean boolean7 = locale3.hasExtensions();
        java.util.Set<java.lang.String> strSet8 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ita" + "'", str2, "ita");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        java.io.IOException iOException1 = new java.io.IOException("5131");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket(259200031L, chronology1, locale3);
        java.lang.String str5 = locale3.getLanguage();
        java.util.Locale locale7 = new java.util.Locale("CAN");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale7.getUnicodeLocaleType("10 (JPN,us)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 10 (JPN,us)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertEquals(locale7.toString(), "can");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.util.Locale locale1 = new java.util.Locale("DateTimeField[clockhourOfDay]");
        org.junit.Assert.assertEquals(locale1.toString(), "datetimefield[clockhourofday]");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        dateTimeParserBucket4.setZone(dateTimeZone8);
        long long13 = dateTimeZone8.convertLocalToUTC(3149193600100L, false, (-88L));
        int int15 = dateTimeZone8.getOffset(324000001L);
        boolean boolean16 = dateTimeZone8.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3148833600100L + "'", long13 == 3148833600100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 360000000 + "'", int15 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale12.getISO3Country();
        java.lang.String str14 = locale12.getISO3Language();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale12.getDisplayVariant(locale15);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale23.getISO3Country();
        java.lang.String str25 = locale23.getISO3Language();
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale23.getDisplayVariant(locale26);
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale28.getISO3Country();
        java.util.Locale locale30 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale12, locale17, locale20, locale23, locale28, locale30 };
        java.util.ArrayList<java.util.Locale> localeList32 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList32, localeArray31);
        java.util.Locale locale34 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList32);
        java.lang.String[] strArray38 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String str41 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList39, filteringMode42);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.parse("ja");
        java.util.Locale.LanguageRange languageRange47 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] { languageRange47 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale54.getISO3Country();
        java.lang.String str56 = locale54.getISO3Language();
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale54.getDisplayVariant(locale57);
        java.util.Locale locale59 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology61 = null;
        java.util.Locale locale62 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology61, locale62, (java.lang.Integer) 100);
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale65.getISO3Country();
        java.lang.String str67 = locale65.getISO3Language();
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale65.getDisplayVariant(locale68);
        java.util.Locale locale70 = java.util.Locale.getDefault();
        java.lang.String str71 = locale70.getISO3Country();
        java.util.Locale locale72 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale54, locale59, locale62, locale65, locale70, locale72 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.util.Locale>) localeList74, filteringMode77);
        java.util.Locale locale79 = java.util.Locale.lookup(languageRangeList45, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Locale locale81 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList78);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ita" + "'", str14, "ita");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ita" + "'", str25, "ita");
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "it");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ita" + "'", str56, "ita");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "it");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
// flaky:         org.junit.Assert.assertEquals(locale59.toString(), "it");
        org.junit.Assert.assertNotNull(locale62);
// flaky:         org.junit.Assert.assertEquals(locale62.toString(), "it");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "it");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ita" + "'", str67, "ita");
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "it");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
// flaky:         org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode77.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertNull(locale80);
        org.junit.Assert.assertNull(locale81);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        java.util.Locale locale1 = new java.util.Locale("fr,FR");
        org.junit.Assert.assertEquals(locale1.toString(), "fr,fr");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("10", "jpn", "us");
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("Italian");
        java.util.Locale.setDefault(category0, locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale10.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale4.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10 (JPN,us)" + "'", str5, "10 (JPN,us)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "10_JPN_us");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "10_JPN_us");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "italian");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguage("it");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.setLanguageTag("thu");
        java.util.Locale.Builder builder15 = builder10.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder10.removeUnicodeLocaleAttribute("-1562400000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: -1562400000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Thursday", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Language();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale6.getDisplayVariant(locale9);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale17.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale6, locale11, locale14, locale17, locale22, locale24 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList26);
        java.lang.String[] strArray32 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleKeys();
        java.lang.String str41 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strSet40);
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strSet43, filteringMode44);
        java.util.Locale.LanguageRange languageRange47 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] { languageRange47 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale54.getISO3Country();
        java.lang.String str56 = locale54.getISO3Language();
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale54.getDisplayVariant(locale57);
        java.util.Locale locale59 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology61 = null;
        java.util.Locale locale62 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology61, locale62, (java.lang.Integer) 100);
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale65.getISO3Country();
        java.lang.String str67 = locale65.getISO3Language();
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale65.getDisplayVariant(locale68);
        java.util.Locale locale70 = java.util.Locale.getDefault();
        java.lang.String str71 = locale70.getISO3Country();
        java.util.Locale locale72 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale54, locale59, locale62, locale65, locale70, locale72 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.util.Locale>) localeList74, filteringMode77);
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.Locale locale81 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList79);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
// flaky:         org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale62);
// flaky:         org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
// flaky:         org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode77.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNull(locale81);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setVariant("4969628");
        java.util.Locale.Builder builder6 = builder0.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder8 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setScript("18");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 18 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.io.IOException iOException2 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("UTC", throwable5);
        java.io.IOException iOException7 = new java.io.IOException(throwable5);
        iOException2.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("UTC", (java.lang.Throwable) iOException7);
        java.io.IOException iOException11 = new java.io.IOException();
        java.io.IOException iOException12 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException11);
        iOException7.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray14 = iOException7.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException7);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("java.io.IOException: java.io.IOException: Thu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'java.io.IOException: java.io.IOException: Thu' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder4 = builder3.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(99, 3);
        int int4 = dateTimeZone2.getStandardOffset(1860087L);
        long long6 = dateTimeZone2.convertUTCToLocal(3600011L);
        java.lang.String str7 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 356580000 + "'", int4 == 356580000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 360180011L + "'", long6 == 360180011L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+99:03" + "'", str7, "+99:03");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Germania", strMap1);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale3.getDisplayName();
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet6, filteringMode7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap9);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale6 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean7 = locale6.hasExtensions();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.lang.String str14 = dateTimeZone1.getShortName((long) (short) 1, locale10);
        java.lang.String str15 = dateTimeZone1.getID();
        int int17 = dateTimeZone1.getStandardOffset(60480000010L);
        int int19 = dateTimeZone1.getStandardOffset(259200107L);
        int int21 = dateTimeZone1.getStandardOffset((long) 1970);
        int int23 = dateTimeZone1.getOffsetFromLocal(61084800010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale6.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.String str11 = locale10.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale10.getUnicodeLocaleType("inglese (Stati Uniti)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: inglese (Stati Uniti)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        long long11 = dateTimeParserBucket7.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        int int12 = dateTimeParserBucket7.getOffset();
        dateTimeParserBucket7.setOffset((int) (byte) 0);
        long long16 = dateTimeParserBucket7.computeMillis(false);
        java.util.Locale locale17 = dateTimeParserBucket7.getLocale();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "");
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("x-lvariant-0_ITALIANO (ITALIA)_ITA", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        int int31 = dateTimeParserBucket30.getOffset();
        java.lang.Object obj32 = dateTimeParserBucket30.saveState();
        java.util.Locale locale33 = dateTimeParserBucket30.getLocale();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        java.util.Locale.Builder builder35 = builder22.setLocale(locale34);
        java.util.Locale.Builder builder36 = builder22.clearExtensions();
        java.util.Locale.Builder builder37 = builder36.clearExtensions();
        java.util.Locale locale38 = builder37.build();
        java.util.Locale.Builder builder41 = builder37.setExtension('x', "2008");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder43 = builder41.setLanguage("+00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +00:00:00.010 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(builder41);
    }
}
