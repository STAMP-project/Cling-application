import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(69);
        long long3 = dateTimeZone1.nextTransition(212400000000L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 212400000000L + "'", long3 == 212400000000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-30));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguage("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.setLanguageTag("100");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 100 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        java.util.Locale locale2 = new java.util.Locale("weekyear", "gio");
        org.junit.Assert.assertEquals(locale2.toString(), "weekyear_GIO");
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale.Builder builder15 = builder13.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName(1001L, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(99, 3);
        int int4 = dateTimeZone2.getStandardOffset(1860087L);
        int int6 = dateTimeZone2.getOffset((-619148000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 356580000 + "'", int4 == 356580000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 356580000 + "'", int6 == 356580000);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "");
        java.util.Locale.Builder builder14 = builder9.setLanguageTag("eng");
        java.util.Locale.Builder builder15 = builder9.clearExtensions();
        java.util.Locale locale16 = builder15.build();
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.lang.String str18 = locale17.toLanguageTag();
        java.lang.String str19 = locale17.getDisplayScript();
        java.util.Locale.Builder builder20 = builder15.setLocale(locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale21.getISO3Country();
        java.lang.String str23 = locale21.getISO3Language();
        java.util.Locale.setDefault(locale21);
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.lang.String str28 = locale21.getDisplayCountry(locale25);
        java.util.Locale.setDefault(locale25);
        java.lang.String str30 = locale25.getLanguage();
        java.util.Locale.Builder builder31 = builder20.setLocale(locale25);
        java.util.Locale locale32 = builder31.build();
        java.util.Locale.setDefault(category0, locale32);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "eng");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh" + "'", str18, "zh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zho" + "'", str23, "zho");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u56fd" + "'", str27, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh" + "'", str30, "zh");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
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
        int int16 = dateTimeParserBucket7.getOffset();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 97L);
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) 10);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        long long10 = dateTimeZone1.convertUTCToLocal(254099948L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 254099948L + "'", long10 == 254099948L);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguageTag("CHN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setVariant("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: java.io.ioexception: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        java.util.Locale locale1 = new java.util.Locale("Italiano");
        org.junit.Assert.assertEquals(locale1.toString(), "italiano");
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        java.io.IOException iOException1 = new java.io.IOException("en");
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DateTimeField[hourOfDay]");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setScript("");
        java.util.Locale.Builder builder8 = builder5.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder10 = builder5.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder12 = builder5.addUnicodeLocaleAttribute("ita");
        java.util.Locale locale13 = builder5.build();
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = locale1.getDisplayLanguage(locale13);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale.Builder builder20 = builder17.setExtension('a', "");
        java.util.Locale.Builder builder22 = builder17.setLanguageTag("eng");
        java.util.Locale.Builder builder23 = builder17.clearExtensions();
        java.util.Locale locale24 = builder23.build();
        java.util.Locale locale25 = java.util.Locale.CHINESE;
        java.lang.String str26 = locale25.toLanguageTag();
        java.lang.String str27 = locale25.getDisplayScript();
        java.util.Locale.Builder builder28 = builder23.setLocale(locale25);
        java.lang.String str29 = locale13.getDisplayCountry(locale25);
        java.util.Locale.setDefault(locale25);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "eng");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh" + "'", str26, "zh");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("cinese");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale.Builder builder15 = builder12.setExtension('x', "86399");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setUnicodeLocaleKeyword("48", "English");
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale6);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        java.lang.String str11 = locale6.getCountry();
        java.util.Set<java.lang.String> strSet12 = locale6.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IT" + "'", str11, "IT");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("year");
        java.util.Locale.Builder builder13 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder10.setUnicodeLocaleKeyword("24", "259200032");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: 259200032 [at index 0]");
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
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
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
        java.util.Locale locale26 = new java.util.Locale("CHN");
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale.Builder builder28 = builder20.setLocale(locale26);
        java.util.Locale.Builder builder30 = builder28.setLanguageTag("Friday");
        java.util.Locale.Builder builder33 = builder28.setUnicodeLocaleKeyword("47", "italian");
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
        org.junit.Assert.assertEquals(locale26.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "chn" + "'", str27, "chn");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setScript("java.io.IOException: java.io.IOException: germany");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: java.io.IOException: java.io.IOException: germany [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-292122054L));
        java.lang.String str12 = dateTimeZone1.getName(0L);
        java.lang.String str14 = dateTimeZone1.getShortName((long) 15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        java.io.IOException iOException4 = new java.io.IOException("jpn");
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("35", (java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("Germania", (java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("dayofyear", (java.lang.Throwable) iOException6);
        java.io.IOException iOException10 = new java.io.IOException("utc");
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("jpn");
        java.io.IOException iOException16 = new java.io.IOException("UTC");
        java.io.IOException iOException18 = new java.io.IOException("zho");
        iOException16.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException("2", (java.lang.Throwable) iOException16);
        iOException13.addSuppressed((java.lang.Throwable) iOException20);
        java.lang.Throwable[] throwableArray22 = iOException13.getSuppressed();
        iOException10.addSuppressed((java.lang.Throwable) iOException13);
        iOException6.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException27 = new java.io.IOException("UTC");
        java.io.IOException iOException29 = new java.io.IOException("zho");
        iOException27.addSuppressed((java.lang.Throwable) iOException29);
        java.io.IOException iOException31 = new java.io.IOException("2", (java.lang.Throwable) iOException27);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        java.lang.Throwable[] throwableArray33 = iOException31.getSuppressed();
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) iOException31);
        java.io.IOException iOException36 = new java.io.IOException();
        java.io.IOException iOException37 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException36);
        java.lang.Throwable[] throwableArray38 = iOException37.getSuppressed();
        iOException31.addSuppressed((java.lang.Throwable) iOException37);
        java.lang.Throwable[] throwableArray40 = iOException37.getSuppressed();
        iOException6.addSuppressed((java.lang.Throwable) iOException37);
        java.lang.String str42 = iOException37.toString();
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u5fb7\u56fd" + "'", str42, "\u5fb7\u56fd");
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360660000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        java.io.IOException iOException1 = new java.io.IOException("FR_FR");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("jpn");
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException6);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        java.io.IOException iOException1 = new java.io.IOException("datetimefield[yearofcentury]");
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        int int3 = dateTimeZone0.getStandardOffset(1210L);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        boolean boolean8 = dateTimeZone6.isStandardOffset(3124137600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        java.io.IOException iOException1 = new java.io.IOException("41");
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale19.getISO3Country();
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
        java.lang.String str37 = locale36.getISO3Country();
        java.lang.String str38 = locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale47.getISO3Country();
        java.lang.String str49 = locale47.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale47.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale52.getISO3Country();
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList68, strMap69);
        java.util.Locale locale71 = java.util.Locale.CHINESE;
        java.lang.String str72 = locale71.toLanguageTag();
        java.lang.String str73 = locale71.getLanguage();
        java.util.Locale.Builder builder74 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder75 = builder74.clear();
        java.util.Locale locale76 = builder75.build();
        java.util.Locale locale77 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str78 = locale76.getDisplayLanguage(locale77);
        java.lang.String str79 = locale71.getDisplayCountry(locale76);
        java.util.Set<java.lang.String> strSet80 = locale76.getUnicodeLocaleKeys();
        java.lang.String str81 = java.util.Locale.lookupTag(languageRangeList68, (java.util.Collection<java.lang.String>) strSet80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap82 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList68, strMap82);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap84 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList85 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList83, strMap84);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ita" + "'", str5, "ita");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ita" + "'", str16, "ita");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ITA" + "'", str20, "ITA");
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
        org.junit.Assert.assertEquals(locale36.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ITA" + "'", str37, "ITA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ita" + "'", str38, "ita");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ITA" + "'", str48, "ITA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ita" + "'", str49, "ita");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ITA" + "'", str53, "ITA");
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
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "zh" + "'", str72, "zh");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "zh" + "'", str73, "zh");
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(languageRangeList83);
        org.junit.Assert.assertNotNull(languageRangeList85);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale locale11 = builder3.build();
        java.util.Locale.Builder builder13 = builder3.removeUnicodeLocaleAttribute("100");
        java.util.Locale.Builder builder15 = builder13.removeUnicodeLocaleAttribute("chn");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
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
        long long16 = dateTimeField14.roundHalfEven((long) 53);
        boolean boolean17 = dateTimeField14.isSupported();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 946684800000L + "'", long16 == 946684800000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("Japanese");
        java.util.Locale locale12 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder9.setUnicodeLocaleKeyword("x-lvariant-84", "+00:05:45.599");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: x-lvariant-84 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ita");
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("US");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = new java.util.Locale("US");
        java.lang.String str10 = locale9.getVariant();
        java.util.Locale.setDefault(category7, locale9);
        java.util.Locale locale12 = java.util.Locale.getDefault(category7);
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology14, locale15, (java.lang.Integer) (-1), 0);
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.lang.String str20 = locale19.getScript();
        java.lang.String str21 = locale19.getScript();
        boolean boolean22 = dateTimeParserBucket18.restoreState((java.lang.Object) locale19);
        java.util.Locale.setDefault(category7, locale19);
        java.util.Set<java.lang.String> strSet24 = locale19.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strSet24, filteringMode25);
        java.lang.String str27 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet24);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale9.toString(), "us");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "us");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setLanguage("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("ko");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: -1");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: -1" + "'", str2, "java.io.IOException: java.io.IOException: java.io.IOException: -1");
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Deutsch", (double) 0);
        double double3 = languageRange2.getWeight();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale locale5 = locale4.stripExtensions();
        boolean boolean6 = languageRange2.equals((java.lang.Object) locale5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("91");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=91");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 97L);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) dateTimeZone7);
        long long11 = dateTimeZone1.convertUTCToLocal(17999999L);
        int int13 = dateTimeZone1.getOffsetFromLocal(3105388800000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 17999999L + "'", long11 == 17999999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(212400000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("19");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-2399), 362);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 362");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("java.io.IOException: java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:java.io.ioexception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        java.util.Locale locale3 = new java.util.Locale("+01:00", "ISOCHRONOLOGY[UTC]", "DATETIMEFIELD[CLOCKHOUROFHALFDAY]");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "+01:00_ISOCHRONOLOGY[UTC]_DATETIMEFIELD[CLOCKHOUROFHALFDAY]");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1439, 80294);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 80294");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("2", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray9 = iOException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        java.io.IOException iOException3 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("DateTimeField[millisOfDay]", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException10 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("ITA", (java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.lang.Throwable[] throwableArray15 = iOException13.getSuppressed();
        java.io.IOException iOException18 = new java.io.IOException("UTC");
        java.io.IOException iOException21 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray22 = iOException21.getSuppressed();
        java.lang.Throwable throwable24 = null;
        java.io.IOException iOException25 = new java.io.IOException("UTC", throwable24);
        java.io.IOException iOException26 = new java.io.IOException(throwable24);
        iOException21.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException("UTC", (java.lang.Throwable) iOException26);
        iOException18.addSuppressed((java.lang.Throwable) iOException26);
        java.lang.Throwable[] throwableArray30 = iOException18.getSuppressed();
        java.io.IOException iOException31 = new java.io.IOException("24", (java.lang.Throwable) iOException18);
        java.io.IOException iOException33 = new java.io.IOException("DE");
        java.io.IOException iOException35 = new java.io.IOException("ISOChronology[UTC]");
        iOException33.addSuppressed((java.lang.Throwable) iOException35);
        iOException18.addSuppressed((java.lang.Throwable) iOException35);
        iOException13.addSuppressed((java.lang.Throwable) iOException18);
        iOException3.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException40 = new java.io.IOException("Chinese (China)", (java.lang.Throwable) iOException18);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
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
        java.util.Set<java.lang.String> strSet14 = locale11.getUnicodeLocaleKeys();
        java.lang.String str15 = locale11.getVariant();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Germania" + "'", str8, "Germania");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str12, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.010" + "'", str13, "+00:00:00.010");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6926399, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale9.getDisplayScript();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder13 = builder7.clearExtensions();
        java.util.Locale locale14 = builder13.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.lang.String str7 = locale0.getDisplayCountry(locale4);
        java.util.Locale.setDefault(locale4);
        java.lang.String str9 = locale4.getLanguage();
        java.util.Locale locale10 = locale4.stripExtensions();
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale10.getCountry();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CN" + "'", str12, "CN");
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(7223);
        dateTimeParserBucket7.setZone(dateTimeZone10);
        long long13 = dateTimeZone10.previousTransition(6652801000L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 6652801000L + "'", long13 == 6652801000L);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        java.lang.Object obj10 = dateTimeParserBucket6.saveState();
        dateTimeParserBucket6.setPivotYear((java.lang.Integer) 23);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(362);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53, 53);
        long long4 = dateTimeZone2.convertUTCToLocal(27460800000L);
        java.lang.String str6 = dateTimeZone2.getNameKey(1187L);
        java.lang.String str7 = dateTimeZone2.toString();
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        int int11 = dateTimeZone9.getOffset(915148799991L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 27654780000L + "'", long4 == 27654780000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+53:53" + "'", str7, "+53:53");
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Ora media di Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        java.util.Locale locale3 = new java.util.Locale("", "CINESE", "+168:09");
        org.junit.Assert.assertEquals(locale3.toString(), "_CINESE_+168:09");
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-2966796), (-100751458));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -100751458");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getName(259200107L);
        int int14 = dateTimeZone10.getOffsetFromLocal((-62104060800001L));
        long long18 = dateTimeZone10.convertLocalToUTC(3084498489600000L, false, 259200031L);
        long long20 = dateTimeZone10.convertUTCToLocal(789263999954L);
        java.lang.String str22 = dateTimeZone10.getName((-61977744000000L));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3084498489600000L + "'", long18 == 3084498489600000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 789263999954L + "'", long20 == 789263999954L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("era", (double) 259286399L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.59286399E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("x-lvariant-ERA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
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
        int int24 = dateTimeZone22.getStandardOffset(4492800011L);
        long long27 = dateTimeZone22.adjustOffset(672L, false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 672L + "'", long27 == 672L);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) (short) 1);
        java.lang.String str7 = dateTimeZone1.getName(61084800010L);
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str10 = dateTimeZone1.getNameKey(575144865532800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7200000L) + "'", long5 == (-7200000L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+02:00" + "'", str7, "+02:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+02:00" + "'", str8, "+02:00");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.Object obj8 = dateTimeParserBucket7.saveState();
        dateTimeParserBucket7.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale13 = java.util.Locale.US;
        dateTimeParserBucket7.saveField(dateTimeFieldType11, "centuryOfEra", locale13);
        java.lang.String str15 = dateTimeFieldType11.getName();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType11.getDurationType();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "yearOfCentury" + "'", str15, "yearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType16);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        java.io.IOException iOException2 = new java.io.IOException("jpn");
        java.io.IOException iOException5 = new java.io.IOException("UTC");
        java.io.IOException iOException7 = new java.io.IOException("zho");
        iOException5.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("2", (java.lang.Throwable) iOException5);
        iOException2.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("ITA", (java.lang.Throwable) iOException14);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        java.io.IOException iOException22 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray23 = iOException22.getSuppressed();
        java.lang.Throwable throwable25 = null;
        java.io.IOException iOException26 = new java.io.IOException("UTC", throwable25);
        java.io.IOException iOException27 = new java.io.IOException(throwable25);
        iOException22.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException29 = new java.io.IOException("UTC", (java.lang.Throwable) iOException27);
        java.io.IOException iOException31 = new java.io.IOException();
        java.io.IOException iOException32 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException31);
        iOException27.addSuppressed((java.lang.Throwable) iOException31);
        java.lang.Throwable throwable37 = null;
        java.io.IOException iOException38 = new java.io.IOException("UTC", throwable37);
        java.io.IOException iOException39 = new java.io.IOException(throwable37);
        java.io.IOException iOException40 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException39);
        java.lang.Throwable[] throwableArray41 = iOException40.getSuppressed();
        java.io.IOException iOException42 = new java.io.IOException("cinese", (java.lang.Throwable) iOException40);
        iOException31.addSuppressed((java.lang.Throwable) iOException40);
        java.io.IOException iOException44 = new java.io.IOException("Deutschland", (java.lang.Throwable) iOException40);
        java.lang.Throwable throwable47 = null;
        java.io.IOException iOException48 = new java.io.IOException("UTC", throwable47);
        java.io.IOException iOException49 = new java.io.IOException(throwable47);
        java.io.IOException iOException50 = new java.io.IOException("7", (java.lang.Throwable) iOException49);
        java.io.IOException iOException51 = new java.io.IOException((java.lang.Throwable) iOException49);
        iOException40.addSuppressed((java.lang.Throwable) iOException49);
        java.io.IOException iOException54 = new java.io.IOException("jpn");
        java.io.IOException iOException57 = new java.io.IOException("UTC");
        java.io.IOException iOException59 = new java.io.IOException("zho");
        iOException57.addSuppressed((java.lang.Throwable) iOException59);
        java.io.IOException iOException61 = new java.io.IOException("2", (java.lang.Throwable) iOException57);
        iOException54.addSuppressed((java.lang.Throwable) iOException61);
        java.lang.Throwable[] throwableArray63 = iOException61.getSuppressed();
        java.io.IOException iOException66 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray67 = iOException66.getSuppressed();
        java.io.IOException iOException68 = new java.io.IOException((java.lang.Throwable) iOException66);
        java.io.IOException iOException69 = new java.io.IOException("ITA", (java.lang.Throwable) iOException66);
        java.io.IOException iOException70 = new java.io.IOException((java.lang.Throwable) iOException69);
        iOException61.addSuppressed((java.lang.Throwable) iOException69);
        java.io.IOException iOException72 = new java.io.IOException((java.lang.Throwable) iOException61);
        java.io.IOException iOException73 = new java.io.IOException((java.lang.Throwable) iOException61);
        iOException49.addSuppressed((java.lang.Throwable) iOException73);
        iOException17.addSuppressed((java.lang.Throwable) iOException73);
        iOException11.addSuppressed((java.lang.Throwable) iOException73);
        java.io.IOException iOException77 = new java.io.IOException("", (java.lang.Throwable) iOException11);
        java.lang.String str78 = iOException77.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "java.io.IOException: " + "'", str78, "java.io.IOException: ");
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 11);
        boolean boolean3 = dateTimeZone2.isFixed();
        java.lang.String str4 = dateTimeZone2.toString();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = dateTimeZone2.getShortName((-434L), locale7);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("yearOfCentury");
        boolean boolean12 = locale11.hasExtensions();
        java.lang.String str13 = dateTimeZone2.getName(3974400000L, locale11);
        java.lang.String str14 = locale11.getScript();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:11" + "'", str4, "+100:11");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:11" + "'", str8, "+100:11");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:11" + "'", str13, "+100:11");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder12.build();
        java.lang.String str15 = locale14.getDisplayScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 100);
        java.lang.String str12 = dateTimeZone1.getShortName(10L, locale9);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale18, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(100L, chronology15, locale18);
        java.lang.String str22 = locale18.getScript();
        java.lang.String str23 = locale18.getISO3Country();
        java.lang.String str24 = locale18.getDisplayScript();
        java.lang.String str25 = dateTimeZone1.getName((long) 53, locale18);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone1.getOffset(readableInstant26);
        long long29 = dateTimeZone1.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CHN" + "'", str23, "CHN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setRegion("");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = builder12.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder12.setLanguage("java.io.IOException: java.io.IOException: ITA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: java.io.IOException: java.io.IOException: ITA [at index 0]");
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) (short) 1);
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset(3599999L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        java.lang.String str12 = dateTimeZone1.getShortName(259200002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7200000L) + "'", long5 == (-7200000L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7200000 + "'", int8 == 7200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7200000 + "'", int10 == 7200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+02:00" + "'", str12, "+02:00");
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.clear();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder13.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        java.util.Locale locale2 = new java.util.Locale("16", "java.io.IOException: S\374dkorea");
        org.junit.Assert.assertEquals(locale2.toString(), "16_JAVA.IO.IOEXCEPTION: S\374DKOREA");
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        long long11 = dateTimeParserBucket7.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        int int12 = dateTimeParserBucket7.getOffset();
        java.util.Locale locale13 = dateTimeParserBucket7.getLocale();
        org.joda.time.Chronology chronology14 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.minutes();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.dayOfMonth();
        org.joda.time.Chronology chronology17 = chronology14.withUTC();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale.Builder builder14 = builder12.setVariant("Korean");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale0.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getDisplayName();
        java.lang.String str7 = locale5.getISO3Language();
        java.lang.String str8 = locale3.getDisplayScript(locale5);
        java.lang.String str9 = locale3.getDisplayName();
        java.util.Locale locale11 = new java.util.Locale("java.io.IOException: Japanese");
        boolean boolean12 = locale3.equals((java.lang.Object) "java.io.IOException: Japanese");
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str6, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ita" + "'", str7, "ita");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str9, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertEquals(locale11.toString(), "java.io.ioexception: japanese");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long13 = dateTimeZone10.adjustOffset(569228503L, false);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 569228503L + "'", long13 == 569228503L);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("germany", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet7);
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet10, filteringMode11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale16.getISO3Country();
        java.lang.String str18 = locale16.getISO3Language();
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale16.getDisplayVariant(locale19);
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology23, locale24, (java.lang.Integer) 100);
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale27.getISO3Country();
        java.lang.String str29 = locale27.getISO3Language();
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale27.getDisplayVariant(locale30);
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale32.getISO3Country();
        java.util.Locale locale34 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale16, locale21, locale24, locale27, locale32, locale34 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList36);
        java.lang.String[] strArray42 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String str45 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList43);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale49.getISO3Country();
        java.lang.String str51 = locale49.getISO3Language();
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale49.getDisplayVariant(locale52);
        java.util.Locale locale54 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology56, locale57, (java.lang.Integer) 100);
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale60.getISO3Country();
        java.lang.String str62 = locale60.getISO3Language();
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale60.getDisplayVariant(locale63);
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale65.getISO3Country();
        java.util.Locale locale67 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale49, locale54, locale57, locale60, locale65, locale67 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.Locale locale71 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.util.Locale locale76 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet77 = locale76.getUnicodeLocaleKeys();
        java.lang.String str78 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strSet77);
        java.lang.String str79 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet77);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap80 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap82 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList81, strMap82);
        java.util.Locale locale84 = java.util.Locale.CHINESE;
        java.lang.String str85 = locale84.toLanguageTag();
        java.lang.String str86 = locale84.getLanguage();
        java.util.Locale.Builder builder87 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder88 = builder87.clear();
        java.util.Locale locale89 = builder88.build();
        java.util.Locale locale90 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str91 = locale89.getDisplayLanguage(locale90);
        java.lang.String str92 = locale84.getDisplayCountry(locale89);
        java.util.Set<java.lang.String> strSet93 = locale89.getUnicodeLocaleKeys();
        java.lang.String str94 = java.util.Locale.lookupTag(languageRangeList81, (java.util.Collection<java.lang.String>) strSet93);
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet93);
        java.lang.String str96 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList95);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jpn" + "'", str18, "jpn");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "ja");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "jpn" + "'", str29, "jpn");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale49);
// flaky:         org.junit.Assert.assertEquals(locale49.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "jpn" + "'", str51, "jpn");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "ja");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "ja");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "jpn" + "'", str62, "jpn");
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(languageRangeList81);
        org.junit.Assert.assertNotNull(languageRangeList83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "zh" + "'", str85, "zh");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "zh" + "'", str86, "zh");
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        dateTimeParserBucket7.setOffset((int) (short) 0);
        long long11 = dateTimeParserBucket7.computeMillis(true);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology13 = chronology12.withUTC();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology12.add(readablePeriod14, 31449600000L, (-25));
        org.joda.time.DateTimeField dateTimeField18 = chronology12.yearOfEra();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 31449600000L + "'", long17 == 31449600000L);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("datetimefield[yearofcentury]_SECONDOFMINUTE_italiano");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'datetimefield[yearofcentury]_SECONDOFMINUTE_italiano' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder20.addUnicodeLocaleAttribute("secondOfDay");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: secondOfDay [at index 0]");
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
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        boolean boolean3 = languageRange1.equals((java.lang.Object) 1862265600067L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("1439");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1439");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = chronology8.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfDay();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("secondofminute");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=secondofminute");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 0);
        int int11 = dateTimeZone1.getStandardOffset((long) 8);
        long long14 = dateTimeZone1.convertLocalToUTC(259200000L, true);
        int int16 = dateTimeZone1.getOffsetFromLocal(3180000L);
        java.lang.String str17 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 259200000L + "'", long14 == 259200000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        java.util.Locale locale2 = new java.util.Locale("345599", "java.io.IOException: java.io.IOException: 2");
        org.junit.Assert.assertEquals(locale2.toString(), "345599_JAVA.IO.IOEXCEPTION: JAVA.IO.IOEXCEPTION: 2");
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(120);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 2592026132L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2592026132L + "'", long5 == 2592026132L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
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
        org.joda.time.Chronology chronology17 = dateTimeParserBucket7.getChronology();
        long long18 = dateTimeParserBucket7.computeMillis();
        org.joda.time.Chronology chronology19 = dateTimeParserBucket7.getChronology();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.removeUnicodeLocaleAttribute("italiano (italia) (48)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: italiano (italia) (48) [at index 0]");
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
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
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
        int int14 = dateTimeParserBucket9.getOffset();
        dateTimeParserBucket9.setOffset((java.lang.Integer) (-71));
        dateTimeParserBucket9.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        int int4 = dateTimeZone0.getStandardOffset((long) '#');
        long long7 = dateTimeZone0.adjustOffset((long) '#', false);
        long long10 = dateTimeZone0.convertLocalToUTC((-93623039156990781L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-93623039156990781L) + "'", long10 == (-93623039156990781L));
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        java.util.Locale locale3 = new java.util.Locale("\u4e0a\u5348", "\u82f1\u6587\u7f8e\u56fd)", "\u516b\u6708");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e0a\u5348\u82f1\u6587\u7f8e\u56fd\u516b\u6708");
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        java.util.Locale locale2 = new java.util.Locale("97", "DEUTSCH");
        java.lang.String str3 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "97_DEUTSCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97" + "'", str3, "97");
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        java.util.Locale locale3 = new java.util.Locale("java.io.IOException: java.io.IOException: -1", "ZH", "hi!_ISOCHRONOLOGY[UTC]");
        org.junit.Assert.assertEquals(locale3.toString(), "java.io.ioexception: java.io.ioexception: -1_ZH_hi!_ISOCHRONOLOGY[UTC]");
    }
}
